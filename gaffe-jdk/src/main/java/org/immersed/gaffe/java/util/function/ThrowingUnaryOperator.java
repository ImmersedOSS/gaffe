package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.UnaryOperator;
import lombok.SneakyThrows;

/**
 * Represents an operation on a single operand that produces a result of the
 * same type as its operand.  This is a specialization of {@code Function} for
 * the case where the operand and result are of the same type.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object)}.
 *
 * @param <T> the type of the operand and result of the operator
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingUnaryOperator<T, X extends Throwable> extends UnaryOperator<T> {
  @Override
  @SneakyThrows
  default T apply(T t) {
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
  T tryApply(T t) throws X;
}
