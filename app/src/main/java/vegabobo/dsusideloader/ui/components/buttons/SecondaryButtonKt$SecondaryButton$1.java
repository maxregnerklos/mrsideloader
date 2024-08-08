package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SecondaryButton.kt */
public final class SecondaryButtonKt$SecondaryButton$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0 $onClick;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecondaryButtonKt$SecondaryButton$1(Modifier modifier, String str, Function0 function0, boolean z, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$text = str;
        this.$onClick = function0;
        this.$isEnabled = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SecondaryButtonKt.SecondaryButton(this.$modifier, this.$text, this.$onClick, this.$isEnabled, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
