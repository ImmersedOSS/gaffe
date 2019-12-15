package org.immersed.gaffe.generation;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.junit.jupiter.api.Test;

import io.github.classgraph.ClassInfo;

public class JdkProjectTest
{
    @Test
    public void testCustomProject() throws IOException
    {
        ProjectSpec spec = JdkProject.create();

        List<Path> originalSources = spec.originalJavaSource()
                                         .stream()
                                         .map(Path::getFileName)
                                         .collect(Collectors.toList());

        assertThat(originalSources).containsOnly(Paths.get("src.zip"), Paths.get("openjfx-src.zip"));

        Set<String> content = new HashSet<>(Arrays.asList("rt.jar", "jfxrt.jar"));
        for (FunctionalInterfaceSpec funcSpec : spec.functionalInterfaces())
        {
            ClassInfo info = funcSpec.superClassInfo();

            File source = info.getClasspathElementFile();
            String fileName = source.getName();
            assertThat(content.contains(fileName)).isTrue();
        }
    }
}
