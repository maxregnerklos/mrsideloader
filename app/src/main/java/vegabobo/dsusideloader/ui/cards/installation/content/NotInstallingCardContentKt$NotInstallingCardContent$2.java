package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.home.InstallationCardState;

/* compiled from: NotInstallingCardContent.kt */
public final class NotInstallingCardContentKt$NotInstallingCardContent$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function0 $onClickClear;
    public final /* synthetic */ Function0 $onClickInstall;
    public final /* synthetic */ MutableInteractionSource $textFieldInteraction;
    public final /* synthetic */ InstallationCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotInstallingCardContentKt$NotInstallingCardContent$2(MutableInteractionSource mutableInteractionSource, InstallationCardState installationCardState, Function0 function0, Function0 function02, int i) {
        super(2);
        this.$textFieldInteraction = mutableInteractionSource;
        this.$uiState = installationCardState;
        this.$onClickClear = function0;
        this.$onClickInstall = function02;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        NotInstallingCardContentKt.NotInstallingCardContent(this.$textFieldInteraction, this.$uiState, this.$onClickClear, this.$onClickInstall, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
