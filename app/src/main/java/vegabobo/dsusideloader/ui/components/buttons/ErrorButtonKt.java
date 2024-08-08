package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorButton.kt */
public abstract class ErrorButtonKt {
    public static final void ErrorButton(Modifier modifier, String text, Function0 onClick, boolean isEnabled, Composer $composer, int $changed, int i) {
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
        Composer $composer2 = $composer.startRestartGroup(319858062);
        ComposerKt.sourceInformation($composer2, "C(ErrorButton)P(1,3,2)18@486L11,13@328L182:ErrorButton.kt#90uv7e");
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
                    isEnabled2 = LiveLiterals$ErrorButtonKt.INSTANCE.m3032Boolean$paramisEnabled$funErrorButton();
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
                ComposerKt.traceEventStart(319858062, $dirty, -1, "vegabobo.dsusideloader.ui.components.buttons.ErrorButton (ErrorButton.kt:7)");
            }
            int i5 = $dirty;
            ActionButtonKt.m3028ActionButtonr7P0LY(modifier3, text, onClick, Color.m1182boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).m581getError0d7_KjU()), (Color) null, false, isEnabled2, (Function2) null, $composer2, ($dirty & 14) | ($dirty & 112) | ($dirty & 896) | (($dirty << 9) & 3670016), 176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            int i6 = $dirty2;
            modifier3 = modifier2;
            isEnabled2 = z;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ErrorButtonKt$ErrorButton$1(modifier3, text, onClick, isEnabled2, $changed, i));
        }
    }
}
