package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Predicate;
import lombok.SneakyThrows;

/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object)}.
 *
 * @param <T> the type of the input to the predicate
 *
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPredicate<T, X extends Throwable> extends Predicate<T> {
  @Override
  @SneakyThrows
  default boolean test(T t) {
    return tryTest(t);
  }

  /**
   * Evaluates this predicate on the given argument.
   *
   * @param t the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   *
   * @throws X any exception that may be thrown.
   */
  boolean tryTest(T t) throws X;
}
