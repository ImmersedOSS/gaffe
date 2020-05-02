package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongBinaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation upon two {@code long}-valued operands and producing a
 * {@code long}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code long}.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #applyAsLong(long, long)}.
 *
 * @see BinaryOperator
 * @see LongUnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongBinaryOperator<X extends Throwable> extends LongBinaryOperator
{
    @Override
    @SneakyThrows
    default long applyAsLong(long left, long right)
    {
        return tryApplyAsLong(left, right);
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
    long tryApplyAsLong(long left, long right) throws X;
}
