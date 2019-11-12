package org.immersed.gaffe.generation;

import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.DEFAULT;
import static javax.lang.model.element.Modifier.PUBLIC;
import static org.immersed.gaffe.generation.Constants.EXCEPTION_GENERIC;
import static org.immersed.gaffe.generation.Constants.PACKAGE;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

/**
 * A throwing interface spec defines what a throwing functional interface looks
 * like. By default, {@link Throwable} is specified as the option to throw.
 * 
 * @author Dan Avila
 */
public class ThrowingInterfaceSpec
{
    private static CodeBlock callThrowingMethod(MethodSpec throwingMethod)
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

    private static Iterable<TypeVariableName> classGenericVars(FunctionalInterfaceSpec spec)
    {
        String[] superGenerics = spec.typeDeclarations();
        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        TypeVariableName[] classGenericVars = Arrays.copyOf(superGenericVars, superGenericVars.length + 1);
        classGenericVars[classGenericVars.length - 1] = TypeVariableName.get(EXCEPTION_GENERIC, Throwable.class);

        return Arrays.asList(classGenericVars);
    }

    private List<ParameterSpec> parameterSpecs(FunctionalInterfaceSpec spec)
    {
        AtomicInteger character = new AtomicInteger('a');
        Map<String, String> typeTranslations = spec.typeParameterMappings();

        return Arrays.stream(spec.superMethodInfo()
                                 .getParameterInfo())
                     .map(m ->
                     {
                         String name = m.getName();
                         name = name == null ? Character.toString((char) character.getAndIncrement()) : name;
                         String type = m.getTypeSignatureOrTypeDescriptor()
                                        .toString();
                         type = typeTranslations.getOrDefault(type, type)
                                                .replaceAll("[$]", ".");

                         return ParameterSpec.builder(TypeVariableName.get(type), name)
                                             .build();
                     })
                     .collect(Collectors.toList());
    }

    private static TypeName superInterface(FunctionalInterfaceSpec spec)
    {
        String[] superGenerics = spec.superGenerics();

        if (superGenerics.length == 0)
        {
            Class<?> type = spec.superType();
            return TypeName.get(type);
        }

        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        return ParameterizedTypeName.get(ClassName.get(spec.superType()), superGenericVars);
    }

    private final FunctionalInterfaceSpec spec;
    private final MethodSpec throwingMethod;
    private final MethodSpec overriddenMethod;

    private final TypeSpec typeSpec;

    /**
     * Creates a new interface specification that describes the error throwing
     * functional interface.
     * 
     * @param spec the specification.
     */
    public ThrowingInterfaceSpec(FunctionalInterfaceSpec spec)
    {
        this.spec = spec;

        List<ParameterSpec> parameters = parameterSpecs(spec);

        throwingMethod = MethodSpec.methodBuilder(spec.methodName())
                                   .addParameters(parameters)
                                   .addModifiers(PUBLIC, ABSTRACT)
                                   .addException(TypeVariableName.get(EXCEPTION_GENERIC))
                                   .returns(TypeVariableName.get(spec.superMethodReturns()))
                                   .build();

        overriddenMethod = MethodSpec.methodBuilder(spec.superMethodName())
                                     .addParameters(parameters)
                                     .addModifiers(PUBLIC, DEFAULT)
                                     .addAnnotation(Override.class)
                                     .addAnnotation(SneakyThrows.class)
                                     .returns(TypeVariableName.get(spec.superMethodReturns()))
                                     .addCode(callThrowingMethod(throwingMethod))
                                     .build();

        typeSpec = TypeSpec.interfaceBuilder(spec.className())
                           .addAnnotation(FunctionalInterface.class)
                           .addSuperinterface(superInterface(spec))
                           .addTypeVariables(classGenericVars(spec))
                           .addModifiers(PUBLIC)
                           .addMethod(overriddenMethod)
                           .addMethod(throwingMethod)
                           .build();
    }

    final TypeName superInterface()
    {
        return this.typeSpec.superinterfaces.get(0);
    }

    /**
     * The new functional method that throws an exception.
     * 
     * @return the method specification
     */
    final MethodSpec throwingMethod()
    {
        return this.throwingMethod;
    }

    /**
     * The original method that is now overridden with default behavior using
     * lombok.
     * 
     * @return the method specification
     */
    final MethodSpec originalMethod()
    {
        return this.overriddenMethod;
    }

    /**
     * Creates a .java file for this interface in the given project with the default
     * package.
     * 
     * @param proj the project we are saving this interface to.
     * @throws IOException if the .java file could not be saved.
     */
    public void writeToFile(ProjectSpec proj) throws IOException
    {
        writeToFile(proj, spec.packageName(PACKAGE));
    }

    /**
     * Creates a .java file in the given project with the specified package.
     * Duplicate classes will be overridden by the last encountered class.
     * 
     * @param proj       the project we are saving this interface to.
     * @param newPackage the package for this interface.
     * @throws IOException if the .java file could not be saved.
     */
    public void writeToFile(ProjectSpec proj, String newPackage) throws IOException
    {
        JavaFile file = JavaFile.builder(newPackage, typeSpec)
                                .build();
        file.writeTo(Files.createDirectories(proj.sourceFolder()));
    }
}
