package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.Builder;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBuilder<T, X extends Throwable> extends Builder<T> {
  @Override
  @SneakyThrows
  default T build() {
    return tryBuild();
  }

  T tryBuild() throws X;
}
