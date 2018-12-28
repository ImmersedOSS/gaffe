package org.immersed.gaffe;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.classgraph.ClassTypeSignature;
import io.github.classgraph.TypeParameter;

/**
 * Utility class to implement default methods for
 * {@link FunctionalInterfaceSpec}.
 * 
 * @author Dan Avila
 *
 */
final class Util
{
    static String[] walkTypeParameters(FunctionalInterfaceSpec spec, Function<TypeParameter, String> mapper)
    {
        ClassTypeSignature sigs = spec.superClassInfo()
                                      .getTypeSignature();

        if (sigs == null)
        {
            return new String[0];
        }

        List<TypeParameter> params = sigs.getTypeParameters();
        String[] paramArgs = new String[params.size()];

        params.stream()
              .map(mapper)
              .collect(Collectors.toList())
              .toArray(paramArgs);

        return paramArgs;
    }

    private Util()
    {
    }
}
