package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.ListChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingListChangeListener<E, X extends Throwable> extends ListChangeListener<E> {
  @Override
  @SneakyThrows
  default void onChanged(javafx.collections.ListChangeListener.Change<? extends E> a) {
    tryOnChanged(a);
  }

  void tryOnChanged(javafx.collections.ListChangeListener.Change<? extends E> a) throws X;
}
