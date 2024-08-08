package vegabobo.dsusideloader.ui.screen.libraries;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.UriHandler;
import com.mikepenz.aboutlibraries.entity.Library;
import com.mikepenz.aboutlibraries.entity.License;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import vegabobo.dsusideloader.ui.components.DynamicListItemKt;
import vegabobo.dsusideloader.ui.components.PreferenceItemKt;

/* compiled from: LibrariesScreen.kt */
public final class LibrariesScreenKt$LibrariesScreen$2 extends Lambda implements Function2 {
    public final /* synthetic */ List $libraries;
    public final /* synthetic */ UriHandler $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibrariesScreenKt$LibrariesScreen$2(List list, UriHandler uriHandler) {
        super(2);
        this.$libraries = list;
        this.$uriHandler = uriHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        int i = $changed;
        ComposerKt.sourceInformation($composer, "C55@2245L935:LibrariesScreen.kt#qseziw");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1156388465, i, -1, "vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreen.<anonymous> (LibrariesScreen.kt:54)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            final List list = this.$libraries;
            final UriHandler uriHandler = this.$uriHandler;
            LazyDslKt.LazyColumn(fillMaxSize$default, (LazyListState) null, (PaddingValues) null, false, (Arrangement.Vertical) null, (Alignment.Horizontal) null, (FlingBehavior) null, false, new Function1() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    invoke((LazyListScope) p1);
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyListScope $this$LazyColumn) {
                    Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
                    int size = list.size();
                    final List list = list;
                    final UriHandler uriHandler = uriHandler;
                    LazyListScope.items$default($this$LazyColumn, size, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1154922764, true, new Function4() {
                        public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
                            invoke((LazyItemScope) p1, ((Number) p2).intValue(), (Composer) p3, ((Number) p4).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                            Intrinsics.checkNotNullParameter($this$items, "$this$items");
                            ComposerKt.sourceInformation($composer, "C64@2648L444:LibrariesScreen.kt#qseziw");
                            int $dirty = $changed;
                            if (($changed & 112) == 0) {
                                $dirty |= $composer.changed(it) ? 32 : 16;
                            }
                            if (($dirty & 721) != 144 || !$composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1154922764, $dirty, -1, "vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreen.<anonymous>.<anonymous>.<anonymous> (LibrariesScreen.kt:56)");
                                }
                                Library thisLibrary = (Library) list.get(it);
                                final String name = thisLibrary.getName();
                                final Ref$ObjectRef licenses = new Ref$ObjectRef();
                                licenses.element = LiveLiterals$LibrariesScreenKt.INSTANCE.m3362String$vallicenses$fun$anonymous$$arg3$callitems$fun$anonymous$$arg8$callLazyColumn$fun$anonymous$$arg7$callApplicationScreen$funLibrariesScreen();
                                for (License license : thisLibrary.getLicenses()) {
                                    Object obj = licenses.element;
                                    String name2 = license.getName();
                                    licenses.element = obj + name2;
                                }
                                final String urlToOpen = thisLibrary.getWebsite();
                                if (urlToOpen == null) {
                                    urlToOpen = LiveLiterals$LibrariesScreenKt.INSTANCE.m3361String$branch$when$valurlToOpen$fun$anonymous$$arg3$callitems$fun$anonymous$$arg8$callLazyColumn$fun$anonymous$$arg7$callApplicationScreen$funLibrariesScreen();
                                }
                                final UriHandler uriHandler = uriHandler;
                                DynamicListItemKt.DynamicListItem(list.size() - LiveLiterals$LibrariesScreenKt.INSTANCE.m3360Int$arg0$callminus$arg0$callDynamicListItem$fun$anonymous$$arg3$callitems$fun$anonymous$$arg8$callLazyColumn$fun$anonymous$$arg7$callApplicationScreen$funLibrariesScreen(), it, ComposableLambdaKt.composableLambda($composer, -192719791, true, new Function2() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                                        invoke((Composer) p1, ((Number) p2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer $composer, int $changed) {
                                        ComposerKt.sourceInformation($composer, "C65@2738L336:LibrariesScreen.kt#qseziw");
                                        if (($changed & 11) != 2 || !$composer.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-192719791, $changed, -1, "vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LibrariesScreen.kt:64)");
                                            }
                                            final String str = urlToOpen;
                                            final UriHandler uriHandler = uriHandler;
                                            PreferenceItemKt.PreferenceItem(name, (String) licenses.element, (ImageVector) null, new Function1() {
                                                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                                    invoke(((Boolean) p1).booleanValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(boolean it) {
                                                    if (str.length() > 0) {
                                                        uriHandler.openUri(str);
                                                    }
                                                }
                                            }, false, false, false, $composer, 0, 116);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        $composer.skipToGroupEnd();
                                    }
                                }), $composer, ($dirty & 112) | 384);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            $composer.skipToGroupEnd();
                        }
                    }), 6, (Object) null);
                    LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$LibrariesScreenKt.INSTANCE.m3354getLambda1$app_miniDebug(), 3, (Object) null);
                }
            }, $composer, 6, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
