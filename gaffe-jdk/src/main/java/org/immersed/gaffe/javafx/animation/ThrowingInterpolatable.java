package org.immersed.gaffe.javafx.animation;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.animation.Interpolatable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingInterpolatable<T, X extends Throwable> extends Interpolatable<T> {
  @Override
  @SneakyThrows
  default T interpolate(T a, double b) {
    return tryInterpolate(a,b);
  }

  T tryInterpolate(T a, double b) throws X;
}
