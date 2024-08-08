package vegabobo.dsusideloader;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.theme.ThemeKt;

/* renamed from: vegabobo.dsusideloader.ComposableSingletons$MainActivityKt$lambda-2$1  reason: invalid class name */
/* compiled from: MainActivity.kt */
public final class ComposableSingletons$MainActivityKt$lambda2$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$MainActivityKt$lambda2$1 INSTANCE = new ComposableSingletons$MainActivityKt$lambda2$1();

    public ComposableSingletons$MainActivityKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C136@4660L59:MainActivity.kt#pjnnvf");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583480285, $changed, -1, "vegabobo.dsusideloader.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:135)");
            }
            ThemeKt.DSUHelperTheme(false, false, ComposableSingletons$MainActivityKt.INSTANCE.m2533getLambda1$app_miniDebug(), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
