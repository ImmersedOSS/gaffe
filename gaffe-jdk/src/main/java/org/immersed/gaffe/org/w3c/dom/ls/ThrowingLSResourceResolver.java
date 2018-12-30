package org.immersed.gaffe.org.w3c.dom.ls;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.ls.LSResourceResolver;

@FunctionalInterface
public interface ThrowingLSResourceResolver<X extends Throwable> extends LSResourceResolver {
  @Override
  @SneakyThrows
  default org.w3c.dom.ls.LSInput resolveResource(java.lang.String a, java.lang.String b,
      java.lang.String c, java.lang.String d, java.lang.String e) {
    return tryResolveResource(a,b,c,d,e);
  }

  org.w3c.dom.ls.LSInput tryResolveResource(java.lang.String a, java.lang.String b,
      java.lang.String c, java.lang.String d, java.lang.String e) throws X;
}
