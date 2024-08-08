package vegabobo.dsusideloader.ui.components;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ApplicationScreen.kt */
public abstract class ApplicationScreenKt {
    public static final void ApplicationScreen(Modifier modifier, Arrangement.HorizontalOrVertical verticalArrangement, boolean columnContent, boolean enableDefaultScrollBehavior, Function3 topBar, Function2 bottomBar, Function3 outsideContent, Function2 content, Composer $composer, int $changed, int i) {
        Arrangement.HorizontalOrVertical verticalArrangement2;
        boolean columnContent2;
        boolean enableDefaultScrollBehavior2;
        Function3 topBar2;
        Function2 bottomBar2;
        Function2 content2;
        Function3 outsideContent2;
        Function2 bottomBar3;
        Function3 topBar3;
        boolean enableDefaultScrollBehavior3;
        boolean columnContent3;
        Arrangement.HorizontalOrVertical verticalArrangement3;
        Modifier modifier2;
        int $dirty;
        Function2 content3;
        Function3 outsideContent3;
        Function2 bottomBar4;
        Function3 topBar4;
        Modifier modifier3;
        Modifier modifier4;
        Modifier modifier5;
        int i2;
        int i3;
        int i4;
        int i5 = $changed;
        int i6 = i;
        Composer $composer2 = $composer.startRestartGroup(705549353);
        ComposerKt.sourceInformation($composer2, "C(ApplicationScreen)P(4,7,1,3,6!1,5)39@1807L33,42@1983L24,40@1884L130,49@2205L10,51@2267L17,53@2290L1201,82@3497L22:ApplicationScreen.kt#bcxyhz");
        int $dirty2 = $changed;
        int i7 = i6 & 1;
        if (i7 != 0) {
            $dirty2 |= 6;
            Modifier modifier6 = modifier;
        } else if ((i5 & 14) == 0) {
            $dirty2 |= $composer2.changed((Object) modifier) ? 4 : 2;
        } else {
            Modifier modifier7 = modifier;
        }
        if ((i5 & 112) == 0) {
            if ((i6 & 2) == 0) {
                verticalArrangement2 = verticalArrangement;
                if ($composer2.changed((Object) verticalArrangement2)) {
                    i4 = 32;
                    $dirty2 |= i4;
                }
            } else {
                verticalArrangement2 = verticalArrangement;
            }
            i4 = 16;
            $dirty2 |= i4;
        } else {
            verticalArrangement2 = verticalArrangement;
        }
        if ((i5 & 896) == 0) {
            if ((i6 & 4) == 0) {
                columnContent2 = columnContent;
                if ($composer2.changed(columnContent2)) {
                    i3 = 256;
                    $dirty2 |= i3;
                }
            } else {
                columnContent2 = columnContent;
            }
            i3 = 128;
            $dirty2 |= i3;
        } else {
            columnContent2 = columnContent;
        }
        if ((i5 & 7168) == 0) {
            if ((i6 & 8) == 0) {
                enableDefaultScrollBehavior2 = enableDefaultScrollBehavior;
                if ($composer2.changed(enableDefaultScrollBehavior2)) {
                    i2 = 2048;
                    $dirty2 |= i2;
                }
            } else {
                enableDefaultScrollBehavior2 = enableDefaultScrollBehavior;
            }
            i2 = 1024;
            $dirty2 |= i2;
        } else {
            enableDefaultScrollBehavior2 = enableDefaultScrollBehavior;
        }
        int i8 = i6 & 16;
        if (i8 != 0) {
            $dirty2 |= 24576;
            topBar2 = topBar;
        } else if ((57344 & i5) == 0) {
            topBar2 = topBar;
            $dirty2 |= $composer2.changedInstance(topBar2) ? 16384 : 8192;
        } else {
            topBar2 = topBar;
        }
        int i9 = i6 & 32;
        if (i9 != 0) {
            $dirty2 |= 196608;
            bottomBar2 = bottomBar;
        } else if ((458752 & i5) == 0) {
            bottomBar2 = bottomBar;
            $dirty2 |= $composer2.changedInstance(bottomBar2) ? 131072 : 65536;
        } else {
            bottomBar2 = bottomBar;
        }
        int i10 = i6 & 64;
        if (i10 != 0) {
            $dirty2 |= 1572864;
            Function3 function3 = outsideContent;
        } else if ((i5 & 3670016) == 0) {
            $dirty2 |= $composer2.changedInstance(outsideContent) ? 1048576 : 524288;
        } else {
            Function3 function32 = outsideContent;
        }
        int i11 = i6 & 128;
        if (i11 != 0) {
            $dirty2 |= 12582912;
            Function2 function2 = content;
        } else if ((i5 & 29360128) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 8388608 : 4194304;
        } else {
            Function2 function22 = content;
        }
        if (($dirty2 & 23967451) != 4793490 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i5 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i7 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier;
                }
                if ((i6 & 2) != 0) {
                    modifier5 = modifier4;
                    $dirty2 &= -113;
                    verticalArrangement2 = Arrangement.INSTANCE.m196spacedBy0680j_4(Dp.m2350constructorimpl((float) LiveLiterals$ApplicationScreenKt.INSTANCE.m2938Int$$$this$call$getdp$$arg0$callspacedBy$paramverticalArrangement$funApplicationScreen()));
                } else {
                    modifier5 = modifier4;
                }
                if ((i6 & 4) != 0) {
                    $dirty2 &= -897;
                    columnContent2 = LiveLiterals$ApplicationScreenKt.INSTANCE.m2936Boolean$paramcolumnContent$funApplicationScreen();
                }
                if (i6 != false && true) {
                    $dirty2 &= -7169;
                    enableDefaultScrollBehavior2 = LiveLiterals$ApplicationScreenKt.INSTANCE.m2937Boolean$paramenableDefaultScrollBehavior$funApplicationScreen();
                }
                if (i8 != 0) {
                    topBar2 = ComposableSingletons$ApplicationScreenKt.INSTANCE.m2925getLambda1$app_miniDebug();
                }
                if (i9 != 0) {
                    bottomBar2 = ComposableSingletons$ApplicationScreenKt.INSTANCE.m2926getLambda2$app_miniDebug();
                }
                Function3 outsideContent4 = i10 != 0 ? ComposableSingletons$ApplicationScreenKt.INSTANCE.m2927getLambda3$app_miniDebug() : outsideContent;
                if (i11 != 0) {
                    content3 = ComposableSingletons$ApplicationScreenKt.INSTANCE.m2928getLambda4$app_miniDebug();
                    $dirty = $dirty2;
                    outsideContent3 = outsideContent4;
                    topBar4 = topBar2;
                    bottomBar4 = bottomBar2;
                    modifier3 = modifier5;
                } else {
                    modifier3 = modifier5;
                    content3 = content;
                    $dirty = $dirty2;
                    outsideContent3 = outsideContent4;
                    topBar4 = topBar2;
                    bottomBar4 = bottomBar2;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i6 & 2) != 0) {
                    $dirty2 &= -113;
                }
                if ((i6 & 4) != 0) {
                    $dirty2 &= -897;
                }
                if ((i6 & 8) != 0) {
                    outsideContent3 = outsideContent;
                    content3 = content;
                    $dirty = $dirty2 & -7169;
                    topBar4 = topBar2;
                    bottomBar4 = bottomBar2;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    outsideContent3 = outsideContent;
                    content3 = content;
                    $dirty = $dirty2;
                    topBar4 = topBar2;
                    bottomBar4 = bottomBar2;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705549353, $dirty, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen (ApplicationScreen.kt:29)");
            }
            TopAppBarScrollBehavior scrollBehavior = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7), (Function0) null, (AnimationSpec) null, SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay($composer2, 0), $composer2, (TopAppBarDefaults.$stable << 12) | 4096, 6);
            Modifier scrollBehaviorModifier = Modifier.Companion;
            if (enableDefaultScrollBehavior2) {
                scrollBehaviorModifier = NestedScrollModifierKt.nestedScroll$default(scrollBehaviorModifier, scrollBehavior.getNestedScrollConnection(), (NestedScrollDispatcher) null, 2, (Object) null);
            }
            SurfaceKt.m710SurfaceT9BRK9s((Modifier) null, (Shape) null, 0, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.composableLambda($composer2, -1170159228, true, new ApplicationScreenKt$ApplicationScreen$1(scrollBehaviorModifier, topBar4, scrollBehavior, $dirty, bottomBar4, enableDefaultScrollBehavior2, columnContent2, modifier3, verticalArrangement2, content3)), $composer2, 12582912, 127);
            outsideContent3.invoke(WindowInsetsKt.asPaddingValues(WindowInsetsKt.m260onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, $composer2, 8), WindowInsetsSides.Companion.m275getVerticalJoeWqyM()), $composer2, 0), $composer2, Integer.valueOf(($dirty >> 15) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            topBar3 = topBar4;
            bottomBar3 = bottomBar4;
            outsideContent2 = outsideContent3;
            content2 = content3;
            verticalArrangement3 = verticalArrangement2;
            columnContent3 = columnContent2;
            enableDefaultScrollBehavior3 = enableDefaultScrollBehavior2;
            int i12 = $dirty;
        } else {
            $composer2.skipToGroupEnd();
            outsideContent2 = outsideContent;
            content2 = content;
            int i13 = $dirty2;
            verticalArrangement3 = verticalArrangement2;
            enableDefaultScrollBehavior3 = enableDefaultScrollBehavior2;
            topBar3 = topBar2;
            bottomBar3 = bottomBar2;
            modifier2 = modifier;
            columnContent3 = columnContent2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            Composer composer = $composer2;
            Modifier modifier8 = modifier2;
            return;
        }
        ApplicationScreenKt$ApplicationScreen$2 applicationScreenKt$ApplicationScreen$2 = r0;
        Modifier modifier9 = modifier2;
        Composer composer2 = $composer2;
        ApplicationScreenKt$ApplicationScreen$2 applicationScreenKt$ApplicationScreen$22 = new ApplicationScreenKt$ApplicationScreen$2(modifier2, verticalArrangement3, columnContent3, enableDefaultScrollBehavior3, topBar3, bottomBar3, outsideContent2, content2, $changed, i);
        endRestartGroup.updateScope(applicationScreenKt$ApplicationScreen$2);
    }
}
