package org.immersed.gaffe.org.w3c.dom.views;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.views.AbstractView;

@FunctionalInterface
public interface ThrowingAbstractView<X extends Throwable> extends AbstractView {
  @Override
  @SneakyThrows
  default org.w3c.dom.views.DocumentView getDocument() {
    return tryGetDocument();
  }

  org.w3c.dom.views.DocumentView tryGetDocument() throws X;
}
