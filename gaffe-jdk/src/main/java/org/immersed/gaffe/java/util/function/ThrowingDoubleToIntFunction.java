package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleToIntFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts a double-valued argument and produces an
 * int-valued result.  This is the {@code double}-to-{@code int} primitive
 * specialization for {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(double)}.
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDoubleToIntFunction<X extends Throwable> extends DoubleToIntFunction {
  @Override
  @SneakyThrows
  default int applyAsInt(double value) {
    return tryApplyAsInt(value);
  }

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   *
   * @throws X any exception that may be thrown.
   */
  int tryApplyAsInt(double value) throws X;
}
