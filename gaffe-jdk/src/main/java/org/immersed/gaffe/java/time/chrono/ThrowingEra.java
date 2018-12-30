package org.immersed.gaffe.java.time.chrono;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.time.chrono.Era;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingEra<X extends Throwable> extends Era {
  @Override
  @SneakyThrows
  default int getValue() {
    return tryGetValue();
  }

  int tryGetValue() throws X;
}
