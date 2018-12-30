package org.immersed.gaffe.javafx.event;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.event.EventHandler;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingEventHandler<T extends javafx.event.Event, X extends Throwable> extends EventHandler<T> {
  @Override
  @SneakyThrows
  default void handle(T a) {
    tryHandle(a);
  }

  void tryHandle(T a) throws X;
}
