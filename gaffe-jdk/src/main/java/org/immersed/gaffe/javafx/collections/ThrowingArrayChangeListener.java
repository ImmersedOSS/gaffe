package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.ArrayChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingArrayChangeListener<T extends javafx.collections.ObservableArray<T>, X extends Throwable> extends ArrayChangeListener<T> {
  @Override
  @SneakyThrows
  default void onChanged(T a, boolean b, int c, int d) {
    tryOnChanged(a,b,c,d);
  }

  void tryOnChanged(T a, boolean b, int c, int d) throws X;
}
