package vegabobo.dsusideloader;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.NavigationKt;

/* renamed from: vegabobo.dsusideloader.ComposableSingletons$MainActivityKt$lambda-1$1  reason: invalid class name */
/* compiled from: MainActivity.kt */
public final class ComposableSingletons$MainActivityKt$lambda1$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$MainActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$MainActivityKt$lambda1$1();

    public ComposableSingletons$MainActivityKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C137@4693L12:MainActivity.kt#pjnnvf");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1166201473, $changed, -1, "vegabobo.dsusideloader.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:136)");
            }
            NavigationKt.Navigation($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
