package org.immersed.gaffe;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;

public class FunctionInterfaceSpecTest
{
    @Test
    public void testDefaultMethods()
    {
        final String name = "java.util.function.LongPredicate";

        final ClassInfo cls = new ClassGraph().enableAllInfo()
                                              .enableSystemJarsAndModules()
                                              .whitelistJars("rt.jar")
                                              .whitelistLibOrExtJars("rt.jar")
                                              .whitelistClasses(name)
                                              .scan()
                                              .getAllInterfaces()
                                              .get(0);

        final MethodInfo method = cls.getMethodInfo("test")
                                     .get(0);

        FunctionalInterfaceSpec spec = new FunctionalInterfaceSpec.Builder().superClassInfo(cls)
                                                                            .superMethodInfo(method)
                                                                            .build();
        assertThat(spec.className()).isEqualTo("ThrowingLongPredicate");
        assertThat(spec.methodName()).isEqualTo("tryTest");
    }
}
