package org.immersed.gaffe.java.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.Observer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingObserver<X extends Throwable> extends Observer {
  @Override
  @SneakyThrows
  default void update(java.util.Observable a, java.lang.Object b) {
    tryUpdate(a,b);
  }

  void tryUpdate(java.util.Observable a, java.lang.Object b) throws X;
}
