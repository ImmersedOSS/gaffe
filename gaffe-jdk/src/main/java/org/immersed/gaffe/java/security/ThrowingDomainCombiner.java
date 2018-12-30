package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.DomainCombiner;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDomainCombiner<X extends Throwable> extends DomainCombiner {
  @Override
  @SneakyThrows
  default java.security.ProtectionDomain[] combine(java.security.ProtectionDomain[] a,
      java.security.ProtectionDomain[] b) {
    return tryCombine(a,b);
  }

  java.security.ProtectionDomain[] tryCombine(java.security.ProtectionDomain[] a,
      java.security.ProtectionDomain[] b) throws X;
}
