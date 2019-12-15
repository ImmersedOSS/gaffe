package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.Builder;
import lombok.SneakyThrows;

/**
 * Interface representing a builder. Builders are objects that are used to
 * construct other objects.
 *
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBuilder<T, X extends Throwable> extends Builder<T> {
  @Override
  @SneakyThrows
  default T build() {
    return tryBuild();
  }

  /**
   * Builds and returns the object.
   *
   * @throws X any exception that may be thrown.
   */
  T tryBuild() throws X;
}
