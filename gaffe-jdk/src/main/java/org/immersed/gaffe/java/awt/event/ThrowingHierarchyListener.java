package org.immersed.gaffe.java.awt.event;

import java.awt.event.HierarchyListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingHierarchyListener<X extends Throwable> extends HierarchyListener {
  @Override
  @SneakyThrows
  default void hierarchyChanged(java.awt.event.HierarchyEvent a) {
    tryHierarchyChanged(a);
  }

  void tryHierarchyChanged(java.awt.event.HierarchyEvent a) throws X;
}
