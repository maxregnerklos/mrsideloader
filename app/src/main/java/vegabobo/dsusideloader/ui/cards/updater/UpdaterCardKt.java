package vegabobo.dsusideloader.ui.cards.updater;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;
import vegabobo.dsusideloader.ui.screen.about.UpdateStatus;
import vegabobo.dsusideloader.ui.screen.about.UpdaterCardState;

/* compiled from: UpdaterCard.kt */
public abstract class UpdaterCardKt {
    public static final void UpdaterCard(UpdaterCardState uiState, boolean isUpdaterAvailable, Function0 onClickImage, Function0 onClickCheckUpdates, Function0 onClickDownloadUpdate, Function0 onClickViewChangelog, Composer $composer, int $changed) {
        Composer $composer2;
        UpdaterCardState updaterCardState = uiState;
        Function0 function0 = onClickImage;
        Function0 function02 = onClickCheckUpdates;
        Function0 function03 = onClickDownloadUpdate;
        Function0 function04 = onClickViewChangelog;
        int i = $changed;
        Intrinsics.checkNotNullParameter(updaterCardState, "uiState");
        Intrinsics.checkNotNullParameter(function0, "onClickImage");
        Intrinsics.checkNotNullParameter(function02, "onClickCheckUpdates");
        Intrinsics.checkNotNullParameter(function03, "onClickDownloadUpdate");
        Intrinsics.checkNotNullParameter(function04, "onClickViewChangelog");
        Composer $composer3 = $composer.startRestartGroup(-553801751);
        ComposerKt.sourceInformation($composer3, "C(UpdaterCard)P(5!1,3)59@2433L3993:UpdaterCard.kt#ogv8z");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changed((Object) updaterCardState) ? 4 : 2;
        }
        if ((i & 112) == 0) {
            $dirty |= $composer3.changed(isUpdaterAvailable) ? 32 : 16;
        } else {
            boolean z = isUpdaterAvailable;
        }
        if ((i & 896) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 131072 : 65536;
        }
        int $dirty2 = $dirty;
        if ((374491 & $dirty2) != 74898 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-553801751, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.updater.UpdaterCard (UpdaterCard.kt:42)");
            }
            boolean r25 = LiveLiterals$UpdaterCardKt.INSTANCE.m2902Boolean$arg8$callSimpleCard$funUpdaterCard();
            UpdaterCardKt$UpdaterCard$1 updaterCardKt$UpdaterCard$1 = r0;
            int i2 = $dirty2;
            UpdaterCardKt$UpdaterCard$1 updaterCardKt$UpdaterCard$12 = new UpdaterCardKt$UpdaterCard$1(isUpdaterAvailable, uiState, onClickCheckUpdates, $dirty2, onClickImage, onClickViewChangelog, onClickDownloadUpdate);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda($composer3, -1942992799, true, updaterCardKt$UpdaterCard$1);
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M((Modifier) null, (String) null, (String) null, false, false, 0, false, false, r25, composableLambda, $composer2, 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i3 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpdaterCardKt$UpdaterCard$2(uiState, isUpdaterAvailable, onClickImage, onClickCheckUpdates, onClickDownloadUpdate, onClickViewChangelog, $changed));
        }
    }

    public static final boolean UpdaterCard$isDownloading(UpdaterCardState $uiState) {
        return $uiState.isDownloading() || $uiState.getUpdateStatus() == UpdateStatus.CHECKING_FOR_UPDATES;
    }

    public static final boolean UpdaterCard$isCheckingForUpdates(UpdaterCardState $uiState) {
        return $uiState.getUpdateStatus() == UpdateStatus.CHECKING_FOR_UPDATES;
    }

    public static final boolean UpdaterCard$isUpdateFound(UpdaterCardState $uiState) {
        return $uiState.getUpdateStatus() == UpdateStatus.UPDATE_FOUND;
    }
}
