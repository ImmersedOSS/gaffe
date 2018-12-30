package org.immersed.gaffe.org.w3c.dom.xpath;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.xpath.XPathExpression;

@FunctionalInterface
public interface ThrowingXPathExpression<X extends Throwable> extends XPathExpression {
  @Override
  @SneakyThrows
  default java.lang.Object evaluate(org.w3c.dom.Node a, short b, java.lang.Object c) {
    return tryEvaluate(a,b,c);
  }

  java.lang.Object tryEvaluate(org.w3c.dom.Node a, short b, java.lang.Object c) throws X;
}
