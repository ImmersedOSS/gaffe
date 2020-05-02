package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Function;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts one argument and produces a result.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #apply(Object)}.
 *
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFunction<T, R, X extends Throwable> extends Function<T, R>
{
    @Override
    @SneakyThrows
    default R apply(T t)
    {
        return tryApply(t);
    }

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     *
     * @throws X any exception that may be thrown.
     */
    R tryApply(T t) throws X;
}
