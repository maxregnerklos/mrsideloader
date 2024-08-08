package vegabobo.dsusideloader.ui.components;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.components.ComposableSingletons$ApplicationScreenKt$lambda-1$1  reason: invalid class name */
/* compiled from: ApplicationScreen.kt */
public final class ComposableSingletons$ApplicationScreenKt$lambda1$1 extends Lambda implements Function3 {
    public static final ComposableSingletons$ApplicationScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ApplicationScreenKt$lambda1$1();

    public ComposableSingletons$ApplicationScreenKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((TopAppBarScrollBehavior) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TopAppBarScrollBehavior it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:ApplicationScreen.kt#bcxyhz");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1712326021, $changed, -1, "vegabobo.dsusideloader.ui.components.ComposableSingletons$ApplicationScreenKt.lambda-1.<anonymous> (ApplicationScreen.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
