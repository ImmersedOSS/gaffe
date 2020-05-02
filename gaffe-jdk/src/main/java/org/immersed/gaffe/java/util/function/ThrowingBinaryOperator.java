package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BinaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation upon two operands of the same type, producing a
 * result of the same type as the operands. This is a specialization of
 * {@link BiFunction} for the case where the operands and the result are all of
 * the same type.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the operands and result of the operator
 *
 * @see BiFunction
 * @see UnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBinaryOperator<T, X extends Throwable> extends BinaryOperator<T>
{
    @Override
    @SneakyThrows
    default T apply(T t, T u)
    {
        return tryApply(t, u);
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
    T tryApply(T t, T u) throws X;
}
