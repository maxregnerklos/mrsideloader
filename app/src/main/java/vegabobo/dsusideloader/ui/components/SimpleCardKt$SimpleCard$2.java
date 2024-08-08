package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SimpleCard.kt */
public final class SimpleCardKt$SimpleCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $addPadding;
    public final /* synthetic */ boolean $addToggle;
    public final /* synthetic */ long $cardColor;
    public final /* synthetic */ String $cardTitle;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $isToggleEnabled;
    public final /* synthetic */ boolean $justifyText;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ String $text;
    public final /* synthetic */ boolean $textScrollable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleCardKt$SimpleCard$2(Modifier modifier, String str, String str2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, Function2 function2, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$cardTitle = str;
        this.$text = str2;
        this.$addToggle = z;
        this.$isToggleEnabled = z2;
        this.$cardColor = j;
        this.$justifyText = z3;
        this.$textScrollable = z4;
        this.$addPadding = z5;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SimpleCardKt.m3027SimpleCardYod850M(this.$modifier, this.$cardTitle, this.$text, this.$addToggle, this.$isToggleEnabled, this.$cardColor, this.$justifyText, this.$textScrollable, this.$addPadding, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
