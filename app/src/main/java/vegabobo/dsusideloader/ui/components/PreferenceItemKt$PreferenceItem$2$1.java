package vegabobo.dsusideloader.ui.components;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: PreferenceItem.kt */
public final class PreferenceItemKt$PreferenceItem$2$1 extends Lambda implements Function0 {
    public final /* synthetic */ boolean $isChecked;
    public final /* synthetic */ Function1 $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceItemKt$PreferenceItem$2$1(Function1 function1, boolean z) {
        super(0);
        this.$onClick = function1;
        this.$isChecked = z;
    }

    public final void invoke() {
        this.$onClick.invoke(Boolean.valueOf(this.$isChecked));
    }
}
