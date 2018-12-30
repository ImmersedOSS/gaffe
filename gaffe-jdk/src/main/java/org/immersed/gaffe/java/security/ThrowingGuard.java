package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.Guard;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingGuard<X extends Throwable> extends Guard {
  @Override
  @SneakyThrows
  default void checkGuard(java.lang.Object a) {
    tryCheckGuard(a);
  }

  void tryCheckGuard(java.lang.Object a) throws X;
}
