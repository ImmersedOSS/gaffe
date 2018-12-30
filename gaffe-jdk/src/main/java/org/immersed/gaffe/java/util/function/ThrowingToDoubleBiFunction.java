package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToDoubleBiFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToDoubleBiFunction<T, U, X extends Throwable> extends ToDoubleBiFunction<T, U> {
  @Override
  @SneakyThrows
  default double applyAsDouble(T a, U b) {
    return tryApplyAsDouble(a,b);
  }

  double tryApplyAsDouble(T a, U b) throws X;
}
