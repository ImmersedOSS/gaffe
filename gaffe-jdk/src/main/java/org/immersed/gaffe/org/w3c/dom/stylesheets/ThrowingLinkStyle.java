package org.immersed.gaffe.org.w3c.dom.stylesheets;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.stylesheets.LinkStyle;

/**
 * The <code>LinkStyle</code> interface provides a mechanism by which a style
 * sheet can be retrieved from the node responsible for linking it into a
 * document. An instance of the <code>LinkStyle</code> interface can be obtained
 * using binding-specific casting methods on an instance of a linking node
 * (<code>HTMLLinkElement</code>, <code>HTMLStyleElement</code> or
 * <code>ProcessingInstruction</code> in DOM Level 2).
 * <p>
 * See also the
 * <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification</a>.
 * 
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLinkStyle<X extends Throwable> extends LinkStyle
{
    @Override
    @SneakyThrows
    default org.w3c.dom.stylesheets.StyleSheet getSheet()
    {
        return tryGetSheet();
    }

    /**
     * The style sheet.
     *
     * @throws X any exception that may be thrown.
     */
    org.w3c.dom.stylesheets.StyleSheet tryGetSheet() throws X;
}
