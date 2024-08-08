package vegabobo.dsusideloader.ui.screen.about;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: AboutScreen.kt */
public final class AboutScreenKt$AboutScreen$3$5$2$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutScreenKt$AboutScreen$3$5$2$1(Function1 function1) {
        super(1);
        this.$navigate = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Boolean) p1).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean it) {
        this.$navigate.invoke("libraries");
    }
}
