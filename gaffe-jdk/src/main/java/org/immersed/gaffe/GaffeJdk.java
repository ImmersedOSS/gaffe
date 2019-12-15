package org.immersed.gaffe;

import java.awt.ActiveEvent;
import java.awt.Composite;
import java.awt.KeyEventDispatcher;
import java.awt.KeyEventPostProcessor;
import java.awt.PrintGraphics;
import java.awt.Stroke;
import java.awt.Transparency;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.FlavorListener;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.HierarchyListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.TextListener;
import java.awt.event.WindowStateListener;
import java.awt.image.ImageObserver;
import java.awt.image.TileObserver;
import java.awt.image.renderable.RenderedImageFactory;
import java.awt.print.Printable;
import java.awt.print.PrinterGraphics;
import java.beans.ExceptionListener;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.beans.beancontext.BeanContextContainerProxy;
import java.beans.beancontext.BeanContextProxy;
import java.beans.beancontext.BeanContextServiceRevokedListener;
import java.io.Closeable;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.ObjectInputValidation;
import java.lang.AutoCloseable;
import java.lang.Comparable;
import java.lang.Iterable;
import java.lang.Readable;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.instrument.ClassFileTransformer;
import java.lang.management.PlatformManagedObject;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.net.ContentHandlerFactory;
import java.net.CookiePolicy;
import java.net.DatagramSocketImplFactory;
import java.net.FileNameMap;
import java.net.ProtocolFamily;
import java.net.SocketImplFactory;
import java.net.URLStreamHandlerFactory;
import java.nio.file.DirectoryStream;
import java.nio.file.PathMatcher;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import java.rmi.activation.ActivationInstantiator;
import java.rmi.activation.Activator;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIFailureHandler;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.Unreferenced;
import java.security.DomainCombiner;
import java.security.Guard;
import java.security.KeyStore;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.security.interfaces.DSAKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECField;
import java.sql.DriverAction;
import java.time.chrono.Era;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalQuery;
import java.util.Formattable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.logging.Filter;
import java.util.prefs.PreferenceChangeListener;
import java.util.spi.ResourceBundleControlProvider;
import javafx.animation.Interpolatable;
import javafx.beans.InvalidationListener;
import javafx.beans.WeakListener;
import javafx.beans.value.ChangeListener;
import javafx.collections.ArrayChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.MapChangeListener;
import javafx.collections.SetChangeListener;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioSpectrumListener;
import javafx.util.Builder;
import javafx.util.BuilderFactory;
import javafx.util.Callback;
import org.immersed.gaffe.java.awt.ThrowingActiveEvent;
import org.immersed.gaffe.java.awt.ThrowingComposite;
import org.immersed.gaffe.java.awt.ThrowingKeyEventDispatcher;
import org.immersed.gaffe.java.awt.ThrowingKeyEventPostProcessor;
import org.immersed.gaffe.java.awt.ThrowingPrintGraphics;
import org.immersed.gaffe.java.awt.ThrowingStroke;
import org.immersed.gaffe.java.awt.ThrowingTransparency;
import org.immersed.gaffe.java.awt.datatransfer.ThrowingClipboardOwner;
import org.immersed.gaffe.java.awt.datatransfer.ThrowingFlavorListener;
import org.immersed.gaffe.java.awt.dnd.ThrowingDragGestureListener;
import org.immersed.gaffe.java.awt.dnd.ThrowingDragSourceMotionListener;
import org.immersed.gaffe.java.awt.event.ThrowingAWTEventListener;
import org.immersed.gaffe.java.awt.event.ThrowingActionListener;
import org.immersed.gaffe.java.awt.event.ThrowingAdjustmentListener;
import org.immersed.gaffe.java.awt.event.ThrowingHierarchyListener;
import org.immersed.gaffe.java.awt.event.ThrowingItemListener;
import org.immersed.gaffe.java.awt.event.ThrowingMouseWheelListener;
import org.immersed.gaffe.java.awt.event.ThrowingTextListener;
import org.immersed.gaffe.java.awt.event.ThrowingWindowStateListener;
import org.immersed.gaffe.java.awt.image.ThrowingImageObserver;
import org.immersed.gaffe.java.awt.image.ThrowingTileObserver;
import org.immersed.gaffe.java.awt.image.renderable.ThrowingRenderedImageFactory;
import org.immersed.gaffe.java.awt.print.ThrowingPrintable;
import org.immersed.gaffe.java.awt.print.ThrowingPrinterGraphics;
import org.immersed.gaffe.java.beans.ThrowingExceptionListener;
import org.immersed.gaffe.java.beans.ThrowingPropertyChangeListener;
import org.immersed.gaffe.java.beans.ThrowingVetoableChangeListener;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextChildComponentProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextContainerProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextServiceRevokedListener;
import org.immersed.gaffe.java.io.ThrowingCloseable;
import org.immersed.gaffe.java.io.ThrowingFileFilter;
import org.immersed.gaffe.java.io.ThrowingFilenameFilter;
import org.immersed.gaffe.java.io.ThrowingFlushable;
import org.immersed.gaffe.java.io.ThrowingObjectInputValidation;
import org.immersed.gaffe.java.lang.ThrowingAutoCloseable;
import org.immersed.gaffe.java.lang.ThrowingComparable;
import org.immersed.gaffe.java.lang.ThrowingIterable;
import org.immersed.gaffe.java.lang.ThrowingReadable;
import org.immersed.gaffe.java.lang.ThrowingRunnable;
import org.immersed.gaffe.java.lang.ThrowingUncaughtExceptionHandler;
import org.immersed.gaffe.java.lang.instrument.ThrowingClassFileTransformer;
import org.immersed.gaffe.java.lang.management.ThrowingPlatformManagedObject;
import org.immersed.gaffe.java.lang.reflect.ThrowingGenericArrayType;
import org.immersed.gaffe.java.lang.reflect.ThrowingInvocationHandler;
import org.immersed.gaffe.java.net.ThrowingContentHandlerFactory;
import org.immersed.gaffe.java.net.ThrowingCookiePolicy;
import org.immersed.gaffe.java.net.ThrowingDatagramSocketImplFactory;
import org.immersed.gaffe.java.net.ThrowingFileNameMap;
import org.immersed.gaffe.java.net.ThrowingProtocolFamily;
import org.immersed.gaffe.java.net.ThrowingSocketImplFactory;
import org.immersed.gaffe.java.net.ThrowingURLStreamHandlerFactory;
import org.immersed.gaffe.java.nio.file.ThrowingFilter;
import org.immersed.gaffe.java.nio.file.ThrowingModifier;
import org.immersed.gaffe.java.nio.file.ThrowingPathMatcher;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingAttributeView;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingFileAttributeView;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingFileStoreAttributeView;
import org.immersed.gaffe.java.rmi.activation.ThrowingActivationInstantiator;
import org.immersed.gaffe.java.rmi.activation.ThrowingActivator;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIClientSocketFactory;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIFailureHandler;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIServerSocketFactory;
import org.immersed.gaffe.java.rmi.server.ThrowingUnreferenced;
import org.immersed.gaffe.java.security.ThrowingDomainCombiner;
import org.immersed.gaffe.java.security.ThrowingGuard;
import org.immersed.gaffe.java.security.ThrowingLoadStoreParameter;
import org.immersed.gaffe.java.security.ThrowingPrivilegedAction;
import org.immersed.gaffe.java.security.ThrowingPrivilegedExceptionAction;
import org.immersed.gaffe.java.security.interfaces.ThrowingDSAKey;
import org.immersed.gaffe.java.security.interfaces.ThrowingECKey;
import org.immersed.gaffe.java.security.interfaces.ThrowingRSAKey;
import org.immersed.gaffe.java.security.spec.ThrowingECField;
import org.immersed.gaffe.java.sql.ThrowingDriverAction;
import org.immersed.gaffe.java.time.chrono.ThrowingEra;
import org.immersed.gaffe.java.time.temporal.ThrowingTemporalAdjuster;
import org.immersed.gaffe.java.time.temporal.ThrowingTemporalQuery;
import org.immersed.gaffe.java.util.ThrowingFormattable;
import org.immersed.gaffe.java.util.ThrowingObserver;
import org.immersed.gaffe.java.util.concurrent.ThrowingCallable;
import org.immersed.gaffe.java.util.concurrent.ThrowingExecutor;
import org.immersed.gaffe.java.util.concurrent.ThrowingForkJoinWorkerThreadFactory;
import org.immersed.gaffe.java.util.concurrent.ThrowingRejectedExecutionHandler;
import org.immersed.gaffe.java.util.concurrent.ThrowingThreadFactory;
import org.immersed.gaffe.java.util.function.ThrowingBiConsumer;
import org.immersed.gaffe.java.util.function.ThrowingBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingBiPredicate;
import org.immersed.gaffe.java.util.function.ThrowingBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingBooleanSupplier;
import org.immersed.gaffe.java.util.function.ThrowingConsumer;
import org.immersed.gaffe.java.util.function.ThrowingDoubleBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingDoubleConsumer;
import org.immersed.gaffe.java.util.function.ThrowingDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoublePredicate;
import org.immersed.gaffe.java.util.function.ThrowingDoubleSupplier;
import org.immersed.gaffe.java.util.function.ThrowingDoubleToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoubleToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoubleUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingIntConsumer;
import org.immersed.gaffe.java.util.function.ThrowingIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntPredicate;
import org.immersed.gaffe.java.util.function.ThrowingIntSupplier;
import org.immersed.gaffe.java.util.function.ThrowingIntToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingLongBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingLongConsumer;
import org.immersed.gaffe.java.util.function.ThrowingLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongPredicate;
import org.immersed.gaffe.java.util.function.ThrowingLongSupplier;
import org.immersed.gaffe.java.util.function.ThrowingLongToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingObjDoubleConsumer;
import org.immersed.gaffe.java.util.function.ThrowingObjIntConsumer;
import org.immersed.gaffe.java.util.function.ThrowingObjLongConsumer;
import org.immersed.gaffe.java.util.function.ThrowingPredicate;
import org.immersed.gaffe.java.util.function.ThrowingSupplier;
import org.immersed.gaffe.java.util.function.ThrowingToDoubleBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingToIntBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingToLongBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingUnaryOperator;
import org.immersed.gaffe.java.util.prefs.ThrowingPreferenceChangeListener;
import org.immersed.gaffe.java.util.spi.ThrowingResourceBundleControlProvider;
import org.immersed.gaffe.javafx.animation.ThrowingInterpolatable;
import org.immersed.gaffe.javafx.beans.ThrowingInvalidationListener;
import org.immersed.gaffe.javafx.beans.ThrowingWeakListener;
import org.immersed.gaffe.javafx.beans.value.ThrowingChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingArrayChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingListChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingMapChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingSetChangeListener;
import org.immersed.gaffe.javafx.event.ThrowingEventDispatcher;
import org.immersed.gaffe.javafx.event.ThrowingEventHandler;
import org.immersed.gaffe.javafx.event.ThrowingEventTarget;
import org.immersed.gaffe.javafx.fxml.ThrowingInitializable;
import org.immersed.gaffe.javafx.scene.media.ThrowingAudioSpectrumListener;
import org.immersed.gaffe.javafx.util.ThrowingBuilder;
import org.immersed.gaffe.javafx.util.ThrowingBuilderFactory;
import org.immersed.gaffe.javafx.util.ThrowingCallback;
import org.immersed.gaffe.org.omg.CORBA.ThrowingDomainManagerOperations;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingInvokeHandler;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingValueBase;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingValueFactory;
import org.immersed.gaffe.org.omg.IOP.ThrowingCodecFactoryOperations;
import org.immersed.gaffe.org.omg.PortableInterceptor.ThrowingPolicyFactoryOperations;
import org.immersed.gaffe.org.omg.PortableServer.ThrowingAdapterActivatorOperations;
import org.immersed.gaffe.org.w3c.dom.ThrowingDOMErrorHandler;
import org.immersed.gaffe.org.w3c.dom.ThrowingUserDataHandler;
import org.immersed.gaffe.org.w3c.dom.css.ThrowingElementCSSInlineStyle;
import org.immersed.gaffe.org.w3c.dom.events.ThrowingDocumentEvent;
import org.immersed.gaffe.org.w3c.dom.events.ThrowingEventListener;
import org.immersed.gaffe.org.w3c.dom.ls.ThrowingLSResourceResolver;
import org.immersed.gaffe.org.w3c.dom.ranges.ThrowingDocumentRange;
import org.immersed.gaffe.org.w3c.dom.stylesheets.ThrowingDocumentStyle;
import org.immersed.gaffe.org.w3c.dom.stylesheets.ThrowingLinkStyle;
import org.immersed.gaffe.org.w3c.dom.traversal.ThrowingNodeFilter;
import org.immersed.gaffe.org.w3c.dom.views.ThrowingAbstractView;
import org.immersed.gaffe.org.w3c.dom.views.ThrowingDocumentView;
import org.immersed.gaffe.org.xml.sax.ThrowingEntityResolver;
import org.omg.CORBA.DomainManagerOperations;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.ValueBase;
import org.omg.CORBA.portable.ValueFactory;
import org.omg.IOP.CodecFactoryOperations;
import org.omg.PortableInterceptor.PolicyFactoryOperations;
import org.omg.PortableServer.AdapterActivatorOperations;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.css.ElementCSSInlineStyle;
import org.w3c.dom.events.DocumentEvent;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.ls.LSResourceResolver;
import org.w3c.dom.ranges.DocumentRange;
import org.w3c.dom.stylesheets.DocumentStyle;
import org.w3c.dom.stylesheets.LinkStyle;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.views.AbstractView;
import org.w3c.dom.views.DocumentView;
import org.xml.sax.EntityResolver;

/**
 * This utility class is the primary entry point for the <b>Jdk</b> project.
 * <p>Functions names match the associated interface.</p>
 * General use as follows:
 * <pre> import static org.immersed.gaffe.GaffeJdk.*
 *
 *  throwingFunction(in -> {
 *      return Files.readAllBytes(in); // throws IOException!
 *  }</pre>
 */
public final class GaffeJdk {
  private GaffeJdk() {
  }

  /**
   * Creates a new {@link ThrowingActiveEvent}
   * that allows for exceptions to be thrown.
   * @param throwingActiveEvent the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingActiveEvent' behind the original interface.
   */
  public static <X extends Throwable> ActiveEvent throwingActiveEvent(
      ThrowingActiveEvent<X> throwingActiveEvent) {
    return throwingActiveEvent;
  }

  /**
   * Creates a new {@link ThrowingComposite}
   * that allows for exceptions to be thrown.
   * @param throwingComposite the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingComposite' behind the original interface.
   */
  public static <X extends Throwable> Composite throwingComposite(
      ThrowingComposite<X> throwingComposite) {
    return throwingComposite;
  }

  /**
   * Creates a new {@link ThrowingKeyEventDispatcher}
   * that allows for exceptions to be thrown.
   * @param throwingKeyEventDispatcher the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingKeyEventDispatcher' behind the original interface.
   */
  public static <X extends Throwable> KeyEventDispatcher throwingKeyEventDispatcher(
      ThrowingKeyEventDispatcher<X> throwingKeyEventDispatcher) {
    return throwingKeyEventDispatcher;
  }

  /**
   * Creates a new {@link ThrowingKeyEventPostProcessor}
   * that allows for exceptions to be thrown.
   * @param throwingKeyEventPostProcessor the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingKeyEventPostProcessor' behind the original interface.
   */
  public static <X extends Throwable> KeyEventPostProcessor throwingKeyEventPostProcessor(
      ThrowingKeyEventPostProcessor<X> throwingKeyEventPostProcessor) {
    return throwingKeyEventPostProcessor;
  }

  /**
   * Creates a new {@link ThrowingPrintGraphics}
   * that allows for exceptions to be thrown.
   * @param throwingPrintGraphics the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPrintGraphics' behind the original interface.
   */
  public static <X extends Throwable> PrintGraphics throwingPrintGraphics(
      ThrowingPrintGraphics<X> throwingPrintGraphics) {
    return throwingPrintGraphics;
  }

  /**
   * Creates a new {@link ThrowingStroke}
   * that allows for exceptions to be thrown.
   * @param throwingStroke the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingStroke' behind the original interface.
   */
  public static <X extends Throwable> Stroke throwingStroke(ThrowingStroke<X> throwingStroke) {
    return throwingStroke;
  }

  /**
   * Creates a new {@link ThrowingTransparency}
   * that allows for exceptions to be thrown.
   * @param throwingTransparency the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingTransparency' behind the original interface.
   */
  public static <X extends Throwable> Transparency throwingTransparency(
      ThrowingTransparency<X> throwingTransparency) {
    return throwingTransparency;
  }

  /**
   * Creates a new {@link ThrowingClipboardOwner}
   * that allows for exceptions to be thrown.
   * @param throwingClipboardOwner the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingClipboardOwner' behind the original interface.
   */
  public static <X extends Throwable> ClipboardOwner throwingClipboardOwner(
      ThrowingClipboardOwner<X> throwingClipboardOwner) {
    return throwingClipboardOwner;
  }

  /**
   * Creates a new {@link ThrowingFlavorListener}
   * that allows for exceptions to be thrown.
   * @param throwingFlavorListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFlavorListener' behind the original interface.
   */
  public static <X extends Throwable> FlavorListener throwingFlavorListener(
      ThrowingFlavorListener<X> throwingFlavorListener) {
    return throwingFlavorListener;
  }

  /**
   * Creates a new {@link ThrowingDragGestureListener}
   * that allows for exceptions to be thrown.
   * @param throwingDragGestureListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDragGestureListener' behind the original interface.
   */
  public static <X extends Throwable> DragGestureListener throwingDragGestureListener(
      ThrowingDragGestureListener<X> throwingDragGestureListener) {
    return throwingDragGestureListener;
  }

  /**
   * Creates a new {@link ThrowingDragSourceMotionListener}
   * that allows for exceptions to be thrown.
   * @param throwingDragSourceMotionListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDragSourceMotionListener' behind the original interface.
   */
  public static <X extends Throwable> DragSourceMotionListener throwingDragSourceMotionListener(
      ThrowingDragSourceMotionListener<X> throwingDragSourceMotionListener) {
    return throwingDragSourceMotionListener;
  }

  /**
   * Creates a new {@link ThrowingAWTEventListener}
   * that allows for exceptions to be thrown.
   * @param throwingAWTEventListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAWTEventListener' behind the original interface.
   */
  public static <X extends Throwable> AWTEventListener throwingAWTEventListener(
      ThrowingAWTEventListener<X> throwingAWTEventListener) {
    return throwingAWTEventListener;
  }

  /**
   * Creates a new {@link ThrowingActionListener}
   * that allows for exceptions to be thrown.
   * @param throwingActionListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingActionListener' behind the original interface.
   */
  public static <X extends Throwable> ActionListener throwingActionListener(
      ThrowingActionListener<X> throwingActionListener) {
    return throwingActionListener;
  }

  /**
   * Creates a new {@link ThrowingAdjustmentListener}
   * that allows for exceptions to be thrown.
   * @param throwingAdjustmentListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAdjustmentListener' behind the original interface.
   */
  public static <X extends Throwable> AdjustmentListener throwingAdjustmentListener(
      ThrowingAdjustmentListener<X> throwingAdjustmentListener) {
    return throwingAdjustmentListener;
  }

  /**
   * Creates a new {@link ThrowingHierarchyListener}
   * that allows for exceptions to be thrown.
   * @param throwingHierarchyListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingHierarchyListener' behind the original interface.
   */
  public static <X extends Throwable> HierarchyListener throwingHierarchyListener(
      ThrowingHierarchyListener<X> throwingHierarchyListener) {
    return throwingHierarchyListener;
  }

  /**
   * Creates a new {@link ThrowingItemListener}
   * that allows for exceptions to be thrown.
   * @param throwingItemListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingItemListener' behind the original interface.
   */
  public static <X extends Throwable> ItemListener throwingItemListener(
      ThrowingItemListener<X> throwingItemListener) {
    return throwingItemListener;
  }

  /**
   * Creates a new {@link ThrowingMouseWheelListener}
   * that allows for exceptions to be thrown.
   * @param throwingMouseWheelListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingMouseWheelListener' behind the original interface.
   */
  public static <X extends Throwable> MouseWheelListener throwingMouseWheelListener(
      ThrowingMouseWheelListener<X> throwingMouseWheelListener) {
    return throwingMouseWheelListener;
  }

  /**
   * Creates a new {@link ThrowingTextListener}
   * that allows for exceptions to be thrown.
   * @param throwingTextListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingTextListener' behind the original interface.
   */
  public static <X extends Throwable> TextListener throwingTextListener(
      ThrowingTextListener<X> throwingTextListener) {
    return throwingTextListener;
  }

  /**
   * Creates a new {@link ThrowingWindowStateListener}
   * that allows for exceptions to be thrown.
   * @param throwingWindowStateListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingWindowStateListener' behind the original interface.
   */
  public static <X extends Throwable> WindowStateListener throwingWindowStateListener(
      ThrowingWindowStateListener<X> throwingWindowStateListener) {
    return throwingWindowStateListener;
  }

  /**
   * Creates a new {@link ThrowingImageObserver}
   * that allows for exceptions to be thrown.
   * @param throwingImageObserver the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingImageObserver' behind the original interface.
   */
  public static <X extends Throwable> ImageObserver throwingImageObserver(
      ThrowingImageObserver<X> throwingImageObserver) {
    return throwingImageObserver;
  }

  /**
   * Creates a new {@link ThrowingTileObserver}
   * that allows for exceptions to be thrown.
   * @param throwingTileObserver the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingTileObserver' behind the original interface.
   */
  public static <X extends Throwable> TileObserver throwingTileObserver(
      ThrowingTileObserver<X> throwingTileObserver) {
    return throwingTileObserver;
  }

  /**
   * Creates a new {@link ThrowingRenderedImageFactory}
   * that allows for exceptions to be thrown.
   * @param throwingRenderedImageFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRenderedImageFactory' behind the original interface.
   */
  public static <X extends Throwable> RenderedImageFactory throwingRenderedImageFactory(
      ThrowingRenderedImageFactory<X> throwingRenderedImageFactory) {
    return throwingRenderedImageFactory;
  }

  /**
   * Creates a new {@link ThrowingPrintable}
   * that allows for exceptions to be thrown.
   * @param throwingPrintable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPrintable' behind the original interface.
   */
  public static <X extends Throwable> Printable throwingPrintable(
      ThrowingPrintable<X> throwingPrintable) {
    return throwingPrintable;
  }

  /**
   * Creates a new {@link ThrowingPrinterGraphics}
   * that allows for exceptions to be thrown.
   * @param throwingPrinterGraphics the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPrinterGraphics' behind the original interface.
   */
  public static <X extends Throwable> PrinterGraphics throwingPrinterGraphics(
      ThrowingPrinterGraphics<X> throwingPrinterGraphics) {
    return throwingPrinterGraphics;
  }

  /**
   * Creates a new {@link ThrowingExceptionListener}
   * that allows for exceptions to be thrown.
   * @param throwingExceptionListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingExceptionListener' behind the original interface.
   */
  public static <X extends Throwable> ExceptionListener throwingExceptionListener(
      ThrowingExceptionListener<X> throwingExceptionListener) {
    return throwingExceptionListener;
  }

  /**
   * Creates a new {@link ThrowingPropertyChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingPropertyChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPropertyChangeListener' behind the original interface.
   */
  public static <X extends Throwable> PropertyChangeListener throwingPropertyChangeListener(
      ThrowingPropertyChangeListener<X> throwingPropertyChangeListener) {
    return throwingPropertyChangeListener;
  }

  /**
   * Creates a new {@link ThrowingVetoableChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingVetoableChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingVetoableChangeListener' behind the original interface.
   */
  public static <X extends Throwable> VetoableChangeListener throwingVetoableChangeListener(
      ThrowingVetoableChangeListener<X> throwingVetoableChangeListener) {
    return throwingVetoableChangeListener;
  }

  /**
   * Creates a new {@link ThrowingBeanContextChildComponentProxy}
   * that allows for exceptions to be thrown.
   * @param throwingBeanContextChildComponentProxy the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBeanContextChildComponentProxy' behind the original interface.
   */
  public static <X extends Throwable> BeanContextChildComponentProxy throwingBeanContextChildComponentProxy(
      ThrowingBeanContextChildComponentProxy<X> throwingBeanContextChildComponentProxy) {
    return throwingBeanContextChildComponentProxy;
  }

  /**
   * Creates a new {@link ThrowingBeanContextContainerProxy}
   * that allows for exceptions to be thrown.
   * @param throwingBeanContextContainerProxy the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBeanContextContainerProxy' behind the original interface.
   */
  public static <X extends Throwable> BeanContextContainerProxy throwingBeanContextContainerProxy(
      ThrowingBeanContextContainerProxy<X> throwingBeanContextContainerProxy) {
    return throwingBeanContextContainerProxy;
  }

  /**
   * Creates a new {@link ThrowingBeanContextProxy}
   * that allows for exceptions to be thrown.
   * @param throwingBeanContextProxy the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBeanContextProxy' behind the original interface.
   */
  public static <X extends Throwable> BeanContextProxy throwingBeanContextProxy(
      ThrowingBeanContextProxy<X> throwingBeanContextProxy) {
    return throwingBeanContextProxy;
  }

  /**
   * Creates a new {@link ThrowingBeanContextServiceRevokedListener}
   * that allows for exceptions to be thrown.
   * @param throwingBeanContextServiceRevokedListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBeanContextServiceRevokedListener' behind the original interface.
   */
  public static <X extends Throwable> BeanContextServiceRevokedListener throwingBeanContextServiceRevokedListener(
      ThrowingBeanContextServiceRevokedListener<X> throwingBeanContextServiceRevokedListener) {
    return throwingBeanContextServiceRevokedListener;
  }

  /**
   * Creates a new {@link ThrowingCloseable}
   * that allows for exceptions to be thrown.
   * @param throwingCloseable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingCloseable' behind the original interface.
   */
  public static <X extends Throwable> Closeable throwingCloseable(
      ThrowingCloseable<X> throwingCloseable) {
    return throwingCloseable;
  }

  /**
   * Creates a new {@link ThrowingFileFilter}
   * that allows for exceptions to be thrown.
   * @param throwingFileFilter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFileFilter' behind the original interface.
   */
  public static <X extends Throwable> FileFilter throwingFileFilter(
      ThrowingFileFilter<X> throwingFileFilter) {
    return throwingFileFilter;
  }

  /**
   * Creates a new {@link ThrowingFilenameFilter}
   * that allows for exceptions to be thrown.
   * @param throwingFilenameFilter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFilenameFilter' behind the original interface.
   */
  public static <X extends Throwable> FilenameFilter throwingFilenameFilter(
      ThrowingFilenameFilter<X> throwingFilenameFilter) {
    return throwingFilenameFilter;
  }

  /**
   * Creates a new {@link ThrowingFlushable}
   * that allows for exceptions to be thrown.
   * @param throwingFlushable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFlushable' behind the original interface.
   */
  public static <X extends Throwable> Flushable throwingFlushable(
      ThrowingFlushable<X> throwingFlushable) {
    return throwingFlushable;
  }

  /**
   * Creates a new {@link ThrowingObjectInputValidation}
   * that allows for exceptions to be thrown.
   * @param throwingObjectInputValidation the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingObjectInputValidation' behind the original interface.
   */
  public static <X extends Throwable> ObjectInputValidation throwingObjectInputValidation(
      ThrowingObjectInputValidation<X> throwingObjectInputValidation) {
    return throwingObjectInputValidation;
  }

  /**
   * Creates a new {@link ThrowingAutoCloseable}
   * that allows for exceptions to be thrown.
   * @param throwingAutoCloseable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAutoCloseable' behind the original interface.
   */
  public static <X extends Throwable> AutoCloseable throwingAutoCloseable(
      ThrowingAutoCloseable<X> throwingAutoCloseable) {
    return throwingAutoCloseable;
  }

  /**
   * Creates a new {@link ThrowingComparable}
   * that allows for exceptions to be thrown.
   * @param throwingComparable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingComparable' behind the original interface.
   */
  public static <T, X extends Throwable> Comparable<T> throwingComparable(
      ThrowingComparable<T, X> throwingComparable) {
    return throwingComparable;
  }

  /**
   * Creates a new {@link ThrowingIterable}
   * that allows for exceptions to be thrown.
   * @param throwingIterable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIterable' behind the original interface.
   */
  public static <T, X extends Throwable> Iterable<T> throwingIterable(
      ThrowingIterable<T, X> throwingIterable) {
    return throwingIterable;
  }

  /**
   * Creates a new {@link ThrowingReadable}
   * that allows for exceptions to be thrown.
   * @param throwingReadable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingReadable' behind the original interface.
   */
  public static <X extends Throwable> Readable throwingReadable(
      ThrowingReadable<X> throwingReadable) {
    return throwingReadable;
  }

  /**
   * Creates a new {@link ThrowingRunnable}
   * that allows for exceptions to be thrown.
   * @param throwingRunnable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRunnable' behind the original interface.
   */
  public static <X extends Throwable> Runnable throwingRunnable(
      ThrowingRunnable<X> throwingRunnable) {
    return throwingRunnable;
  }

  /**
   * Creates a new {@link ThrowingUncaughtExceptionHandler}
   * that allows for exceptions to be thrown.
   * @param throwingThreadUncaughtExceptionHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingThreadUncaughtExceptionHandler' behind the original interface.
   */
  public static <X extends Throwable> Thread.UncaughtExceptionHandler throwingThreadUncaughtExceptionHandler(
      ThrowingUncaughtExceptionHandler<X> throwingThreadUncaughtExceptionHandler) {
    return throwingThreadUncaughtExceptionHandler;
  }

  /**
   * Creates a new {@link ThrowingClassFileTransformer}
   * that allows for exceptions to be thrown.
   * @param throwingClassFileTransformer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingClassFileTransformer' behind the original interface.
   */
  public static <X extends Throwable> ClassFileTransformer throwingClassFileTransformer(
      ThrowingClassFileTransformer<X> throwingClassFileTransformer) {
    return throwingClassFileTransformer;
  }

  /**
   * Creates a new {@link ThrowingPlatformManagedObject}
   * that allows for exceptions to be thrown.
   * @param throwingPlatformManagedObject the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPlatformManagedObject' behind the original interface.
   */
  public static <X extends Throwable> PlatformManagedObject throwingPlatformManagedObject(
      ThrowingPlatformManagedObject<X> throwingPlatformManagedObject) {
    return throwingPlatformManagedObject;
  }

  /**
   * Creates a new {@link ThrowingGenericArrayType}
   * that allows for exceptions to be thrown.
   * @param throwingGenericArrayType the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingGenericArrayType' behind the original interface.
   */
  public static <X extends Throwable> GenericArrayType throwingGenericArrayType(
      ThrowingGenericArrayType<X> throwingGenericArrayType) {
    return throwingGenericArrayType;
  }

  /**
   * Creates a new {@link ThrowingInvocationHandler}
   * that allows for exceptions to be thrown.
   * @param throwingInvocationHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingInvocationHandler' behind the original interface.
   */
  public static <X extends Throwable> InvocationHandler throwingInvocationHandler(
      ThrowingInvocationHandler<X> throwingInvocationHandler) {
    return throwingInvocationHandler;
  }

  /**
   * Creates a new {@link ThrowingContentHandlerFactory}
   * that allows for exceptions to be thrown.
   * @param throwingContentHandlerFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingContentHandlerFactory' behind the original interface.
   */
  public static <X extends Throwable> ContentHandlerFactory throwingContentHandlerFactory(
      ThrowingContentHandlerFactory<X> throwingContentHandlerFactory) {
    return throwingContentHandlerFactory;
  }

  /**
   * Creates a new {@link ThrowingCookiePolicy}
   * that allows for exceptions to be thrown.
   * @param throwingCookiePolicy the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingCookiePolicy' behind the original interface.
   */
  public static <X extends Throwable> CookiePolicy throwingCookiePolicy(
      ThrowingCookiePolicy<X> throwingCookiePolicy) {
    return throwingCookiePolicy;
  }

  /**
   * Creates a new {@link ThrowingDatagramSocketImplFactory}
   * that allows for exceptions to be thrown.
   * @param throwingDatagramSocketImplFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDatagramSocketImplFactory' behind the original interface.
   */
  public static <X extends Throwable> DatagramSocketImplFactory throwingDatagramSocketImplFactory(
      ThrowingDatagramSocketImplFactory<X> throwingDatagramSocketImplFactory) {
    return throwingDatagramSocketImplFactory;
  }

  /**
   * Creates a new {@link ThrowingFileNameMap}
   * that allows for exceptions to be thrown.
   * @param throwingFileNameMap the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFileNameMap' behind the original interface.
   */
  public static <X extends Throwable> FileNameMap throwingFileNameMap(
      ThrowingFileNameMap<X> throwingFileNameMap) {
    return throwingFileNameMap;
  }

  /**
   * Creates a new {@link ThrowingProtocolFamily}
   * that allows for exceptions to be thrown.
   * @param throwingProtocolFamily the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingProtocolFamily' behind the original interface.
   */
  public static <X extends Throwable> ProtocolFamily throwingProtocolFamily(
      ThrowingProtocolFamily<X> throwingProtocolFamily) {
    return throwingProtocolFamily;
  }

  /**
   * Creates a new {@link ThrowingSocketImplFactory}
   * that allows for exceptions to be thrown.
   * @param throwingSocketImplFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingSocketImplFactory' behind the original interface.
   */
  public static <X extends Throwable> SocketImplFactory throwingSocketImplFactory(
      ThrowingSocketImplFactory<X> throwingSocketImplFactory) {
    return throwingSocketImplFactory;
  }

  /**
   * Creates a new {@link ThrowingURLStreamHandlerFactory}
   * that allows for exceptions to be thrown.
   * @param throwingURLStreamHandlerFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingURLStreamHandlerFactory' behind the original interface.
   */
  public static <X extends Throwable> URLStreamHandlerFactory throwingURLStreamHandlerFactory(
      ThrowingURLStreamHandlerFactory<X> throwingURLStreamHandlerFactory) {
    return throwingURLStreamHandlerFactory;
  }

  /**
   * Creates a new {@link ThrowingFilter}
   * that allows for exceptions to be thrown.
   * @param throwingDirectoryStreamFilter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDirectoryStreamFilter' behind the original interface.
   */
  public static <T, X extends Throwable> DirectoryStream.Filter<T> throwingDirectoryStreamFilter(
      ThrowingFilter<T, X> throwingDirectoryStreamFilter) {
    return throwingDirectoryStreamFilter;
  }

  /**
   * Creates a new {@link ThrowingPathMatcher}
   * that allows for exceptions to be thrown.
   * @param throwingPathMatcher the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPathMatcher' behind the original interface.
   */
  public static <X extends Throwable> PathMatcher throwingPathMatcher(
      ThrowingPathMatcher<X> throwingPathMatcher) {
    return throwingPathMatcher;
  }

  /**
   * Creates a new {@link ThrowingModifier}
   * that allows for exceptions to be thrown.
   * @param throwingWatchEventModifier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingWatchEventModifier' behind the original interface.
   */
  public static <X extends Throwable> WatchEvent.Modifier throwingWatchEventModifier(
      ThrowingModifier<X> throwingWatchEventModifier) {
    return throwingWatchEventModifier;
  }

  /**
   * Creates a new {@link ThrowingAttributeView}
   * that allows for exceptions to be thrown.
   * @param throwingAttributeView the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAttributeView' behind the original interface.
   */
  public static <X extends Throwable> AttributeView throwingAttributeView(
      ThrowingAttributeView<X> throwingAttributeView) {
    return throwingAttributeView;
  }

  /**
   * Creates a new {@link ThrowingFileAttributeView}
   * that allows for exceptions to be thrown.
   * @param throwingFileAttributeView the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFileAttributeView' behind the original interface.
   */
  public static <X extends Throwable> FileAttributeView throwingFileAttributeView(
      ThrowingFileAttributeView<X> throwingFileAttributeView) {
    return throwingFileAttributeView;
  }

  /**
   * Creates a new {@link ThrowingFileStoreAttributeView}
   * that allows for exceptions to be thrown.
   * @param throwingFileStoreAttributeView the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFileStoreAttributeView' behind the original interface.
   */
  public static <X extends Throwable> FileStoreAttributeView throwingFileStoreAttributeView(
      ThrowingFileStoreAttributeView<X> throwingFileStoreAttributeView) {
    return throwingFileStoreAttributeView;
  }

  /**
   * Creates a new {@link ThrowingActivationInstantiator}
   * that allows for exceptions to be thrown.
   * @param throwingActivationInstantiator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingActivationInstantiator' behind the original interface.
   */
  public static <X extends Throwable> ActivationInstantiator throwingActivationInstantiator(
      ThrowingActivationInstantiator<X> throwingActivationInstantiator) {
    return throwingActivationInstantiator;
  }

  /**
   * Creates a new {@link ThrowingActivator}
   * that allows for exceptions to be thrown.
   * @param throwingActivator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingActivator' behind the original interface.
   */
  public static <X extends Throwable> Activator throwingActivator(
      ThrowingActivator<X> throwingActivator) {
    return throwingActivator;
  }

  /**
   * Creates a new {@link ThrowingRMIClientSocketFactory}
   * that allows for exceptions to be thrown.
   * @param throwingRMIClientSocketFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRMIClientSocketFactory' behind the original interface.
   */
  public static <X extends Throwable> RMIClientSocketFactory throwingRMIClientSocketFactory(
      ThrowingRMIClientSocketFactory<X> throwingRMIClientSocketFactory) {
    return throwingRMIClientSocketFactory;
  }

  /**
   * Creates a new {@link ThrowingRMIFailureHandler}
   * that allows for exceptions to be thrown.
   * @param throwingRMIFailureHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRMIFailureHandler' behind the original interface.
   */
  public static <X extends Throwable> RMIFailureHandler throwingRMIFailureHandler(
      ThrowingRMIFailureHandler<X> throwingRMIFailureHandler) {
    return throwingRMIFailureHandler;
  }

  /**
   * Creates a new {@link ThrowingRMIServerSocketFactory}
   * that allows for exceptions to be thrown.
   * @param throwingRMIServerSocketFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRMIServerSocketFactory' behind the original interface.
   */
  public static <X extends Throwable> RMIServerSocketFactory throwingRMIServerSocketFactory(
      ThrowingRMIServerSocketFactory<X> throwingRMIServerSocketFactory) {
    return throwingRMIServerSocketFactory;
  }

  /**
   * Creates a new {@link ThrowingUnreferenced}
   * that allows for exceptions to be thrown.
   * @param throwingUnreferenced the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingUnreferenced' behind the original interface.
   */
  public static <X extends Throwable> Unreferenced throwingUnreferenced(
      ThrowingUnreferenced<X> throwingUnreferenced) {
    return throwingUnreferenced;
  }

  /**
   * Creates a new {@link ThrowingDomainCombiner}
   * that allows for exceptions to be thrown.
   * @param throwingDomainCombiner the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDomainCombiner' behind the original interface.
   */
  public static <X extends Throwable> DomainCombiner throwingDomainCombiner(
      ThrowingDomainCombiner<X> throwingDomainCombiner) {
    return throwingDomainCombiner;
  }

  /**
   * Creates a new {@link ThrowingGuard}
   * that allows for exceptions to be thrown.
   * @param throwingGuard the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingGuard' behind the original interface.
   */
  public static <X extends Throwable> Guard throwingGuard(ThrowingGuard<X> throwingGuard) {
    return throwingGuard;
  }

  /**
   * Creates a new {@link ThrowingLoadStoreParameter}
   * that allows for exceptions to be thrown.
   * @param throwingKeyStoreLoadStoreParameter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingKeyStoreLoadStoreParameter' behind the original interface.
   */
  public static <X extends Throwable> KeyStore.LoadStoreParameter throwingKeyStoreLoadStoreParameter(
      ThrowingLoadStoreParameter<X> throwingKeyStoreLoadStoreParameter) {
    return throwingKeyStoreLoadStoreParameter;
  }

  /**
   * Creates a new {@link ThrowingPrivilegedAction}
   * that allows for exceptions to be thrown.
   * @param throwingPrivilegedAction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPrivilegedAction' behind the original interface.
   */
  public static <T, X extends Throwable> PrivilegedAction<T> throwingPrivilegedAction(
      ThrowingPrivilegedAction<T, X> throwingPrivilegedAction) {
    return throwingPrivilegedAction;
  }

  /**
   * Creates a new {@link ThrowingPrivilegedExceptionAction}
   * that allows for exceptions to be thrown.
   * @param throwingPrivilegedExceptionAction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPrivilegedExceptionAction' behind the original interface.
   */
  public static <T, X extends Throwable> PrivilegedExceptionAction<T> throwingPrivilegedExceptionAction(
      ThrowingPrivilegedExceptionAction<T, X> throwingPrivilegedExceptionAction) {
    return throwingPrivilegedExceptionAction;
  }

  /**
   * Creates a new {@link ThrowingDSAKey}
   * that allows for exceptions to be thrown.
   * @param throwingDSAKey the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDSAKey' behind the original interface.
   */
  public static <X extends Throwable> DSAKey throwingDSAKey(ThrowingDSAKey<X> throwingDSAKey) {
    return throwingDSAKey;
  }

  /**
   * Creates a new {@link ThrowingECKey}
   * that allows for exceptions to be thrown.
   * @param throwingECKey the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingECKey' behind the original interface.
   */
  public static <X extends Throwable> ECKey throwingECKey(ThrowingECKey<X> throwingECKey) {
    return throwingECKey;
  }

  /**
   * Creates a new {@link ThrowingRSAKey}
   * that allows for exceptions to be thrown.
   * @param throwingRSAKey the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRSAKey' behind the original interface.
   */
  public static <X extends Throwable> RSAKey throwingRSAKey(ThrowingRSAKey<X> throwingRSAKey) {
    return throwingRSAKey;
  }

  /**
   * Creates a new {@link ThrowingECField}
   * that allows for exceptions to be thrown.
   * @param throwingECField the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingECField' behind the original interface.
   */
  public static <X extends Throwable> ECField throwingECField(ThrowingECField<X> throwingECField) {
    return throwingECField;
  }

  /**
   * Creates a new {@link ThrowingDriverAction}
   * that allows for exceptions to be thrown.
   * @param throwingDriverAction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDriverAction' behind the original interface.
   */
  public static <X extends Throwable> DriverAction throwingDriverAction(
      ThrowingDriverAction<X> throwingDriverAction) {
    return throwingDriverAction;
  }

  /**
   * Creates a new {@link ThrowingEra}
   * that allows for exceptions to be thrown.
   * @param throwingEra the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEra' behind the original interface.
   */
  public static <X extends Throwable> Era throwingEra(ThrowingEra<X> throwingEra) {
    return throwingEra;
  }

  /**
   * Creates a new {@link ThrowingTemporalAdjuster}
   * that allows for exceptions to be thrown.
   * @param throwingTemporalAdjuster the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingTemporalAdjuster' behind the original interface.
   */
  public static <X extends Throwable> TemporalAdjuster throwingTemporalAdjuster(
      ThrowingTemporalAdjuster<X> throwingTemporalAdjuster) {
    return throwingTemporalAdjuster;
  }

  /**
   * Creates a new {@link ThrowingTemporalQuery}
   * that allows for exceptions to be thrown.
   * @param throwingTemporalQuery the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingTemporalQuery' behind the original interface.
   */
  public static <R, X extends Throwable> TemporalQuery<R> throwingTemporalQuery(
      ThrowingTemporalQuery<R, X> throwingTemporalQuery) {
    return throwingTemporalQuery;
  }

  /**
   * Creates a new {@link ThrowingFormattable}
   * that allows for exceptions to be thrown.
   * @param throwingFormattable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFormattable' behind the original interface.
   */
  public static <X extends Throwable> Formattable throwingFormattable(
      ThrowingFormattable<X> throwingFormattable) {
    return throwingFormattable;
  }

  /**
   * Creates a new {@link ThrowingObserver}
   * that allows for exceptions to be thrown.
   * @param throwingObserver the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingObserver' behind the original interface.
   */
  public static <X extends Throwable> Observer throwingObserver(
      ThrowingObserver<X> throwingObserver) {
    return throwingObserver;
  }

  /**
   * Creates a new {@link ThrowingCallable}
   * that allows for exceptions to be thrown.
   * @param throwingCallable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingCallable' behind the original interface.
   */
  public static <V, X extends Throwable> Callable<V> throwingCallable(
      ThrowingCallable<V, X> throwingCallable) {
    return throwingCallable;
  }

  /**
   * Creates a new {@link ThrowingExecutor}
   * that allows for exceptions to be thrown.
   * @param throwingExecutor the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingExecutor' behind the original interface.
   */
  public static <X extends Throwable> Executor throwingExecutor(
      ThrowingExecutor<X> throwingExecutor) {
    return throwingExecutor;
  }

  /**
   * Creates a new {@link ThrowingForkJoinWorkerThreadFactory}
   * that allows for exceptions to be thrown.
   * @param throwingForkJoinPoolForkJoinWorkerThreadFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingForkJoinPoolForkJoinWorkerThreadFactory' behind the original interface.
   */
  public static <X extends Throwable> ForkJoinPool.ForkJoinWorkerThreadFactory throwingForkJoinPoolForkJoinWorkerThreadFactory(
      ThrowingForkJoinWorkerThreadFactory<X> throwingForkJoinPoolForkJoinWorkerThreadFactory) {
    return throwingForkJoinPoolForkJoinWorkerThreadFactory;
  }

  /**
   * Creates a new {@link ThrowingRejectedExecutionHandler}
   * that allows for exceptions to be thrown.
   * @param throwingRejectedExecutionHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingRejectedExecutionHandler' behind the original interface.
   */
  public static <X extends Throwable> RejectedExecutionHandler throwingRejectedExecutionHandler(
      ThrowingRejectedExecutionHandler<X> throwingRejectedExecutionHandler) {
    return throwingRejectedExecutionHandler;
  }

  /**
   * Creates a new {@link ThrowingThreadFactory}
   * that allows for exceptions to be thrown.
   * @param throwingThreadFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingThreadFactory' behind the original interface.
   */
  public static <X extends Throwable> ThreadFactory throwingThreadFactory(
      ThrowingThreadFactory<X> throwingThreadFactory) {
    return throwingThreadFactory;
  }

  /**
   * Creates a new {@link ThrowingBiConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingBiConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBiConsumer' behind the original interface.
   */
  public static <T, U, X extends Throwable> BiConsumer<T, U> throwingBiConsumer(
      ThrowingBiConsumer<T, U, X> throwingBiConsumer) {
    return throwingBiConsumer;
  }

  /**
   * Creates a new {@link ThrowingBiFunction}
   * that allows for exceptions to be thrown.
   * @param throwingBiFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBiFunction' behind the original interface.
   */
  public static <T, U, R, X extends Throwable> BiFunction<T, U, R> throwingBiFunction(
      ThrowingBiFunction<T, U, R, X> throwingBiFunction) {
    return throwingBiFunction;
  }

  /**
   * Creates a new {@link ThrowingBiPredicate}
   * that allows for exceptions to be thrown.
   * @param throwingBiPredicate the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBiPredicate' behind the original interface.
   */
  public static <T, U, X extends Throwable> BiPredicate<T, U> throwingBiPredicate(
      ThrowingBiPredicate<T, U, X> throwingBiPredicate) {
    return throwingBiPredicate;
  }

  /**
   * Creates a new {@link ThrowingBinaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingBinaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBinaryOperator' behind the original interface.
   */
  public static <T, X extends Throwable> BinaryOperator<T> throwingBinaryOperator(
      ThrowingBinaryOperator<T, X> throwingBinaryOperator) {
    return throwingBinaryOperator;
  }

  /**
   * Creates a new {@link ThrowingBooleanSupplier}
   * that allows for exceptions to be thrown.
   * @param throwingBooleanSupplier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBooleanSupplier' behind the original interface.
   */
  public static <X extends Throwable> BooleanSupplier throwingBooleanSupplier(
      ThrowingBooleanSupplier<X> throwingBooleanSupplier) {
    return throwingBooleanSupplier;
  }

  /**
   * Creates a new {@link ThrowingConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingConsumer' behind the original interface.
   */
  public static <T, X extends Throwable> Consumer<T> throwingConsumer(
      ThrowingConsumer<T, X> throwingConsumer) {
    return throwingConsumer;
  }

  /**
   * Creates a new {@link ThrowingDoubleBinaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleBinaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleBinaryOperator' behind the original interface.
   */
  public static <X extends Throwable> DoubleBinaryOperator throwingDoubleBinaryOperator(
      ThrowingDoubleBinaryOperator<X> throwingDoubleBinaryOperator) {
    return throwingDoubleBinaryOperator;
  }

  /**
   * Creates a new {@link ThrowingDoubleConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleConsumer' behind the original interface.
   */
  public static <X extends Throwable> DoubleConsumer throwingDoubleConsumer(
      ThrowingDoubleConsumer<X> throwingDoubleConsumer) {
    return throwingDoubleConsumer;
  }

  /**
   * Creates a new {@link ThrowingDoubleFunction}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleFunction' behind the original interface.
   */
  public static <R, X extends Throwable> DoubleFunction<R> throwingDoubleFunction(
      ThrowingDoubleFunction<R, X> throwingDoubleFunction) {
    return throwingDoubleFunction;
  }

  /**
   * Creates a new {@link ThrowingDoublePredicate}
   * that allows for exceptions to be thrown.
   * @param throwingDoublePredicate the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoublePredicate' behind the original interface.
   */
  public static <X extends Throwable> DoublePredicate throwingDoublePredicate(
      ThrowingDoublePredicate<X> throwingDoublePredicate) {
    return throwingDoublePredicate;
  }

  /**
   * Creates a new {@link ThrowingDoubleSupplier}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleSupplier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleSupplier' behind the original interface.
   */
  public static <X extends Throwable> DoubleSupplier throwingDoubleSupplier(
      ThrowingDoubleSupplier<X> throwingDoubleSupplier) {
    return throwingDoubleSupplier;
  }

  /**
   * Creates a new {@link ThrowingDoubleToIntFunction}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleToIntFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleToIntFunction' behind the original interface.
   */
  public static <X extends Throwable> DoubleToIntFunction throwingDoubleToIntFunction(
      ThrowingDoubleToIntFunction<X> throwingDoubleToIntFunction) {
    return throwingDoubleToIntFunction;
  }

  /**
   * Creates a new {@link ThrowingDoubleToLongFunction}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleToLongFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleToLongFunction' behind the original interface.
   */
  public static <X extends Throwable> DoubleToLongFunction throwingDoubleToLongFunction(
      ThrowingDoubleToLongFunction<X> throwingDoubleToLongFunction) {
    return throwingDoubleToLongFunction;
  }

  /**
   * Creates a new {@link ThrowingDoubleUnaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingDoubleUnaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDoubleUnaryOperator' behind the original interface.
   */
  public static <X extends Throwable> DoubleUnaryOperator throwingDoubleUnaryOperator(
      ThrowingDoubleUnaryOperator<X> throwingDoubleUnaryOperator) {
    return throwingDoubleUnaryOperator;
  }

  /**
   * Creates a new {@link ThrowingFunction}
   * that allows for exceptions to be thrown.
   * @param throwingFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFunction' behind the original interface.
   */
  public static <T, R, X extends Throwable> Function<T, R> throwingFunction(
      ThrowingFunction<T, R, X> throwingFunction) {
    return throwingFunction;
  }

  /**
   * Creates a new {@link ThrowingIntBinaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingIntBinaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntBinaryOperator' behind the original interface.
   */
  public static <X extends Throwable> IntBinaryOperator throwingIntBinaryOperator(
      ThrowingIntBinaryOperator<X> throwingIntBinaryOperator) {
    return throwingIntBinaryOperator;
  }

  /**
   * Creates a new {@link ThrowingIntConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingIntConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntConsumer' behind the original interface.
   */
  public static <X extends Throwable> IntConsumer throwingIntConsumer(
      ThrowingIntConsumer<X> throwingIntConsumer) {
    return throwingIntConsumer;
  }

  /**
   * Creates a new {@link ThrowingIntFunction}
   * that allows for exceptions to be thrown.
   * @param throwingIntFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntFunction' behind the original interface.
   */
  public static <R, X extends Throwable> IntFunction<R> throwingIntFunction(
      ThrowingIntFunction<R, X> throwingIntFunction) {
    return throwingIntFunction;
  }

  /**
   * Creates a new {@link ThrowingIntPredicate}
   * that allows for exceptions to be thrown.
   * @param throwingIntPredicate the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntPredicate' behind the original interface.
   */
  public static <X extends Throwable> IntPredicate throwingIntPredicate(
      ThrowingIntPredicate<X> throwingIntPredicate) {
    return throwingIntPredicate;
  }

  /**
   * Creates a new {@link ThrowingIntSupplier}
   * that allows for exceptions to be thrown.
   * @param throwingIntSupplier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntSupplier' behind the original interface.
   */
  public static <X extends Throwable> IntSupplier throwingIntSupplier(
      ThrowingIntSupplier<X> throwingIntSupplier) {
    return throwingIntSupplier;
  }

  /**
   * Creates a new {@link ThrowingIntToDoubleFunction}
   * that allows for exceptions to be thrown.
   * @param throwingIntToDoubleFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntToDoubleFunction' behind the original interface.
   */
  public static <X extends Throwable> IntToDoubleFunction throwingIntToDoubleFunction(
      ThrowingIntToDoubleFunction<X> throwingIntToDoubleFunction) {
    return throwingIntToDoubleFunction;
  }

  /**
   * Creates a new {@link ThrowingIntToLongFunction}
   * that allows for exceptions to be thrown.
   * @param throwingIntToLongFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntToLongFunction' behind the original interface.
   */
  public static <X extends Throwable> IntToLongFunction throwingIntToLongFunction(
      ThrowingIntToLongFunction<X> throwingIntToLongFunction) {
    return throwingIntToLongFunction;
  }

  /**
   * Creates a new {@link ThrowingIntUnaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingIntUnaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingIntUnaryOperator' behind the original interface.
   */
  public static <X extends Throwable> IntUnaryOperator throwingIntUnaryOperator(
      ThrowingIntUnaryOperator<X> throwingIntUnaryOperator) {
    return throwingIntUnaryOperator;
  }

  /**
   * Creates a new {@link ThrowingLongBinaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingLongBinaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongBinaryOperator' behind the original interface.
   */
  public static <X extends Throwable> LongBinaryOperator throwingLongBinaryOperator(
      ThrowingLongBinaryOperator<X> throwingLongBinaryOperator) {
    return throwingLongBinaryOperator;
  }

  /**
   * Creates a new {@link ThrowingLongConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingLongConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongConsumer' behind the original interface.
   */
  public static <X extends Throwable> LongConsumer throwingLongConsumer(
      ThrowingLongConsumer<X> throwingLongConsumer) {
    return throwingLongConsumer;
  }

  /**
   * Creates a new {@link ThrowingLongFunction}
   * that allows for exceptions to be thrown.
   * @param throwingLongFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongFunction' behind the original interface.
   */
  public static <R, X extends Throwable> LongFunction<R> throwingLongFunction(
      ThrowingLongFunction<R, X> throwingLongFunction) {
    return throwingLongFunction;
  }

  /**
   * Creates a new {@link ThrowingLongPredicate}
   * that allows for exceptions to be thrown.
   * @param throwingLongPredicate the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongPredicate' behind the original interface.
   */
  public static <X extends Throwable> LongPredicate throwingLongPredicate(
      ThrowingLongPredicate<X> throwingLongPredicate) {
    return throwingLongPredicate;
  }

  /**
   * Creates a new {@link ThrowingLongSupplier}
   * that allows for exceptions to be thrown.
   * @param throwingLongSupplier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongSupplier' behind the original interface.
   */
  public static <X extends Throwable> LongSupplier throwingLongSupplier(
      ThrowingLongSupplier<X> throwingLongSupplier) {
    return throwingLongSupplier;
  }

  /**
   * Creates a new {@link ThrowingLongToDoubleFunction}
   * that allows for exceptions to be thrown.
   * @param throwingLongToDoubleFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongToDoubleFunction' behind the original interface.
   */
  public static <X extends Throwable> LongToDoubleFunction throwingLongToDoubleFunction(
      ThrowingLongToDoubleFunction<X> throwingLongToDoubleFunction) {
    return throwingLongToDoubleFunction;
  }

  /**
   * Creates a new {@link ThrowingLongToIntFunction}
   * that allows for exceptions to be thrown.
   * @param throwingLongToIntFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongToIntFunction' behind the original interface.
   */
  public static <X extends Throwable> LongToIntFunction throwingLongToIntFunction(
      ThrowingLongToIntFunction<X> throwingLongToIntFunction) {
    return throwingLongToIntFunction;
  }

  /**
   * Creates a new {@link ThrowingLongUnaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingLongUnaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLongUnaryOperator' behind the original interface.
   */
  public static <X extends Throwable> LongUnaryOperator throwingLongUnaryOperator(
      ThrowingLongUnaryOperator<X> throwingLongUnaryOperator) {
    return throwingLongUnaryOperator;
  }

  /**
   * Creates a new {@link ThrowingObjDoubleConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingObjDoubleConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingObjDoubleConsumer' behind the original interface.
   */
  public static <T, X extends Throwable> ObjDoubleConsumer<T> throwingObjDoubleConsumer(
      ThrowingObjDoubleConsumer<T, X> throwingObjDoubleConsumer) {
    return throwingObjDoubleConsumer;
  }

  /**
   * Creates a new {@link ThrowingObjIntConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingObjIntConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingObjIntConsumer' behind the original interface.
   */
  public static <T, X extends Throwable> ObjIntConsumer<T> throwingObjIntConsumer(
      ThrowingObjIntConsumer<T, X> throwingObjIntConsumer) {
    return throwingObjIntConsumer;
  }

  /**
   * Creates a new {@link ThrowingObjLongConsumer}
   * that allows for exceptions to be thrown.
   * @param throwingObjLongConsumer the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingObjLongConsumer' behind the original interface.
   */
  public static <T, X extends Throwable> ObjLongConsumer<T> throwingObjLongConsumer(
      ThrowingObjLongConsumer<T, X> throwingObjLongConsumer) {
    return throwingObjLongConsumer;
  }

  /**
   * Creates a new {@link ThrowingPredicate}
   * that allows for exceptions to be thrown.
   * @param throwingPredicate the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPredicate' behind the original interface.
   */
  public static <T, X extends Throwable> Predicate<T> throwingPredicate(
      ThrowingPredicate<T, X> throwingPredicate) {
    return throwingPredicate;
  }

  /**
   * Creates a new {@link ThrowingSupplier}
   * that allows for exceptions to be thrown.
   * @param throwingSupplier the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingSupplier' behind the original interface.
   */
  public static <T, X extends Throwable> Supplier<T> throwingSupplier(
      ThrowingSupplier<T, X> throwingSupplier) {
    return throwingSupplier;
  }

  /**
   * Creates a new {@link ThrowingToDoubleBiFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToDoubleBiFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToDoubleBiFunction' behind the original interface.
   */
  public static <T, U, X extends Throwable> ToDoubleBiFunction<T, U> throwingToDoubleBiFunction(
      ThrowingToDoubleBiFunction<T, U, X> throwingToDoubleBiFunction) {
    return throwingToDoubleBiFunction;
  }

  /**
   * Creates a new {@link ThrowingToDoubleFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToDoubleFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToDoubleFunction' behind the original interface.
   */
  public static <T, X extends Throwable> ToDoubleFunction<T> throwingToDoubleFunction(
      ThrowingToDoubleFunction<T, X> throwingToDoubleFunction) {
    return throwingToDoubleFunction;
  }

  /**
   * Creates a new {@link ThrowingToIntBiFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToIntBiFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToIntBiFunction' behind the original interface.
   */
  public static <T, U, X extends Throwable> ToIntBiFunction<T, U> throwingToIntBiFunction(
      ThrowingToIntBiFunction<T, U, X> throwingToIntBiFunction) {
    return throwingToIntBiFunction;
  }

  /**
   * Creates a new {@link ThrowingToIntFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToIntFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToIntFunction' behind the original interface.
   */
  public static <T, X extends Throwable> ToIntFunction<T> throwingToIntFunction(
      ThrowingToIntFunction<T, X> throwingToIntFunction) {
    return throwingToIntFunction;
  }

  /**
   * Creates a new {@link ThrowingToLongBiFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToLongBiFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToLongBiFunction' behind the original interface.
   */
  public static <T, U, X extends Throwable> ToLongBiFunction<T, U> throwingToLongBiFunction(
      ThrowingToLongBiFunction<T, U, X> throwingToLongBiFunction) {
    return throwingToLongBiFunction;
  }

  /**
   * Creates a new {@link ThrowingToLongFunction}
   * that allows for exceptions to be thrown.
   * @param throwingToLongFunction the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingToLongFunction' behind the original interface.
   */
  public static <T, X extends Throwable> ToLongFunction<T> throwingToLongFunction(
      ThrowingToLongFunction<T, X> throwingToLongFunction) {
    return throwingToLongFunction;
  }

  /**
   * Creates a new {@link ThrowingUnaryOperator}
   * that allows for exceptions to be thrown.
   * @param throwingUnaryOperator the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingUnaryOperator' behind the original interface.
   */
  public static <T, X extends Throwable> UnaryOperator<T> throwingUnaryOperator(
      ThrowingUnaryOperator<T, X> throwingUnaryOperator) {
    return throwingUnaryOperator;
  }

  /**
   * Creates a new {@link org.immersed.gaffe.java.util.logging.ThrowingFilter}
   * that allows for exceptions to be thrown.
   * @param throwingFilter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingFilter' behind the original interface.
   */
  public static <X extends Throwable> Filter throwingFilter(
      org.immersed.gaffe.java.util.logging.ThrowingFilter<X> throwingFilter) {
    return throwingFilter;
  }

  /**
   * Creates a new {@link ThrowingPreferenceChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingPreferenceChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPreferenceChangeListener' behind the original interface.
   */
  public static <X extends Throwable> PreferenceChangeListener throwingPreferenceChangeListener(
      ThrowingPreferenceChangeListener<X> throwingPreferenceChangeListener) {
    return throwingPreferenceChangeListener;
  }

  /**
   * Creates a new {@link ThrowingResourceBundleControlProvider}
   * that allows for exceptions to be thrown.
   * @param throwingResourceBundleControlProvider the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingResourceBundleControlProvider' behind the original interface.
   */
  public static <X extends Throwable> ResourceBundleControlProvider throwingResourceBundleControlProvider(
      ThrowingResourceBundleControlProvider<X> throwingResourceBundleControlProvider) {
    return throwingResourceBundleControlProvider;
  }

  /**
   * Creates a new {@link ThrowingInterpolatable}
   * that allows for exceptions to be thrown.
   * @param throwingInterpolatable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingInterpolatable' behind the original interface.
   */
  public static <T, X extends Throwable> Interpolatable<T> throwingInterpolatable(
      ThrowingInterpolatable<T, X> throwingInterpolatable) {
    return throwingInterpolatable;
  }

  /**
   * Creates a new {@link ThrowingInvalidationListener}
   * that allows for exceptions to be thrown.
   * @param throwingInvalidationListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingInvalidationListener' behind the original interface.
   */
  public static <X extends Throwable> InvalidationListener throwingInvalidationListener(
      ThrowingInvalidationListener<X> throwingInvalidationListener) {
    return throwingInvalidationListener;
  }

  /**
   * Creates a new {@link ThrowingWeakListener}
   * that allows for exceptions to be thrown.
   * @param throwingWeakListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingWeakListener' behind the original interface.
   */
  public static <X extends Throwable> WeakListener throwingWeakListener(
      ThrowingWeakListener<X> throwingWeakListener) {
    return throwingWeakListener;
  }

  /**
   * Creates a new {@link ThrowingChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingChangeListener' behind the original interface.
   */
  public static <T, X extends Throwable> ChangeListener<T> throwingChangeListener(
      ThrowingChangeListener<T, X> throwingChangeListener) {
    return throwingChangeListener;
  }

  /**
   * Creates a new {@link ThrowingArrayChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingArrayChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingArrayChangeListener' behind the original interface.
   */
  public static <T extends javafx.collections.ObservableArray<T>, X extends Throwable> ArrayChangeListener<T> throwingArrayChangeListener(
      ThrowingArrayChangeListener<T, X> throwingArrayChangeListener) {
    return throwingArrayChangeListener;
  }

  /**
   * Creates a new {@link ThrowingListChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingListChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingListChangeListener' behind the original interface.
   */
  public static <E, X extends Throwable> ListChangeListener<E> throwingListChangeListener(
      ThrowingListChangeListener<E, X> throwingListChangeListener) {
    return throwingListChangeListener;
  }

  /**
   * Creates a new {@link ThrowingMapChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingMapChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingMapChangeListener' behind the original interface.
   */
  public static <K, V, X extends Throwable> MapChangeListener<K, V> throwingMapChangeListener(
      ThrowingMapChangeListener<K, V, X> throwingMapChangeListener) {
    return throwingMapChangeListener;
  }

  /**
   * Creates a new {@link ThrowingSetChangeListener}
   * that allows for exceptions to be thrown.
   * @param throwingSetChangeListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingSetChangeListener' behind the original interface.
   */
  public static <E, X extends Throwable> SetChangeListener<E> throwingSetChangeListener(
      ThrowingSetChangeListener<E, X> throwingSetChangeListener) {
    return throwingSetChangeListener;
  }

  /**
   * Creates a new {@link ThrowingEventDispatcher}
   * that allows for exceptions to be thrown.
   * @param throwingEventDispatcher the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEventDispatcher' behind the original interface.
   */
  public static <X extends Throwable> EventDispatcher throwingEventDispatcher(
      ThrowingEventDispatcher<X> throwingEventDispatcher) {
    return throwingEventDispatcher;
  }

  /**
   * Creates a new {@link ThrowingEventHandler}
   * that allows for exceptions to be thrown.
   * @param throwingEventHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEventHandler' behind the original interface.
   */
  public static <T extends javafx.event.Event, X extends Throwable> EventHandler<T> throwingEventHandler(
      ThrowingEventHandler<T, X> throwingEventHandler) {
    return throwingEventHandler;
  }

  /**
   * Creates a new {@link ThrowingEventTarget}
   * that allows for exceptions to be thrown.
   * @param throwingEventTarget the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEventTarget' behind the original interface.
   */
  public static <X extends Throwable> EventTarget throwingEventTarget(
      ThrowingEventTarget<X> throwingEventTarget) {
    return throwingEventTarget;
  }

  /**
   * Creates a new {@link ThrowingInitializable}
   * that allows for exceptions to be thrown.
   * @param throwingInitializable the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingInitializable' behind the original interface.
   */
  public static <X extends Throwable> Initializable throwingInitializable(
      ThrowingInitializable<X> throwingInitializable) {
    return throwingInitializable;
  }

  /**
   * Creates a new {@link ThrowingAudioSpectrumListener}
   * that allows for exceptions to be thrown.
   * @param throwingAudioSpectrumListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAudioSpectrumListener' behind the original interface.
   */
  public static <X extends Throwable> AudioSpectrumListener throwingAudioSpectrumListener(
      ThrowingAudioSpectrumListener<X> throwingAudioSpectrumListener) {
    return throwingAudioSpectrumListener;
  }

  /**
   * Creates a new {@link ThrowingBuilder}
   * that allows for exceptions to be thrown.
   * @param throwingBuilder the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBuilder' behind the original interface.
   */
  public static <T, X extends Throwable> Builder<T> throwingBuilder(
      ThrowingBuilder<T, X> throwingBuilder) {
    return throwingBuilder;
  }

  /**
   * Creates a new {@link ThrowingBuilderFactory}
   * that allows for exceptions to be thrown.
   * @param throwingBuilderFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingBuilderFactory' behind the original interface.
   */
  public static <X extends Throwable> BuilderFactory throwingBuilderFactory(
      ThrowingBuilderFactory<X> throwingBuilderFactory) {
    return throwingBuilderFactory;
  }

  /**
   * Creates a new {@link ThrowingCallback}
   * that allows for exceptions to be thrown.
   * @param throwingCallback the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingCallback' behind the original interface.
   */
  public static <P, R, X extends Throwable> Callback<P, R> throwingCallback(
      ThrowingCallback<P, R, X> throwingCallback) {
    return throwingCallback;
  }

  /**
   * Creates a new {@link ThrowingDomainManagerOperations}
   * that allows for exceptions to be thrown.
   * @param throwingDomainManagerOperations the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDomainManagerOperations' behind the original interface.
   */
  public static <X extends Throwable> DomainManagerOperations throwingDomainManagerOperations(
      ThrowingDomainManagerOperations<X> throwingDomainManagerOperations) {
    return throwingDomainManagerOperations;
  }

  /**
   * Creates a new {@link ThrowingInvokeHandler}
   * that allows for exceptions to be thrown.
   * @param throwingInvokeHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingInvokeHandler' behind the original interface.
   */
  public static <X extends Throwable> InvokeHandler throwingInvokeHandler(
      ThrowingInvokeHandler<X> throwingInvokeHandler) {
    return throwingInvokeHandler;
  }

  /**
   * Creates a new {@link ThrowingValueBase}
   * that allows for exceptions to be thrown.
   * @param throwingValueBase the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingValueBase' behind the original interface.
   */
  public static <X extends Throwable> ValueBase throwingValueBase(
      ThrowingValueBase<X> throwingValueBase) {
    return throwingValueBase;
  }

  /**
   * Creates a new {@link ThrowingValueFactory}
   * that allows for exceptions to be thrown.
   * @param throwingValueFactory the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingValueFactory' behind the original interface.
   */
  public static <X extends Throwable> ValueFactory throwingValueFactory(
      ThrowingValueFactory<X> throwingValueFactory) {
    return throwingValueFactory;
  }

  /**
   * Creates a new {@link ThrowingCodecFactoryOperations}
   * that allows for exceptions to be thrown.
   * @param throwingCodecFactoryOperations the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingCodecFactoryOperations' behind the original interface.
   */
  public static <X extends Throwable> CodecFactoryOperations throwingCodecFactoryOperations(
      ThrowingCodecFactoryOperations<X> throwingCodecFactoryOperations) {
    return throwingCodecFactoryOperations;
  }

  /**
   * Creates a new {@link ThrowingPolicyFactoryOperations}
   * that allows for exceptions to be thrown.
   * @param throwingPolicyFactoryOperations the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingPolicyFactoryOperations' behind the original interface.
   */
  public static <X extends Throwable> PolicyFactoryOperations throwingPolicyFactoryOperations(
      ThrowingPolicyFactoryOperations<X> throwingPolicyFactoryOperations) {
    return throwingPolicyFactoryOperations;
  }

  /**
   * Creates a new {@link ThrowingAdapterActivatorOperations}
   * that allows for exceptions to be thrown.
   * @param throwingAdapterActivatorOperations the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAdapterActivatorOperations' behind the original interface.
   */
  public static <X extends Throwable> AdapterActivatorOperations throwingAdapterActivatorOperations(
      ThrowingAdapterActivatorOperations<X> throwingAdapterActivatorOperations) {
    return throwingAdapterActivatorOperations;
  }

  /**
   * Creates a new {@link ThrowingDOMErrorHandler}
   * that allows for exceptions to be thrown.
   * @param throwingDOMErrorHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDOMErrorHandler' behind the original interface.
   */
  public static <X extends Throwable> DOMErrorHandler throwingDOMErrorHandler(
      ThrowingDOMErrorHandler<X> throwingDOMErrorHandler) {
    return throwingDOMErrorHandler;
  }

  /**
   * Creates a new {@link ThrowingUserDataHandler}
   * that allows for exceptions to be thrown.
   * @param throwingUserDataHandler the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingUserDataHandler' behind the original interface.
   */
  public static <X extends Throwable> UserDataHandler throwingUserDataHandler(
      ThrowingUserDataHandler<X> throwingUserDataHandler) {
    return throwingUserDataHandler;
  }

  /**
   * Creates a new {@link ThrowingElementCSSInlineStyle}
   * that allows for exceptions to be thrown.
   * @param throwingElementCSSInlineStyle the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingElementCSSInlineStyle' behind the original interface.
   */
  public static <X extends Throwable> ElementCSSInlineStyle throwingElementCSSInlineStyle(
      ThrowingElementCSSInlineStyle<X> throwingElementCSSInlineStyle) {
    return throwingElementCSSInlineStyle;
  }

  /**
   * Creates a new {@link ThrowingDocumentEvent}
   * that allows for exceptions to be thrown.
   * @param throwingDocumentEvent the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDocumentEvent' behind the original interface.
   */
  public static <X extends Throwable> DocumentEvent throwingDocumentEvent(
      ThrowingDocumentEvent<X> throwingDocumentEvent) {
    return throwingDocumentEvent;
  }

  /**
   * Creates a new {@link ThrowingEventListener}
   * that allows for exceptions to be thrown.
   * @param throwingEventListener the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEventListener' behind the original interface.
   */
  public static <X extends Throwable> EventListener throwingEventListener(
      ThrowingEventListener<X> throwingEventListener) {
    return throwingEventListener;
  }

  /**
   * Creates a new {@link ThrowingLSResourceResolver}
   * that allows for exceptions to be thrown.
   * @param throwingLSResourceResolver the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLSResourceResolver' behind the original interface.
   */
  public static <X extends Throwable> LSResourceResolver throwingLSResourceResolver(
      ThrowingLSResourceResolver<X> throwingLSResourceResolver) {
    return throwingLSResourceResolver;
  }

  /**
   * Creates a new {@link ThrowingDocumentRange}
   * that allows for exceptions to be thrown.
   * @param throwingDocumentRange the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDocumentRange' behind the original interface.
   */
  public static <X extends Throwable> DocumentRange throwingDocumentRange(
      ThrowingDocumentRange<X> throwingDocumentRange) {
    return throwingDocumentRange;
  }

  /**
   * Creates a new {@link ThrowingDocumentStyle}
   * that allows for exceptions to be thrown.
   * @param throwingDocumentStyle the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDocumentStyle' behind the original interface.
   */
  public static <X extends Throwable> DocumentStyle throwingDocumentStyle(
      ThrowingDocumentStyle<X> throwingDocumentStyle) {
    return throwingDocumentStyle;
  }

  /**
   * Creates a new {@link ThrowingLinkStyle}
   * that allows for exceptions to be thrown.
   * @param throwingLinkStyle the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingLinkStyle' behind the original interface.
   */
  public static <X extends Throwable> LinkStyle throwingLinkStyle(
      ThrowingLinkStyle<X> throwingLinkStyle) {
    return throwingLinkStyle;
  }

  /**
   * Creates a new {@link ThrowingNodeFilter}
   * that allows for exceptions to be thrown.
   * @param throwingNodeFilter the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingNodeFilter' behind the original interface.
   */
  public static <X extends Throwable> NodeFilter throwingNodeFilter(
      ThrowingNodeFilter<X> throwingNodeFilter) {
    return throwingNodeFilter;
  }

  /**
   * Creates a new {@link ThrowingAbstractView}
   * that allows for exceptions to be thrown.
   * @param throwingAbstractView the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingAbstractView' behind the original interface.
   */
  public static <X extends Throwable> AbstractView throwingAbstractView(
      ThrowingAbstractView<X> throwingAbstractView) {
    return throwingAbstractView;
  }

  /**
   * Creates a new {@link ThrowingDocumentView}
   * that allows for exceptions to be thrown.
   * @param throwingDocumentView the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingDocumentView' behind the original interface.
   */
  public static <X extends Throwable> DocumentView throwingDocumentView(
      ThrowingDocumentView<X> throwingDocumentView) {
    return throwingDocumentView;
  }

  /**
   * Creates a new {@link ThrowingEntityResolver}
   * that allows for exceptions to be thrown.
   * @param throwingEntityResolver the interface that can throw check exceptions.
   * @param <X> the type of checked exception.
   * @returns the parameter 'throwingEntityResolver' behind the original interface.
   */
  public static <X extends Throwable> EntityResolver throwingEntityResolver(
      ThrowingEntityResolver<X> throwingEntityResolver) {
    return throwingEntityResolver;
  }
}
