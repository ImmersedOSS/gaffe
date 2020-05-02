package org.immersed.gaffe.java.awt;

import java.awt.PrintGraphics;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * An abstract class which provides a print graphics context for a page.
 *
 * @author Amy Fowler
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPrintGraphics<X extends Throwable> extends PrintGraphics
{
    @Override
    @SneakyThrows
    default java.awt.PrintJob getPrintJob()
    {
        return tryGetPrintJob();
    }

    /**
     * Returns the PrintJob object from which this PrintGraphics object originated.
     *
     * @throws X any exception that may be thrown.
     */
    java.awt.PrintJob tryGetPrintJob() throws X;
}
