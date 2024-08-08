package vegabobo.dsusideloader.ui.cards;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.CardBoxKt;
import vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState;

/* compiled from: ImageSizeCard.kt */
public abstract class ImageSizeCardKt {
    public static final void ImageSizeCard(boolean isEnabled, ImageSizeCardState uiState, Modifier modifier, Function1 onValueChange, Function1 onCheckedChange, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        Function1 function1;
        Function1 onCheckedChange2;
        Modifier modifier3;
        Modifier modifier4;
        Function1 onCheckedChange3;
        boolean z = isEnabled;
        ImageSizeCardState imageSizeCardState = uiState;
        Function1 function12 = onValueChange;
        int i2 = $changed;
        Intrinsics.checkNotNullParameter(imageSizeCardState, "uiState");
        Intrinsics.checkNotNullParameter(function12, "onValueChange");
        Composer $composer2 = $composer.startRestartGroup(344914290);
        ComposerKt.sourceInformation($composer2, "C(ImageSizeCard)P(!1,4!1,3)31@1167L40,29@1109L1386:ImageSizeCard.kt#e34gdu");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if ((i2 & 14) == 0) {
            $dirty |= $composer2.changed(z) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer2.changed((Object) imageSizeCardState) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed((Object) modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 8) != 0) {
            $dirty |= 3072;
        } else if ((i2 & 7168) == 0) {
            $dirty |= $composer2.changedInstance(function12) ? 2048 : 1024;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            function1 = onCheckedChange;
        } else if ((57344 & i2) == 0) {
            function1 = onCheckedChange;
            $dirty |= $composer2.changedInstance(function1) ? 16384 : 8192;
        } else {
            function1 = onCheckedChange;
        }
        int $dirty2 = $dirty;
        if ((46811 & $dirty2) != 9362 || !$composer2.getSkipping()) {
            if (i3 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                onCheckedChange3 = ImageSizeCardKt$ImageSizeCard$1.INSTANCE;
            } else {
                onCheckedChange3 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344914290, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.ImageSizeCard (ImageSizeCard.kt:22)");
            }
            CardBoxKt.m2924CardBoxueL0Wzs(modifier4, StringResources_androidKt.stringResource(C0001R$string.image_size, $composer2, 0), LiveLiterals$ImageSizeCardKt.INSTANCE.m2844Boolean$arg2$callCardBox$funImageSizeCard(), uiState.isSelected(), !z, false, 0, onCheckedChange3, (RoundedCornerShape) null, ComposableLambdaKt.composableLambda($composer2, -379977245, true, new ImageSizeCardKt$ImageSizeCard$2(imageSizeCardState, z, function12, $dirty2)), $composer2, (($dirty2 >> 6) & 14) | 805306368 | (($dirty2 << 9) & 29360128), 352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            onCheckedChange2 = onCheckedChange3;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            onCheckedChange2 = function1;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            int i5 = $dirty2;
            Composer composer = $composer2;
            return;
        }
        int i6 = $dirty2;
        Composer composer2 = $composer2;
        endRestartGroup.updateScope(new ImageSizeCardKt$ImageSizeCard$3(isEnabled, uiState, modifier3, onValueChange, onCheckedChange2, $changed, i));
    }
}
