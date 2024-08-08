package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActionButton.kt */
public abstract class ActionButtonKt {
    /* renamed from: ActionButton-r7P-0LY  reason: not valid java name */
    public static final void m3028ActionButtonr7P0LY(Modifier modifier, String text, Function0 onClick, Color colorButton, Color colorText, boolean textButton, boolean isEnabled, Function2 content, Composer $composer, int $changed, int i) {
        Color colorButton2;
        Color colorText2;
        boolean textButton2;
        boolean isEnabled2;
        Function2 content2;
        boolean isEnabled3;
        boolean textButton3;
        Color colorText3;
        Color colorButton3;
        Modifier modifier2;
        int $dirty;
        Function2 content3;
        boolean isEnabled4;
        boolean textButton4;
        Color colorText4;
        Modifier modifier3;
        boolean textButton5;
        ButtonColors buttonColors;
        boolean textButton6;
        int i2;
        int i3;
        String str = text;
        Function0 function0 = onClick;
        int i4 = $changed;
        int i5 = i;
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer $composer2 = $composer.startRestartGroup(1158063486);
        ComposerKt.sourceInformation($composer2, "C(ActionButton)P(4,6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,7,3):ActionButton.kt#90uv7e");
        int $dirty2 = $changed;
        int i6 = i5 & 1;
        if (i6 != 0) {
            $dirty2 |= 6;
            Modifier modifier4 = modifier;
        } else if ((i4 & 14) == 0) {
            $dirty2 |= $composer2.changed((Object) modifier) ? 4 : 2;
        } else {
            Modifier modifier5 = modifier;
        }
        if ((i5 & 2) != 0) {
            $dirty2 |= 48;
        } else if ((i4 & 112) == 0) {
            $dirty2 |= $composer2.changed((Object) str) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            $dirty2 |= 384;
        } else if ((i4 & 896) == 0) {
            $dirty2 |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i5 & 8;
        if (i7 != 0) {
            $dirty2 |= 3072;
            colorButton2 = colorButton;
        } else if ((i4 & 7168) == 0) {
            colorButton2 = colorButton;
            $dirty2 |= $composer2.changed((Object) colorButton2) ? 2048 : 1024;
        } else {
            colorButton2 = colorButton;
        }
        int i8 = i5 & 16;
        if (i8 != 0) {
            $dirty2 |= 24576;
            colorText2 = colorText;
        } else if ((57344 & i4) == 0) {
            colorText2 = colorText;
            $dirty2 |= $composer2.changed((Object) colorText2) ? 16384 : 8192;
        } else {
            colorText2 = colorText;
        }
        if ((458752 & i4) == 0) {
            if ((i5 & 32) == 0) {
                textButton2 = textButton;
                if ($composer2.changed(textButton2)) {
                    i3 = 131072;
                    $dirty2 |= i3;
                }
            } else {
                textButton2 = textButton;
            }
            i3 = 65536;
            $dirty2 |= i3;
        } else {
            textButton2 = textButton;
        }
        if ((3670016 & i4) == 0) {
            if ((i5 & 64) == 0) {
                isEnabled2 = isEnabled;
                if ($composer2.changed(isEnabled2)) {
                    i2 = 1048576;
                    $dirty2 |= i2;
                }
            } else {
                isEnabled2 = isEnabled;
            }
            i2 = 524288;
            $dirty2 |= i2;
        } else {
            isEnabled2 = isEnabled;
        }
        int i9 = i5 & 128;
        if (i9 != 0) {
            $dirty2 |= 12582912;
            Function2 function2 = content;
        } else if ((i4 & 29360128) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 8388608 : 4194304;
        } else {
            Function2 function22 = content;
        }
        if (($dirty2 & 23967451) != 4793490 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i4 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                if (i7 != 0) {
                    colorButton2 = null;
                }
                if (i8 != 0) {
                    colorText2 = null;
                }
                if ((i5 & 32) != 0) {
                    $dirty2 &= -458753;
                    textButton2 = LiveLiterals$ActionButtonKt.INSTANCE.m3031Boolean$paramtextButton$funActionButton();
                }
                if (i5 != false && true) {
                    $dirty2 &= -3670017;
                    isEnabled2 = LiveLiterals$ActionButtonKt.INSTANCE.m3030Boolean$paramisEnabled$funActionButton();
                }
                if (i9 != 0) {
                    $dirty = $dirty2;
                    content3 = ComposableSingletons$ActionButtonKt.INSTANCE.m3029getLambda1$app_miniDebug();
                    colorText4 = colorText2;
                    textButton4 = textButton2;
                    isEnabled4 = isEnabled2;
                } else {
                    content3 = content;
                    $dirty = $dirty2;
                    colorText4 = colorText2;
                    textButton4 = textButton2;
                    isEnabled4 = isEnabled2;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i5 & 32) != 0) {
                    $dirty2 &= -458753;
                }
                if ((i5 & 64) != 0) {
                    content3 = content;
                    $dirty = $dirty2 & -3670017;
                    colorText4 = colorText2;
                    textButton4 = textButton2;
                    isEnabled4 = isEnabled2;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    content3 = content;
                    $dirty = $dirty2;
                    colorText4 = colorText2;
                    textButton4 = textButton2;
                    isEnabled4 = isEnabled2;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1158063486, $dirty, -1, "vegabobo.dsusideloader.ui.components.buttons.ActionButton (ActionButton.kt:12)");
            }
            if (textButton4) {
                $composer2.startReplaceableGroup(1247976745);
                ComposerKt.sourceInformation($composer2, "23@719L71");
                ButtonKt.TextButton(onClick, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda($composer2, -542477098, true, new ActionButtonKt$ActionButton$1(str, $dirty)), $composer2, (($dirty >> 6) & 14) | 805306368, 510);
                $composer2.endReplaceableGroup();
                textButton5 = textButton4;
            } else {
                $composer2.startReplaceableGroup(1247976838);
                ComposerKt.sourceInformation($composer2, "27@812L491");
                if (colorButton2 != null) {
                    $composer2.startReplaceableGroup(1247977022);
                    ComposerKt.sourceInformation($composer2, "33@1019L25");
                    textButton5 = textButton4;
                    textButton6 = true;
                    ButtonColors r12 = ButtonDefaults.INSTANCE.m570buttonColorsro_MJ88(colorButton2.m1196unboximpl(), 0, 0, 0, $composer2, (($dirty >> 9) & 14) | (ButtonDefaults.$stable << 12), 14);
                    $composer2.endReplaceableGroup();
                    buttonColors = r12;
                } else {
                    textButton5 = textButton4;
                    textButton6 = true;
                    $composer2.startReplaceableGroup(1247977100);
                    ComposerKt.sourceInformation($composer2, "35@1097L14");
                    ButtonColors r122 = ButtonDefaults.INSTANCE.m570buttonColorsro_MJ88(0, 0, 0, 0, $composer2, ButtonDefaults.$stable << 12, 15);
                    $composer2.endReplaceableGroup();
                    buttonColors = r122;
                }
                ButtonKt.FilledTonalButton(onClick, modifier3, isEnabled4, (Shape) null, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda($composer2, -1551231500, textButton6, new ActionButtonKt$ActionButton$2(str, colorText4, $dirty, content3)), $composer2, (($dirty >> 6) & 14) | 805306368 | (($dirty << 3) & 112) | (($dirty >> 12) & 896), 488);
                $composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textButton3 = textButton5;
            modifier2 = modifier3;
            colorText3 = colorText4;
            isEnabled3 = isEnabled4;
            content2 = content3;
            colorButton3 = colorButton2;
            int i10 = $dirty;
        } else {
            $composer2.skipToGroupEnd();
            content2 = content;
            int i11 = $dirty2;
            textButton3 = textButton2;
            isEnabled3 = isEnabled2;
            colorButton3 = colorButton2;
            colorText3 = colorText2;
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            Composer composer = $composer2;
            Modifier modifier6 = modifier2;
            return;
        }
        ActionButtonKt$ActionButton$3 actionButtonKt$ActionButton$3 = r0;
        Modifier modifier7 = modifier2;
        Composer composer2 = $composer2;
        ActionButtonKt$ActionButton$3 actionButtonKt$ActionButton$32 = new ActionButtonKt$ActionButton$3(modifier2, text, onClick, colorButton3, colorText3, textButton3, isEnabled3, content2, $changed, i);
        endRestartGroup.updateScope(actionButtonKt$ActionButton$3);
    }
}
