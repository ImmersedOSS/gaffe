package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.RMIFailureHandler;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRMIFailureHandler<X extends Throwable> extends RMIFailureHandler {
  @Override
  @SneakyThrows
  default boolean failure(java.lang.Exception a) {
    return tryFailure(a);
  }

  boolean tryFailure(java.lang.Exception a) throws X;
}
