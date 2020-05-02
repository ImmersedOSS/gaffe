package org.immersed.gaffe.org.w3c.dom;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.DOMErrorHandler;

/**
 * <code>DOMErrorHandler</code> is a callback interface that the DOM
 * implementation can call when reporting errors that happens while processing
 * XML data, or when doing some other processing (e.g. validating a document). A
 * <code>DOMErrorHandler</code> object can be attached to a
 * <code>Document</code> using the "error-handler" on the
 * <code>DOMConfiguration</code> interface. If more than one error needs to be
 * reported during an operation, the sequence and numbers of the errors passed
 * to the error handler are implementation dependent.
 * <p>
 * The application that is using the DOM implementation is expected to implement
 * this interface.
 * <p>
 * See also the
 * <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document
 * Object Model (DOM) Level 3 Core Specification</a>.
 * 
 * @since DOM Level 3
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDOMErrorHandler<X extends Throwable> extends DOMErrorHandler
{
    @Override
    @SneakyThrows
    default boolean handleError(org.w3c.dom.DOMError error)
    {
        return tryHandleError(error);
    }

    /**
     * This method is called on the error handler when an error occurs. <br>
     * If an exception is thrown from this method, it is considered to be equivalent
     * of returning <code>true</code>.
     * 
     * @param error The error object that describes the error. This object may be
     *              reused by the DOM implementation across multiple calls to the
     *              <code>handleError</code> method.
     * @return If the <code>handleError</code> method returns <code>false</code>,
     *         the DOM implementation should stop the current processing when
     *         possible. If the method returns <code>true</code>, the processing may
     *         continue depending on <code>DOMError.severity</code>.
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryHandleError(org.w3c.dom.DOMError error) throws X;
}
