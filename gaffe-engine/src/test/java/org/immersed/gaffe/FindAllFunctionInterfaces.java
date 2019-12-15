package org.immersed.gaffe;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicReference;

import org.immersed.gaffe.generation.JdkProject;

import io.github.classgraph.MethodParameterInfo;

public class FindAllFunctionInterfaces
{
    public static void main(String[] args) throws IOException
    {
        PrintStream stream = new PrintStream(new File("out.txt"));
        System.setErr(stream);

        JdkProject.create()
                  .functionalInterfaces()
                  .toList()
                  .stream()
                  .forEach(s ->
                  {
                      String name = s.superClassInfo()
                                     .getName();
                      String m = s.superMethodInfo()
                                  .getName();

                      AtomicReference<String> ref = new AtomicReference<>("");
                      StringBuilder builder = new StringBuilder("(");
                      for (MethodParameterInfo param : s.superMethodInfo()
                                                        .getParameterInfo())
                      {
                          builder.append(ref.getAndSet(", "));
                          builder.append(param.getTypeSignatureOrTypeDescriptor());
                      }
                      builder.append(")");

                      System.out.println(String.format("%s.%s%s", name, m, builder.toString()));
                  });
    }
}
