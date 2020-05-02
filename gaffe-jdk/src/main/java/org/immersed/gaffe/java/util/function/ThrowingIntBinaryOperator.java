package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntBinaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation upon two {@code int}-valued operands and producing an
 * {@code int}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsInt(int, int)}.
 *
 * @see BinaryOperator
 * @see IntUnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIntBinaryOperator<X extends Throwable> extends IntBinaryOperator
{
    @Override
    @SneakyThrows
    default int applyAsInt(int left, int right)
    {
        return tryApplyAsInt(left, right);
    }

    /**
     * Applies this operator to the given operands.
     *
     * @param left  the first operand
     * @param right the second operand
     * @return the operator result
     *
     * @throws X any exception that may be thrown.
     */
    int tryApplyAsInt(int left, int right) throws X;
}
