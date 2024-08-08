package vegabobo.dsusideloader.ui.util;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityResult.kt */
public abstract class ActivityResultKt {
    public static final ManagedActivityResultLauncher launcherAcResult(Function1 result, Composer $composer, int $changed) {
        Object value$iv$iv;
        Intrinsics.checkNotNullParameter(result, "result");
        $composer.startReplaceableGroup(-1443567642);
        ComposerKt.sourceInformation($composer, "C(launcherAcResult)17@637L105,15@538L204:ActivityResult.kt#k5p5kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1443567642, $changed, -1, "vegabobo.dsusideloader.ui.util.launcherAcResult (ActivityResult.kt:12)");
        }
        ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
        int i = $changed & 14;
        $composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed((Object) result);
        Composer $this$cache$iv$iv = $composer;
        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
        if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
            value$iv$iv = new ActivityResultKt$launcherAcResult$1$1(result);
            $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) value$iv$iv, $composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return rememberLauncherForActivityResult;
    }
}
