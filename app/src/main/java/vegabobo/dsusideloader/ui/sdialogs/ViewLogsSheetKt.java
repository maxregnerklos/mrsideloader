package vegabobo.dsusideloader.ui.sdialogs;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material.icons.Icons$Outlined;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.CustomBottomSheetKt;
import vegabobo.dsusideloader.ui.util.ActivityResultKt;

/* compiled from: ViewLogsSheet.kt */
public abstract class ViewLogsSheetKt {
    public static final void ViewLogsBottomSheet(String logs, Function1 onClickSaveLogs, Function0 onDismiss, Composer $composer, int $changed) {
        String str = logs;
        Function1 function1 = onClickSaveLogs;
        Function0 function0 = onDismiss;
        int i = $changed;
        Intrinsics.checkNotNullParameter(str, "logs");
        Intrinsics.checkNotNullParameter(function1, "onClickSaveLogs");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(-1194465926);
        ComposerKt.sourceInformation($composer2, "C(ViewLogsBottomSheet)28@1058L7,29@1090L40,31@1157L126,37@1324L47,36@1289L840:ViewLogsSheet.kt#c2k7s9");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer2.changed((Object) str) ? 4 : 2;
        }
        if ((i & 112) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 731) != 146 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1194465926, $dirty2, -1, "vegabobo.dsusideloader.ui.sdialogs.ViewLogsBottomSheet (ViewLogsSheet.kt:23)");
            }
            CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(this_$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ManagedActivityResultLauncher saveLogsResult = ActivityResultKt.launcherAcResult(new ViewLogsSheetKt$ViewLogsBottomSheet$saveLogsResult$1(function1, (Context) consume, StringResources_androidKt.stringResource(C0001R$string.saved_logs, $composer2, 0)), $composer2, 0);
            ManagedActivityResultLauncher managedActivityResultLauncher = saveLogsResult;
            CustomBottomSheetKt.CustomBottomSheet((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.installation_logs, $composer2, 0), DescriptionKt.getDescription(Icons$Outlined.INSTANCE), onDismiss, ComposableLambdaKt.composableLambda($composer2, -454292390, true, new ViewLogsSheetKt$ViewLogsBottomSheet$1(str, $dirty2, saveLogsResult)), $composer2, (($dirty2 << 3) & 7168) | 24576, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ViewLogsSheetKt$ViewLogsBottomSheet$2(str, function1, function0, i));
        }
    }
}
