package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.RMIClientSocketFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRMIClientSocketFactory<X extends Throwable> extends RMIClientSocketFactory {
  @Override
  @SneakyThrows
  default java.net.Socket createSocket(java.lang.String a, int b) {
    return tryCreateSocket(a,b);
  }

  java.net.Socket tryCreateSocket(java.lang.String a, int b) throws X;
}
