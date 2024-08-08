package vegabobo.dsusideloader.ui.screen.libraries;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.unit.Dp;
import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.util.AndroidExtensionsKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.ui.components.ApplicationScreenKt;

/* compiled from: LibrariesScreen.kt */
public abstract class LibrariesScreenKt {
    public static final void LibrariesScreen(Function1 navigate, Composer $composer, int $changed) {
        Object value$iv$iv;
        Function1 function1 = navigate;
        int i = $changed;
        Intrinsics.checkNotNullParameter(function1, "navigate");
        Composer $composer2 = $composer.startRestartGroup(-1948527321);
        ComposerKt.sourceInformation($composer2, "C(LibrariesScreen)32@1366L40,33@1438L7,34@1483L7,38@1618L24,39@1686L45,41@1737L1449:LibrariesScreen.kt#qseziw");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 11) != 2 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1948527321, $dirty2, -1, "vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreen (LibrariesScreen.kt:29)");
            }
            $composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation($composer2, "CC(remember):Composables.kt#9igjgp");
            Composer $this$cache$iv$iv = $composer2;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer2.endReplaceableGroup();
            MutableState libs = (MutableState) value$iv$iv;
            CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(this_$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) consume;
            CompositionLocal this_$iv2 = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer2.consume(this_$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            libs.setValue(AndroidExtensionsKt.withContext(new Libs.Builder(), context).build());
            Object value = libs.getValue();
            Intrinsics.checkNotNull(value);
            List libraries = ((Libs) value).getLibraries();
            Context context2 = context;
            List libraries2 = libraries;
            TopAppBarScrollBehavior scrollBehavior = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7), (Function0) null, (AnimationSpec) null, (DecayAnimationSpec) null, $composer2, TopAppBarDefaults.$stable << 12, 14);
            Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, scrollBehavior.getNestedScrollConnection(), (NestedScrollDispatcher) null, 2, (Object) null);
            LiveLiterals$LibrariesScreenKt liveLiterals$LibrariesScreenKt = LiveLiterals$LibrariesScreenKt.INSTANCE;
            UriHandler uriHandler = (UriHandler) consume2;
            TopAppBarScrollBehavior topAppBarScrollBehavior = scrollBehavior;
            UriHandler uriHandler2 = uriHandler;
            Context context3 = context2;
            List list = libraries2;
            ApplicationScreenKt.ApplicationScreen(PaddingKt.m225paddingqDBjuR0$default(nestedScroll$default, Dp.m2350constructorimpl((float) liveLiterals$LibrariesScreenKt.m3358Int$$$this$call$getdp$$arg0$callpadding$valtmp0_modifier$funLibrariesScreen()), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$LibrariesScreenKt.m3359Int$$$this$call$getdp$$arg2$callpadding$valtmp0_modifier$funLibrariesScreen()), 0.0f, 10, (Object) null), (Arrangement.HorizontalOrVertical) null, liveLiterals$LibrariesScreenKt.m3355Boolean$arg2$callApplicationScreen$funLibrariesScreen(), liveLiterals$LibrariesScreenKt.m3356Boolean$arg3$callApplicationScreen$funLibrariesScreen(), ComposableLambdaKt.composableLambda($composer2, 81221220, true, new LibrariesScreenKt$LibrariesScreen$1(scrollBehavior, function1, $dirty2)), (Function2) null, (Function3) null, ComposableLambdaKt.composableLambda($composer2, 1156388465, true, new LibrariesScreenKt$LibrariesScreen$2(libraries2, uriHandler)), $composer2, 12607488, 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LibrariesScreenKt$LibrariesScreen$3(function1, i));
        }
    }
}
