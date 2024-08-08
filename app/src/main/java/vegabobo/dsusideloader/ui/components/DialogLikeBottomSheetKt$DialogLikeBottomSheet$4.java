package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: DialogLikeBottomSheet.kt */
public final class DialogLikeBottomSheetKt$DialogLikeBottomSheet$4 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $confirmText;
    public final /* synthetic */ Function3 $content;
    public final /* synthetic */ boolean $hideKeyboard;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0 $onClickCancel;
    public final /* synthetic */ Function0 $onClickConfirm;
    public final /* synthetic */ Function0 $onDismiss;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLikeBottomSheetKt$DialogLikeBottomSheet$4(Modifier modifier, ImageVector imageVector, String str, String str2, String str3, String str4, boolean z, Function0 function0, Function0 function02, Function0 function03, Function3 function3, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$icon = imageVector;
        this.$title = str;
        this.$text = str2;
        this.$confirmText = str3;
        this.$cancelText = str4;
        this.$hideKeyboard = z;
        this.$onClickConfirm = function0;
        this.$onClickCancel = function02;
        this.$onDismiss = function03;
        this.$content = function3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DialogLikeBottomSheetKt.DialogLikeBottomSheet(this.$modifier, this.$icon, this.$title, this.$text, this.$confirmText, this.$cancelText, this.$hideKeyboard, this.$onClickConfirm, this.$onClickCancel, this.$onDismiss, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
