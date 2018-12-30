package org.immersed.gaffe.javafx.beans;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.InvalidationListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingInvalidationListener<X extends Throwable> extends InvalidationListener {
  @Override
  @SneakyThrows
  default void invalidated(javafx.beans.Observable a) {
    tryInvalidated(a);
  }

  void tryInvalidated(javafx.beans.Observable a) throws X;
}
