package org.immersed.gaffe.generation;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.MethodInfo;

public class InterfaceGeneratorTest
{
    @Rule
    public final TemporaryFolder rule = new TemporaryFolder();

    @Test
    public void testCreatingAnInterface() throws IOException
    {
        final String name = "javafx.beans.value.ChangeListener";

        final ClassInfo cls = new ClassGraph().enableAllInfo()
                                              .enableSystemJarsAndModules()
                                              .whitelistJars("rt.jar", "jfxrt.jar")
                                              .whitelistLibOrExtJars("rt.jar", "jfxrt.jar")
                                              .whitelistClasses(name)
                                              .scan()
                                              .getAllInterfaces()
                                              .get(0);

        final MethodInfo method = cls.getDeclaredMethodInfo()
                                     .get(0);

        Path folder = rule.newFolder()
                          .toPath();

        ProjectSpec project = mock(ProjectSpec.class);
        when(project.sourceFolder()).thenReturn(folder);

        FunctionalInterfaceSpec spec = new FunctionalInterfaceSpec.Builder().superClassInfo(cls)
                                                                            .superMethodInfo(method)
                                                                            .build();
        new InterfaceGenerator(spec, project).generateJavaFile();

        Files.walk(folder)
             .filter(Files::isRegularFile)
             .forEach(t ->
             {
                 try
                 {
                     System.out.println(new String(Files.readAllBytes(t)));
                 }
                 catch (IOException e)
                 {
                     e.printStackTrace();
                 }
             });
    }
}
