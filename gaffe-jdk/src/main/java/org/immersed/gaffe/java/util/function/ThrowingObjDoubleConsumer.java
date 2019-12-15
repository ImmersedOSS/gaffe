package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ObjDoubleConsumer;
import lombok.SneakyThrows;

/**
 * Represents an operation that accepts an object-valued and a
 * {@code double}-valued argument, and returns no result.  This is the
 * {@code (reference, double)} specialization of {@link BiConsumer}.
 * Unlike most other functional interfaces, {@code ObjDoubleConsumer} is
 * expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, double)}.
 *
 * @param <T> the type of the object argument to the operation
 *
 * @see BiConsumer
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingObjDoubleConsumer<T, X extends Throwable> extends ObjDoubleConsumer<T> {
  @Override
  @SneakyThrows
  default void accept(T t, double value) {
    tryAccept(t,value);
  }

  /**
   * Performs this operation on the given arguments.
   *
   * @param t the first input argument
   * @param value the second input argument
   *
   * @throws X any exception that may be thrown.
   */
  void tryAccept(T t, double value) throws X;
}
