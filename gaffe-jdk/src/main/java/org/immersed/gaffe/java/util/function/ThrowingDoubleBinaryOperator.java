package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleBinaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation upon two {@code double}-valued operands and producing a
 * {@code double}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code double}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsDouble(double, double)}.
 *
 * @see BinaryOperator
 * @see DoubleUnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDoubleBinaryOperator<X extends Throwable> extends DoubleBinaryOperator {
  @Override
  @SneakyThrows
  default double applyAsDouble(double left, double right) {
    return tryApplyAsDouble(left,right);
  }

  /**
   * Applies this operator to the given operands.
   *
   * @param left the first operand
   * @param right the second operand
   * @return the operator result
   *
   * @throws X any exception that may be thrown.
   */
  double tryApplyAsDouble(double left, double right) throws X;
}
