package org.immersed.gaffe.java.util.logging;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.logging.Filter;
import lombok.SneakyThrows;

/**
 * A Filter can be used to provide fine grain control over what is logged,
 * beyond the control provided by log levels.
 * <p>
 * Each Logger and each Handler can have a filter associated with it. The Logger
 * or Handler will call the isLoggable method to check if a given LogRecord
 * should be published. If isLoggable returns false, the LogRecord will be
 * discarded.
 *
 * @since 1.4
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFilter<X extends Throwable> extends Filter
{
    @Override
    @SneakyThrows
    default boolean isLoggable(java.util.logging.LogRecord record)
    {
        return tryIsLoggable(record);
    }

    /**
     * Check if a given log record should be published.
     * 
     * @param record a LogRecord
     * @return true if the log record should be published.
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryIsLoggable(java.util.logging.LogRecord record) throws X;
}
