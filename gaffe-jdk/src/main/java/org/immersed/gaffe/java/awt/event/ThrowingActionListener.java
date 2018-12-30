package org.immersed.gaffe.java.awt.event;

import java.awt.event.ActionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingActionListener<X extends Throwable> extends ActionListener {
  @Override
  @SneakyThrows
  default void actionPerformed(java.awt.event.ActionEvent a) {
    tryActionPerformed(a);
  }

  void tryActionPerformed(java.awt.event.ActionEvent a) throws X;
}
