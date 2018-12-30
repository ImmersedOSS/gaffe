package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntSupplier;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntSupplier<X extends Throwable> extends IntSupplier {
  @Override
  @SneakyThrows
  default int getAsInt() {
    return tryGetAsInt();
  }

  int tryGetAsInt() throws X;
}
