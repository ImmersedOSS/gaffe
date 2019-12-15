package org.immersed.gaffe.generation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.immersed.gaffe.FunctionalInterfaceSpec;
import org.immersed.gaffe.JavaLexer;
import org.immersed.gaffe.JavaParser;
import org.immersed.gaffe.JavaParser.FormalParameterContext;
import org.immersed.gaffe.JavaParser.FormalParameterListContext;
import org.immersed.gaffe.JavaParser.FormalParametersContext;
import org.immersed.gaffe.JavaParser.InterfaceDeclarationContext;
import org.immersed.gaffe.JavaParser.InterfaceMethodDeclarationContext;
import org.immersed.gaffe.JavaParser.VariableDeclaratorIdContext;
import org.immersed.gaffe.JavaParserBaseListener;

import com.squareup.javapoet.CodeBlock;

import io.github.classgraph.ClassInfo;

/**
 * Derives information from the source file, including parameter names and
 * javadoc.
 * 
 * @author Dan Avila
 */
public class SourceFileParser
{
    private final class JavadocListener extends JavaParserBaseListener
    {
        private final FunctionalInterfaceSpec spec;

        private Token type;
        private Token method;
        private FormalParametersContext params;

        public JavadocListener(FunctionalInterfaceSpec spec)
        {
            this.spec = spec;
        }

        @Override
        public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx)
        {
            String name = spec.superClassName();
            String id = ctx.IDENTIFIER()
                           .toString();

            if (name.endsWith(id))
            {
                this.type = ctx.getStart();
            }
        }

        @Override
        public void exitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx)
        {
            TerminalNode id = ctx.IDENTIFIER();
            String methodName = id.toString();

            if (methodName.equals(this.spec.superMethodName()))
            {
                this.method = ctx.getStart();
                this.params = ctx.formalParameters();
            }
        }
    }

    private Token typeJavadoc;
    private Token methodJavadoc;
    private FormalParametersContext params;

    public SourceFileParser(ProjectSpec proj, FunctionalInterfaceSpec spec)
    {
        List<ClassInfo> interfaces = findAllInterfaces(spec.superClassInfo());
        for (ClassInfo superInfo : interfaces)
        {
            CharStream stream = readSourceFile(proj, superInfo);
            Lexer lexer = new JavaLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            JavadocListener listener = new JavadocListener(spec);
            parser.addParseListener(listener);
            parser.compilationUnit();

            List<Token> javadocs = new ArrayList<>();
            for (int i = 0; i < tokens.size(); i++)
            {
                Token token = tokens.get(i);
                String text = token.getText();

                if (text.startsWith("/**") && text.endsWith("*/"))
                {
                    javadocs.add(token);
                }
            }

            this.typeJavadoc = checkAndStore(javadocs, listener.type, this.typeJavadoc);
            this.methodJavadoc = checkAndStore(javadocs, listener.method, this.methodJavadoc);
            this.params = listener.params;

            if (this.typeJavadoc != null && this.methodJavadoc != null)
            {
                break;
            }
        }
    }

    private List<ClassInfo> findAllInterfaces(ClassInfo info)
    {
        List<ClassInfo> interfaces = new ArrayList<>();
        interfaces.add(info);

        for (int i = 0; i < interfaces.size(); i++)
        {
            ClassInfo latest = interfaces.get(i);

            for (ClassInfo parent : latest.getInterfaces())
            {
                if (!interfaces.contains(parent))
                {
                    interfaces.add(parent);
                }
            }
        }

        return interfaces;
    }

    private Token checkAndStore(List<Token> javadocs, Token ref, Token target)
    {
        if (target != null || ref == null)
        {
            return target;
        }

        Token best = null;
        for (Token javadoc : javadocs)
        {
            int javadocId = javadoc.getTokenIndex();
            int refId = ref.getTokenIndex();

            int diff = refId - javadocId;
            int bestDiff = best == null ? Integer.MAX_VALUE : refId - best.getTokenIndex();

            if (diff >= 0 && diff < bestDiff)
            {
                best = javadoc;
            }
        }

        javadocs.remove(best);

        return best;
    }

    public CodeBlock getClassJavadoc()
    {
        return toCodeBlock(this.typeJavadoc).add("@param <X> the exception this interface may throw.\n")
                                            .build();
    }

    public CodeBlock getMethodJavadoc()
    {
        return toCodeBlock(this.methodJavadoc).build();
    }

    public List<String> getParamNames()
    {
        FormalParameterListContext paramsList = params.formalParameterList();

        if (paramsList == null)
        {
            return Collections.emptyList();
        }

        return paramsList.formalParameter()
                         .stream()
                         .map(FormalParameterContext::variableDeclaratorId)
                         .map(VariableDeclaratorIdContext::getText)
                         .collect(Collectors.toList());
    }

    private CodeBlock.Builder toCodeBlock(Token token)
    {
        String[] lines = token.getText()
                              .split("\\n");
        CodeBlock.Builder block = CodeBlock.builder();

        for (int i = 1; i < lines.length - 1; i++)
        {
            String line = lines[i];
            block.add("$L\n", line.replaceAll("\\*", "")
                                  .trim());
        }

        return block;
    }

    private CharStream readSourceFile(ProjectSpec spec, ClassInfo info)
    {
        String entryName = info.getName()
                               .replace(".", "/");

        if (entryName.contains("$"))
        {
            entryName = entryName.substring(0, entryName.indexOf('$'));
        }

        for (Path sourceLocation : spec.originalJavaSource())
        {
            try (ZipFile file = new ZipFile(sourceLocation.toFile()))
            {
                final ZipEntry entry = file.getEntry(String.format("%s.java", entryName));

                if (entry != null)
                {
                    return CharStreams.fromStream(file.getInputStream(entry));
                }
            }
            catch (IOException e)
            {
                throw new IllegalStateException(e);
            }
        }

        throw new IllegalStateException("Could not find the source file for " + info);
    }

}
