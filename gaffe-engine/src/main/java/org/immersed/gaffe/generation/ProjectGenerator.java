package org.immersed.gaffe.generation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.immersed.gaffe.FunctionalInterfaceSet;
import org.immersed.gaffe.FunctionalInterfaceSpec;

/**
 * This class generates all projects. This class is likely to evolve over time
 * or become a gradle plugin.
 * 
 * @author Dan Avila
 */
public final class ProjectGenerator
{
    public static void main(String... args) throws IOException
    {
        new ProjectGenerator(Arrays.asList(JdkProject.create())).generateAll();
    }

    private final List<ProjectSpec> projects;

    private ProjectGenerator(Collection<ProjectSpec> projects)
    {
        this.projects = new ArrayList<>(projects);
    }

    public void generateAll()
    {
        this.projects.forEach(t ->
        {
            try
            {
                generateProject(t);
            }
            catch (IOException | ClassNotFoundException e)
            {
                throw new IllegalStateException(e);
            }
        });
    }

    public void generateProject(ProjectSpec project) throws IOException, ClassNotFoundException
    {
        Files.walk(project.sourceFolder())
             .filter(Files::isRegularFile)
             .forEach(p ->
             {
                 try
                 {
                     Files.delete(p);
                 }
                 catch (IOException e)
                 {
                     throw new IllegalStateException(e);
                 }
             });

        for (FunctionalInterfaceSpec iface : project.functionalInterfaces())
        {
            new InterfaceGenerator(iface, project).generateJavaFile();
        }

        new UtilityClassGenerator(project).generateUtilityClass();
    }
}
