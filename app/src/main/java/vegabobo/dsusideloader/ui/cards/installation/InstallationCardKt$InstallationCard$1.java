package vegabobo.dsusideloader.ui.cards.installation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.home.InstallationCardState;

/* compiled from: InstallationCard.kt */
public final class InstallationCardKt$InstallationCard$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
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
    public InstallationCardKt$InstallationCard$1(InstallationCardState installationCardState, MutableInteractionSource mutableInteractionSource, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function0 function011, int i, int i2) {
        super(3);
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
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope it, Composer $composer, int $changed) {
        int i = $changed;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C60@2051L849:InstallationCard.kt#hydgom");
        if ((i & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2059804001, i, -1, "vegabobo.dsusideloader.ui.cards.installation.InstallationCard.<anonymous> (InstallationCard.kt:59)");
            }
            InstallationCardState installationCardState = this.$uiState;
            MutableInteractionSource mutableInteractionSource = this.$textFieldInteraction;
            String str = this.$minPercentageOfFreeStorage;
            Function0 function0 = this.$onClickClear;
            Function0 function02 = this.$onClickInstall;
            Function0 function03 = this.$onClickRetryInstallation;
            Function0 function04 = this.$onClickUnmountSdCardAndRetry;
            Function0 function05 = this.$onClickSetSeLinuxPermissive;
            Function0 function06 = this.$onClickCancelInstallation;
            Function0 function07 = this.$onClickDiscardInstalledGsiAndInstall;
            Function0 function08 = this.$onClickDiscardDsu;
            Function0 function09 = this.$onClickRebootToDynOS;
            Function0 function010 = this.$onClickViewLogs;
            Function0 function011 = this.$onClickViewCommands;
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            Composer composer = $composer;
            InstallationCardStepKt.InstallationCardStep(installationCardState, mutableInteractionSource, str, function0, function02, function03, function04, function05, function06, function07, function08, function09, function010, function011, composer, (i2 & 14) | 48 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192), (i3 & 14) | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 >> 3) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
