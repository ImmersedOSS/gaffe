package org.immersed.gaffe.generation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.immersed.gaffe.FunctionalInterfaceSet;
import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class InterfaceGeneratorTest
{
    @Test
    public void testCreatingAnInterface(@TempDir Path folder) throws IOException
    {
        final String name = "java.security.KeyStore$LoadStoreParameter";

        FunctionalInterfaceSpec spec = JdkProject.create()
                                                 .functionalInterfaces()
                                                 .toList()
                                                 .stream()
                                                 .peek(fn -> System.out.println(fn.superClassInfo()
                                                                                  .getSimpleName()))
                                                 .filter(fn -> name.contains(fn.superClassInfo()
                                                                               .getSimpleName()))
                                                 .findAny()
                                                 .get();

        ProjectSpec project = mock(ProjectSpec.class);
        when(project.sourceFolder()).thenReturn(folder);

        new InterfaceGenerator(spec, project).generateJavaFile();

        Files.walk(folder)
             .filter(Files::isRegularFile)
             .forEach(path ->
             {
                 try
                 {
                     System.out.println(path);
                     System.out.println(new String(Files.readAllBytes(path)));
                 }
                 catch (IOException e)
                 {
                     e.printStackTrace();
                 }
             });
    }
}
