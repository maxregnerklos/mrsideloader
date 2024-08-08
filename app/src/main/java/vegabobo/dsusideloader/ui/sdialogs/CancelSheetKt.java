package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.material.icons.Icons$Outlined;
import androidx.compose.material.icons.outlined.CancelKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.DialogLikeBottomSheetKt;

/* compiled from: CancelSheet.kt */
public abstract class CancelSheetKt {
    public static final void CancelSheet(Function0 onClickConfirm, Function0 onClickCancel, Composer $composer, int $changed) {
        Composer $composer2;
        Function0 function0 = onClickConfirm;
        Function0 function02 = onClickCancel;
        int i = $changed;
        Intrinsics.checkNotNullParameter(function0, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function02, "onClickCancel");
        Composer $composer3 = $composer.startRestartGroup(-2095843661);
        ComposerKt.sourceInformation($composer3, "C(CancelSheet)P(1)15@471L58,17@584L61,18@669L33,19@725L32,14@432L412:CancelSheet.kt#c2k7s9");
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
                ComposerKt.traceEventStart(-2095843661, $dirty2, -1, "vegabobo.dsusideloader.ui.sdialogs.CancelSheet (CancelSheet.kt:10)");
            }
            int i2 = $dirty2;
            $composer2 = $composer3;
            DialogLikeBottomSheetKt.DialogLikeBottomSheet((Modifier) null, CancelKt.getCancel(Icons$Outlined.INSTANCE), StringResources_androidKt.stringResource(C0001R$string.cancel_installation_question, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.cancel_installation_description, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.yes, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.no, $composer3, 0), false, onClickConfirm, onClickCancel, (Function0) null, (Function3) null, $composer3, (($dirty2 << 21) & 29360128) | (($dirty2 << 21) & 234881024), 0, 1601);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i3 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            Function0 function03 = onClickCancel;
            int i4 = $changed;
            return;
        }
        endRestartGroup.updateScope(new CancelSheetKt$CancelSheet$1(function0, onClickCancel, $changed));
    }
}
