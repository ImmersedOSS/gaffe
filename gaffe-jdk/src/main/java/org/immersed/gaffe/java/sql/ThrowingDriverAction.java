package org.immersed.gaffe.java.sql;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.sql.DriverAction;
import lombok.SneakyThrows;

/**
 * An interface that must be implemented when a {@linkplain Driver} wants to be
 * notified by {@code DriverManager}.
 * <P>
 * A {@code DriverAction} implementation is not intended to be used directly by
 * applications. A JDBC Driver may choose to create its {@code DriverAction}
 * implementation in a private class to avoid it being called directly.
 * <p>
 * The JDBC driver's static initialization block must call
 * {@linkplain DriverManager#registerDriver(java.sql.Driver, java.sql.DriverAction) }
 * in order to inform {@code DriverManager} which {@code DriverAction}
 * implementation to call when the JDBC driver is de-registered.
 * 
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDriverAction<X extends Throwable> extends DriverAction
{
    @Override
    @SneakyThrows
    default void deregister()
    {
        tryDeregister();
    }

    /**
     * Method called by {@linkplain DriverManager#deregisterDriver(Driver) } to
     * notify the JDBC driver that it was de-registered.
     * <p>
     * The {@code deregister} method is intended only to be used by JDBC Drivers and
     * not by applications. JDBC drivers are recommended to not implement
     * {@code DriverAction} in a public class. If there are active connections to
     * the database at the time that the {@code deregister} method is called, it is
     * implementation specific as to whether the connections are closed or allowed
     * to continue. Once this method is called, it is implementation specific as to
     * whether the driver may limit the ability to create new connections to the
     * database, invoke other {@code Driver} methods or throw a
     * {@code SQLException}. Consult your JDBC driver's documentation for additional
     * information on its behavior.
     * 
     * @see DriverManager#registerDriver(java.sql.Driver, java.sql.DriverAction)
     * @see DriverManager#deregisterDriver(Driver)
     * @since 1.8
     *
     * @throws X any exception that may be thrown.
     */
    void tryDeregister() throws X;
}
