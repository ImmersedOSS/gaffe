package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.RMIFailureHandler;
import lombok.SneakyThrows;

/**
 * An <code>RMIFailureHandler</code> can be registered via the
 * <code>RMISocketFactory.setFailureHandler</code> call. The
 * <code>failure</code> method of the handler is invoked when the RMI runtime is
 * unable to create a <code>ServerSocket</code> to listen for incoming calls.
 * The <code>failure</code> method returns a boolean indicating whether the
 * runtime should attempt to re-create the <code>ServerSocket</code>.
 *
 * @author Ann Wollrath
 * @since JDK1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingRMIFailureHandler<X extends Throwable> extends RMIFailureHandler
{
    @Override
    @SneakyThrows
    default boolean failure(java.lang.Exception ex)
    {
        return tryFailure(ex);
    }

    /**
     * The <code>failure</code> callback is invoked when the RMI runtime is unable
     * to create a <code>ServerSocket</code> via the <code>RMISocketFactory</code>.
     * An <code>RMIFailureHandler</code> is registered via a call to
     * <code>RMISocketFacotry.setFailureHandler</code>. If no failure handler is
     * installed, the default behavior is to attempt to re-create the ServerSocket.
     *
     * @param ex the exception that occurred during <code>ServerSocket</code>
     *           creation
     * @return if true, the RMI runtime attempts to retry <code>ServerSocket</code>
     *         creation
     * @see java.rmi.server.RMISocketFactory#setFailureHandler(RMIFailureHandler)
     * @since JDK1.1
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryFailure(java.lang.Exception ex) throws X;
}
