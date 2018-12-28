package org.immersed.gaffe.generation;

import static javax.lang.model.element.Modifier.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.immersed.gaffe.FunctionalInterfaceSpec;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;

import lombok.SneakyThrows;

public final class InterfaceGenerator
{
    private static final String EXCEPTION_GENERIC = "X";

    private final ProjectSpec proj;
    private final FunctionalInterfaceSpec spec;

    public InterfaceGenerator(FunctionalInterfaceSpec spec, ProjectSpec proj)
    {
        this.spec = spec;
        this.proj = proj;
    }

    public void generateJavaFile() throws IOException
    {
        List<ParameterSpec> parameters = parameterSpecs();

        MethodSpec throwingMethod = MethodSpec.methodBuilder(spec.methodName())
                                              .addParameters(parameters)
                                              .addModifiers(PUBLIC, ABSTRACT)
                                              .addException(TypeVariableName.get(EXCEPTION_GENERIC))
                                              .returns(TypeVariableName.get(spec.superMethodReturns()))
                                              .build();

        MethodSpec overriddenMethod = MethodSpec.methodBuilder(spec.superMethodName())
                                                .addParameters(parameters)
                                                .addModifiers(PUBLIC, DEFAULT)
                                                .addAnnotation(Override.class)
                                                .addAnnotation(SneakyThrows.class)
                                                .returns(TypeVariableName.get(spec.superMethodReturns()))
                                                .addCode(callThrowingMethod(throwingMethod))
                                                .build();

        TypeSpec typeSpec = TypeSpec.interfaceBuilder(spec.className())
                                    .addAnnotation(FunctionalInterface.class)
                                    .addSuperinterface(superInterface())
                                    .addTypeVariables(classGenericVars())
                                    .addModifiers(PUBLIC)
                                    .addMethod(overriddenMethod)
                                    .addMethod(throwingMethod)
                                    .build();

        JavaFile file = JavaFile.builder("org.immersed.gaffe", typeSpec)
                                .build();
        file.writeTo(Files.createDirectories(proj.sourceFolder()));
    }

    private CodeBlock callThrowingMethod(MethodSpec throwingMethod)
    {
        CodeBlock.Builder builder = CodeBlock.builder();

        if (!"void".equals(throwingMethod.returnType.toString()))
        {
            builder.add("return ");
        }

        builder.add("$L(", throwingMethod.name);

        List<ParameterSpec> paramSpecs = throwingMethod.parameters;

        AtomicReference<String> comma = new AtomicReference<>("");
        StringBuilder params = new StringBuilder();

        for (ParameterSpec paramSpec : paramSpecs)
        {
            params.append(comma.getAndSet(","));
            params.append(paramSpec.name);
        }

        builder.add("$L);\n", params.toString());

        return builder.build();
    }

    private Iterable<TypeVariableName> classGenericVars()
    {
        String[] superGenerics = spec.superGenerics();
        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        TypeVariableName[] classGenericVars = Arrays.copyOf(superGenericVars, superGenericVars.length + 1);
        classGenericVars[classGenericVars.length - 1] = TypeVariableName.get(EXCEPTION_GENERIC, Throwable.class);

        return Arrays.asList(classGenericVars);
    }

    private List<ParameterSpec> parameterSpecs()
    {
        AtomicInteger character = new AtomicInteger('a');

        return Arrays.stream(spec.superMethodInfo()
                                 .getParameterInfo())
                     .map(m ->
                     {
                         String name = m.getName();
                         name = name == null ? Character.toString((char) character.getAndIncrement()) : name;
                         String type = m.getTypeSignatureOrTypeDescriptor()
                                        .toString();
                         return ParameterSpec.builder(TypeVariableName.get(type), name)
                                             .build();
                     })
                     .collect(Collectors.toList());
    }

    private TypeName superInterface()
    {
        String[] superGenerics = spec.superGenerics();

        if (superGenerics.length == 0)
        {
            return TypeName.get(spec.superType());
        }

        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        return ParameterizedTypeName.get(ClassName.get(spec.superType()), superGenericVars);
    }
}
