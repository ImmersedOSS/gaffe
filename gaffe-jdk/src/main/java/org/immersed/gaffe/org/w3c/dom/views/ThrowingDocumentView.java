package org.immersed.gaffe.org.w3c.dom.views;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.views.DocumentView;

/**
 * The <code>DocumentView</code> interface is implemented by
 * <code>Document</code> objects in DOM implementations supporting DOM
 * Views. It provides an attribute to retrieve the default view of a
 * document.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Views-20001113'>Document Object Model (DOM) Level 2 Views Specification</a>.
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDocumentView<X extends Throwable> extends DocumentView {
  @Override
  @SneakyThrows
  default org.w3c.dom.views.AbstractView getDefaultView() {
    return tryGetDefaultView();
  }

  /**
   * The default <code>AbstractView</code> for this <code>Document</code>,
   * or <code>null</code> if none available.
   *
   * @throws X any exception that may be thrown.
   */
  org.w3c.dom.views.AbstractView tryGetDefaultView() throws X;
}
