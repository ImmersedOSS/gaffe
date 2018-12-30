package org.immersed.gaffe.java.beans;

import java.beans.PropertyChangeListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPropertyChangeListener<X extends Throwable> extends PropertyChangeListener {
  @Override
  @SneakyThrows
  default void propertyChange(java.beans.PropertyChangeEvent a) {
    tryPropertyChange(a);
  }

  void tryPropertyChange(java.beans.PropertyChangeEvent a) throws X;
}
