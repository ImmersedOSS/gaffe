package org.immersed.gaffe.java.awt;

import java.awt.Stroke;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingStroke<X extends Throwable> extends Stroke {
  @Override
  @SneakyThrows
  default java.awt.Shape createStrokedShape(java.awt.Shape a) {
    return tryCreateStrokedShape(a);
  }

  java.awt.Shape tryCreateStrokedShape(java.awt.Shape a) throws X;
}
