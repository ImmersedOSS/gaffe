package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntUnaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * an {@code int}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code int}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(int)}.
 *
 * @see UnaryOperator
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIntUnaryOperator<X extends Throwable> extends IntUnaryOperator {
  @Override
  @SneakyThrows
  default int applyAsInt(int operand) {
    return tryApplyAsInt(operand);
  }

  /**
   * Applies this operator to the given operand.
   *
   * @param operand the operand
   * @return the operator result
   *
   * @throws X any exception that may be thrown.
   */
  int tryApplyAsInt(int operand) throws X;
}
