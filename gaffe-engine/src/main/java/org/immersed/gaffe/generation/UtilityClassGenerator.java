package org.immersed.gaffe.generation;

import static javax.lang.model.element.Modifier.*;
import static org.immersed.gaffe.generation.Constants.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import org.immersed.gaffe.FunctionalInterfaceSpec;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;
import com.squareup.javapoet.TypeVariableName;

final class UtilityClassGenerator
{
    private final ProjectSpec proj;

    public UtilityClassGenerator(ProjectSpec spec)
    {
        this.proj = spec;
    }

    public void generateUtilityClass() throws IOException
    {
        MethodSpec utilityConstructor = MethodSpec.constructorBuilder()
                                                  .addModifiers(PRIVATE)
                                                  .build();

        TypeSpec.Builder utilityClass = TypeSpec.classBuilder(className())
                                                .addModifiers(PUBLIC, FINAL)
                                                .addMethod(utilityConstructor);

        for (FunctionalInterfaceSpec spec : proj.functionalInterfaces())
        {
            install(utilityClass, spec);
        }

        JavaFile file = JavaFile.builder(Constants.PACKAGE, utilityClass.build())
                                .build();
        file.writeTo(Files.createDirectories(proj.sourceFolder()));
    }

    private void install(Builder utilityClass, FunctionalInterfaceSpec spec)
    {
        TypeVariableName[] methodGenerics = classGenericVars(spec);
        TypeVariableName[] parameterGenerics = parameterGenerics(spec);

        ClassName paramClassName = ClassName.get(spec.packageName(PACKAGE), spec.className());
        ParameterizedTypeName paramType = ParameterizedTypeName.get(paramClassName, parameterGenerics);

        String paramName = spec.className();
        paramName = Character.toLowerCase(paramName.charAt(0)) + paramName.substring(1);

        utilityClass.addMethod(MethodSpec.methodBuilder("throwing")
                                         .addModifiers(PUBLIC, STATIC)
                                         .addParameter(paramType, paramName)
                                         .addTypeVariables(Arrays.asList(methodGenerics))
                                         .returns(returnType(spec))
                                         .addCode("return $L;\n", paramName)
                                         .build());
    }

    private TypeName returnType(FunctionalInterfaceSpec spec)
    {
        ClassName returnClassName = ClassName.get(spec.superType());

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

        return ParameterizedTypeName.get(returnClassName, superGenericVars);
    }

    private TypeVariableName[] parameterGenerics(FunctionalInterfaceSpec spec)
    {
        String[] superGenerics = spec.superGenerics();
        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        TypeVariableName[] classGenericVars = Arrays.copyOf(superGenericVars, superGenericVars.length + 1);
        classGenericVars[classGenericVars.length - 1] = TypeVariableName.get(EXCEPTION_GENERIC);

        return classGenericVars;
    }

    private TypeVariableName[] classGenericVars(FunctionalInterfaceSpec spec)
    {
        String[] superGenerics = spec.typeDeclarations();
        TypeVariableName[] superGenericVars = new TypeVariableName[superGenerics.length];
        for (int i = 0; i < superGenericVars.length; i++)
        {
            superGenericVars[i] = TypeVariableName.get(superGenerics[i]);
        }

        TypeVariableName[] classGenericVars = Arrays.copyOf(superGenericVars, superGenericVars.length + 1);
        classGenericVars[classGenericVars.length - 1] = TypeVariableName.get(EXCEPTION_GENERIC, Throwable.class);

        return classGenericVars;
    }

    private ClassName className()
    {
        String name = this.proj.projectName();
        return ClassName.get(Constants.PACKAGE, "Gaffe" + name);
    }
}
