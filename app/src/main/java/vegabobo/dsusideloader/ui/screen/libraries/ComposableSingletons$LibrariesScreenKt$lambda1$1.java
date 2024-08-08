package vegabobo.dsusideloader.ui.screen.libraries;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.screen.libraries.ComposableSingletons$LibrariesScreenKt$lambda-1$1  reason: invalid class name */
/* compiled from: LibrariesScreen.kt */
public final class ComposableSingletons$LibrariesScreenKt$lambda1$1 extends Lambda implements Function3 {
    public static final ComposableSingletons$LibrariesScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$LibrariesScreenKt$lambda1$1();

    public ComposableSingletons$LibrariesScreenKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((LazyItemScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C76@3126L42:LibrariesScreen.kt#qseziw");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1122732707, $changed, -1, "vegabobo.dsusideloader.ui.screen.libraries.ComposableSingletons$LibrariesScreenKt.lambda-1.<anonymous> (LibrariesScreen.kt:76)");
            }
            SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(Modifier.Companion, Dp.m2350constructorimpl((float) LiveLiterals$LibrariesScreenKt.INSTANCE.m3357Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer$fun$anonymous$$arg2$callitem$fun$anonymous$$arg8$callLazyColumn$fun$anonymous$$arg7$callApplicationScreen$funLibrariesScreen())), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
