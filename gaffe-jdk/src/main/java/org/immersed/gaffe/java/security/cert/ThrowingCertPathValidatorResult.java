package org.immersed.gaffe.java.security.cert;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.cert.CertPathValidatorResult;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCertPathValidatorResult<X extends Throwable> extends CertPathValidatorResult {
  @Override
  @SneakyThrows
  default java.lang.Object clone() {
    return tryClone();
  }

  java.lang.Object tryClone() throws X;
}
