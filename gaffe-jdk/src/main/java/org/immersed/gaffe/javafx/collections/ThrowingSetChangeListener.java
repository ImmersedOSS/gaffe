package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.SetChangeListener;
import lombok.SneakyThrows;

/**
 * Interface that receives notifications of changes to an ObservableSet.
 * @param <E> the element type
 * @since JavaFX 2.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingSetChangeListener<E, X extends Throwable> extends SetChangeListener<E> {
  @Override
  @SneakyThrows
  default void onChanged(javafx.collections.SetChangeListener.Change<? extends E> change) {
    tryOnChanged(change);
  }

  /**
   * Called after a change has been made to an ObservableSet.
   * This method is called on every elementary change (add/remove) once.
   * This means, complex changes like removeAll(Collection) or clear()
   * may result in more than one call of onChanged method.
   *
   * @param change the change that was made
   *
   * @throws X any exception that may be thrown.
   */
  void tryOnChanged(javafx.collections.SetChangeListener.Change<? extends E> change) throws X;
}
