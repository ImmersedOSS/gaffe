package org.immersed.gaffe.javafx.animation;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.animation.Interpolatable;
import lombok.SneakyThrows;

/**
 * A value that can be interpolated. It defines single
 * {@link #interpolate(Object, double)} method, which returns interpolated value
 * of given fraction.
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingInterpolatable<T, X extends Throwable> extends Interpolatable<T> {
  @Override
  @SneakyThrows
  default T interpolate(T endValue, double t) {
    return tryInterpolate(endValue,t);
  }

  /**
   * The function calculates an interpolated value along the fraction
   * {@code t} between {@code 0.0} and {@code 1.0}. When {@code t} = 1.0,
   * {@code endVal} is returned.
   *
   * @param endValue
   * target value
   * @param t
   * fraction between {@code 0.0} and {@code 1.0}
   * @return interpolated value
   *
   * @throws X any exception that may be thrown.
   */
  T tryInterpolate(T endValue, double t) throws X;
}
