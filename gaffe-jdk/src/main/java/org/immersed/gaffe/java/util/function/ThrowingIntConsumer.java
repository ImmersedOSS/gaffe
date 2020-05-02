package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntConsumer;
import lombok.SneakyThrows;

/**
 * Represents an operation that accepts a single {@code int}-valued argument and
 * returns no result. This is the primitive type specialization of
 * {@link Consumer} for {@code int}. Unlike most other functional interfaces,
 * {@code IntConsumer} is expected to operate via side-effects.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #accept(int)}.
 *
 * @see Consumer
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIntConsumer<X extends Throwable> extends IntConsumer
{
    @Override
    @SneakyThrows
    default void accept(int value)
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
    void tryAccept(int value) throws X;
}
