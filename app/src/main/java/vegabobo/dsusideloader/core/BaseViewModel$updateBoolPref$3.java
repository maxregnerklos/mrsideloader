package vegabobo.dsusideloader.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseViewModel.kt */
public final class BaseViewModel$updateBoolPref$3 extends Lambda implements Function0 {
    public final /* synthetic */ Function1 $onRead;
    public final /* synthetic */ boolean $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewModel$updateBoolPref$3(Function1 function1, boolean z) {
        super(0);
        this.$onRead = function1;
        this.$value = z;
    }

    public final void invoke() {
        this.$onRead.invoke(Boolean.valueOf(this.$value));
    }
}
