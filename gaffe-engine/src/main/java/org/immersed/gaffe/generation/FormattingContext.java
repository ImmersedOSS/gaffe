package org.immersed.gaffe.generation;

import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;

public class FormattingContext implements IApplicationContext
{
    private final Path formatter;
    private final ProjectSpec spec;

    public FormattingContext(ProjectSpec spec) throws Exception
    {
        this.formatter = Paths.get(".settings/org.eclipse.jdt.core.prefs");
        this.spec = spec;

        Class<?> type = org.eclipse.jdt.internal.core.util.Util.class;

        Field field = type.getDeclaredField("JAVA_LIKE_EXTENSIONS");
        field.setAccessible(true);

        char[][] extensions = new char[1][];
        extensions[0] = "java".toCharArray();
        field.set(null, extensions);
    }

    @Override
    public Map<?, ?> getArguments()
    {
        String source = spec.sourceFolder()
                            .toString();
        String tests = spec.sourceFolder()
                           .toString();

        List<String> argsList = Arrays.asList("-config", formatter.toString(), source, tests);
        String[] args = new String[argsList.size()];
        argsList.toArray(args);

        final String key = IApplicationContext.APPLICATION_ARGS;
        return Collections.singletonMap(key, args);
    }

    @Override
    public void applicationRunning()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getBrandingApplication()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getBrandingName()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getBrandingDescription()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getBrandingId()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getBrandingProperty(String key)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Bundle getBrandingBundle()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setResult(Object result, IApplication application)
    {
        throw new UnsupportedOperationException();
    }

}
