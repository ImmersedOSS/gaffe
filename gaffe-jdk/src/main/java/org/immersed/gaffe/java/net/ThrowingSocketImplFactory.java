package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.SocketImplFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingSocketImplFactory<X extends Throwable> extends SocketImplFactory {
  @Override
  @SneakyThrows
  default java.net.SocketImpl createSocketImpl() {
    return tryCreateSocketImpl();
  }

  java.net.SocketImpl tryCreateSocketImpl() throws X;
}
