package org.immersed.gaffe.java.awt;

import java.awt.ActiveEvent;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * An interface for events that know how to dispatch themselves. By implementing
 * this interface an event can be placed upon the event queue and its
 * <code>dispatch()</code> method will be called when the event is dispatched,
 * using the <code>EventDispatchThread</code>.
 * <p>
 * This is a very useful mechanism for avoiding deadlocks. If a thread is
 * executing in a critical section (i.e., it has entered one or more monitors),
 * calling other synchronized code may cause deadlocks. To avoid the potential
 * deadlocks, an <code>ActiveEvent</code> can be created to run the second
 * section of code at later time. If there is contention on the monitor, the
 * second thread will simply block until the first thread has finished its work
 * and exited its monitors.
 * <p>
 * For security reasons, it is often desirable to use an
 * <code>ActiveEvent</code> to avoid calling untrusted code from a critical
 * thread. For instance, peer implementations can use this facility to avoid
 * making calls into user code from a system thread. Doing so avoids potential
 * deadlocks and denial-of-service attacks.
 *
 * @author Timothy Prinzing
 * @since 1.2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingActiveEvent<X extends Throwable> extends ActiveEvent
{
    @Override
    @SneakyThrows
    default void dispatch()
    {
        tryDispatch();
    }

    /**
     * Dispatch the event to its target, listeners of the events source, or do
     * whatever it is this event is supposed to do.
     *
     * @throws X any exception that may be thrown.
     */
    void tryDispatch() throws X;
}
