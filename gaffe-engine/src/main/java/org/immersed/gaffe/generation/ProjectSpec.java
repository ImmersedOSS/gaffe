package org.immersed.gaffe.generation;

import java.nio.file.Path;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface ProjectSpec
{
    class Builder extends ProjectSpec_Builder
    {
    }

    Path projectFolder();

    default Path sourceFolder()
    {
        return projectFolder().resolve("src")
                              .resolve("main")
                              .resolve("java");
    }
}
