package org.immersed.gaffe.java.awt.dnd;

import java.awt.dnd.DragGestureListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDragGestureListener<X extends Throwable> extends DragGestureListener {
  @Override
  @SneakyThrows
  default void dragGestureRecognized(java.awt.dnd.DragGestureEvent a) {
    tryDragGestureRecognized(a);
  }

  void tryDragGestureRecognized(java.awt.dnd.DragGestureEvent a) throws X;
}
