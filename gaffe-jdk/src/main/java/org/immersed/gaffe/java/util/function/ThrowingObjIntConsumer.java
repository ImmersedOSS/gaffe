package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ObjIntConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingObjIntConsumer<T, X extends Throwable> extends ObjIntConsumer<T> {
  @Override
  @SneakyThrows
  default void accept(T a, int b) {
    tryAccept(a,b);
  }

  void tryAccept(T a, int b) throws X;
}
