package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function0;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;

/* compiled from: UnlockedBootloaderCard.kt */
public abstract class UnlockedBootloaderCardKt {
    public static final void UnlockedBootloaderCard(Function0 onClickClose, Composer $composer, int $changed, int i) {
        Function0 function0;
        Composer $composer2;
        Function0 onClickClose2;
        Function0 onClickClose3;
        int i2 = $changed;
        int i3 = i;
        Composer $composer3 = $composer.startRestartGroup(926865649);
        ComposerKt.sourceInformation($composer3, "C(UnlockedBootloaderCard)19@677L46,20@740L51,17@601L498:UnlockedBootloaderCard.kt#ypex4d");
        int $dirty = $changed;
        int i4 = i3 & 1;
        if (i4 != 0) {
            $dirty |= 6;
            function0 = onClickClose;
        } else if ((i2 & 14) == 0) {
            function0 = onClickClose;
            $dirty |= $composer3.changedInstance(function0) ? 4 : 2;
        } else {
            function0 = onClickClose;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 11) != 2 || !$composer3.getSkipping()) {
            if (i4 != 0) {
                onClickClose3 = UnlockedBootloaderCardKt$UnlockedBootloaderCard$1.INSTANCE;
            } else {
                onClickClose3 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(926865649, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.warnings.UnlockedBootloaderCard (UnlockedBootloaderCard.kt:14)");
            }
            onClickClose2 = onClickClose3;
            int i5 = $dirty2;
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.unlocked_bl_warn, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.unlocked_bl_warn_desc, $composer3, 0), false, false, 0, false, false, false, ComposableLambdaKt.composableLambda($composer3, -783197847, true, new UnlockedBootloaderCardKt$UnlockedBootloaderCard$2(onClickClose3, $dirty2)), $composer3, 805306374, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            onClickClose2 = function0;
            int i6 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UnlockedBootloaderCardKt$UnlockedBootloaderCard$3(onClickClose2, i2, i3));
        }
    }
}
