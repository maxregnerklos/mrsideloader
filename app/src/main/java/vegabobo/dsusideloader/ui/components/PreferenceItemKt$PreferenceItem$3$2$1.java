package vegabobo.dsusideloader.ui.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: PreferenceItem.kt */
public final class PreferenceItemKt$PreferenceItem$3$2$1 extends Lambda implements Function1 {
    public final /* synthetic */ boolean $isChecked;
    public final /* synthetic */ Function1 $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceItemKt$PreferenceItem$3$2$1(Function1 function1, boolean z) {
        super(1);
        this.$onClick = function1;
        this.$isChecked = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Boolean) p1).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean it) {
        this.$onClick.invoke(Boolean.valueOf(this.$isChecked));
    }
}
