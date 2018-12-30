package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.BuilderFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBuilderFactory<X extends Throwable> extends BuilderFactory {
  @Override
  @SneakyThrows
  default javafx.util.Builder<?> getBuilder(java.lang.Class<?> a) {
    return tryGetBuilder(a);
  }

  javafx.util.Builder<?> tryGetBuilder(java.lang.Class<?> a) throws X;
}
