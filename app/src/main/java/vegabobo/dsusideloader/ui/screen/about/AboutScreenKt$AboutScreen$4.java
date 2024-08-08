package vegabobo.dsusideloader.ui.screen.about;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: AboutScreen.kt */
public final class AboutScreenKt$AboutScreen$4 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AboutViewModel $aboutViewModel;
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutScreenKt$AboutScreen$4(Function1 function1, AboutViewModel aboutViewModel, int i, int i2) {
        super(2);
        this.$navigate = function1;
        this.$aboutViewModel = aboutViewModel;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AboutScreenKt.AboutScreen(this.$navigate, this.$aboutViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
