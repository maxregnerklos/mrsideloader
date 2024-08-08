package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$5 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function4 $content;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0 $onDismiss;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$5(Modifier modifier, String str, ImageVector imageVector, Function0 function0, Function4 function4, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$title = str;
        this.$icon = imageVector;
        this.$onDismiss = function0;
        this.$content = function4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        CustomBottomSheetKt.CustomBottomSheet(this.$modifier, this.$title, this.$icon, this.$onDismiss, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
