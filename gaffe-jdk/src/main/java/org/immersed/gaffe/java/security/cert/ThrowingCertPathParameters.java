package org.immersed.gaffe.java.security.cert;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.cert.CertPathParameters;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCertPathParameters<X extends Throwable> extends CertPathParameters {
  @Override
  @SneakyThrows
  default java.lang.Object clone() {
    return tryClone();
  }

  java.lang.Object tryClone() throws X;
}
