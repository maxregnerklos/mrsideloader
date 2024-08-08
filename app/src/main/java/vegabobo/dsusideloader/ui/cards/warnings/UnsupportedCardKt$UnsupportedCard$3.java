package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: UnsupportedCard.kt */
public final class UnsupportedCardKt$UnsupportedCard$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0 $onClickClose;
    public final /* synthetic */ Function0 $onClickContinueAnyway;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnsupportedCardKt$UnsupportedCard$3(Function0 function0, Function0 function02, int i, int i2) {
        super(2);
        this.$onClickClose = function0;
        this.$onClickContinueAnyway = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UnsupportedCardKt.UnsupportedCard(this.$onClickClose, this.$onClickContinueAnyway, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
