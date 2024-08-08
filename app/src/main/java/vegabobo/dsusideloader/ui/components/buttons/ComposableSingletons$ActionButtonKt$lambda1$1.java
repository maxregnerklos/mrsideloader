package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.components.buttons.ComposableSingletons$ActionButtonKt$lambda-1$1  reason: invalid class name */
/* compiled from: ActionButton.kt */
public final class ComposableSingletons$ActionButtonKt$lambda1$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$ActionButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$ActionButtonKt$lambda1$1();

    public ComposableSingletons$ActionButtonKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:ActionButton.kt#90uv7e");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366037141, $changed, -1, "vegabobo.dsusideloader.ui.components.buttons.ComposableSingletons$ActionButtonKt.lambda-1.<anonymous> (ActionButton.kt:20)");
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
