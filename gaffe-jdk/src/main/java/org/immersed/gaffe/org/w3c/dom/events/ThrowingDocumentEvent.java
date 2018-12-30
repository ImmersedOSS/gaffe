package org.immersed.gaffe.org.w3c.dom.events;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.events.DocumentEvent;

@FunctionalInterface
public interface ThrowingDocumentEvent<X extends Throwable> extends DocumentEvent {
  @Override
  @SneakyThrows
  default org.w3c.dom.events.Event createEvent(java.lang.String a) {
    return tryCreateEvent(a);
  }

  org.w3c.dom.events.Event tryCreateEvent(java.lang.String a) throws X;
}
