package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToIntBiFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts two arguments and produces an int-valued
 * result. This is the {@code int}-producing primitive specialization for
 * {@link BiFunction}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsInt(Object, Object)}.
 *
 * @param <T> the type of the first argument to the function
 * @param <U> the type of the second argument to the function
 *
 * @see BiFunction
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingToIntBiFunction<T, U, X extends Throwable> extends ToIntBiFunction<T, U>
{
    @Override
    @SneakyThrows
    default int applyAsInt(T t, U u)
    {
        return tryApplyAsInt(t, u);
    }

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     *
     * @throws X any exception that may be thrown.
     */
    int tryApplyAsInt(T t, U u) throws X;
}
