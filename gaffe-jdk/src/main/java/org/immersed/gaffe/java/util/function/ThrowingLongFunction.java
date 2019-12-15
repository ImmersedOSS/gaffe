package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * result.  This is the {@code long}-consuming primitive specialization for
 * {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(long)}.
 *
 * @param <R> the type of the result of the function
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongFunction<R, X extends Throwable> extends LongFunction<R> {
  @Override
  @SneakyThrows
  default R apply(long value) {
    return tryApply(value);
  }

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   *
   * @throws X any exception that may be thrown.
   */
  R tryApply(long value) throws X;
}
