package vegabobo.dsusideloader.ui.cards.installation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.home.InstallationCardState;

/* compiled from: InstallationCardStep.kt */
public final class InstallationCardStepKt$InstallationCardStep$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $minPercentageOfFreeStorage;
    public final /* synthetic */ Function0 $onClickCancelInstallation;
    public final /* synthetic */ Function0 $onClickClear;
    public final /* synthetic */ Function0 $onClickDiscardDsu;
    public final /* synthetic */ Function0 $onClickDiscardInstalledGsiAndInstall;
    public final /* synthetic */ Function0 $onClickInstall;
    public final /* synthetic */ Function0 $onClickRebootToDynOS;
    public final /* synthetic */ Function0 $onClickRetryInstallation;
    public final /* synthetic */ Function0 $onClickSetSeLinuxPermissive;
    public final /* synthetic */ Function0 $onClickUnmountSdCardAndRetry;
    public final /* synthetic */ Function0 $onClickViewCommands;
    public final /* synthetic */ Function0 $onClickViewLogs;
    public final /* synthetic */ MutableInteractionSource $textFieldInteraction;
    public final /* synthetic */ InstallationCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstallationCardStepKt$InstallationCardStep$1(InstallationCardState installationCardState, MutableInteractionSource mutableInteractionSource, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function0 function011, int i, int i2, int i3) {
        super(2);
        this.$uiState = installationCardState;
        this.$textFieldInteraction = mutableInteractionSource;
        this.$minPercentageOfFreeStorage = str;
        this.$onClickClear = function0;
        this.$onClickInstall = function02;
        this.$onClickRetryInstallation = function03;
        this.$onClickUnmountSdCardAndRetry = function04;
        this.$onClickSetSeLinuxPermissive = function05;
        this.$onClickCancelInstallation = function06;
        this.$onClickDiscardInstalledGsiAndInstall = function07;
        this.$onClickDiscardDsu = function08;
        this.$onClickRebootToDynOS = function09;
        this.$onClickViewLogs = function010;
        this.$onClickViewCommands = function011;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        InstallationCardState installationCardState = this.$uiState;
        InstallationCardState installationCardState2 = installationCardState;
        InstallationCardStepKt.InstallationCardStep(installationCardState2, this.$textFieldInteraction, this.$minPercentageOfFreeStorage, this.$onClickClear, this.$onClickInstall, this.$onClickRetryInstallation, this.$onClickUnmountSdCardAndRetry, this.$onClickSetSeLinuxPermissive, this.$onClickCancelInstallation, this.$onClickDiscardInstalledGsiAndInstall, this.$onClickDiscardDsu, this.$onClickRebootToDynOS, this.$onClickViewLogs, this.$onClickViewCommands, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
