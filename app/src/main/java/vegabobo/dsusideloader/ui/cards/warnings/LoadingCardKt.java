package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;

/* compiled from: LoadingCard.kt */
public abstract class LoadingCardKt {
    public static final void GrantingPermissionCard(Composer $composer, int $changed) {
        Composer $composer2;
        int i = $changed;
        Composer $composer3 = $composer.startRestartGroup(-248471656);
        ComposerKt.sourceInformation($composer3, "C(GrantingPermissionCard)16@584L48,17@649L49,14@508L350:LoadingCard.kt#ypex4d");
        if (i != 0 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-248471656, i, -1, "vegabobo.dsusideloader.ui.cards.warnings.GrantingPermissionCard (LoadingCard.kt:13)");
            }
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.missing_permission, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.granting_permission, $composer3, 0), false, false, 0, false, false, false, ComposableSingletons$LoadingCardKt.INSTANCE.m2919getLambda1$app_miniDebug(), $composer3, 805306374, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LoadingCardKt$GrantingPermissionCard$1(i));
        }
    }
}
