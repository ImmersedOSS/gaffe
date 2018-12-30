package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.PathMatcher;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPathMatcher<X extends Throwable> extends PathMatcher {
  @Override
  @SneakyThrows
  default boolean matches(java.nio.file.Path a) {
    return tryMatches(a);
  }

  boolean tryMatches(java.nio.file.Path a) throws X;
}
