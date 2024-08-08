package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.components.ComposableSingletons$SimpleCardKt$lambda-1$1  reason: invalid class name */
/* compiled from: SimpleCard.kt */
public final class ComposableSingletons$SimpleCardKt$lambda1$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$SimpleCardKt$lambda1$1 INSTANCE = new ComposableSingletons$SimpleCardKt$lambda1$1();

    public ComposableSingletons$SimpleCardKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:SimpleCard.kt#bcxyhz");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1653722110, $changed, -1, "vegabobo.dsusideloader.ui.components.ComposableSingletons$SimpleCardKt.lambda-1.<anonymous> (SimpleCard.kt:22)");
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
