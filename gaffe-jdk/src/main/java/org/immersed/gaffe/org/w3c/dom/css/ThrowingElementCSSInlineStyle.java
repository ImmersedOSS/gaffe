package org.immersed.gaffe.org.w3c.dom.css;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.css.ElementCSSInlineStyle;

@FunctionalInterface
public interface ThrowingElementCSSInlineStyle<X extends Throwable> extends ElementCSSInlineStyle {
  @Override
  @SneakyThrows
  default org.w3c.dom.css.CSSStyleDeclaration getStyle() {
    return tryGetStyle();
  }

  org.w3c.dom.css.CSSStyleDeclaration tryGetStyle() throws X;
}
