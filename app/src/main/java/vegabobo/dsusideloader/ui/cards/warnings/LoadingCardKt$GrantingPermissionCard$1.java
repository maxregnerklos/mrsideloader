package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: LoadingCard.kt */
public final class LoadingCardKt$GrantingPermissionCard$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingCardKt$GrantingPermissionCard$1(int i) {
        super(2);
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LoadingCardKt.GrantingPermissionCard(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
