package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: RequiresLogPermissionCard.kt */
public final class RequiresLogPermissionCardKt$RequiresLogPermissionCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function0 $onClickGrant;
    public final /* synthetic */ Function0 $onClickRefuse;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequiresLogPermissionCardKt$RequiresLogPermissionCard$2(Function0 function0, Function0 function02, int i) {
        super(2);
        this.$onClickGrant = function0;
        this.$onClickRefuse = function02;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        RequiresLogPermissionCardKt.RequiresLogPermissionCard(this.$onClickGrant, this.$onClickRefuse, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
