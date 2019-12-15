package org.immersed.gaffe.javafx.event;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.event.EventHandler;
import lombok.SneakyThrows;

/**
 * Handler for events of a specific class / type.
 *
 * @param <T> the event class this handler can handle
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingEventHandler<T extends javafx.event.Event, X extends Throwable> extends EventHandler<T> {
  @Override
  @SneakyThrows
  default void handle(T event) {
    tryHandle(event);
  }

  /**
   * Invoked when a specific event of the type for which this handler is
   * registered happens.
   *
   * @param event the event which occurred
   *
   * @throws X any exception that may be thrown.
   */
  void tryHandle(T event) throws X;
}
