package org.immersed.gaffe.java.awt.event;

import java.awt.event.AdjustmentListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingAdjustmentListener<X extends Throwable> extends AdjustmentListener {
  @Override
  @SneakyThrows
  default void adjustmentValueChanged(java.awt.event.AdjustmentEvent a) {
    tryAdjustmentValueChanged(a);
  }

  void tryAdjustmentValueChanged(java.awt.event.AdjustmentEvent a) throws X;
}
