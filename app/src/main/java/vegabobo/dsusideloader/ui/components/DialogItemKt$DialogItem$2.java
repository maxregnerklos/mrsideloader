package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: DialogItem.kt */
public final class DialogItemKt$DialogItem$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ String $text;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogItemKt$DialogItem$2(ImageVector imageVector, String str, String str2, long j, int i, int i2) {
        super(2);
        this.$icon = imageVector;
        this.$title = str;
        this.$text = str2;
        this.$textColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DialogItemKt.m2935DialogItemww6aTOc(this.$icon, this.$title, this.$text, this.$textColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
