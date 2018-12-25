package org.immersed.gaffe;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;
import io.github.classgraph.ScanResult;

public final class FunctionInterfaceFinder
{
    public static FunctionInterfaceFinder jdk()
    {
        return new FunctionInterfaceFinder(new ClassGraph().enableSystemJarsAndModules()
                                                           .enableAllInfo()
                                                           .whitelistJars("rt.jar", "jfxrt.jar")
                                                           .whitelistLibOrExtJars("rt.jar", "jfxrt.jar")
                                                           .whitelistPackages("java", "javafx", "org"));
    }

    private static <T> Predicate<T> not(Predicate<T> predicate)
    {
        return predicate.negate();
    }

    private ClassGraph graph;

    private FunctionInterfaceFinder(ClassGraph graph)
    {
        this.graph = graph.verbose();
    }

    public final List<FunctionInterfaceSpec> findAll()
    {
        try (ScanResult scanResult = graph.scan())
        {
            FunctionInterfaceSpec.Builder builder = new FunctionInterfaceSpec.Builder();

            return scanResult.getAllClasses()
                             .stream()
                             .filter(ClassInfo::isInterface)
                             .peek(builder::classInfo)
                             .filter(c -> c.getMethodInfo()
                                           .stream()
                                           .filter(not(MethodInfo::isDefault))
                                           .filter(not(MethodInfo::isStatic))
                                           .peek(builder::methodInfo)
                                           .count() == 1)
                             .map(c -> builder.build())
                             .collect(Collectors.toList());
        }
    }
}
