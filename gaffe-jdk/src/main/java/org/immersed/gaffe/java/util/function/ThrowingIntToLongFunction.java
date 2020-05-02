package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntToLongFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * long-valued result. This is the {@code int}-to-{@code long} primitive
 * specialization for {@link Function}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsLong(int)}.
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIntToLongFunction<X extends Throwable> extends IntToLongFunction
{
    @Override
    @SneakyThrows
    default long applyAsLong(int value)
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
    long tryApplyAsLong(int value) throws X;
}
