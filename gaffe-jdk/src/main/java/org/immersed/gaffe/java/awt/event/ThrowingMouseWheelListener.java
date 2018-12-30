package org.immersed.gaffe.java.awt.event;

import java.awt.event.MouseWheelListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingMouseWheelListener<X extends Throwable> extends MouseWheelListener {
  @Override
  @SneakyThrows
  default void mouseWheelMoved(java.awt.event.MouseWheelEvent a) {
    tryMouseWheelMoved(a);
  }

  void tryMouseWheelMoved(java.awt.event.MouseWheelEvent a) throws X;
}
