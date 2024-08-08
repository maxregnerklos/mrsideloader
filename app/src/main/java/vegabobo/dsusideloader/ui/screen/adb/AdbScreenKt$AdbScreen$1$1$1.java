package vegabobo.dsusideloader.ui.screen.adb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: AdbScreen.kt */
public final class AdbScreenKt$AdbScreen$1$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdbScreenKt$AdbScreen$1$1$1(Function1 function1) {
        super(0);
        this.$navigate = function1;
    }

    public final void invoke() {
        this.$navigate.invoke("preferences");
    }
}
