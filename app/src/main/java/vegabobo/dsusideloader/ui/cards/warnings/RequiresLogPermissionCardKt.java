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

/* compiled from: RequiresLogPermissionCard.kt */
public abstract class RequiresLogPermissionCardKt {
    public static final void RequiresLogPermissionCard(Function0 onClickGrant, Function0 onClickRefuse, Composer $composer, int $changed) {
        Composer $composer2;
        Function0 function0 = onClickGrant;
        Function0 function02 = onClickRefuse;
        int i = $changed;
        Intrinsics.checkNotNullParameter(function0, "onClickGrant");
        Intrinsics.checkNotNullParameter(function02, "onClickRefuse");
        Composer $composer3 = $composer.startRestartGroup(-697319971);
        ComposerKt.sourceInformation($composer3, "C(RequiresLogPermissionCard)24@906L48,25@971L60,22@830L612:RequiresLogPermissionCard.kt#ypex4d");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 4 : 2;
        }
        if ((i & 112) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-697319971, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.warnings.RequiresLogPermissionCard (RequiresLogPermissionCard.kt:18)");
            }
            int i2 = $dirty2;
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.missing_permission, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.missing_permission_description, $composer3, 0), false, false, 0, false, false, false, ComposableLambdaKt.composableLambda($composer3, -886944171, true, new RequiresLogPermissionCardKt$RequiresLogPermissionCard$1(function02, $dirty2, function0)), $composer3, 805306374, 504);
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
            endRestartGroup.updateScope(new RequiresLogPermissionCardKt$RequiresLogPermissionCard$2(function0, function02, i));
        }
    }
}
