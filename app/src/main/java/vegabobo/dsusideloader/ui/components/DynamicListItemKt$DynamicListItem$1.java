package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DynamicListItem.kt */
public final class DynamicListItemKt$DynamicListItem$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2 $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicListItemKt$DynamicListItem$1(Function2 function2, int i) {
        super(3);
        this.$content = function2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C21@628L9:DynamicListItem.kt#bcxyhz");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1784490438, $changed, -1, "vegabobo.dsusideloader.ui.components.DynamicListItem.<anonymous> (DynamicListItem.kt:20)");
            }
            this.$content.invoke($composer, Integer.valueOf((this.$$dirty >> 6) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
