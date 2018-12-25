package org.immersed.gaffe;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FindAllFunctionInterfaces
{
    public static void main(String[] args) throws IOException
    {
        PrintStream stream = new PrintStream(new File("out.txt"));
        System.setErr(stream);

        FunctionInterfaceFinder.jdk()
                               .findAll()
                               .stream()
                               .map(spec -> spec.classInfo())
                               .map(ci -> ci.getPackageName() + "." + ci.getName())
                               .forEach(System.out::println);
    }
}
