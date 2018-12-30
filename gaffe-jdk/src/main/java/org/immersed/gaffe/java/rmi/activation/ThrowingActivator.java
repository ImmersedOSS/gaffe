package org.immersed.gaffe.java.rmi.activation;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.activation.Activator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingActivator<X extends Throwable> extends Activator {
  @Override
  @SneakyThrows
  default java.rmi.MarshalledObject<? extends java.rmi.Remote> activate(
      java.rmi.activation.ActivationID a, boolean b) {
    return tryActivate(a,b);
  }

  java.rmi.MarshalledObject<? extends java.rmi.Remote> tryActivate(
      java.rmi.activation.ActivationID a, boolean b) throws X;
}
