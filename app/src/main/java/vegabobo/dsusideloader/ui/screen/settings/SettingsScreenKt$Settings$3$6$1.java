package vegabobo.dsusideloader.ui.screen.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$3$6$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$3$6$1(Function1 function1) {
        super(1);
        this.$navigate = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Boolean) p1).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean it) {
        this.$navigate.invoke("about");
    }
}
