package org.immersed.gaffe.java.awt.image.renderable;

import java.awt.image.renderable.RenderedImageFactory;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRenderedImageFactory<X extends Throwable> extends RenderedImageFactory {
  @Override
  @SneakyThrows
  default java.awt.image.RenderedImage create(java.awt.image.renderable.ParameterBlock a,
      java.awt.RenderingHints b) {
    return tryCreate(a,b);
  }

  java.awt.image.RenderedImage tryCreate(java.awt.image.renderable.ParameterBlock a,
      java.awt.RenderingHints b) throws X;
}
