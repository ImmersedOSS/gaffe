package org.immersed.gaffe.java.io;

import java.io.Closeable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCloseable<X extends Throwable> extends Closeable {
  @Override
  @SneakyThrows
  default void close() {
    tryClose();
  }

  void tryClose() throws X;
}
