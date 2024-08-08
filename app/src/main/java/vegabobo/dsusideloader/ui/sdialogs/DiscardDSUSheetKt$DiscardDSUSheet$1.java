package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: DiscardDSUSheet.kt */
public final class DiscardDSUSheetKt$DiscardDSUSheet$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function0 $onClickCancel;
    public final /* synthetic */ Function0 $onClickConfirm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscardDSUSheetKt$DiscardDSUSheet$1(Function0 function0, Function0 function02, int i) {
        super(2);
        this.$onClickConfirm = function0;
        this.$onClickCancel = function02;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DiscardDSUSheetKt.DiscardDSUSheet(this.$onClickConfirm, this.$onClickCancel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
