package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongToIntFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts a long-valued argument and produces an
 * int-valued result.  This is the {@code long}-to-{@code int} primitive
 * specialization for {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsInt(long)}.
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongToIntFunction<X extends Throwable> extends LongToIntFunction {
  @Override
  @SneakyThrows
  default int applyAsInt(long value) {
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
  int tryApplyAsInt(long value) throws X;
}
