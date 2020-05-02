package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleToLongFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts a double-valued argument and produces a
 * long-valued result. This is the {@code double}-to-{@code long} primitive
 * specialization for {@link Function}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsLong(double)}.
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDoubleToLongFunction<X extends Throwable> extends DoubleToLongFunction
{
    @Override
    @SneakyThrows
    default long applyAsLong(double value)
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
    long tryApplyAsLong(double value) throws X;
}
