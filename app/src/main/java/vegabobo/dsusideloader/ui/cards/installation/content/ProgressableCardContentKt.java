package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;

/* compiled from: ProgressableCardContent.kt */
public abstract class ProgressableCardContentKt {
    public static final void ProgressableCardContent(String text, boolean showProgressBar, boolean isIndeterminate, float progress, String textFirstButton, String textSecondButton, Function0 onClickFirstButton, Function0 onClickSecondButton, Composer $composer, int $changed, int i) {
        boolean z;
        boolean z2;
        float progress2;
        String textFirstButton2;
        String textSecondButton2;
        Function0 onClickFirstButton2;
        Function0 function0;
        Function0 onClickSecondButton2;
        Function0 onClickFirstButton3;
        String textSecondButton3;
        String textFirstButton3;
        boolean showProgressBar2;
        Composer $composer2;
        float progress3;
        boolean isIndeterminate2;
        boolean isIndeterminate3;
        float progress4;
        int $dirty;
        Function0 factory$iv$iv$iv;
        boolean showProgressBar3;
        boolean isIndeterminate4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = text;
        int i7 = $changed;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str, "text");
        Composer $composer3 = $composer.startRestartGroup(-1177698112);
        ComposerKt.sourceInformation($composer3, "C(ProgressableCardContent)P(5,4!1,3,6,7)26@992L17,27@1014L435,40@1454L47,41@1506L564:ProgressableCardContent.kt#udsvy7");
        int $dirty2 = $changed;
        if ((i8 & 1) != 0) {
            $dirty2 |= 6;
        } else if ((i7 & 14) == 0) {
            $dirty2 |= $composer3.changed((Object) str) ? 4 : 2;
        }
        if ((i7 & 112) == 0) {
            if ((i8 & 2) == 0) {
                z = showProgressBar;
                if ($composer3.changed(z)) {
                    i6 = 32;
                    $dirty2 |= i6;
                }
            } else {
                z = showProgressBar;
            }
            i6 = 16;
            $dirty2 |= i6;
        } else {
            z = showProgressBar;
        }
        if ((i7 & 896) == 0) {
            if ((i8 & 4) == 0) {
                z2 = isIndeterminate;
                if ($composer3.changed(z2)) {
                    i5 = 256;
                    $dirty2 |= i5;
                }
            } else {
                z2 = isIndeterminate;
            }
            i5 = 128;
            $dirty2 |= i5;
        } else {
            z2 = isIndeterminate;
        }
        if ((i7 & 7168) == 0) {
            if ((i8 & 8) == 0) {
                progress2 = progress;
                if ($composer3.changed(progress2)) {
                    i4 = 2048;
                    $dirty2 |= i4;
                }
            } else {
                progress2 = progress;
            }
            i4 = 1024;
            $dirty2 |= i4;
        } else {
            progress2 = progress;
        }
        if ((57344 & i7) == 0) {
            if ((i8 & 16) == 0) {
                textFirstButton2 = textFirstButton;
                if ($composer3.changed((Object) textFirstButton2)) {
                    i3 = 16384;
                    $dirty2 |= i3;
                }
            } else {
                textFirstButton2 = textFirstButton;
            }
            i3 = 8192;
            $dirty2 |= i3;
        } else {
            textFirstButton2 = textFirstButton;
        }
        if ((458752 & i7) == 0) {
            if ((i8 & 32) == 0) {
                textSecondButton2 = textSecondButton;
                if ($composer3.changed((Object) textSecondButton2)) {
                    i2 = 131072;
                    $dirty2 |= i2;
                }
            } else {
                textSecondButton2 = textSecondButton;
            }
            i2 = 65536;
            $dirty2 |= i2;
        } else {
            textSecondButton2 = textSecondButton;
        }
        int i9 = i8 & 64;
        if (i9 != 0) {
            $dirty2 |= 1572864;
            onClickFirstButton2 = onClickFirstButton;
        } else if ((3670016 & i7) == 0) {
            onClickFirstButton2 = onClickFirstButton;
            $dirty2 |= $composer3.changedInstance(onClickFirstButton2) ? 1048576 : 524288;
        } else {
            onClickFirstButton2 = onClickFirstButton;
        }
        int i10 = i8 & 128;
        if (i10 != 0) {
            $dirty2 |= 12582912;
            function0 = onClickSecondButton;
        } else if ((29360128 & i7) == 0) {
            function0 = onClickSecondButton;
            $dirty2 |= $composer3.changedInstance(function0) ? 8388608 : 4194304;
        } else {
            function0 = onClickSecondButton;
        }
        if ((23967451 & $dirty2) != 4793490 || !$composer3.getSkipping()) {
            $composer3.startDefaults();
            if ((i7 & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if ((i8 & 2) != 0) {
                    showProgressBar3 = LiveLiterals$ProgressableCardContentKt.INSTANCE.m2892Boolean$paramshowProgressBar$funProgressableCardContent();
                    $dirty2 &= -113;
                } else {
                    showProgressBar3 = z;
                }
                if ((i8 & 4) != 0) {
                    isIndeterminate4 = LiveLiterals$ProgressableCardContentKt.INSTANCE.m2891Boolean$paramisIndeterminate$funProgressableCardContent();
                    $dirty2 &= -897;
                } else {
                    isIndeterminate4 = z2;
                }
                if ((i8 & 8) != 0) {
                    $dirty2 &= -7169;
                    progress2 = LiveLiterals$ProgressableCardContentKt.INSTANCE.m2894Float$paramprogress$funProgressableCardContent();
                }
                if ((i8 & 16) != 0) {
                    $dirty2 &= -57345;
                    textFirstButton2 = LiveLiterals$ProgressableCardContentKt.INSTANCE.m2899String$paramtextFirstButton$funProgressableCardContent();
                }
                if ((i8 & 32) != 0) {
                    $dirty2 &= -458753;
                    textSecondButton2 = LiveLiterals$ProgressableCardContentKt.INSTANCE.m2900String$paramtextSecondButton$funProgressableCardContent();
                }
                if (i9 != 0) {
                    onClickFirstButton2 = null;
                }
                if (i10 != 0) {
                    showProgressBar2 = showProgressBar3;
                    isIndeterminate3 = isIndeterminate4;
                    onClickSecondButton2 = null;
                    progress4 = progress2;
                    textFirstButton3 = textFirstButton2;
                    textSecondButton3 = textSecondButton2;
                    onClickFirstButton3 = onClickFirstButton2;
                    $dirty = $dirty2;
                } else {
                    showProgressBar2 = showProgressBar3;
                    isIndeterminate3 = isIndeterminate4;
                    textFirstButton3 = textFirstButton2;
                    textSecondButton3 = textSecondButton2;
                    onClickFirstButton3 = onClickFirstButton2;
                    onClickSecondButton2 = function0;
                    $dirty = $dirty2;
                    progress4 = progress2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i8 & 2) != 0) {
                    $dirty2 &= -113;
                }
                if ((i8 & 4) != 0) {
                    $dirty2 &= -897;
                }
                if ((i8 & 8) != 0) {
                    $dirty2 &= -7169;
                }
                if ((i8 & 16) != 0) {
                    $dirty2 &= -57345;
                }
                if ((i8 & 32) != 0) {
                    showProgressBar2 = z;
                    isIndeterminate3 = z2;
                    textFirstButton3 = textFirstButton2;
                    textSecondButton3 = textSecondButton2;
                    onClickFirstButton3 = onClickFirstButton2;
                    onClickSecondButton2 = function0;
                    $dirty = -458753 & $dirty2;
                    progress4 = progress2;
                } else {
                    showProgressBar2 = z;
                    isIndeterminate3 = z2;
                    textFirstButton3 = textFirstButton2;
                    textSecondButton3 = textSecondButton2;
                    onClickFirstButton3 = onClickFirstButton2;
                    onClickSecondButton2 = function0;
                    $dirty = $dirty2;
                    progress4 = progress2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177698112, $dirty, -1, "vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContent (ProgressableCardContent.kt:16)");
            }
            int $dirty3 = $dirty;
            boolean isIndeterminate5 = isIndeterminate3;
            Composer $composer4 = $composer3;
            TextKt.m754TextfLXpl1I(text, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer4, $dirty3 & 14, 0, 65534);
            progress3 = progress4;
            isIndeterminate2 = isIndeterminate5;
            int $dirty4 = $dirty3;
            $composer2 = $composer4;
            AnimatedVisibilityKt.AnimatedVisibility(showProgressBar2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda($composer2, -1909585688, true, new ProgressableCardContentKt$ProgressableCardContent$1(isIndeterminate2, progress3, $dirty4)), $composer2, (($dirty4 >> 3) & 14) | 196608, 30);
            Modifier.Companion companion = Modifier.Companion;
            LiveLiterals$ProgressableCardContentKt liveLiterals$ProgressableCardContentKt = LiveLiterals$ProgressableCardContentKt.INSTANCE;
            SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ProgressableCardContentKt.m2895Int$$$this$call$getdp$$arg1$callpadding$arg0$callSpacer$funProgressableCardContent()), 0.0f, 0.0f, 13, (Object) null), $composer2, 0);
            $composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = companion;
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Density density$iv$iv = (Density) consume;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer2.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(companion2);
            Modifier.Companion companion4 = companion2;
            int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv = materializerOf;
            Function0 factory$iv$iv$iv2 = constructor;
            Arrangement.Horizontal horizontal = horizontalArrangement$iv;
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer2.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer2.useNode();
            }
            $composer2.disableReusing();
            Function0 function02 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer2);
            Alignment.Vertical vertical = verticalAlignment$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
            $composer2.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer2)), $composer2, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            $composer2.startReplaceableGroup(2058660585);
            Composer $composer$iv = $composer2;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            int i11 = ($changed$iv$iv$iv >> 9) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            int i12 = ((0 >> 6) & 112) | 6;
            Composer $composer5 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer5, 1567280956, "C42@1520L38:ProgressableCardContent.kt#udsvy7");
            Density density = density$iv$iv;
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, companion, liveLiterals$ProgressableCardContentKt.m2893Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$funProgressableCardContent(), false, 2, (Object) null), $composer5, 0);
            $composer5.startReplaceableGroup(1567281003);
            ComposerKt.sourceInformation($composer5, "44@1614L118");
            if (onClickSecondButton2 != null) {
                SecondaryButtonKt.SecondaryButton((Modifier) null, textSecondButton3, onClickSecondButton2, false, $composer5, (($dirty4 >> 12) & 112) | (($dirty4 >> 15) & 896), 9);
            }
            $composer5.endReplaceableGroup();
            $composer5.startReplaceableGroup(1567281187);
            ComposerKt.sourceInformation($composer5, "50@1828L47");
            if (!(onClickFirstButton3 == null || onClickSecondButton2 == null)) {
                SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ProgressableCardContentKt.m2897Int$$$this$call$getdp$$arg2$callpadding$arg0$callSpacer$branch$if1$fun$anonymous$$arg3$callRow$funProgressableCardContent()), 0.0f, 11, (Object) null), $composer5, 0);
            }
            $composer5.endReplaceableGroup();
            $composer5.startReplaceableGroup(-371394799);
            ComposerKt.sourceInformation($composer5, "53@1940L114");
            if (onClickFirstButton3 != null) {
                PrimaryButtonKt.PrimaryButton((Modifier) null, textFirstButton3, onClickFirstButton3, false, $composer5, (($dirty4 >> 9) & 112) | (($dirty4 >> 12) & 896), 9);
            }
            $composer5.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer2.endReplaceableGroup();
            $composer2.endNode();
            $composer2.endReplaceableGroup();
            $composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            int i13 = $dirty4;
        } else {
            $composer3.skipToGroupEnd();
            showProgressBar2 = z;
            progress3 = progress2;
            textFirstButton3 = textFirstButton2;
            textSecondButton3 = textSecondButton2;
            onClickFirstButton3 = onClickFirstButton2;
            onClickSecondButton2 = function0;
            $composer2 = $composer3;
            int i14 = $dirty2;
            isIndeterminate2 = z2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            boolean z3 = isIndeterminate2;
            return;
        }
        boolean z4 = isIndeterminate2;
        ProgressableCardContentKt$ProgressableCardContent$3 progressableCardContentKt$ProgressableCardContent$3 = r0;
        ProgressableCardContentKt$ProgressableCardContent$3 progressableCardContentKt$ProgressableCardContent$32 = new ProgressableCardContentKt$ProgressableCardContent$3(text, showProgressBar2, isIndeterminate2, progress3, textFirstButton3, textSecondButton3, onClickFirstButton3, onClickSecondButton2, $changed, i);
        endRestartGroup.updateScope(progressableCardContentKt$ProgressableCardContent$3);
    }
}
