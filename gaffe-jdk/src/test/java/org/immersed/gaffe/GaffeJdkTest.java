package org.immersed.gaffe;

import static org.immersed.gaffe.GaffeJdk.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public final class GaffeJdkTest {
  @Test
  public void testthrowingActiveEventCanThrowCheckedException() {
    java.awt.ActiveEvent iface = throwingActiveEvent(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCompositeCanThrowCheckedException() {
    java.awt.Composite iface = throwingComposite((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingKeyEventDispatcherCanThrowCheckedException() {
    java.awt.KeyEventDispatcher iface = throwingKeyEventDispatcher(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingKeyEventPostProcessorCanThrowCheckedException() {
    java.awt.KeyEventPostProcessor iface = throwingKeyEventPostProcessor(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPrintGraphicsCanThrowCheckedException() {
    java.awt.PrintGraphics iface = throwingPrintGraphics(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingStrokeCanThrowCheckedException() {
    java.awt.Stroke iface = throwingStroke(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingTransparencyCanThrowCheckedException() {
    java.awt.Transparency iface = throwingTransparency(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingClipboardOwnerCanThrowCheckedException() {
    java.awt.datatransfer.ClipboardOwner iface = throwingClipboardOwner((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFlavorListenerCanThrowCheckedException() {
    java.awt.datatransfer.FlavorListener iface = throwingFlavorListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDragGestureListenerCanThrowCheckedException() {
    java.awt.dnd.DragGestureListener iface = throwingDragGestureListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDragSourceMotionListenerCanThrowCheckedException() {
    java.awt.dnd.DragSourceMotionListener iface = throwingDragSourceMotionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAWTEventListenerCanThrowCheckedException() {
    java.awt.event.AWTEventListener iface = throwingAWTEventListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingActionListenerCanThrowCheckedException() {
    java.awt.event.ActionListener iface = throwingActionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAdjustmentListenerCanThrowCheckedException() {
    java.awt.event.AdjustmentListener iface = throwingAdjustmentListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingHierarchyListenerCanThrowCheckedException() {
    java.awt.event.HierarchyListener iface = throwingHierarchyListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingItemListenerCanThrowCheckedException() {
    java.awt.event.ItemListener iface = throwingItemListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingMouseWheelListenerCanThrowCheckedException() {
    java.awt.event.MouseWheelListener iface = throwingMouseWheelListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingTextListenerCanThrowCheckedException() {
    java.awt.event.TextListener iface = throwingTextListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingWindowStateListenerCanThrowCheckedException() {
    java.awt.event.WindowStateListener iface = throwingWindowStateListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingImageObserverCanThrowCheckedException() {
    java.awt.image.ImageObserver iface = throwingImageObserver((a,b,c,d,e,f) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingTileObserverCanThrowCheckedException() {
    java.awt.image.TileObserver iface = throwingTileObserver((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRenderedImageFactoryCanThrowCheckedException() {
    java.awt.image.renderable.RenderedImageFactory iface = throwingRenderedImageFactory((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingSystemTrayPeerCanThrowCheckedException() {
    java.awt.peer.SystemTrayPeer iface = throwingSystemTrayPeer(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPrintableCanThrowCheckedException() {
    java.awt.print.Printable iface = throwingPrintable((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPrinterGraphicsCanThrowCheckedException() {
    java.awt.print.PrinterGraphics iface = throwingPrinterGraphics(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingExceptionListenerCanThrowCheckedException() {
    java.beans.ExceptionListener iface = throwingExceptionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPropertyChangeListenerCanThrowCheckedException() {
    java.beans.PropertyChangeListener iface = throwingPropertyChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingVetoableChangeListenerCanThrowCheckedException() {
    java.beans.VetoableChangeListener iface = throwingVetoableChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBeanContextChildComponentProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextChildComponentProxy iface = throwingBeanContextChildComponentProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBeanContextContainerProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextContainerProxy iface = throwingBeanContextContainerProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBeanContextProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextProxy iface = throwingBeanContextProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBeanContextServiceRevokedListenerCanThrowCheckedException() {
    java.beans.beancontext.BeanContextServiceRevokedListener iface = throwingBeanContextServiceRevokedListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCloseableCanThrowCheckedException() {
    java.io.Closeable iface = throwingCloseable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFileFilterCanThrowCheckedException() {
    java.io.FileFilter iface = throwingFileFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFilenameFilterCanThrowCheckedException() {
    java.io.FilenameFilter iface = throwingFilenameFilter((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFlushableCanThrowCheckedException() {
    java.io.Flushable iface = throwingFlushable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingObjectInputValidationCanThrowCheckedException() {
    java.io.ObjectInputValidation iface = throwingObjectInputValidation(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAutoCloseableCanThrowCheckedException() {
    java.lang.AutoCloseable iface = throwingAutoCloseable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingComparableCanThrowCheckedException() {
    java.lang.Comparable iface = throwingComparable(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIterableCanThrowCheckedException() {
    java.lang.Iterable iface = throwingIterable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingReadableCanThrowCheckedException() {
    java.lang.Readable iface = throwingReadable(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRunnableCanThrowCheckedException() {
    java.lang.Runnable iface = throwingRunnable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingThreadUncaughtExceptionHandlerCanThrowCheckedException() {
    java.lang.Thread.UncaughtExceptionHandler iface = throwingThreadUncaughtExceptionHandler((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingClassFileTransformerCanThrowCheckedException() {
    java.lang.instrument.ClassFileTransformer iface = throwingClassFileTransformer((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPlatformManagedObjectCanThrowCheckedException() {
    java.lang.management.PlatformManagedObject iface = throwingPlatformManagedObject(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingGenericArrayTypeCanThrowCheckedException() {
    java.lang.reflect.GenericArrayType iface = throwingGenericArrayType(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingInvocationHandlerCanThrowCheckedException() {
    java.lang.reflect.InvocationHandler iface = throwingInvocationHandler((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingContentHandlerFactoryCanThrowCheckedException() {
    java.net.ContentHandlerFactory iface = throwingContentHandlerFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCookiePolicyCanThrowCheckedException() {
    java.net.CookiePolicy iface = throwingCookiePolicy((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDatagramSocketImplFactoryCanThrowCheckedException() {
    java.net.DatagramSocketImplFactory iface = throwingDatagramSocketImplFactory(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFileNameMapCanThrowCheckedException() {
    java.net.FileNameMap iface = throwingFileNameMap(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingProtocolFamilyCanThrowCheckedException() {
    java.net.ProtocolFamily iface = throwingProtocolFamily(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingSocketImplFactoryCanThrowCheckedException() {
    java.net.SocketImplFactory iface = throwingSocketImplFactory(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingURLStreamHandlerFactoryCanThrowCheckedException() {
    java.net.URLStreamHandlerFactory iface = throwingURLStreamHandlerFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDirectoryStreamFilterCanThrowCheckedException() {
    java.nio.file.DirectoryStream.Filter iface = throwingDirectoryStreamFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPathMatcherCanThrowCheckedException() {
    java.nio.file.PathMatcher iface = throwingPathMatcher(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingWatchEventModifierCanThrowCheckedException() {
    java.nio.file.WatchEvent.Modifier iface = throwingWatchEventModifier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.AttributeView iface = throwingAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFileAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.FileAttributeView iface = throwingFileAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFileStoreAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.FileStoreAttributeView iface = throwingFileStoreAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingActivationInstantiatorCanThrowCheckedException() {
    java.rmi.activation.ActivationInstantiator iface = throwingActivationInstantiator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingActivatorCanThrowCheckedException() {
    java.rmi.activation.Activator iface = throwingActivator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRMIClientSocketFactoryCanThrowCheckedException() {
    java.rmi.server.RMIClientSocketFactory iface = throwingRMIClientSocketFactory((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRMIFailureHandlerCanThrowCheckedException() {
    java.rmi.server.RMIFailureHandler iface = throwingRMIFailureHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRMIServerSocketFactoryCanThrowCheckedException() {
    java.rmi.server.RMIServerSocketFactory iface = throwingRMIServerSocketFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingUnreferencedCanThrowCheckedException() {
    java.rmi.server.Unreferenced iface = throwingUnreferenced(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDomainCombinerCanThrowCheckedException() {
    java.security.DomainCombiner iface = throwingDomainCombiner((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingGuardCanThrowCheckedException() {
    java.security.Guard iface = throwingGuard(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingKeyStoreLoadStoreParameterCanThrowCheckedException() {
    java.security.KeyStore.LoadStoreParameter iface = throwingKeyStoreLoadStoreParameter(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPrivilegedActionCanThrowCheckedException() {
    java.security.PrivilegedAction iface = throwingPrivilegedAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPrivilegedExceptionActionCanThrowCheckedException() {
    java.security.PrivilegedExceptionAction iface = throwingPrivilegedExceptionAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCertPathParametersCanThrowCheckedException() {
    java.security.cert.CertPathParameters iface = throwingCertPathParameters(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCertPathValidatorResultCanThrowCheckedException() {
    java.security.cert.CertPathValidatorResult iface = throwingCertPathValidatorResult(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCertStoreParametersCanThrowCheckedException() {
    java.security.cert.CertStoreParameters iface = throwingCertStoreParameters(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDSAKeyCanThrowCheckedException() {
    java.security.interfaces.DSAKey iface = throwingDSAKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingECKeyCanThrowCheckedException() {
    java.security.interfaces.ECKey iface = throwingECKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRSAKeyCanThrowCheckedException() {
    java.security.interfaces.RSAKey iface = throwingRSAKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingECFieldCanThrowCheckedException() {
    java.security.spec.ECField iface = throwingECField(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDriverActionCanThrowCheckedException() {
    java.sql.DriverAction iface = throwingDriverAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEraCanThrowCheckedException() {
    java.time.chrono.Era iface = throwingEra(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingTemporalAdjusterCanThrowCheckedException() {
    java.time.temporal.TemporalAdjuster iface = throwingTemporalAdjuster(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingTemporalQueryCanThrowCheckedException() {
    java.time.temporal.TemporalQuery iface = throwingTemporalQuery(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFormattableCanThrowCheckedException() {
    java.util.Formattable iface = throwingFormattable((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingObserverCanThrowCheckedException() {
    java.util.Observer iface = throwingObserver((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCallableCanThrowCheckedException() {
    java.util.concurrent.Callable iface = throwingCallable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingExecutorCanThrowCheckedException() {
    java.util.concurrent.Executor iface = throwingExecutor(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingForkJoinPoolForkJoinWorkerThreadFactoryCanThrowCheckedException() {
    java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory iface = throwingForkJoinPoolForkJoinWorkerThreadFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingRejectedExecutionHandlerCanThrowCheckedException() {
    java.util.concurrent.RejectedExecutionHandler iface = throwingRejectedExecutionHandler((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingThreadFactoryCanThrowCheckedException() {
    java.util.concurrent.ThreadFactory iface = throwingThreadFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBiConsumerCanThrowCheckedException() {
    java.util.function.BiConsumer iface = throwingBiConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBiFunctionCanThrowCheckedException() {
    java.util.function.BiFunction iface = throwingBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBiPredicateCanThrowCheckedException() {
    java.util.function.BiPredicate iface = throwingBiPredicate((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBinaryOperatorCanThrowCheckedException() {
    java.util.function.BinaryOperator iface = throwingBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBooleanSupplierCanThrowCheckedException() {
    java.util.function.BooleanSupplier iface = throwingBooleanSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingConsumerCanThrowCheckedException() {
    java.util.function.Consumer iface = throwingConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleBinaryOperatorCanThrowCheckedException() {
    java.util.function.DoubleBinaryOperator iface = throwingDoubleBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleConsumerCanThrowCheckedException() {
    java.util.function.DoubleConsumer iface = throwingDoubleConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleFunctionCanThrowCheckedException() {
    java.util.function.DoubleFunction iface = throwingDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoublePredicateCanThrowCheckedException() {
    java.util.function.DoublePredicate iface = throwingDoublePredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleSupplierCanThrowCheckedException() {
    java.util.function.DoubleSupplier iface = throwingDoubleSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleToIntFunctionCanThrowCheckedException() {
    java.util.function.DoubleToIntFunction iface = throwingDoubleToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleToLongFunctionCanThrowCheckedException() {
    java.util.function.DoubleToLongFunction iface = throwingDoubleToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDoubleUnaryOperatorCanThrowCheckedException() {
    java.util.function.DoubleUnaryOperator iface = throwingDoubleUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFunctionCanThrowCheckedException() {
    java.util.function.Function iface = throwingFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntBinaryOperatorCanThrowCheckedException() {
    java.util.function.IntBinaryOperator iface = throwingIntBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntConsumerCanThrowCheckedException() {
    java.util.function.IntConsumer iface = throwingIntConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntFunctionCanThrowCheckedException() {
    java.util.function.IntFunction iface = throwingIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntPredicateCanThrowCheckedException() {
    java.util.function.IntPredicate iface = throwingIntPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntSupplierCanThrowCheckedException() {
    java.util.function.IntSupplier iface = throwingIntSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntToDoubleFunctionCanThrowCheckedException() {
    java.util.function.IntToDoubleFunction iface = throwingIntToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntToLongFunctionCanThrowCheckedException() {
    java.util.function.IntToLongFunction iface = throwingIntToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingIntUnaryOperatorCanThrowCheckedException() {
    java.util.function.IntUnaryOperator iface = throwingIntUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongBinaryOperatorCanThrowCheckedException() {
    java.util.function.LongBinaryOperator iface = throwingLongBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongConsumerCanThrowCheckedException() {
    java.util.function.LongConsumer iface = throwingLongConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongFunctionCanThrowCheckedException() {
    java.util.function.LongFunction iface = throwingLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongPredicateCanThrowCheckedException() {
    java.util.function.LongPredicate iface = throwingLongPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongSupplierCanThrowCheckedException() {
    java.util.function.LongSupplier iface = throwingLongSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongToDoubleFunctionCanThrowCheckedException() {
    java.util.function.LongToDoubleFunction iface = throwingLongToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongToIntFunctionCanThrowCheckedException() {
    java.util.function.LongToIntFunction iface = throwingLongToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLongUnaryOperatorCanThrowCheckedException() {
    java.util.function.LongUnaryOperator iface = throwingLongUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingObjDoubleConsumerCanThrowCheckedException() {
    java.util.function.ObjDoubleConsumer iface = throwingObjDoubleConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingObjIntConsumerCanThrowCheckedException() {
    java.util.function.ObjIntConsumer iface = throwingObjIntConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingObjLongConsumerCanThrowCheckedException() {
    java.util.function.ObjLongConsumer iface = throwingObjLongConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPredicateCanThrowCheckedException() {
    java.util.function.Predicate iface = throwingPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingSupplierCanThrowCheckedException() {
    java.util.function.Supplier iface = throwingSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToDoubleBiFunctionCanThrowCheckedException() {
    java.util.function.ToDoubleBiFunction iface = throwingToDoubleBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToDoubleFunctionCanThrowCheckedException() {
    java.util.function.ToDoubleFunction iface = throwingToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToIntBiFunctionCanThrowCheckedException() {
    java.util.function.ToIntBiFunction iface = throwingToIntBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToIntFunctionCanThrowCheckedException() {
    java.util.function.ToIntFunction iface = throwingToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToLongBiFunctionCanThrowCheckedException() {
    java.util.function.ToLongBiFunction iface = throwingToLongBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingToLongFunctionCanThrowCheckedException() {
    java.util.function.ToLongFunction iface = throwingToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingUnaryOperatorCanThrowCheckedException() {
    java.util.function.UnaryOperator iface = throwingUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingFilterCanThrowCheckedException() {
    java.util.logging.Filter iface = throwingFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPreferenceChangeListenerCanThrowCheckedException() {
    java.util.prefs.PreferenceChangeListener iface = throwingPreferenceChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingResourceBundleControlProviderCanThrowCheckedException() {
    java.util.spi.ResourceBundleControlProvider iface = throwingResourceBundleControlProvider(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingInterpolatableCanThrowCheckedException() {
    javafx.animation.Interpolatable iface = throwingInterpolatable((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingInvalidationListenerCanThrowCheckedException() {
    javafx.beans.InvalidationListener iface = throwingInvalidationListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingWeakListenerCanThrowCheckedException() {
    javafx.beans.WeakListener iface = throwingWeakListener(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingChangeListenerCanThrowCheckedException() {
    javafx.beans.value.ChangeListener iface = throwingChangeListener((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingArrayChangeListenerCanThrowCheckedException() {
    javafx.collections.ArrayChangeListener iface = throwingArrayChangeListener((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingListChangeListenerCanThrowCheckedException() {
    javafx.collections.ListChangeListener iface = throwingListChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingMapChangeListenerCanThrowCheckedException() {
    javafx.collections.MapChangeListener iface = throwingMapChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingSetChangeListenerCanThrowCheckedException() {
    javafx.collections.SetChangeListener iface = throwingSetChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEventDispatcherCanThrowCheckedException() {
    javafx.event.EventDispatcher iface = throwingEventDispatcher((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEventHandlerCanThrowCheckedException() {
    javafx.event.EventHandler iface = throwingEventHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEventTargetCanThrowCheckedException() {
    javafx.event.EventTarget iface = throwingEventTarget(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingInitializableCanThrowCheckedException() {
    javafx.fxml.Initializable iface = throwingInitializable((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAudioSpectrumListenerCanThrowCheckedException() {
    javafx.scene.media.AudioSpectrumListener iface = throwingAudioSpectrumListener((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBuilderCanThrowCheckedException() {
    javafx.util.Builder iface = throwingBuilder(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingBuilderFactoryCanThrowCheckedException() {
    javafx.util.BuilderFactory iface = throwingBuilderFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCallbackCanThrowCheckedException() {
    javafx.util.Callback iface = throwingCallback(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDomainManagerOperationsCanThrowCheckedException() {
    org.omg.CORBA.DomainManagerOperations iface = throwingDomainManagerOperations(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingInvokeHandlerCanThrowCheckedException() {
    org.omg.CORBA.portable.InvokeHandler iface = throwingInvokeHandler((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingValueBaseCanThrowCheckedException() {
    org.omg.CORBA.portable.ValueBase iface = throwingValueBase(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingValueFactoryCanThrowCheckedException() {
    org.omg.CORBA.portable.ValueFactory iface = throwingValueFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingCodecFactoryOperationsCanThrowCheckedException() {
    org.omg.IOP.CodecFactoryOperations iface = throwingCodecFactoryOperations(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingPolicyFactoryOperationsCanThrowCheckedException() {
    org.omg.PortableInterceptor.PolicyFactoryOperations iface = throwingPolicyFactoryOperations((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAdapterActivatorOperationsCanThrowCheckedException() {
    org.omg.PortableServer.AdapterActivatorOperations iface = throwingAdapterActivatorOperations((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDOMErrorHandlerCanThrowCheckedException() {
    org.w3c.dom.DOMErrorHandler iface = throwingDOMErrorHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingUserDataHandlerCanThrowCheckedException() {
    org.w3c.dom.UserDataHandler iface = throwingUserDataHandler((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingElementCSSInlineStyleCanThrowCheckedException() {
    org.w3c.dom.css.ElementCSSInlineStyle iface = throwingElementCSSInlineStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDocumentEventCanThrowCheckedException() {
    org.w3c.dom.events.DocumentEvent iface = throwingDocumentEvent(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEventListenerCanThrowCheckedException() {
    org.w3c.dom.events.EventListener iface = throwingEventListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLSResourceResolverCanThrowCheckedException() {
    org.w3c.dom.ls.LSResourceResolver iface = throwingLSResourceResolver((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDocumentRangeCanThrowCheckedException() {
    org.w3c.dom.ranges.DocumentRange iface = throwingDocumentRange(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDocumentStyleCanThrowCheckedException() {
    org.w3c.dom.stylesheets.DocumentStyle iface = throwingDocumentStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingLinkStyleCanThrowCheckedException() {
    org.w3c.dom.stylesheets.LinkStyle iface = throwingLinkStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingNodeFilterCanThrowCheckedException() {
    org.w3c.dom.traversal.NodeFilter iface = throwingNodeFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingAbstractViewCanThrowCheckedException() {
    org.w3c.dom.views.AbstractView iface = throwingAbstractView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingDocumentViewCanThrowCheckedException() {
    org.w3c.dom.views.DocumentView iface = throwingDocumentView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingXPathExpressionCanThrowCheckedException() {
    org.w3c.dom.xpath.XPathExpression iface = throwingXPathExpression((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingXPathNSResolverCanThrowCheckedException() {
    org.w3c.dom.xpath.XPathNSResolver iface = throwingXPathNSResolver(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testthrowingEntityResolverCanThrowCheckedException() {
    org.xml.sax.EntityResolver iface = throwingEntityResolver((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }
}
