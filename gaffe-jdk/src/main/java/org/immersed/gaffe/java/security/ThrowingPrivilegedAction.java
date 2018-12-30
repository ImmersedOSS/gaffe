package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.PrivilegedAction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPrivilegedAction<T, X extends Throwable> extends PrivilegedAction<T> {
  @Override
  @SneakyThrows
  default T run() {
    return tryRun();
  }

  T tryRun() throws X;
}
