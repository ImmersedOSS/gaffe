package org.immersed.gaffe.java.beans;

import java.beans.VetoableChangeListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingVetoableChangeListener<X extends Throwable> extends VetoableChangeListener {
  @Override
  @SneakyThrows
  default void vetoableChange(java.beans.PropertyChangeEvent a) {
    tryVetoableChange(a);
  }

  void tryVetoableChange(java.beans.PropertyChangeEvent a) throws X;
}
