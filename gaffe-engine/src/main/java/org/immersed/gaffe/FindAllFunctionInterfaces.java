package org.immersed.gaffe;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;

public class FindAllFunctionInterfaces
{
    public static void main(String[] args) throws IOException
    {
        PrintStream stream = new PrintStream(new File("out.txt"));
        System.setErr(stream);

        AtomicInteger count = new AtomicInteger();
        FunctionalInterfaceSet.jdk()
                              .toList()
                              .stream()
                              .map(spec -> spec.superClassInfo())
                              .map(ci -> ci.getName())
                              .map(name -> count.incrementAndGet() + " " + name)
                              .forEach(System.out::println);
    }
}
