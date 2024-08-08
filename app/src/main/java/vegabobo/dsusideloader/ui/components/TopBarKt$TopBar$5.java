package vegabobo.dsusideloader.ui.components;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: TopBar.kt */
public final class TopBarKt$TopBar$5 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $barTitle;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ String $iconContentDescription;
    public final /* synthetic */ Function0 $onClickBackButton;
    public final /* synthetic */ Function0 $onClickIcon;
    public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBarKt$TopBar$5(TopAppBarScrollBehavior topAppBarScrollBehavior, String str, ImageVector imageVector, String str2, Function0 function0, Function0 function02, int i, int i2) {
        super(2);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$barTitle = str;
        this.$icon = imageVector;
        this.$iconContentDescription = str2;
        this.$onClickIcon = function0;
        this.$onClickBackButton = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TopBarKt.TopBar(this.$scrollBehavior, this.$barTitle, this.$icon, this.$iconContentDescription, this.$onClickIcon, this.$onClickBackButton, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
