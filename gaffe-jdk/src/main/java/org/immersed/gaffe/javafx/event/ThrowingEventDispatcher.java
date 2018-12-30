package org.immersed.gaffe.javafx.event;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.event.EventDispatcher;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingEventDispatcher<X extends Throwable> extends EventDispatcher {
  @Override
  @SneakyThrows
  default javafx.event.Event dispatchEvent(javafx.event.Event a,
      javafx.event.EventDispatchChain b) {
    return tryDispatchEvent(a,b);
  }

  javafx.event.Event tryDispatchEvent(javafx.event.Event a, javafx.event.EventDispatchChain b)
      throws X;
}
