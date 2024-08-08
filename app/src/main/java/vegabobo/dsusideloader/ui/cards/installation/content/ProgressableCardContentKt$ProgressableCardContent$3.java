package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: ProgressableCardContent.kt */
public final class ProgressableCardContentKt$ProgressableCardContent$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isIndeterminate;
    public final /* synthetic */ Function0 $onClickFirstButton;
    public final /* synthetic */ Function0 $onClickSecondButton;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ boolean $showProgressBar;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $textFirstButton;
    public final /* synthetic */ String $textSecondButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressableCardContentKt$ProgressableCardContent$3(String str, boolean z, boolean z2, float f, String str2, String str3, Function0 function0, Function0 function02, int i, int i2) {
        super(2);
        this.$text = str;
        this.$showProgressBar = z;
        this.$isIndeterminate = z2;
        this.$progress = f;
        this.$textFirstButton = str2;
        this.$textSecondButton = str3;
        this.$onClickFirstButton = function0;
        this.$onClickSecondButton = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ProgressableCardContentKt.ProgressableCardContent(this.$text, this.$showProgressBar, this.$isIndeterminate, this.$progress, this.$textFirstButton, this.$textSecondButton, this.$onClickFirstButton, this.$onClickSecondButton, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
