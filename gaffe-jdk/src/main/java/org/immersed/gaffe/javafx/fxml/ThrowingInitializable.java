package org.immersed.gaffe.javafx.fxml;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.fxml.Initializable;
import lombok.SneakyThrows;

/**
 * Controller initialization interface.
 * <p>
 * <em>NOTE</em> This interface has been superseded by automatic injection of
 * <code>location</code> and <code>resources</code> properties into the
 * controller. {@link FXMLLoader} will now automatically call any suitably
 * annotated no-arg <code>initialize()</code> method defined by the controller.
 * It is recommended that the injection approach be used whenever possible.
 * 
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingInitializable<X extends Throwable> extends Initializable
{
    @Override
    @SneakyThrows
    default void initialize(java.net.URL location, java.util.ResourceBundle resources)
    {
        tryInitialize(location, resources);
    }

    /**
     * Called to initialize a controller after its root element has been completely
     * processed.
     *
     * @param location  The location used to resolve relative paths for the root
     *                  object, or <tt>null</tt> if the location is not known.
     *
     * @param resources The resources used to localize the root object, or
     *                  <tt>null</tt> if the root object was not localized.
     *
     * @throws X any exception that may be thrown.
     */
    void tryInitialize(java.net.URL location, java.util.ResourceBundle resources) throws X;
}
