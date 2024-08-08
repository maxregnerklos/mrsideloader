package vegabobo.dsusideloader.ui.cards.warnings;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;
import vegabobo.dsusideloader.ui.util.ActivityResultKt;

/* compiled from: SetupStorage.kt */
public abstract class SetupStorageKt {
    public static final void SetupStorage(Function1 onSetupStorageSuccess, Composer $composer, int $changed) {
        Composer $composer2;
        Object value$iv$iv;
        Function1 function1 = onSetupStorageSuccess;
        int i = $changed;
        Intrinsics.checkNotNullParameter(function1, "onSetupStorageSuccess");
        Composer $composer3 = $composer.startRestartGroup(-121438396);
        ComposerKt.sourceInformation($composer3, "C(SetupStorage)20@760L41,20@743L58,26@883L43,27@943L55,24@807L474:SetupStorage.kt#ypex4d");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 11) != 2 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-121438396, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.warnings.SetupStorage (SetupStorage.kt:16)");
            }
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            int i2 = $dirty2 & 14;
            $composer3.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation($composer3, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv = $composer3.changed((Object) function1);
            Composer $this$cache$iv$iv = $composer3;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new SetupStorageKt$SetupStorage$launcherSetupStorage$1$1(function1);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer3.endReplaceableGroup();
            ManagedActivityResultLauncher launcherSetupStorage = ActivityResultKt.launcherAcResult((Function1) value$iv$iv, $composer3, 0);
            ManagedActivityResultLauncher managedActivityResultLauncher = launcherSetupStorage;
            int i3 = $dirty2;
            $composer2 = $composer3;
            SimpleCardKt.m3027SimpleCardYod850M(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), StringResources_androidKt.stringResource(C0001R$string.setup_storage, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.setup_storage_description, $composer3, 0), false, false, 0, false, false, false, ComposableLambdaKt.composableLambda($composer3, -871339076, true, new SetupStorageKt$SetupStorage$1(launcherSetupStorage, intent)), $composer3, 805306374, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i4 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SetupStorageKt$SetupStorage$2(function1, i));
        }
    }
}
