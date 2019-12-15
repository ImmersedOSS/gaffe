package org.immersed.gaffe;

import java.util.Map;

import org.inferred.freebuilder.FreeBuilder;

import com.squareup.javapoet.TypeName;

import io.github.classgraph.ClassInfo;
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
     * Gets the {@link Class#getSimpleName() simple name} of the provided class.
     * 
     * @return the name of the class.
     */
    default String superClassName()
    {
        ClassInfo info = superClassInfo();
        String name = info.getSimpleName();

        if (info.isInnerClass())
        {
            return name.substring(name.lastIndexOf('$') + 1);
        }

        return name;
    }

    /**
     * Gets the class name of the interface we are trying to create.
     * 
     * @return the name of the class.
     */
    default String className()
    {
        return "Throwing" + superClassName();
    }

    default String packageName(String topLevelPackage)
    {
        return topLevelPackage + "." + superClassInfo().getPackageName();
    }

    /**
     * The name of the new functional interface method name.
     * 
     * @return the method name, as a string.
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
     * The class information describing extends functional interface.
     * 
     * @return an object holding all class information.
     */
    ClassInfo superClassInfo();

    /**
     * Gets the generic type declaration of the super class.
     * 
     * @return a string containing the generic names.
     */
    default String[] superGenerics()
    {
        return Util.walkTypeParameters(superClassInfo(), TypeParameter::getName);
    }

    /**
     * The info for the functional method.
     * 
     * @return an object holding information about the method.
     */
    MethodInfo superMethodInfo();

    /**
     * Gets the name of the functional method found in the super interface. Derived
     * from {@link #superMethodInfo()}.
     * 
     * @return the name as a string.
     */
    default String superMethodName()
    {
        return superMethodInfo().getName();
    }

    /**
     * Gets the return type for the method of this function interface. This method
     * accounts for interface hierarchies.
     * 
     * @return a string representing the type of the return value.
     */
    default TypeName superMethodReturns()
    {
        String retVal = superMethodInfo().getTypeSignatureOrTypeDescriptor()
                                         .getResultType()
                                         .toString();
        return Util.get(typeParameterMappings().getOrDefault(retVal, retVal)
                                               .replaceAll("[$]", "."));
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

    /**
     * Provides a list of strings that describe the generic types of this interface.
     * They are based off of the extended interface.
     * 
     * @return the type declarations.
     */
    default String[] typeDeclarations()
    {
        return Util.walkTypeParameters(superClassInfo(), TypeParameter::toString);
    }

    /**
     * Provides a map that will translate type parameters from this functional
     * interface if the method is declared in a parent class.
     * 
     * @return a map from the super type to the current class's types.
     */
    default Map<String, String> typeParameterMappings()
    {
        return Util.methodParameterTypes(this);
    }
}
