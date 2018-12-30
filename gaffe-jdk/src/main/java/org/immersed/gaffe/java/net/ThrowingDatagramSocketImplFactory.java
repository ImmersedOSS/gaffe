package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.DatagramSocketImplFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDatagramSocketImplFactory<X extends Throwable> extends DatagramSocketImplFactory {
  @Override
  @SneakyThrows
  default java.net.DatagramSocketImpl createDatagramSocketImpl() {
    return tryCreateDatagramSocketImpl();
  }

  java.net.DatagramSocketImpl tryCreateDatagramSocketImpl() throws X;
}
