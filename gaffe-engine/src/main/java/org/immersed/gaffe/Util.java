package org.immersed.gaffe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassRefTypeSignature;
import io.github.classgraph.ClassTypeSignature;
import io.github.classgraph.MethodInfo;
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
    /**
     * Provides an array of parameter types for the provided method. This method
     * starts at the class which defines the method, and works it's way back using
     * substitution to create the proper function call.
     * 
     * @return an array of the parameter types, based on the interface hierarchy.
     */
    static Map<String, String> methodParameterTypes(FunctionalInterfaceSpec spec)
    {
        final MethodInfo superMethodInfo = spec.superMethodInfo();
        final ClassInfo superClassInfo = spec.superClassInfo();

        ClassInfo classDeclaringMethod = superMethodInfo.getClassInfo();

        List<ClassInfo> hierarchy = new ArrayList<>();
        hierarchy.add(superClassInfo);
        hierarchy.addAll(superClassInfo.getInterfaces());

        int index = hierarchy.indexOf(classDeclaringMethod);
        Map<String, String> translations = new LinkedHashMap<>();

        for (int i = index; i > 0; i--)
        {
            ClassInfo childDeclaration = hierarchy.get(i - 1);
            ClassInfo parent = hierarchy.get(i);

            ClassTypeSignature sigList = childDeclaration.getTypeSignature();

            if (sigList == null)
            {
                return Collections.emptyMap();
            }

            String[] childSpec = sigList.getSuperinterfaceSignatures()
                                        .stream()
                                        .filter(crts -> crts.getClassInfo()
                                                            .equals(parent))
                                        .findAny()
                                        .map(ClassRefTypeSignature::getTypeArguments)
                                        .map(l ->
                                        {
                                            String[] types = new String[l.size()];
                                            for (int x = 0; x < types.length; x++)
                                            {
                                                types[x] = l.get(x)
                                                            .toString();
                                            }
                                            return types;
                                        })
                                        .orElseThrow(() -> new IllegalStateException());

            String[] content = Util.walkTypeParameters(hierarchy.get(i), TypeParameter::getName);

            if (translations.isEmpty())
            {
                for (int x = 0; x < content.length; x++)
                {
                    translations.put(content[x], childSpec[x]);
                }
            } else
            {
                for (int x = 0; x < content.length; x++)
                {
                    String current = content[x];
                    String newValue = childSpec[x];
                    translations.entrySet()
                                .forEach(e ->
                                {
                                    String value = e.getValue();

                                    if (value.equals(current))
                                    {
                                        e.setValue(newValue);
                                    }
                                });

                    translations.put(content[i], childSpec[i]);
                }
            }
        }

        return translations;
    }

    static String[] walkTypeParameters(ClassInfo type, Function<TypeParameter, String> mapper)
    {
        ClassTypeSignature sigs = type.getTypeSignature();

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
