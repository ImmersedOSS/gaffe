package org.immersed.gaffe.org.w3c.dom.events;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.events.EventListener;

@FunctionalInterface
public interface ThrowingEventListener<X extends Throwable> extends EventListener {
  @Override
  @SneakyThrows
  default void handleEvent(org.w3c.dom.events.Event a) {
    tryHandleEvent(a);
  }

  void tryHandleEvent(org.w3c.dom.events.Event a) throws X;
}
