package org.immersed.gaffe.java.awt.event;

import java.awt.event.TextListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingTextListener<X extends Throwable> extends TextListener {
  @Override
  @SneakyThrows
  default void textValueChanged(java.awt.event.TextEvent a) {
    tryTextValueChanged(a);
  }

  void tryTextValueChanged(java.awt.event.TextEvent a) throws X;
}
