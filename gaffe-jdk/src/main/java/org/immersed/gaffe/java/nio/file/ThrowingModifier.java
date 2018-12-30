package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.WatchEvent;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingModifier<X extends Throwable> extends WatchEvent.Modifier {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  java.lang.String tryName() throws X;
}
