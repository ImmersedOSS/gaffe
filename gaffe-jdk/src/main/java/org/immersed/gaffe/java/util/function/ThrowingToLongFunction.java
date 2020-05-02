package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToLongFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that produces a long-valued result. This is the
 * {@code long}-producing primitive specialization for {@link Function}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsLong(Object)}.
 *
 * @param <T> the type of the input to the function
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingToLongFunction<T, X extends Throwable> extends ToLongFunction<T>
{
    @Override
    @SneakyThrows
    default long applyAsLong(T value)
    {
        return tryApplyAsLong(value);
    }

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     *
     * @throws X any exception that may be thrown.
     */
    long tryApplyAsLong(T value) throws X;
}
