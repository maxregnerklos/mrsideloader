package vegabobo.dsusideloader.ui.theme;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
public abstract class ThemeKt {
    public static final ColorScheme DarkColorScheme = ColorSchemeKt.m642darkColorSchemeG1PFcw$default(ColorKt.getBlue80(), 0, 0, 0, 0, ColorKt.getBlueGrey80(), 0, 0, 0, ColorKt.getPurplish80(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870366, (Object) null);
    public static final ColorScheme LightColorScheme = ColorSchemeKt.m644lightColorSchemeG1PFcw$default(ColorKt.getBlue40(), 0, 0, 0, 0, ColorKt.getBlueGrey40(), 0, 0, 0, ColorKt.getPurplish40(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870366, (Object) null);

    public static final void DSUHelperTheme(boolean darkTheme, boolean dynamicColor, Function2 content, Composer $composer, int $changed, int i) {
        boolean darkTheme2;
        boolean z;
        boolean dynamicColor2;
        boolean darkTheme3;
        int $dirty;
        ColorScheme colorScheme;
        int i2;
        int i3;
        Function2 function2 = content;
        int i4 = $changed;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer $composer2 = $composer.startRestartGroup(476151130);
        ComposerKt.sourceInformation($composer2, "C(DSUHelperTheme)P(1,2)40@1226L21,53@1733L7,62@2076L115:Theme.kt#ecl5y0");
        int $dirty2 = $changed;
        if ((i4 & 14) == 0) {
            if ((i & 1) == 0) {
                darkTheme2 = darkTheme;
                if ($composer2.changed(darkTheme)) {
                    i3 = 4;
                    $dirty2 |= i3;
                }
            } else {
                darkTheme2 = darkTheme;
            }
            i3 = 2;
            $dirty2 |= i3;
        } else {
            darkTheme2 = darkTheme;
        }
        if ((i4 & 112) == 0) {
            if ((i & 2) == 0) {
                z = dynamicColor;
                if ($composer2.changed(dynamicColor)) {
                    i2 = 32;
                    $dirty2 |= i2;
                }
            } else {
                z = dynamicColor;
            }
            i2 = 16;
            $dirty2 |= i2;
        } else {
            z = dynamicColor;
        }
        if ((i & 4) != 0) {
            $dirty2 |= 384;
        } else if ((i4 & 896) == 0) {
            $dirty2 |= $composer2.changedInstance(function2) ? 256 : 128;
        }
        if (($dirty2 & 731) != 146 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i4 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if ((i & 1) != 0) {
                    darkTheme2 = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                    $dirty2 &= -15;
                }
                if ((i & 2) != 0) {
                    $dirty = $dirty2 & -113;
                    darkTheme3 = darkTheme2;
                    dynamicColor2 = LiveLiterals$ThemeKt.INSTANCE.m3412Boolean$paramdynamicColor$funDSUHelperTheme();
                } else {
                    $dirty = $dirty2;
                    darkTheme3 = darkTheme2;
                    dynamicColor2 = z;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty2 &= -15;
                }
                if ((i & 2) != 0) {
                    $dirty = $dirty2 & -113;
                    darkTheme3 = darkTheme2;
                    dynamicColor2 = z;
                } else {
                    $dirty = $dirty2;
                    darkTheme3 = darkTheme2;
                    dynamicColor2 = z;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476151130, $dirty, -1, "vegabobo.dsusideloader.ui.theme.DSUHelperTheme (Theme.kt:39)");
            }
            $composer2.startReplaceableGroup(1173627464);
            ComposerKt.sourceInformation($composer2, "47@1517L7");
            if (!dynamicColor2 || Build.VERSION.SDK_INT < 31) {
                colorScheme = darkTheme3 ? DarkColorScheme : LightColorScheme;
            } else {
                CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = $composer2.consume(this_$iv);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Context context = (Context) consume;
                colorScheme = darkTheme3 ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            }
            $composer2.endReplaceableGroup();
            CompositionLocal this_$iv2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer2.consume(this_$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            View view = (View) consume2;
            $composer2.startReplaceableGroup(1173627814);
            ComposerKt.sourceInformation($composer2, "55@1779L285");
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new ThemeKt$DSUHelperTheme$1(view, darkTheme3), $composer2, 0);
            }
            $composer2.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colorScheme, (Shapes) null, TypeKt.getTypography(), content, $composer2, (($dirty << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            int i5 = $dirty2;
            darkTheme3 = darkTheme2;
            dynamicColor2 = z;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ThemeKt$DSUHelperTheme$2(darkTheme3, dynamicColor2, content, $changed, i));
        }
    }
}
