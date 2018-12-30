package org.immersed.gaffe.org.w3c.dom.traversal;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.traversal.NodeFilter;

@FunctionalInterface
public interface ThrowingNodeFilter<X extends Throwable> extends NodeFilter {
  @Override
  @SneakyThrows
  default short acceptNode(org.w3c.dom.Node a) {
    return tryAcceptNode(a);
  }

  short tryAcceptNode(org.w3c.dom.Node a) throws X;
}
