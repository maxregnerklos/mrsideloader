package vegabobo.dsusideloader.ui.cards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.home.UserDataCardState;

/* compiled from: UserdataCard.kt */
public final class UserdataCardKt$UserdataCard$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1 $onCheckedChange;
    public final /* synthetic */ Function1 $onValueChange;
    public final /* synthetic */ UserDataCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserdataCardKt$UserdataCard$3(boolean z, UserDataCardState userDataCardState, Modifier modifier, Function1 function1, Function1 function12, int i, int i2) {
        super(2);
        this.$isEnabled = z;
        this.$uiState = userDataCardState;
        this.$modifier = modifier;
        this.$onValueChange = function1;
        this.$onCheckedChange = function12;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UserdataCardKt.UserdataCard(this.$isEnabled, this.$uiState, this.$modifier, this.$onValueChange, this.$onCheckedChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}