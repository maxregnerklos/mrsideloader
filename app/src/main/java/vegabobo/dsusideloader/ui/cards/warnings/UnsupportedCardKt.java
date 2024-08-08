package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;

/* compiled from: UnsupportedCard.kt */
public abstract class UnsupportedCardKt {
    public static final void UnsupportedCard(Function0 onClickClose, Function0 onClickContinueAnyway, Composer $composer, int $changed, int i) {
        Function0 function0;
        Composer $composer2;
        Function0 onClickClose2;
        Function0 onClickClose3;
        Function0 function02 = onClickContinueAnyway;
        int i2 = $changed;
        int i3 = i;
        Intrinsics.checkNotNullParameter(function02, "onClickContinueAnyway");
        Composer $composer3 = $composer.startRestartGroup(-1147948003);
        ComposerKt.sourceInformation($composer3, "C(UnsupportedCard)25@969L11,26@1017L41,27@1075L60,23@879L800:UnsupportedCard.kt#ypex4d");
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
        if ((i3 & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer3.getSkipping()) {
            if (i4 != 0) {
                onClickClose3 = UnsupportedCardKt$UnsupportedCard$1.INSTANCE;
            } else {
                onClickClose3 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147948003, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.warnings.UnsupportedCard (UnsupportedCard.kt:19)");
            }
            onClickClose2 = onClickClose3;
            int i5 = $dirty2;
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.unsupported, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.device_unsupported_description, $composer3, 0), false, false, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).m582getErrorContainer0d7_KjU(), false, false, false, ComposableLambdaKt.composableLambda($composer3, -836161387, true, new UnsupportedCardKt$UnsupportedCard$2(function02, $dirty2, onClickClose3)), $composer3, 805306374, 472);
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
            endRestartGroup.updateScope(new UnsupportedCardKt$UnsupportedCard$3(onClickClose2, function02, i2, i3));
        }
    }
}
