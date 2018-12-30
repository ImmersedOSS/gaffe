package org.immersed.gaffe.java.awt.dnd;

import java.awt.dnd.DragSourceMotionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDragSourceMotionListener<X extends Throwable> extends DragSourceMotionListener {
  @Override
  @SneakyThrows
  default void dragMouseMoved(java.awt.dnd.DragSourceDragEvent a) {
    tryDragMouseMoved(a);
  }

  void tryDragMouseMoved(java.awt.dnd.DragSourceDragEvent a) throws X;
}
