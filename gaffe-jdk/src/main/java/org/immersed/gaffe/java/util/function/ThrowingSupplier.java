package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Supplier;
import lombok.SneakyThrows;

/**
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #get()}.
 *
 * @param <T> the type of results supplied by this supplier
 *
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingSupplier<T, X extends Throwable> extends Supplier<T> {
  @Override
  @SneakyThrows
  default T get() {
    return tryGet();
  }

  /**
   * Gets a result.
   *
   * @return a result
   *
   * @throws X any exception that may be thrown.
   */
  T tryGet() throws X;
}
