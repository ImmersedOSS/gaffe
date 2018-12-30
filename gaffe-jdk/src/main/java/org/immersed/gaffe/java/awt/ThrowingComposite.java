package org.immersed.gaffe.java.awt;

import java.awt.Composite;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingComposite<X extends Throwable> extends Composite {
  @Override
  @SneakyThrows
  default java.awt.CompositeContext createContext(java.awt.image.ColorModel a,
      java.awt.image.ColorModel b, java.awt.RenderingHints c) {
    return tryCreateContext(a,b,c);
  }

  java.awt.CompositeContext tryCreateContext(java.awt.image.ColorModel a,
      java.awt.image.ColorModel b, java.awt.RenderingHints c) throws X;
}
