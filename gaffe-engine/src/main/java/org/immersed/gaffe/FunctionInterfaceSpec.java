package org.immersed.gaffe;

import org.inferred.freebuilder.FreeBuilder;

import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;

/**
 * A data object containing everything about a functional interface type.
 * 
 * @author Dan Avila
 */
@FreeBuilder
public interface FunctionInterfaceSpec
{
    class Builder extends FunctionInterfaceSpec_Builder
    {
    }

    /**
     * The info describing this interface.
     * 
     * @return an object holding all class information.
     */
    ClassInfo classInfo();

    /**
     * Gets the class name of the new object.
     * 
     * @return
     */
    default String className()
    {
        return "Throwing" + classInfo().getSimpleName();
    }

    /**
     * The info for the functional method.
     * 
     * @return an object holding information about the method.
     */
    MethodInfo methodInfo();

    default String methodName()
    {
        final String name = methodInfo().getName();

        return new StringBuilder().append("try")
                                  .append(Character.toUpperCase(name.charAt(0)))
                                  .append(name.substring(1))
                                  .toString();
    }
}
