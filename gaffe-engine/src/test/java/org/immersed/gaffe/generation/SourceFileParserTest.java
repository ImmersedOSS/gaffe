package org.immersed.gaffe.generation;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.junit.jupiter.api.Test;

import io.github.classgraph.ClassInfo;

public class SourceFileParserTest
{
    @Test
    public void testParser() throws IOException
    {
        ProjectSpec proj = JdkProject.create();
        List<FunctionalInterfaceSpec> specs = proj.functionalInterfaces()
                                                  .toList();
        for (FunctionalInterfaceSpec spec : specs)
        {
            System.out.println(spec.superClassInfo());

            SourceFileParser javadoc = new SourceFileParser(proj, spec);

            System.out.println(javadoc.getClassJavadoc());
            System.out.println(javadoc.getMethodJavadoc());
            System.out.println();

            assertThat(javadoc.getClassJavadoc()).isNotNull();
            assertThat(javadoc.getMethodJavadoc()).isNotNull();
        }
    }

    @Test
    public void testParsingWithTypeParameters() throws IOException
    {
        ProjectSpec proj = JdkProject.create();

        Optional<FunctionalInterfaceSpec> optionalSpec = Optional.empty();
        optionalSpec = proj.functionalInterfaces()
                           .toList()
                           .stream()
                           .filter(fs ->
                           {
                               String expected = BiFunction.class.getSimpleName();
                               ClassInfo info = fs.superClassInfo();
                               String name = info.getSimpleName();
                               return expected.equals(name);
                           })
                           .findFirst();

        assertThat(optionalSpec).isPresent();
        optionalSpec.ifPresent(spec ->
        {
            SourceFileParser parser = new SourceFileParser(proj, spec);
            assertThat(parser.getParamNames()).containsExactly("t", "u");
        });
    }

    @Test
    public void testParsingWithOveriddenMethods() throws IOException
    {
        ProjectSpec proj = JdkProject.create();

        Optional<FunctionalInterfaceSpec> optionalSpec = Optional.empty();
        optionalSpec = proj.functionalInterfaces()
                           .toList()
                           .stream()
                           .filter(fs ->
                           {
                               String expected = BinaryOperator.class.getSimpleName();
                               ClassInfo info = fs.superClassInfo();
                               String name = info.getSimpleName();
                               return expected.equals(name);
                           })
                           .findFirst();

        assertThat(optionalSpec).isPresent();
        optionalSpec.ifPresent(spec ->
        {
            SourceFileParser parser = new SourceFileParser(proj, spec);
            assertThat(parser.getParamNames()).containsExactly("t", "u");
        });
    }
}
