package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.components.ComposableSingletons$ApplicationScreenKt$lambda-4$1  reason: invalid class name */
/* compiled from: ApplicationScreen.kt */
public final class ComposableSingletons$ApplicationScreenKt$lambda4$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$ApplicationScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$ApplicationScreenKt$lambda4$1();

    public ComposableSingletons$ApplicationScreenKt$lambda4$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:ApplicationScreen.kt#bcxyhz");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1829383958, $changed, -1, "vegabobo.dsusideloader.ui.components.ComposableSingletons$ApplicationScreenKt.lambda-4.<anonymous> (ApplicationScreen.kt:37)");
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