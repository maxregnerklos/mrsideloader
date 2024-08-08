package vegabobo.dsusideloader.ui.cards;

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

/* compiled from: WhatIsDsuCard.kt */
public abstract class WhatIsDsuCardKt {
    public static final void DsuInfoCard(Modifier modifier, Function0 onClickViewDocs, Function0 onClickLearnMore, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        Modifier modifier3;
        Modifier modifier4;
        Function0 function0 = onClickViewDocs;
        Function0 function02 = onClickLearnMore;
        int i2 = $changed;
        Intrinsics.checkNotNullParameter(function0, "onClickViewDocs");
        Intrinsics.checkNotNullParameter(function02, "onClickLearnMore");
        Composer $composer2 = $composer.startRestartGroup(-1136210625);
        ComposerKt.sourceInformation($composer2, "C(DsuInfoCard)P(!1,2)21@702L41,22@760L53,19@641L696:WhatIsDsuCard.kt#e34gdu");
        int $dirty = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed((Object) modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty |= 384;
        } else if ((i2 & 896) == 0) {
            $dirty |= $composer2.changedInstance(function02) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 731) != 146 || !$composer2.getSkipping()) {
            if (i3 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136210625, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.DsuInfoCard (WhatIsDsuCard.kt:14)");
            }
            SimpleCardKt.m3027SimpleCardYod850M(modifier4, StringResources_androidKt.stringResource(C0001R$string.what_is_dsu, $composer2, 0), StringResources_androidKt.stringResource(C0001R$string.what_is_dsu_description, $composer2, 0), false, false, 0, LiveLiterals$WhatIsDsuCardKt.INSTANCE.m2860Boolean$arg6$callSimpleCard$funDsuInfoCard(), false, false, ComposableLambdaKt.composableLambda($composer2, -638516297, true, new WhatIsDsuCardKt$DsuInfoCard$1(function0, $dirty2, function02)), $composer2, ($dirty2 & 14) | 805306368, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            int i4 = $dirty2;
            Composer composer = $composer2;
            return;
        }
        int i5 = $dirty2;
        Composer composer2 = $composer2;
        endRestartGroup.updateScope(new WhatIsDsuCardKt$DsuInfoCard$2(modifier3, onClickViewDocs, onClickLearnMore, $changed, i));
    }
}
