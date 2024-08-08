package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* compiled from: SecondaryButton.kt */
public abstract class SecondaryButtonKt {
    public static final void SecondaryButton(Modifier modifier, String text, Function0 onClick, boolean isEnabled, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        boolean z;
        boolean isEnabled2;
        Modifier modifier3;
        int $dirty;
        Modifier modifier4;
        int i2;
        String str = text;
        Function0 function0 = onClick;
        int i3 = $changed;
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer $composer2 = $composer.startRestartGroup(336268430);
        ComposerKt.sourceInformation($composer2, "C(SecondaryButton)P(1,3,2)29@857L11,33@1018L193:SecondaryButton.kt#90uv7e");
        int $dirty2 = $changed;
        int i4 = i & 1;
        if (i4 != 0) {
            $dirty2 |= 6;
            modifier2 = modifier;
        } else if ((i3 & 14) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed((Object) modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if ((i & 2) != 0) {
            $dirty2 |= 48;
        } else if ((i3 & 112) == 0) {
            $dirty2 |= $composer2.changed((Object) str) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty2 |= 384;
        } else if ((i3 & 896) == 0) {
            $dirty2 |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            if ((i & 8) == 0) {
                z = isEnabled;
                if ($composer2.changed(z)) {
                    i2 = 2048;
                    $dirty2 |= i2;
                }
            } else {
                z = isEnabled;
            }
            i2 = 1024;
            $dirty2 |= i2;
        } else {
            z = isEnabled;
        }
        if (($dirty2 & 5851) != 1170 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i3 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if ((i & 8) != 0) {
                    $dirty = $dirty2 & -7169;
                    modifier3 = modifier4;
                    isEnabled2 = LiveLiterals$SecondaryButtonKt.INSTANCE.m3034Boolean$paramisEnabled$funSecondaryButton();
                } else {
                    $dirty = $dirty2;
                    modifier3 = modifier4;
                    isEnabled2 = z;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                $dirty = $dirty2;
                modifier3 = modifier2;
                isEnabled2 = z;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336268430, $dirty, -1, "vegabobo.dsusideloader.ui.components.buttons.SecondaryButton (SecondaryButton.kt:13)");
            }
            int onSecondaryVariant = ColorKt.m1208toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).m592getOnSecondaryContainer0d7_KjU());
            LiveLiterals$SecondaryButtonKt liveLiterals$SecondaryButtonKt = LiveLiterals$SecondaryButtonKt.INSTANCE;
            int i5 = onSecondaryVariant;
            int i6 = $dirty;
            ActionButtonKt.m3028ActionButtonr7P0LY(modifier3, text, onClick, Color.m1182boximpl(SecondaryButton$addAlpha(onSecondaryVariant, liveLiterals$SecondaryButtonKt.m3035Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton())), Color.m1182boximpl(SecondaryButton$addAlpha(onSecondaryVariant, liveLiterals$SecondaryButtonKt.m3036Float$arg1$calladdAlpha$valcolorText$funSecondaryButton())), false, isEnabled2, (Function2) null, $composer2, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | (($dirty << 9) & 3670016), 160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            int i7 = $dirty2;
            modifier3 = modifier2;
            isEnabled2 = z;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SecondaryButtonKt$SecondaryButton$1(modifier3, text, onClick, isEnabled2, $changed, i));
        }
    }

    public static final long SecondaryButton$addAlpha(int c, float a) {
        return ColorKt.Color(android.graphics.Color.argb(MathKt__MathJVMKt.roundToInt(((float) android.graphics.Color.alpha(c)) * a), (c >> 16) & 255, (c >> 8) & 255, c & 255));
    }
}
