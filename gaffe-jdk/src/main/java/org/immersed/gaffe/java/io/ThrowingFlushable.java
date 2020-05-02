package org.immersed.gaffe.java.io;

import java.io.Flushable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A <tt>Flushable</tt> is a destination of data that can be flushed. The flush
 * method is invoked to write any buffered output to the underlying stream.
 *
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFlushable<X extends Throwable> extends Flushable
{
    @Override
    @SneakyThrows
    default void flush()
    {
        tryFlush();
    }

    /**
     * Flushes this stream by writing any buffered output to the underlying stream.
     *
     * @throws IOException If an I/O error occurs
     *
     * @throws X           any exception that may be thrown.
     */
    void tryFlush() throws X;
}
