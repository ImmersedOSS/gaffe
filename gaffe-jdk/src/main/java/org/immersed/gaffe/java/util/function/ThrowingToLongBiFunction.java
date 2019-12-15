package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToLongBiFunction;
import lombok.SneakyThrows;

/**
 * Represents a function that accepts two arguments and produces a long-valued
 * result.  This is the {@code long}-producing primitive specialization for
 * {@link BiFunction}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsLong(Object, Object)}.
 *
 * @param <T> the type of the first argument to the function
 * @param <U> the type of the second argument to the function
 *
 * @see BiFunction
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingToLongBiFunction<T, U, X extends Throwable> extends ToLongBiFunction<T, U> {
  @Override
  @SneakyThrows
  default long applyAsLong(T t, U u) {
    return tryApplyAsLong(t,u);
  }

  /**
   * Applies this function to the given arguments.
   *
   * @param t the first function argument
   * @param u the second function argument
   * @return the function result
   *
   * @throws X any exception that may be thrown.
   */
  long tryApplyAsLong(T t, U u) throws X;
}
