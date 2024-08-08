package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: PreferenceItem.kt */
public final class PreferenceItemKt$PreferenceItem$4 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $description;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ boolean $isChecked;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ Function1 $onClick;
    public final /* synthetic */ boolean $showToggle;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceItemKt$PreferenceItem$4(String str, String str2, ImageVector imageVector, Function1 function1, boolean z, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.$title = str;
        this.$description = str2;
        this.$icon = imageVector;
        this.$onClick = function1;
        this.$isChecked = z;
        this.$showToggle = z2;
        this.$isEnabled = z3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PreferenceItemKt.PreferenceItem(this.$title, this.$description, this.$icon, this.$onClick, this.$isChecked, this.$showToggle, this.$isEnabled, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
