package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.components.ComposableSingletons$DialogLikeBottomSheetKt$lambda-1$1  reason: invalid class name */
/* compiled from: DialogLikeBottomSheet.kt */
public final class ComposableSingletons$DialogLikeBottomSheetKt$lambda1$1 extends Lambda implements Function3 {
    public static final ComposableSingletons$DialogLikeBottomSheetKt$lambda1$1 INSTANCE = new ComposableSingletons$DialogLikeBottomSheetKt$lambda1$1();

    public ComposableSingletons$DialogLikeBottomSheetKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope $this$null, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$null, "$this$null");
        ComposerKt.sourceInformation($composer, "C:DialogLikeBottomSheet.kt#bcxyhz");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-984445016, $changed, -1, "vegabobo.dsusideloader.ui.components.ComposableSingletons$DialogLikeBottomSheetKt.lambda-1.<anonymous> (DialogLikeBottomSheet.kt:35)");
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
