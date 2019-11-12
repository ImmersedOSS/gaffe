package org.immersed.gaffe.generation;

import java.io.IOException;

import org.immersed.gaffe.FunctionalInterfaceSpec;

final class InterfaceGenerator
{
    private final ProjectSpec proj;
    private final ThrowingInterfaceSpec spec;

    public InterfaceGenerator(FunctionalInterfaceSpec spec, ProjectSpec proj)
    {
        this.spec = new ThrowingInterfaceSpec(spec);
        this.proj = proj;
    }

    public void generateJavaFile() throws IOException
    {
        this.spec.writeToFile(proj);
    }
}
