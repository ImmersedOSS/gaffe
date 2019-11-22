package org.immersed.gaffe.generation;

import java.nio.file.Path;

import org.immersed.gaffe.FunctionalInterfaceSpec;

import com.squareup.javapoet.ClassName;

import io.github.classgraph.ClassInfo;

final class Util
{
    public static ClassName className(ProjectSpec spec, Path location)
    {
        boolean isTest = location.equals(spec.testFolder());

        StringBuilder buffer = new StringBuilder("Gaffe");
        buffer.append(spec.projectName());
        buffer.append(isTest ? "Test" : "");

        return ClassName.get(Constants.PACKAGE, buffer.toString());
    }

    public static String utilityMethodName(FunctionalInterfaceSpec spec)
    {
        ClassInfo superClass = spec.superClassInfo();
        return "throwing" + superClass.getSimpleName()
                                      .replace("$", "");
    }
}
