package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.RMIServerSocketFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRMIServerSocketFactory<X extends Throwable> extends RMIServerSocketFactory {
  @Override
  @SneakyThrows
  default java.net.ServerSocket createServerSocket(int a) {
    return tryCreateServerSocket(a);
  }

  java.net.ServerSocket tryCreateServerSocket(int a) throws X;
}
