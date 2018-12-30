package org.immersed.gaffe.java.awt.event;

import java.awt.event.WindowStateListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingWindowStateListener<X extends Throwable> extends WindowStateListener {
  @Override
  @SneakyThrows
  default void windowStateChanged(java.awt.event.WindowEvent a) {
    tryWindowStateChanged(a);
  }

  void tryWindowStateChanged(java.awt.event.WindowEvent a) throws X;
}
