package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongPredicate;
import lombok.SneakyThrows;

/**
 * Represents a predicate (boolean-valued function) of one {@code long}-valued
 * argument. This is the {@code long}-consuming primitive type specialization of
 * {@link Predicate}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(long)}.
 *
 * @see Predicate
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongPredicate<X extends Throwable> extends LongPredicate {
  @Override
  @SneakyThrows
  default boolean test(long value) {
    return tryTest(value);
  }

  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   *
   * @throws X any exception that may be thrown.
   */
  boolean tryTest(long value) throws X;
}
