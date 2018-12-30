package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.SetChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingSetChangeListener<E, X extends Throwable> extends SetChangeListener<E> {
  @Override
  @SneakyThrows
  default void onChanged(javafx.collections.SetChangeListener.Change<? extends E> a) {
    tryOnChanged(a);
  }

  void tryOnChanged(javafx.collections.SetChangeListener.Change<? extends E> a) throws X;
}
