package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeScreen.kt */
public final class HomeScreenKt$Home$3$13$1 extends Lambda implements Function0 {
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$Home$3$13$1(Function1 function1) {
        super(0);
        this.$navigate = function1;
    }

    public final void invoke() {
        this.$navigate.invoke("adb_installation");
    }
}
