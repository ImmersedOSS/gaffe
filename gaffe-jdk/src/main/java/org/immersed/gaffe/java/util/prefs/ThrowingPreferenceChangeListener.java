package org.immersed.gaffe.java.util.prefs;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.prefs.PreferenceChangeListener;
import lombok.SneakyThrows;

/**
 * A listener for receiving preference change events.
 *
 * @author  Josh Bloch
 * @see Preferences
 * @see PreferenceChangeEvent
 * @see NodeChangeListener
 * @since   1.4
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPreferenceChangeListener<X extends Throwable> extends PreferenceChangeListener {
  @Override
  @SneakyThrows
  default void preferenceChange(java.util.prefs.PreferenceChangeEvent evt) {
    tryPreferenceChange(evt);
  }

  /**
   * This method gets called when a preference is added, removed or when
   * its value is changed.
   * <p>
   * @param evt A PreferenceChangeEvent object describing the event source
   * and the preference that has changed.
   *
   * @throws X any exception that may be thrown.
   */
  void tryPreferenceChange(java.util.prefs.PreferenceChangeEvent evt) throws X;
}
