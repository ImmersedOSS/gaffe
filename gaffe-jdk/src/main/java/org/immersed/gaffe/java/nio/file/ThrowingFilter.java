package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.DirectoryStream;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFilter<T, X extends Throwable> extends DirectoryStream.Filter<T> {
  @Override
  @SneakyThrows
  default boolean accept(T a) {
    return tryAccept(a);
  }

  boolean tryAccept(T a) throws X;
}
