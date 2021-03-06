package org.immersed.gaffe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.MethodInfo;
import io.github.classgraph.ScanResult;

/**
 * A collection of function interface specification for a library or set of
 * libraries. A variety of static initializers are provided to wrap libraries
 * and the core system libraries.
 * 
 * @author Dan Avila
 */
public final class FunctionalInterfaceSet implements Iterable<FunctionalInterfaceSpec>
{
    /**
     * Provides the set of functional interfaces from the active JDK.
     * 
     * @param jar            the primary jar file.
     * @param additionalJars any additional dependencies.
     * @return the set of functional interfaces.
     */
    public static FunctionalInterfaceSet jars(String jar, String... additionalJars)
    {
        String[] jars = Arrays.copyOf(additionalJars, additionalJars.length + 1);
        jars[jars.length - 1] = jar;

        return new FunctionalInterfaceSet(new ClassGraph().enableAllInfo()
                                                          .whitelistJars(jars));
    }

    private static <T> Predicate<T> not(Predicate<T> predicate)
    {
        return predicate.negate();
    }

    private final ScanResult result;

    public FunctionalInterfaceSet(ClassGraph graph)
    {
        // add verbose() to see detailed info
        this.result = graph.scan();
    }

    @Override
    public Iterator<FunctionalInterfaceSpec> iterator()
    {
        return toList().iterator();
    }

    /**
     * Exports the list of functional interfaces to a java list. This method will
     * build a new list each time it is called.
     * 
     * @return a list of specification objects representing the function interfaces
     *         in this library set.
     */
    public final List<FunctionalInterfaceSpec> toList()
    {
        FunctionalInterfaceSpec.Builder builder = new FunctionalInterfaceSpec.Builder();

        return result.getAllInterfaces()
                     .stream()
                     .filter(this::isVisibleToClients)
                     .peek(builder::superClassInfo)
                     .filter(c -> c.getMethodInfo()
                                   .stream()
                                   .filter(not(MethodInfo::isDefault))
                                   .filter(not(MethodInfo::isStatic))
                                   .peek(builder::superMethodInfo)
                                   .count() == 1L)
                     .map(c -> builder.build())
                     .collect(Collectors.toList());
    }

    private boolean isVisibleToClients(ClassInfo info)
    {
        boolean isVisibleToClients = info.isPublic();

        ClassInfoList parents = info.getOuterClasses();
        for (ClassInfo parent : parents)
        {
            isVisibleToClients = isVisibleToClients && parent.isPublic();
        }

        return isVisibleToClients;
    }
}
