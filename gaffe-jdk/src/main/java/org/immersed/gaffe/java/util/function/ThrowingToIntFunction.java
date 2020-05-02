package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToIntFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that produces an int-valued result. This is the
 * {@code int}-producing primitive specialization for {@link Function}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsInt(Object)}.
 *
 * @param <T> the type of the input to the function
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingToIntFunction<T, X extends Throwable> extends ToIntFunction<T>
{
    @Override
    @SneakyThrows
    default int applyAsInt(T value)
    {
        return tryApplyAsInt(value);
    }

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     *
     * @throws X any exception that may be thrown.
     */
    int tryApplyAsInt(T value) throws X;
}
