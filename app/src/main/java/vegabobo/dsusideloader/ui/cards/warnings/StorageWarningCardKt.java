package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.SizeKt;
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

/* compiled from: StorageWarningCard.kt */
public abstract class StorageWarningCardKt {
    public static final void StorageWarningCard(String minPercentageFreeStorage, Function0 onClick, Composer $composer, int $changed) {
        Composer $composer2;
        String str = minPercentageFreeStorage;
        Function0 function0 = onClick;
        int i = $changed;
        Intrinsics.checkNotNullParameter(str, "minPercentageFreeStorage");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer $composer3 = $composer.startRestartGroup(1225421736);
        ComposerKt.sourceInformation($composer3, "C(StorageWarningCard)19@653L45,20@715L83,17@577L435:StorageWarningCard.kt#ypex4d");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 4 : 2;
        }
        if ((i & 112) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1225421736, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.warnings.StorageWarningCard (StorageWarningCard.kt:13)");
            }
            int i2 = $dirty2;
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.storage_warning, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.storage_warning_description, new Object[]{str}, $composer3, 64), false, false, 0, false, false, false, ComposableLambdaKt.composableLambda($composer3, -353762256, true, new StorageWarningCardKt$StorageWarningCard$1(function0, $dirty2)), $composer3, 805306374, 504);
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
            endRestartGroup.updateScope(new StorageWarningCardKt$StorageWarningCard$2(str, function0, i));
        }
    }
}
