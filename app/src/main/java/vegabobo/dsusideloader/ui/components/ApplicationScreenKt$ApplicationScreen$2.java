package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: ApplicationScreen.kt */
public final class ApplicationScreenKt$ApplicationScreen$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2 $bottomBar;
    public final /* synthetic */ boolean $columnContent;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $enableDefaultScrollBehavior;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function3 $outsideContent;
    public final /* synthetic */ Function3 $topBar;
    public final /* synthetic */ Arrangement.HorizontalOrVertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplicationScreenKt$ApplicationScreen$2(Modifier modifier, Arrangement.HorizontalOrVertical horizontalOrVertical, boolean z, boolean z2, Function3 function3, Function2 function2, Function3 function32, Function2 function22, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$verticalArrangement = horizontalOrVertical;
        this.$columnContent = z;
        this.$enableDefaultScrollBehavior = z2;
        this.$topBar = function3;
        this.$bottomBar = function2;
        this.$outsideContent = function32;
        this.$content = function22;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ApplicationScreenKt.ApplicationScreen(this.$modifier, this.$verticalArrangement, this.$columnContent, this.$enableDefaultScrollBehavior, this.$topBar, this.$bottomBar, this.$outsideContent, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
