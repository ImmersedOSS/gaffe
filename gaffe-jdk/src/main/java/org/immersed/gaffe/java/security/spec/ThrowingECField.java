package org.immersed.gaffe.java.security.spec;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.spec.ECField;
import lombok.SneakyThrows;

/**
 * This interface represents an elliptic curve (EC) finite field.
 * All specialized EC fields must implements this interface.
 *
 * @see ECFieldFp
 * @see ECFieldF2m
 *
 * @author Valerie Peng
 *
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingECField<X extends Throwable> extends ECField {
  @Override
  @SneakyThrows
  default int getFieldSize() {
    return tryGetFieldSize();
  }

  /**
   * Returns the field size in bits. Note: For prime finite
   * field ECFieldFp, size of prime p in bits is returned.
   * For characteristic 2 finite field ECFieldF2m, m is returned.
   * @return the field size in bits.
   *
   * @throws X any exception that may be thrown.
   */
  int tryGetFieldSize() throws X;
}
