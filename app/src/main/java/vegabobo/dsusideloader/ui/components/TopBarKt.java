package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopBar.kt */
public abstract class TopBarKt {
    public static final void TopBar(TopAppBarScrollBehavior scrollBehavior, String barTitle, ImageVector icon, String iconContentDescription, Function0 onClickIcon, Function0 onClickBackButton, Composer $composer, int $changed, int i) {
        TopAppBarScrollBehavior topAppBarScrollBehavior;
        ImageVector imageVector;
        String str;
        Function0 onClickIcon2;
        Function0 function0;
        Function0 onClickBackButton2;
        Function0 onClickIcon3;
        String iconContentDescription2;
        ImageVector icon2;
        TopAppBarScrollBehavior scrollBehavior2;
        int $dirty;
        Function0 onClickBackButton3;
        String iconContentDescription3;
        ImageVector icon3;
        TopAppBarScrollBehavior scrollBehavior3;
        Function0 onClickIcon4;
        int i2;
        String str2 = barTitle;
        int i3 = $changed;
        Intrinsics.checkNotNullParameter(str2, "barTitle");
        Composer $composer2 = $composer.startRestartGroup(-874087779);
        ComposerKt.sourceInformation($composer2, "C(TopBar)P(5!3,4)23@840L747:TopBar.kt#bcxyhz");
        int $dirty2 = $changed;
        int i4 = i & 1;
        if (i4 != 0) {
            $dirty2 |= 6;
            topAppBarScrollBehavior = scrollBehavior;
        } else if ((i3 & 14) == 0) {
            topAppBarScrollBehavior = scrollBehavior;
            $dirty2 |= $composer2.changed((Object) topAppBarScrollBehavior) ? 4 : 2;
        } else {
            topAppBarScrollBehavior = scrollBehavior;
        }
        if ((i & 2) != 0) {
            $dirty2 |= 48;
        } else if ((i3 & 112) == 0) {
            $dirty2 |= $composer2.changed((Object) str2) ? 32 : 16;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty2 |= 384;
            imageVector = icon;
        } else if ((i3 & 896) == 0) {
            imageVector = icon;
            $dirty2 |= $composer2.changed((Object) imageVector) ? 256 : 128;
        } else {
            imageVector = icon;
        }
        if ((i3 & 7168) == 0) {
            if ((i & 8) == 0) {
                str = iconContentDescription;
                if ($composer2.changed((Object) str)) {
                    i2 = 2048;
                    $dirty2 |= i2;
                }
            } else {
                str = iconContentDescription;
            }
            i2 = 1024;
            $dirty2 |= i2;
        } else {
            str = iconContentDescription;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty2 |= 24576;
            onClickIcon2 = onClickIcon;
        } else if ((57344 & i3) == 0) {
            onClickIcon2 = onClickIcon;
            $dirty2 |= $composer2.changedInstance(onClickIcon2) ? 16384 : 8192;
        } else {
            onClickIcon2 = onClickIcon;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty2 |= 196608;
            function0 = onClickBackButton;
        } else if ((458752 & i3) == 0) {
            function0 = onClickBackButton;
            $dirty2 |= $composer2.changedInstance(function0) ? 131072 : 65536;
        } else {
            function0 = onClickBackButton;
        }
        if ((374491 & $dirty2) != 74898 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i3 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i4 != 0) {
                    scrollBehavior3 = null;
                } else {
                    scrollBehavior3 = topAppBarScrollBehavior;
                }
                if (i5 != 0) {
                    icon3 = null;
                } else {
                    icon3 = imageVector;
                }
                if ((i & 8) != 0) {
                    iconContentDescription3 = LiveLiterals$TopBarKt.INSTANCE.m3026String$paramiconContentDescription$funTopBar();
                    $dirty2 &= -7169;
                } else {
                    iconContentDescription3 = str;
                }
                if (i6 != 0) {
                    onClickIcon2 = TopBarKt$TopBar$1.INSTANCE;
                }
                if (i7 != 0) {
                    onClickBackButton3 = null;
                    $dirty = $dirty2;
                    onClickIcon4 = onClickIcon2;
                } else {
                    $dirty = $dirty2;
                    onClickIcon4 = onClickIcon2;
                    onClickBackButton3 = function0;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                scrollBehavior3 = topAppBarScrollBehavior;
                icon3 = imageVector;
                iconContentDescription3 = str;
                onClickBackButton3 = function0;
                $dirty = $dirty2;
                onClickIcon4 = onClickIcon2;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-874087779, $dirty, -1, "vegabobo.dsusideloader.ui.components.TopBar (TopBar.kt:15)");
            }
            AppBarKt.LargeTopAppBar(ComposableLambdaKt.composableLambda($composer2, 220951638, true, new TopBarKt$TopBar$2(str2, $dirty)), (Modifier) null, ComposableLambdaKt.composableLambda($composer2, 719508440, true, new TopBarKt$TopBar$3(onClickBackButton3, $dirty, iconContentDescription3)), ComposableLambdaKt.composableLambda($composer2, 529225025, true, new TopBarKt$TopBar$4(icon3, onClickIcon4, $dirty, iconContentDescription3)), (WindowInsets) null, (TopAppBarColors) null, scrollBehavior3, $composer2, (($dirty << 18) & 3670016) | 3462, 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onClickIcon3 = onClickIcon4;
            scrollBehavior2 = scrollBehavior3;
            icon2 = icon3;
            iconContentDescription2 = iconContentDescription3;
            onClickBackButton2 = onClickBackButton3;
            int i8 = $dirty;
        } else {
            $composer2.skipToGroupEnd();
            int i9 = $dirty2;
            icon2 = imageVector;
            onClickIcon3 = onClickIcon2;
            onClickBackButton2 = function0;
            scrollBehavior2 = topAppBarScrollBehavior;
            iconContentDescription2 = str;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            Composer composer = $composer2;
            return;
        }
        TopBarKt$TopBar$5 topBarKt$TopBar$5 = r0;
        Composer composer2 = $composer2;
        TopBarKt$TopBar$5 topBarKt$TopBar$52 = new TopBarKt$TopBar$5(scrollBehavior2, barTitle, icon2, iconContentDescription2, onClickIcon3, onClickBackButton2, $changed, i);
        endRestartGroup.updateScope(topBarKt$TopBar$5);
    }
}
