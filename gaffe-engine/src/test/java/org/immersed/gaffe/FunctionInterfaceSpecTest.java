package org.immersed.gaffe;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.BinaryOperator;
import java.util.function.LongPredicate;

import org.junit.jupiter.api.Test;

import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;

public class FunctionInterfaceSpecTest
{
    private ClassInfo findClass(Class<?> type)
    {
        String pkg = type.getPackage()
                         .getName();
        String sn = type.getSimpleName();

        return new ClassGraph().enableAllInfo()
                               .enableSystemJarsAndModules()
                               .whitelistJars("rt.jar")
                               .whitelistLibOrExtJars("rt.jar")
                               .whitelistClasses(String.format("%s.%s", pkg, sn))
                               .scan()
                               .getAllInterfaces()
                               .get(0);
    }

    @Test
    public void testDefaultMethods()
    {
        final ClassInfo cls = findClass(LongPredicate.class);

        final MethodInfo method = cls.getMethodInfo("test")
                                     .get(0);

        FunctionalInterfaceSpec spec = new FunctionalInterfaceSpec.Builder().superClassInfo(cls)
                                                                            .superMethodInfo(method)
                                                                            .build();
        assertThat(spec.className()).isEqualTo("ThrowingLongPredicate");
        assertThat(spec.methodName()).isEqualTo("tryTest");
    }

    @Test
    public void testPrimitiveReturnType()
    {
        final ClassInfo cls = findClass(LongPredicate.class);

        final MethodInfo method = cls.getMethodInfo("test")
                                     .get(0);
        FunctionalInterfaceSpec spec = new FunctionalInterfaceSpec.Builder().superClassInfo(cls)
                                                                            .superMethodInfo(method)
                                                                            .build();
        assertThat(spec.superMethodReturns()).isEqualTo(TypeName.BOOLEAN);
    }

    @Test
    public void testGenericReturnType()
    {
        final ClassInfo cls = findClass(BinaryOperator.class);

        final MethodInfo method = cls.getMethodInfo("apply")
                                     .get(0);
        FunctionalInterfaceSpec spec = new FunctionalInterfaceSpec.Builder().superClassInfo(cls)
                                                                            .superMethodInfo(method)
                                                                            .build();
        assertThat(spec.superMethodReturns()).isEqualTo(TypeVariableName.get("T"));
    }
}
