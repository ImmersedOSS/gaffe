package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongConsumer;
import lombok.SneakyThrows;

/**
 * Represents an operation that accepts a single {@code long}-valued argument
 * and returns no result. This is the primitive type specialization of
 * {@link Consumer} for {@code long}. Unlike most other functional interfaces,
 * {@code LongConsumer} is expected to operate via side-effects.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #accept(long)}.
 *
 * @see Consumer
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongConsumer<X extends Throwable> extends LongConsumer
{
    @Override
    @SneakyThrows
    default void accept(long value)
    {
        tryAccept(value);
    }

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     *
     * @throws X any exception that may be thrown.
     */
    void tryAccept(long value) throws X;
}
