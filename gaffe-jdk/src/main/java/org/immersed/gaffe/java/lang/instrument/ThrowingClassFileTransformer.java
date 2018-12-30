package org.immersed.gaffe.java.lang.instrument;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.lang.instrument.ClassFileTransformer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingClassFileTransformer<X extends Throwable> extends ClassFileTransformer {
  @Override
  @SneakyThrows
  default byte[] transform(java.lang.ClassLoader a, java.lang.String b, java.lang.Class<?> c,
      java.security.ProtectionDomain d, byte[] e) {
    return tryTransform(a,b,c,d,e);
  }

  byte[] tryTransform(java.lang.ClassLoader a, java.lang.String b, java.lang.Class<?> c,
      java.security.ProtectionDomain d, byte[] e) throws X;
}
