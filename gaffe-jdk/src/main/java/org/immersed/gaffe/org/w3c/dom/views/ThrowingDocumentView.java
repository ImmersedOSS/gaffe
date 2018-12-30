package org.immersed.gaffe.org.w3c.dom.views;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.views.DocumentView;

@FunctionalInterface
public interface ThrowingDocumentView<X extends Throwable> extends DocumentView {
  @Override
  @SneakyThrows
  default org.w3c.dom.views.AbstractView getDefaultView() {
    return tryGetDefaultView();
  }

  org.w3c.dom.views.AbstractView tryGetDefaultView() throws X;
}
