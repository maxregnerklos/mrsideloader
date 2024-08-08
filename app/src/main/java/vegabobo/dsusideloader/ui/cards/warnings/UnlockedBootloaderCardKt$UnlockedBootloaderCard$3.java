package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: UnlockedBootloaderCard.kt */
public final class UnlockedBootloaderCardKt$UnlockedBootloaderCard$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0 $onClickClose;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnlockedBootloaderCardKt$UnlockedBootloaderCard$3(Function0 function0, int i, int i2) {
        super(2);
        this.$onClickClose = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UnlockedBootloaderCardKt.UnlockedBootloaderCard(this.$onClickClose, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
