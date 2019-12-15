package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BiPredicate;
import lombok.SneakyThrows;

/**
 * Represents a predicate (boolean-valued function) of two arguments.  This is
 * the two-arity specialization of {@link Predicate}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object, Object)}.
 *
 * @param <T> the type of the first argument to the predicate
 * @param <U> the type of the second argument the predicate
 *
 * @see Predicate
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBiPredicate<T, U, X extends Throwable> extends BiPredicate<T, U> {
  @Override
  @SneakyThrows
  default boolean test(T t, U u) {
    return tryTest(t,u);
  }

  /**
   * Evaluates this predicate on the given arguments.
   *
   * @param t the first input argument
   * @param u the second input argument
   * @return {@code true} if the input arguments match the predicate,
   * otherwise {@code false}
   *
   * @throws X any exception that may be thrown.
   */
  boolean tryTest(T t, U u) throws X;
}
