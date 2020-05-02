package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongToDoubleFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * double-valued result. This is the {@code long}-to-{@code double} primitive
 * specialization for {@link Function}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsDouble(long)}.
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongToDoubleFunction<X extends Throwable> extends LongToDoubleFunction
{
    @Override
    @SneakyThrows
    default double applyAsDouble(long value)
    {
        return tryApplyAsDouble(value);
    }

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     *
     * @throws X any exception that may be thrown.
     */
    double tryApplyAsDouble(long value) throws X;
}
