package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(int)}.
 *
 * @param <R> the type of the result of the function
 *
 * @see Function
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIntFunction<R, X extends Throwable> extends IntFunction<R> {
  @Override
  @SneakyThrows
  default R apply(int value) {
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
  R tryApply(int value) throws X;
}
