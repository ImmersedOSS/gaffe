package org.immersed.gaffe.java.awt.datatransfer;

import java.awt.datatransfer.FlavorListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFlavorListener<X extends Throwable> extends FlavorListener {
  @Override
  @SneakyThrows
  default void flavorsChanged(java.awt.datatransfer.FlavorEvent a) {
    tryFlavorsChanged(a);
  }

  void tryFlavorsChanged(java.awt.datatransfer.FlavorEvent a) throws X;
}
