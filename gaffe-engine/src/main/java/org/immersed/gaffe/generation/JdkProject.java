package org.immersed.gaffe.generation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.immersed.gaffe.FunctionalInterfaceSet;

import io.github.classgraph.ClassGraph;

/**
 * This class is a placeholder for the JDK project until we can come up with a
 * better solution.
 * 
 * @author Dan Avila
 *
 */
public final class JdkProject
{
    public static ProjectSpec create() throws IOException
    {
        String prop = System.getProperties()
                            .get("java.home")
                            .toString();

        // TODO: assumes we are running from jre inside of JDK.
        Path path = Paths.get(prop)
                         .getParent();

        List<Path> elements = Files.walk(path, 1)
                                   .filter(p ->
                                   {
                                       String s = p.getFileName()
                                                   .toString();
                                       return s.contains("src") && s.endsWith(".zip");
                                   })
                                   .collect(Collectors.toList());

        return new ProjectSpec.Builder().projectName("Jdk")
                                        .addAllOriginalJavaSource(elements)
                                        .projectFolder(Paths.get("../", "gaffe-jdk")
                                                            .toAbsolutePath())
                                        .functionalInterfaces(jdk())
                                        .build();
    }

    private static FunctionalInterfaceSet jdk()
    {
        ClassGraph cg = new ClassGraph().enableSystemJarsAndModules()
                                        .enableAllInfo()
                                        .disableDirScanning()
                                        .whitelistJars("rt.jar", "jfxrt.jar")
                                        .whitelistLibOrExtJars("rt.jar", "jfxrt.jar")
                                        .whitelistPackages("java", "javafx", "org")
                                        .blacklistPackages("org.jcp", "java.awt.peer", "org.w3c.dom.xpath")
                                        .blacklistClasses("java.security.cert.CertPathParameters",
                                                "java.security.cert.CertStoreParameters",
                                                "java.security.cert.CertPathValidatorResult");

        return new FunctionalInterfaceSet(cg);
    }
}
