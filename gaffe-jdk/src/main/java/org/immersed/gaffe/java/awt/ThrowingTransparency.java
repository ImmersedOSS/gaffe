package org.immersed.gaffe.java.awt;

import java.awt.Transparency;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The <code>Transparency</code> interface defines the common transparency
 * modes for implementing classes.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingTransparency<X extends Throwable> extends Transparency {
  @Override
  @SneakyThrows
  default int getTransparency() {
    return tryGetTransparency();
  }

  /**
   * Returns the type of this <code>Transparency</code>.
   * @return the field type of this <code>Transparency</code>, which is
   * either OPAQUE, BITMASK or TRANSLUCENT.
   *
   * @throws X any exception that may be thrown.
   */
  int tryGetTransparency() throws X;
}
