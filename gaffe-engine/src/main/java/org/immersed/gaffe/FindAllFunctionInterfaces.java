package org.immersed.gaffe;

import java.io.IOException;
import java.util.function.Predicate;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;
import io.github.classgraph.ScanResult;

public class FindAllFunctionInterfaces
{
    public static <T> Predicate<T> not(Predicate<T> predicate)
    {
        return predicate.negate();
    }

    public static void main(String[] args) throws IOException
    {
        try (ScanResult scanResult = new ClassGraph().verbose()
                                                     .enableSystemJarsAndModules()
                                                     .enableAllInfo()
                                                     .whitelistLibOrExtJars("rt.jar", "jfxrt.jar")
                                                     .whitelistPackages("java", "javax", "org", "javafx")
                                                     .scan())
        {
            scanResult.getAllClasses()
                      .stream()
                      .filter(ClassInfo::isInterface)
                      .filter(c -> c.getMethodInfo()
                                    .stream()
                                    .filter(not(MethodInfo::isDefault))
                                    .count() == 1)
                      .forEach(System.out::println);
        }
    }

}
