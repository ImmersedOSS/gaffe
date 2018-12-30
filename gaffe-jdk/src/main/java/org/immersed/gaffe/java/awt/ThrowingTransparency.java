package org.immersed.gaffe.java.awt;

import java.awt.Transparency;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingTransparency<X extends Throwable> extends Transparency {
  @Override
  @SneakyThrows
  default int getTransparency() {
    return tryGetTransparency();
  }

  int tryGetTransparency() throws X;
}
