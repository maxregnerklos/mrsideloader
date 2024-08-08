package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.material.icons.Icons$Outlined;
import androidx.compose.material.icons.outlined.EditKt;
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

/* compiled from: ImageSizeWarningSheet.kt */
public abstract class ImageSizeWarningSheetKt {
    public static final void ImageSizeWarningSheet(Function0 onClickConfirm, Function0 onClickCancel, Composer $composer, int $changed) {
        Composer $composer2;
        Function0 function0 = onClickConfirm;
        Function0 function02 = onClickCancel;
        int i = $changed;
        Intrinsics.checkNotNullParameter(function0, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function02, "onClickCancel");
        Composer $composer3 = $composer.startRestartGroup(1853781811);
        ComposerKt.sourceInformation($composer3, "C(ImageSizeWarningSheet)P(1)15@479L47,17@579L59,18@662L40,19@725L36,14@440L408:ImageSizeWarningSheet.kt#c2k7s9");
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
                ComposerKt.traceEventStart(1853781811, $dirty2, -1, "vegabobo.dsusideloader.ui.sdialogs.ImageSizeWarningSheet (ImageSizeWarningSheet.kt:10)");
            }
            int i2 = $dirty2;
            $composer2 = $composer3;
            DialogLikeBottomSheetKt.DialogLikeBottomSheet((Modifier) null, EditKt.getEdit(Icons$Outlined.INSTANCE), StringResources_androidKt.stringResource(C0001R$string.dialog_image_size, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.dialog_image_size_description, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.set_anyway, $composer3, 0), StringResources_androidKt.stringResource(C0001R$string.cancel, $composer3, 0), false, onClickConfirm, onClickCancel, (Function0) null, (Function3) null, $composer3, (($dirty2 << 21) & 29360128) | (($dirty2 << 21) & 234881024), 0, 1601);
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
        endRestartGroup.updateScope(new ImageSizeWarningSheetKt$ImageSizeWarningSheet$1(function0, onClickCancel, $changed));
    }
}
