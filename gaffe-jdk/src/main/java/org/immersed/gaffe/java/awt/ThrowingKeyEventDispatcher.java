package org.immersed.gaffe.java.awt;

import java.awt.KeyEventDispatcher;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingKeyEventDispatcher<X extends Throwable> extends KeyEventDispatcher {
  @Override
  @SneakyThrows
  default boolean dispatchKeyEvent(java.awt.event.KeyEvent a) {
    return tryDispatchKeyEvent(a);
  }

  boolean tryDispatchKeyEvent(java.awt.event.KeyEvent a) throws X;
}
