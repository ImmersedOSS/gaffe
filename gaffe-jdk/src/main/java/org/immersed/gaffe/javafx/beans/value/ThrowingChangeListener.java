package org.immersed.gaffe.javafx.beans.value;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.value.ChangeListener;
import lombok.SneakyThrows;

/**
 * A {@code ChangeListener} is notified whenever the value of an
 * {@link ObservableValue} changes. It can be registered and unregistered with
 * {@link ObservableValue#addListener(ChangeListener)} respectively
 * {@link ObservableValue#removeListener(ChangeListener)}
 * <p>
 * For an in-depth explanation of change events and how they differ from
 * invalidation events, see the documentation of {@code ObservableValue}.
 * <p>
 * The same instance of {@code ChangeListener} can be registered to listen to
 * multiple {@code ObservableValues}.
 *
 * @see ObservableValue
 *
 *
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingChangeListener<T, X extends Throwable> extends ChangeListener<T> {
  @Override
  @SneakyThrows
  default void changed(javafx.beans.value.ObservableValue<? extends T> observable, T oldValue,
      T newValue) {
    tryChanged(observable,oldValue,newValue);
  }

  /**
   * This method needs to be provided by an implementation of
   * {@code ChangeListener}. It is called if the value of an
   * {@link ObservableValue} changes.
   * <p>
   * In general is is considered bad practice to modify the observed value in
   * this method.
   *
   * @param observable
   * The {@code ObservableValue} which value changed
   * @param oldValue
   * The old value
   * @param newValue
   * The new value
   *
   * @throws X any exception that may be thrown.
   */
  void tryChanged(javafx.beans.value.ObservableValue<? extends T> observable, T oldValue,
      T newValue) throws X;
}
