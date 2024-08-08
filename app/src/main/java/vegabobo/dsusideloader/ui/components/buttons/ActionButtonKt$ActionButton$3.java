package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: ActionButton.kt */
public final class ActionButtonKt$ActionButton$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Color $colorButton;
    public final /* synthetic */ Color $colorText;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0 $onClick;
    public final /* synthetic */ String $text;
    public final /* synthetic */ boolean $textButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionButtonKt$ActionButton$3(Modifier modifier, String str, Function0 function0, Color color, Color color2, boolean z, boolean z2, Function2 function2, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$text = str;
        this.$onClick = function0;
        this.$colorButton = color;
        this.$colorText = color2;
        this.$textButton = z;
        this.$isEnabled = z2;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ActionButtonKt.m3028ActionButtonr7P0LY(this.$modifier, this.$text, this.$onClick, this.$colorButton, this.$colorText, this.$textButton, this.$isEnabled, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
