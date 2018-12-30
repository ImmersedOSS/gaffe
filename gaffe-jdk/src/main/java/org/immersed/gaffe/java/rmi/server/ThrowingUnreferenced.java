package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.Unreferenced;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingUnreferenced<X extends Throwable> extends Unreferenced {
  @Override
  @SneakyThrows
  default void unreferenced() {
    tryUnreferenced();
  }

  void tryUnreferenced() throws X;
}
