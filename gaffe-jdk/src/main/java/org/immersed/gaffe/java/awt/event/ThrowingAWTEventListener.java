package org.immersed.gaffe.java.awt.event;

import java.awt.event.AWTEventListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingAWTEventListener<X extends Throwable> extends AWTEventListener {
  @Override
  @SneakyThrows
  default void eventDispatched(java.awt.AWTEvent a) {
    tryEventDispatched(a);
  }

  void tryEventDispatched(java.awt.AWTEvent a) throws X;
}
