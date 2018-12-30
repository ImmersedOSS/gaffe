package org.immersed.gaffe.org.w3c.dom.xpath;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.xpath.XPathNSResolver;

@FunctionalInterface
public interface ThrowingXPathNSResolver<X extends Throwable> extends XPathNSResolver {
  @Override
  @SneakyThrows
  default java.lang.String lookupNamespaceURI(java.lang.String a) {
    return tryLookupNamespaceURI(a);
  }

  java.lang.String tryLookupNamespaceURI(java.lang.String a) throws X;
}
