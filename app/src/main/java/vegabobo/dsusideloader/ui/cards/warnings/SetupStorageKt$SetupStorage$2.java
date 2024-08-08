package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SetupStorage.kt */
public final class SetupStorageKt$SetupStorage$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function1 $onSetupStorageSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetupStorageKt$SetupStorage$2(Function1 function1, int i) {
        super(2);
        this.$onSetupStorageSuccess = function1;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SetupStorageKt.SetupStorage(this.$onSetupStorageSuccess, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
