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
     * The info for this class.
     * 
     * @return an object holding all class information.
     */
    ClassInfo classInfo();

    /**
     * The info for the functional method.
     * 
     * @return an object holding information about the method.
     */
    MethodInfo methodInfo();

    /**
     * Gets the name of the class.
     * 
     * @return
     */
    default String className()
    {
        return classInfo().getName();
    }
}
