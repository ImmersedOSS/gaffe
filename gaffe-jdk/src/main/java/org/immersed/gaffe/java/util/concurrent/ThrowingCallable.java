package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.Callable;
import lombok.SneakyThrows;

/**
 * A task that returns a result and may throw an exception.
 * Implementors define a single method with no arguments called
 * {@code call}.
 *
 * <p>The {@code Callable} interface is similar to {@link
 * java.lang.Runnable}, in that both are designed for classes whose
 * instances are potentially executed by another thread.  A
 * {@code Runnable}, however, does not return a result and cannot
 * throw a checked exception.
 *
 * <p>The {@link Executors} class contains utility methods to
 * convert from other common forms to {@code Callable} classes.
 *
 * @see Executor
 * @since 1.5
 * @author Doug Lea
 * @param <V> the result type of method {@code call}
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingCallable<V, X extends Throwable> extends Callable<V> {
  @Override
  @SneakyThrows
  default V call() {
    return tryCall();
  }

  /**
   * Computes a result, or throws an exception if unable to do so.
   *
   * @return computed result
   * @throws Exception if unable to compute a result
   *
   * @throws X any exception that may be thrown.
   */
  V tryCall() throws X;
}
