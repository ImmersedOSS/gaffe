package org.immersed.gaffe.org.w3c.dom.stylesheets;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.stylesheets.DocumentStyle;

@FunctionalInterface
public interface ThrowingDocumentStyle<X extends Throwable> extends DocumentStyle {
  @Override
  @SneakyThrows
  default org.w3c.dom.stylesheets.StyleSheetList getStyleSheets() {
    return tryGetStyleSheets();
  }

  org.w3c.dom.stylesheets.StyleSheetList tryGetStyleSheets() throws X;
}
