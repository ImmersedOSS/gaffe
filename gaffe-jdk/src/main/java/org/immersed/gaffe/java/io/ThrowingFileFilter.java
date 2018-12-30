package org.immersed.gaffe.java.io;

import java.io.FileFilter;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFileFilter<X extends Throwable> extends FileFilter {
  @Override
  @SneakyThrows
  default boolean accept(java.io.File a) {
    return tryAccept(a);
  }

  boolean tryAccept(java.io.File a) throws X;
}
