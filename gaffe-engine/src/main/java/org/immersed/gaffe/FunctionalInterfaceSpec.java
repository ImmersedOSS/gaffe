package org.immersed.gaffe;

import java.util.List;
import java.util.stream.Collectors;

import org.inferred.freebuilder.FreeBuilder;

import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassTypeSignature;
import io.github.classgraph.MethodInfo;
import io.github.classgraph.TypeParameter;

/**
 * A data object containing everything about a functional interface type.
 * 
 * @author Dan Avila
 */
@FreeBuilder
public interface FunctionalInterfaceSpec
{
    class Builder extends FunctionalInterfaceSpec_Builder
    {
    }

    /**
     * Gets the class name of the interface we are trying to create.
     * 
     * @return the classname as a string.
     */
    default String className()
    {
        return "Throwing" + superClassInfo().getSimpleName();
    }

    /**
     * The name of the new functional interface method name.
     * 
     * @return
     */
    default String methodName()
    {
        final String name = superMethodInfo().getName();

        return new StringBuilder().append("try")
                                  .append(Character.toUpperCase(name.charAt(0)))
                                  .append(name.substring(1))
                                  .toString();
    }

    /**
     * The info describing this interface.
     * 
     * @return an object holding all class information.
     */
    ClassInfo superClassInfo();

    /**
     * Provides the
     * 
     * @return
     */
    default String[] superGenerics()
    {
        ClassTypeSignature sigs = superClassInfo().getTypeSignature();

        if (sigs == null)
        {
            return new String[0];
        }

        List<TypeParameter> params = sigs.getTypeParameters();
        String[] paramArgs = new String[params.size()];

        params.stream()
              .map(TypeParameter::getName)
              .collect(Collectors.toList())
              .toArray(paramArgs);

        return paramArgs;
    }

    /**
     * The info for the functional method.
     * 
     * @return an object holding information about the method.
     */
    MethodInfo superMethodInfo();

    default String superMethodName()
    {
        return superMethodInfo().getName();
    }

    default String superMethodReturns()
    {
        return superMethodInfo().getTypeSignatureOrTypeDescriptor()
                                .getResultType()
                                .toString();
    }

    /**
     * Gets the class object for the super interface.
     * 
     * @return a class object. Will be used for code generation.
     */
    default Class<?> superType()
    {
        return superClassInfo().loadClass();
    }
}
