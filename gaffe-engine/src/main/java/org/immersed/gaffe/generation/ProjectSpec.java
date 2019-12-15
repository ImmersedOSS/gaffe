package org.immersed.gaffe.generation;

import java.nio.file.Path;
import java.util.List;

import org.immersed.gaffe.FunctionalInterfaceSet;
import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface ProjectSpec
{
    class Builder extends ProjectSpec_Builder
    {
    }

    FunctionalInterfaceSet functionalInterfaces();

    String projectName();

    Path projectFolder();

    /**
     * A group of paths representing the original source code. zip, jar, and folders
     * are supported.
     * 
     * @return 0 or more files representing the original source code.
     */
    List<Path> originalJavaSource();

    /**
     * The location of the source code in the project.
     * 
     * @return
     */
    default Path sourceFolder()
    {
        return projectFolder().resolve("src")
                              .resolve("main")
                              .resolve("java");
    }

    default Path testFolder()
    {
        return projectFolder().resolve("src")
                              .resolve("test")
                              .resolve("java");
    }
}
