package org.immersed.gaffe.org.w3c.dom.stylesheets;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.stylesheets.LinkStyle;

@FunctionalInterface
public interface ThrowingLinkStyle<X extends Throwable> extends LinkStyle {
  @Override
  @SneakyThrows
  default org.w3c.dom.stylesheets.StyleSheet getSheet() {
    return tryGetSheet();
  }

  org.w3c.dom.stylesheets.StyleSheet tryGetSheet() throws X;
}
