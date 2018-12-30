package org.immersed.gaffe.java.lang;

import java.lang.AutoCloseable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingAutoCloseable<X extends Throwable> extends AutoCloseable {
  @Override
  @SneakyThrows
  default void close() {
    tryClose();
  }

  void tryClose() throws X;
}
