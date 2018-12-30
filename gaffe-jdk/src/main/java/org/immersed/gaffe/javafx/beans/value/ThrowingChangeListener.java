package org.immersed.gaffe.javafx.beans.value;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.value.ChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingChangeListener<T, X extends Throwable> extends ChangeListener<T> {
  @Override
  @SneakyThrows
  default void changed(javafx.beans.value.ObservableValue<? extends T> a, T b, T c) {
    tryChanged(a,b,c);
  }

  void tryChanged(javafx.beans.value.ObservableValue<? extends T> a, T b, T c) throws X;
}
