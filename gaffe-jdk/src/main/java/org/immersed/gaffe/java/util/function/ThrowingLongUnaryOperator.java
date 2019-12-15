package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongUnaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code long}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsLong(long)}.
 *
 * @see UnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongUnaryOperator<X extends Throwable> extends LongUnaryOperator {
  @Override
  @SneakyThrows
  default long applyAsLong(long operand) {
    return tryApplyAsLong(operand);
  }

  /**
   * Applies this operator to the given operand.
   *
   * @param operand the operand
   * @return the operator result
   *
   * @throws X any exception that may be thrown.
   */
  long tryApplyAsLong(long operand) throws X;
}
