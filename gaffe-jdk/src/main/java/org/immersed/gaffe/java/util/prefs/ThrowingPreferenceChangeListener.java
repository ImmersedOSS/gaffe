package org.immersed.gaffe.java.util.prefs;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.prefs.PreferenceChangeListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPreferenceChangeListener<X extends Throwable> extends PreferenceChangeListener {
  @Override
  @SneakyThrows
  default void preferenceChange(java.util.prefs.PreferenceChangeEvent a) {
    tryPreferenceChange(a);
  }

  void tryPreferenceChange(java.util.prefs.PreferenceChangeEvent a) throws X;
}
