package org.immersed.gaffe.generation;

import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PUBLIC;
import static org.immersed.gaffe.generation.Util.className;
import static org.immersed.gaffe.generation.Util.utilityMethodName;

import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.IntStream;

import javax.lang.model.element.Modifier;

import org.immersed.gaffe.FunctionalInterfaceSpec;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

public class UtilityClassTestGenerator
{
    private static final String getParams(MethodSpec m)
    {
        return IntStream.range(0, m.parameters.size())
                        .mapToObj(i -> Character.toString((char) ('a' + i)))
                        .reduce((a, b) -> a + "," + b)
                        .map(s -> s.length() == 1 ? s : String.format("(%s)", s))
                        .orElse("()");
    }

    private static final String defaultValueOf(TypeName name)
    {
        if (TypeName.BOOLEAN.equals(name))
        {
            return "true";
        }
        else if (name.isPrimitive())
        {
            return String.format("(%s)0", name.toString());
        }
        return "null";
    }

    private final AnnotationSpec testAnnotation = AnnotationSpec.builder(ClassName.get("org.junit.jupiter.api", "Test"))
                                                                .build();

    private final ProjectSpec proj;
    private final TypeSpec utilityClass;

    public UtilityClassTestGenerator(TypeSpec utilityClass, ProjectSpec spec)
    {
        this.proj = spec;
        this.utilityClass = utilityClass;
    }

    public void generateUtilityClassTest() throws IOException
    {
        TypeSpec.Builder utilityTestClass = TypeSpec.classBuilder(className(proj, proj.testFolder()))
                                                    .addModifiers(PUBLIC, FINAL);
        for (FunctionalInterfaceSpec spec : proj.functionalInterfaces())
        {
            utilityTestClass.addMethod(throwingTest(spec));
            utilityTestClass.addMethod(standardTest(spec));
        }

        JavaFile file = JavaFile.builder(Constants.PACKAGE, utilityTestClass.build())
                                .addStaticImport(ClassName.get(Constants.PACKAGE, utilityClass.name), "*")
                                .addStaticImport(ClassName.get("org.assertj.core.api", "Assertions"), "*")
                                .build();
        file.writeTo(Files.createDirectories(proj.testFolder()));
    }

    private MethodSpec throwingTest(FunctionalInterfaceSpec spec)
    {
        ThrowingInterfaceSpec throwingSpec = new ThrowingInterfaceSpec(spec);
        String utilityMethod = utilityMethodName(spec);

        MethodSpec.Builder mB = MethodSpec.methodBuilder(new StringBuilder().append("test")
                                                                            .append(Character.toUpperCase(
                                                                                    utilityMethod.charAt(0)))
                                                                            .append(utilityMethod.substring(1))
                                                                            .append("CanThrowCheckedException")
                                                                            .toString())
                                          .addModifiers(Modifier.PUBLIC)
                                          .addAnnotation(testAnnotation);

        MethodSpec m = throwingSpec.originalMethod();
        String params = getParams(m);

        TypeName superInterface = throwingSpec.superInterface();

        if (superInterface instanceof ParameterizedTypeName)
        {
            ParameterizedTypeName parameterizedType = (ParameterizedTypeName) superInterface;
            superInterface = parameterizedType.rawType;
        }

        MethodSpec originalMethod = throwingSpec.originalMethod();
        CodeBlock.Builder builder = CodeBlock.builder();
        builder.add("$L iface = $L($L -> {\n", superInterface, utilityMethod, params)
               .indent()
               .addStatement("throw new $T()", IOException.class)
               .unindent()
               .add("});\n")
               .add("assertThatExceptionOfType($T.class).isThrownBy(() -> ", IOException.class)
               .add("iface.$L(", originalMethod.name);
        builder.add(originalMethod.parameters.stream()
                                             .map(param -> defaultValueOf(param.type))
                                             .reduce((a, b) -> a + "," + b)
                                             .orElse(""));
        builder.add("));\n");
        mB.addCode(builder.build());
        return mB.build();
    }

    private MethodSpec standardTest(FunctionalInterfaceSpec spec)
    {
        ThrowingInterfaceSpec throwingSpec = new ThrowingInterfaceSpec(spec);
        String utilityMethod = utilityMethodName(spec);

        MethodSpec.Builder mB = MethodSpec.methodBuilder(new StringBuilder().append("test")
                                                                            .append(Character.toUpperCase(
                                                                                    utilityMethod.charAt(0)))
                                                                            .append(utilityMethod.substring(1))
                                                                            .append("WithoutIssue")
                                                                            .toString())
                                          .addModifiers(Modifier.PUBLIC)
                                          .addException(Throwable.class)
                                          .addAnnotation(testAnnotation);

        MethodSpec m = throwingSpec.originalMethod();
        String params = getParams(m);

        TypeName superInterface = throwingSpec.superInterface();

        if (superInterface instanceof ParameterizedTypeName)
        {
            ParameterizedTypeName parameterizedType = (ParameterizedTypeName) superInterface;
            superInterface = parameterizedType.rawType;
        }

        MethodSpec originalMethod = throwingSpec.originalMethod();
        CodeBlock.Builder builder = CodeBlock.builder();

        TypeName returnType = originalMethod.returnType;

        builder.add("$L iface = $L($L -> {\n", superInterface, utilityMethod, params);

        if (!TypeName.VOID.equals(returnType))
        {
            builder.indent()
                   .addStatement("return $L", defaultValueOf(returnType))
                   .unindent();
        }
        builder.add("});\n")
               .add("iface.$L(", originalMethod.name);
        builder.add(originalMethod.parameters.stream()
                                             .map(param -> defaultValueOf(param.type))
                                             .reduce((a, b) -> a + "," + b)
                                             .orElse(""));
        builder.add(");\n");
        mB.addCode(builder.build());
        return mB.build();
    }
}
