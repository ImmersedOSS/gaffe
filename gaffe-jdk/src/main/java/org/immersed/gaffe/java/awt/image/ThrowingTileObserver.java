package org.immersed.gaffe.java.awt.image;

import java.awt.image.TileObserver;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingTileObserver<X extends Throwable> extends TileObserver {
  @Override
  @SneakyThrows
  default void tileUpdate(java.awt.image.WritableRenderedImage a, int b, int c, boolean d) {
    tryTileUpdate(a,b,c,d);
  }

  void tryTileUpdate(java.awt.image.WritableRenderedImage a, int b, int c, boolean d) throws X;
}
