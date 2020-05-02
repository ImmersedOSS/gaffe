package org.immersed.gaffe.generation;

import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.core.formatter.CodeFormatterApplication;
import org.junit.jupiter.api.Test;

public class FormattingContextTest
{
    @Test
    public void testFormatter() throws Exception
    {
        IApplicationContext context = new FormattingContext(JdkProject.create());

        CodeFormatterApplication app = new CodeFormatterApplication();
        app.start(context);
    }
}
