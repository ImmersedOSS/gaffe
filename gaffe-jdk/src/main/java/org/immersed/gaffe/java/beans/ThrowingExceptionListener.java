package org.immersed.gaffe.java.beans;

import java.beans.ExceptionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingExceptionListener<X extends Throwable> extends ExceptionListener {
  @Override
  @SneakyThrows
  default void exceptionThrown(java.lang.Exception a) {
    tryExceptionThrown(a);
  }

  void tryExceptionThrown(java.lang.Exception a) throws X;
}
