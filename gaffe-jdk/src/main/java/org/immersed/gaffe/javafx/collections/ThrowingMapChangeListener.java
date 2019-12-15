package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.MapChangeListener;
import lombok.SneakyThrows;

/**
 * Interface that receives notifications of changes to an ObservableMap.
 * @param <K> the key element type
 * @param <V> the value element type
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingMapChangeListener<K, V, X extends Throwable> extends MapChangeListener<K, V> {
  @Override
  @SneakyThrows
  default void onChanged(
      javafx.collections.MapChangeListener.Change<? extends K, ? extends V> change) {
    tryOnChanged(change);
  }

  /**
   * Called after a change has been made to an ObservableMap.
   * This method is called on every elementary change (put/remove) once.
   * This means, complex changes like keySet().removeAll(Collection) or clear()
   * may result in more than one call of onChanged method.
   *
   * @param change the change that was made
   *
   * @throws X any exception that may be thrown.
   */
  void tryOnChanged(javafx.collections.MapChangeListener.Change<? extends K, ? extends V> change)
      throws X;
}
