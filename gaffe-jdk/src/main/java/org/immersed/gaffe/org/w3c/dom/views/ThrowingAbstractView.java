package org.immersed.gaffe.org.w3c.dom.views;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.views.AbstractView;

/**
 * A base interface that all views shall derive from.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Views-20001113'>Document Object Model (DOM) Level 2 Views Specification</a>.
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAbstractView<X extends Throwable> extends AbstractView {
  @Override
  @SneakyThrows
  default org.w3c.dom.views.DocumentView getDocument() {
    return tryGetDocument();
  }

  /**
   * The source <code>DocumentView</code> of which this is an
   * <code>AbstractView</code>.
   *
   * @throws X any exception that may be thrown.
   */
  org.w3c.dom.views.DocumentView tryGetDocument() throws X;
}
