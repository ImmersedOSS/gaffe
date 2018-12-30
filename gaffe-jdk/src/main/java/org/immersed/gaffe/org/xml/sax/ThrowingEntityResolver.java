package org.immersed.gaffe.org.xml.sax;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.xml.sax.EntityResolver;

@FunctionalInterface
public interface ThrowingEntityResolver<X extends Throwable> extends EntityResolver {
  @Override
  @SneakyThrows
  default org.xml.sax.InputSource resolveEntity(java.lang.String a, java.lang.String b) {
    return tryResolveEntity(a,b);
  }

  org.xml.sax.InputSource tryResolveEntity(java.lang.String a, java.lang.String b) throws X;
}
