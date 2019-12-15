package org.immersed.gaffe.org.w3c.dom;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.UserDataHandler;

/**
 * When associating an object to a key on a node using
 * <code>Node.setUserData()</code> the application can provide a handler
 * that gets called when the node the object is associated to is being
 * cloned, imported, or renamed. This can be used by the application to
 * implement various behaviors regarding the data it associates to the DOM
 * nodes. This interface defines that handler.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 * @since DOM Level 3
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingUserDataHandler<X extends Throwable> extends UserDataHandler {
  @Override
  @SneakyThrows
  default void handle(short operation, java.lang.String key, java.lang.Object data,
      org.w3c.dom.Node src, org.w3c.dom.Node dst) {
    tryHandle(operation,key,data,src,dst);
  }

  /**
   * This method is called whenever the node for which this handler is
   * registered is imported or cloned.
   * <br> DOM applications must not raise exceptions in a
   * <code>UserDataHandler</code>. The effect of throwing exceptions from
   * the handler is DOM implementation dependent.
   * @param operation Specifies the type of operation that is being
   * performed on the node.
   * @param key Specifies the key for which this handler is being called.
   * @param data Specifies the data for which this handler is being called.
   * @param src Specifies the node being cloned, adopted, imported, or
   * renamed. This is <code>null</code> when the node is being deleted.
   * @param dst Specifies the node newly created if any, or
   * <code>null</code>.
   *
   * @throws X any exception that may be thrown.
   */
  void tryHandle(short operation, java.lang.String key, java.lang.Object data, org.w3c.dom.Node src,
      org.w3c.dom.Node dst) throws X;
}
