package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToDoubleFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that produces a double-valued result.  This is the
 * {@code double}-producing primitive specialization for {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsDouble(Object)}.
 *
 * @param <T> the type of the input to the function
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingToDoubleFunction<T, X extends Throwable> extends ToDoubleFunction<T> {
  @Override
  @SneakyThrows
  default double applyAsDouble(T value) {
    return tryApplyAsDouble(value);
  }

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   *
   * @throws X any exception that may be thrown.
   */
  double tryApplyAsDouble(T value) throws X;
}
