package vegabobo.dsusideloader.ui.cards.updater;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.about.UpdaterCardState;

/* compiled from: UpdaterCard.kt */
public final class UpdaterCardKt$UpdaterCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $isUpdaterAvailable;
    public final /* synthetic */ Function0 $onClickCheckUpdates;
    public final /* synthetic */ Function0 $onClickDownloadUpdate;
    public final /* synthetic */ Function0 $onClickImage;
    public final /* synthetic */ Function0 $onClickViewChangelog;
    public final /* synthetic */ UpdaterCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdaterCardKt$UpdaterCard$2(UpdaterCardState updaterCardState, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        super(2);
        this.$uiState = updaterCardState;
        this.$isUpdaterAvailable = z;
        this.$onClickImage = function0;
        this.$onClickCheckUpdates = function02;
        this.$onClickDownloadUpdate = function03;
        this.$onClickViewChangelog = function04;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UpdaterCardKt.UpdaterCard(this.$uiState, this.$isUpdaterAvailable, this.$onClickImage, this.$onClickCheckUpdates, this.$onClickDownloadUpdate, this.$onClickViewChangelog, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
