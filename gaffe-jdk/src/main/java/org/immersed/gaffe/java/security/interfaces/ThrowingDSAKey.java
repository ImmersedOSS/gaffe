package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.DSAKey;
import lombok.SneakyThrows;

/**
 * The interface to a DSA public or private key. DSA (Digital Signature
 * Algorithm) is defined in NIST's FIPS-186.
 *
 * @see DSAParams
 * @see java.security.Key
 * @see java.security.Signature
 *
 * @author Benjamin Renaud
 * @author Josh Bloch
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDSAKey<X extends Throwable> extends DSAKey {
  @Override
  @SneakyThrows
  default java.security.interfaces.DSAParams getParams() {
    return tryGetParams();
  }

  /**
   * Returns the DSA-specific key parameters. These parameters are
   * never secret.
   *
   * @return the DSA-specific key parameters.
   *
   * @see DSAParams
   *
   * @throws X any exception that may be thrown.
   */
  java.security.interfaces.DSAParams tryGetParams() throws X;
}
