package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: DynamicListItem.kt */
public final class DynamicListItemKt$DynamicListItem$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ int $currentValue;
    public final /* synthetic */ int $listLength;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicListItemKt$DynamicListItem$2(int i, int i2, Function2 function2, int i3) {
        super(2);
        this.$listLength = i;
        this.$currentValue = i2;
        this.$content = function2;
        this.$$changed = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DynamicListItemKt.DynamicListItem(this.$listLength, this.$currentValue, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
