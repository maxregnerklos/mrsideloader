package vegabobo.dsusideloader.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: Theme.kt */
public final class ThemeKt$DSUHelperTheme$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $darkTheme;
    public final /* synthetic */ boolean $dynamicColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThemeKt$DSUHelperTheme$2(boolean z, boolean z2, Function2 function2, int i, int i2) {
        super(2);
        this.$darkTheme = z;
        this.$dynamicColor = z2;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ThemeKt.DSUHelperTheme(this.$darkTheme, this.$dynamicColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
