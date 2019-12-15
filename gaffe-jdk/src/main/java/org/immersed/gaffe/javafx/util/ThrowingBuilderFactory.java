package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.BuilderFactory;
import lombok.SneakyThrows;

/**
 * Interface representing a builder factory. Builder factories are used to
 * produce builders.
 *
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBuilderFactory<X extends Throwable> extends BuilderFactory {
  @Override
  @SneakyThrows
  default javafx.util.Builder<?> getBuilder(java.lang.Class<?> type) {
    return tryGetBuilder(type);
  }

  /**
   * Returns a builder suitable for constructing instances of the given type.
   *
   * @param type
   *
   * @return
   * A builder for the given type, or <tt>null</tt> if this factory does not
   * produce builders for the type.
   *
   * @throws X any exception that may be thrown.
   */
  javafx.util.Builder<?> tryGetBuilder(java.lang.Class<?> type) throws X;
}
