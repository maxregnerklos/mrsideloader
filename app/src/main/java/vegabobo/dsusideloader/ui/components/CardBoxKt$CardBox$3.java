package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: CardBox.kt */
public final class CardBoxKt$CardBox$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $addPadding;
    public final /* synthetic */ boolean $addToggle;
    public final /* synthetic */ long $cardColor;
    public final /* synthetic */ String $cardTitle;
    public final /* synthetic */ Function3 $content;
    public final /* synthetic */ boolean $isToggleChecked;
    public final /* synthetic */ boolean $isToggleEnabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1 $onCheckedChange;
    public final /* synthetic */ RoundedCornerShape $roundedCornerShape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardBoxKt$CardBox$3(Modifier modifier, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, Function1 function1, RoundedCornerShape roundedCornerShape, Function3 function3, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$cardTitle = str;
        this.$addToggle = z;
        this.$isToggleChecked = z2;
        this.$isToggleEnabled = z3;
        this.$addPadding = z4;
        this.$cardColor = j;
        this.$onCheckedChange = function1;
        this.$roundedCornerShape = roundedCornerShape;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        CardBoxKt.m2924CardBoxueL0Wzs(this.$modifier, this.$cardTitle, this.$addToggle, this.$isToggleChecked, this.$isToggleEnabled, this.$addPadding, this.$cardColor, this.$onCheckedChange, this.$roundedCornerShape, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
