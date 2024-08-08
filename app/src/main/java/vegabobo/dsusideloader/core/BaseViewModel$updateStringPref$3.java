package vegabobo.dsusideloader.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseViewModel.kt */
public final class BaseViewModel$updateStringPref$3 extends Lambda implements Function0 {
    public final /* synthetic */ Function1 $onRead;
    public final /* synthetic */ String $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewModel$updateStringPref$3(Function1 function1, String str) {
        super(0);
        this.$onRead = function1;
        this.$value = str;
    }

    public final void invoke() {
        this.$onRead.invoke(this.$value);
    }
}
