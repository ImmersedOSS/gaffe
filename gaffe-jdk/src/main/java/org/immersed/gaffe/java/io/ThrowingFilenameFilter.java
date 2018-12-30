package org.immersed.gaffe.java.io;

import java.io.FilenameFilter;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFilenameFilter<X extends Throwable> extends FilenameFilter {
  @Override
  @SneakyThrows
  default boolean accept(java.io.File a, java.lang.String b) {
    return tryAccept(a,b);
  }

  boolean tryAccept(java.io.File a, java.lang.String b) throws X;
}
