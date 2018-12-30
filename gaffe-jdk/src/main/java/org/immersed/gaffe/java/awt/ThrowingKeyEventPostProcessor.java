package org.immersed.gaffe.java.awt;

import java.awt.KeyEventPostProcessor;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingKeyEventPostProcessor<X extends Throwable> extends KeyEventPostProcessor {
  @Override
  @SneakyThrows
  default boolean postProcessKeyEvent(java.awt.event.KeyEvent a) {
    return tryPostProcessKeyEvent(a);
  }

  boolean tryPostProcessKeyEvent(java.awt.event.KeyEvent a) throws X;
}
