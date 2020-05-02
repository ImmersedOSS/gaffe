package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleUnaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation on a single {@code double}-valued operand that
 * produces a {@code double}-valued result. This is the primitive type
 * specialization of {@link UnaryOperator} for {@code double}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsDouble(double)}.
 *
 * @see UnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDoubleUnaryOperator<X extends Throwable> extends DoubleUnaryOperator
{
    @Override
    @SneakyThrows
    default double applyAsDouble(double operand)
    {
        return tryApplyAsDouble(operand);
    }

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand
     * @return the operator result
     *
     * @throws X any exception that may be thrown.
     */
    double tryApplyAsDouble(double operand) throws X;
}
