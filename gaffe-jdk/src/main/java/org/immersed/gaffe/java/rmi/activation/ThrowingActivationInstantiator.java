package org.immersed.gaffe.java.rmi.activation;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.activation.ActivationInstantiator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingActivationInstantiator<X extends Throwable> extends ActivationInstantiator {
  @Override
  @SneakyThrows
  default java.rmi.MarshalledObject<? extends java.rmi.Remote> newInstance(
      java.rmi.activation.ActivationID a, java.rmi.activation.ActivationDesc b) {
    return tryNewInstance(a,b);
  }

  java.rmi.MarshalledObject<? extends java.rmi.Remote> tryNewInstance(
      java.rmi.activation.ActivationID a, java.rmi.activation.ActivationDesc b) throws X;
}
