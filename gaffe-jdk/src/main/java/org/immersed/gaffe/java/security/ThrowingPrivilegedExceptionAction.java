package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.PrivilegedExceptionAction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPrivilegedExceptionAction<T, X extends Throwable> extends PrivilegedExceptionAction<T> {
  @Override
  @SneakyThrows
  default T run() {
    return tryRun();
  }

  T tryRun() throws X;
}
