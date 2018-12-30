package org.immersed.gaffe.javafx.event;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.event.EventTarget;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingEventTarget<X extends Throwable> extends EventTarget {
  @Override
  @SneakyThrows
  default javafx.event.EventDispatchChain buildEventDispatchChain(
      javafx.event.EventDispatchChain a) {
    return tryBuildEventDispatchChain(a);
  }

  javafx.event.EventDispatchChain tryBuildEventDispatchChain(javafx.event.EventDispatchChain a)
      throws X;
}
