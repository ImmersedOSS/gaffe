package org.immersed.gaffe.java.awt;

import java.awt.ActiveEvent;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingActiveEvent<X extends Throwable> extends ActiveEvent {
  @Override
  @SneakyThrows
  default void dispatch() {
    tryDispatch();
  }

  void tryDispatch() throws X;
}
