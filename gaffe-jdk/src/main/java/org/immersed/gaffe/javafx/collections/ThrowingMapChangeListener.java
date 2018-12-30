package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.MapChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingMapChangeListener<K, V, X extends Throwable> extends MapChangeListener<K, V> {
  @Override
  @SneakyThrows
  default void onChanged(javafx.collections.MapChangeListener.Change<? extends K, ? extends V> a) {
    tryOnChanged(a);
  }

  void tryOnChanged(javafx.collections.MapChangeListener.Change<? extends K, ? extends V> a) throws
      X;
}
