package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ObjLongConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingObjLongConsumer<T, X extends Throwable> extends ObjLongConsumer<T> {
  @Override
  @SneakyThrows
  default void accept(T a, long b) {
    tryAccept(a,b);
  }

  void tryAccept(T a, long b) throws X;
}
