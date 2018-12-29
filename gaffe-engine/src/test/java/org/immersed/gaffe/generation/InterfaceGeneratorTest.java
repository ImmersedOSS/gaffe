package org.immersed.gaffe.generation;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.immersed.gaffe.FunctionalInterfaceSet;
import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class InterfaceGeneratorTest
{
    @Rule
    public final TemporaryFolder rule = new TemporaryFolder();

    @Test
    public void testCreatingAnInterface() throws IOException
    {
        final String name = "java.util.function.BinaryOperator";

        FunctionalInterfaceSpec spec = FunctionalInterfaceSet.jdk()
                                                             .toList()
                                                             .stream()
                                                             .filter(fn -> name.contains(fn.superClassInfo()
                                                                                           .getSimpleName()))
                                                             .findAny()
                                                             .get();

        Path folder = rule.newFolder()
                          .toPath();

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
