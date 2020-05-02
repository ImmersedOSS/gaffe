package org.immersed.gaffe.java.awt.print;

import java.awt.print.PrinterGraphics;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The <code>PrinterGraphics</code> interface is implemented by
 * {@link java.awt.Graphics} objects that are passed to {@link Printable}
 * objects to render a page. It allows an application to find the
 * {@link PrinterJob} object that is controlling the printing.
 * 
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPrinterGraphics<X extends Throwable> extends PrinterGraphics
{
    @Override
    @SneakyThrows
    default java.awt.print.PrinterJob getPrinterJob()
    {
        return tryGetPrinterJob();
    }

    /**
     * Returns the <code>PrinterJob</code> that is controlling the current rendering
     * request.
     * 
     * @return the <code>PrinterJob</code> controlling the current rendering
     *         request.
     * @see java.awt.print.Printable
     *
     * @throws X any exception that may be thrown.
     */
    java.awt.print.PrinterJob tryGetPrinterJob() throws X;
}
