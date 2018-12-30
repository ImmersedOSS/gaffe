package org.immersed.gaffe.java.awt.event;

import java.awt.event.ItemListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingItemListener<X extends Throwable> extends ItemListener {
  @Override
  @SneakyThrows
  default void itemStateChanged(java.awt.event.ItemEvent a) {
    tryItemStateChanged(a);
  }

  void tryItemStateChanged(java.awt.event.ItemEvent a) throws X;
}
