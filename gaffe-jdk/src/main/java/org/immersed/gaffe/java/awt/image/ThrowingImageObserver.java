package org.immersed.gaffe.java.awt.image;

import java.awt.image.ImageObserver;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingImageObserver<X extends Throwable> extends ImageObserver {
  @Override
  @SneakyThrows
  default boolean imageUpdate(java.awt.Image a, int b, int c, int d, int e, int f) {
    return tryImageUpdate(a,b,c,d,e,f);
  }

  boolean tryImageUpdate(java.awt.Image a, int b, int c, int d, int e, int f) throws X;
}
