package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ObjDoubleConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingObjDoubleConsumer<T, X extends Throwable> extends ObjDoubleConsumer<T> {
  @Override
  @SneakyThrows
  default void accept(T a, double b) {
    tryAccept(a,b);
  }

  void tryAccept(T a, double b) throws X;
}
