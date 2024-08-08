package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.FileSelectionBoxKt;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;
import vegabobo.dsusideloader.ui.screen.home.InstallationCardState;

/* compiled from: NotInstallingCardContent.kt */
public abstract class NotInstallingCardContentKt {
    public static final void NotInstallingCardContent(MutableInteractionSource textFieldInteraction, InstallationCardState uiState, Function0 onClickClear, Function0 onClickInstall, Composer $composer, int $changed) {
        Composer $composer2;
        Composer $composer$iv;
        int $dirty;
        Composer $composer3;
        int i;
        MutableInteractionSource mutableInteractionSource = textFieldInteraction;
        InstallationCardState installationCardState = uiState;
        Function0 function0 = onClickClear;
        Function0 function02 = onClickInstall;
        int i2 = $changed;
        Intrinsics.checkNotNullParameter(mutableInteractionSource, "textFieldInteraction");
        Intrinsics.checkNotNullParameter(installationCardState, "uiState");
        Intrinsics.checkNotNullParameter(function0, "onClickClear");
        Intrinsics.checkNotNullParameter(function02, "onClickInstall");
        Composer $composer4 = $composer.startRestartGroup(1757345437);
        ComposerKt.sourceInformation($composer4, "C(NotInstallingCardContent)P(2,3)34@1411L45,28@1166L297,36@1468L48,37@1521L866:NotInstallingCardContent.kt#udsvy7");
        int $dirty2 = $changed;
        if ((i2 & 14) == 0) {
            $dirty2 |= $composer4.changed((Object) mutableInteractionSource) ? 4 : 2;
        }
        if ((i2 & 112) == 0) {
            $dirty2 |= $composer4.changed((Object) installationCardState) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            $dirty2 |= $composer4.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            $dirty2 |= $composer4.changedInstance(function02) ? 2048 : 1024;
        }
        int $dirty3 = $dirty2;
        if (($dirty3 & 5851) != 1170 || !$composer4.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757345437, $dirty3, -1, "vegabobo.dsusideloader.ui.cards.installation.content.NotInstallingCardContent (NotInstallingCardContent.kt:22)");
            }
            boolean isTextFieldEnabled = uiState.isTextFieldEnabled();
            boolean isError = uiState.isError();
            String text = uiState.getText();
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.select_gsi_info, $composer4, 0);
            LiveLiterals$NotInstallingCardContentKt liveLiterals$NotInstallingCardContentKt = LiveLiterals$NotInstallingCardContentKt.INSTANCE;
            int $dirty4 = $dirty3;
            FileSelectionBoxKt.FileSelectionBox((Modifier) null, liveLiterals$NotInstallingCardContentKt.m2886Boolean$arg1$callFileSelectionBox$funNotInstallingCardContent(), (KeyboardOptions) null, isTextFieldEnabled, isError, stringResource, text, textFieldInteraction, (Function1) null, $composer4, ($dirty3 << 21) & 29360128, 261);
            Modifier.Companion companion = Modifier.Companion;
            $composer2 = $composer4;
            SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$NotInstallingCardContentKt.m2889Int$$$this$call$getdp$$arg1$callpadding$arg0$callSpacer$funNotInstallingCardContent()), 0.0f, 0.0f, 13, (Object) null), $composer2, 0);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            $composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, centerVertically, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
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
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer2.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 factory$iv$iv$iv = companion2.getConstructor();
            Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(fillMaxWidth$default);
            Arrangement.Horizontal horizontalArrangement$iv2 = horizontalArrangement$iv;
            int $changed$iv$iv$iv = ((((390 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(factory$iv$iv$iv);
            } else {
                $composer2.useNode();
            }
            $composer2.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer2);
            Function0 factory$iv$iv$iv2 = factory$iv$iv$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
            $composer2.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer2)), $composer2, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            $composer2.startReplaceableGroup(2058660585);
            int i3 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv2 = $composer2;
            ComposerKt.sourceInformationMarkerStart($composer$iv2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Composer $composer5 = $composer$iv2;
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer5, -1766209649, "C41@1642L276,48@1927L38,57@2253L32,56@2219L162:NotInstallingCardContent.kt#udsvy7");
            AnimatedVisibilityKt.AnimatedVisibility((RowScope) rowScopeInstance, uiState.isError(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$NotInstallingCardContentKt.INSTANCE.m2885getLambda1$app_miniDebug(), $composer5, ((((390 >> 6) & 112) | 6) & 14) | 1572864, 30);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, liveLiterals$NotInstallingCardContentKt.m2887Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$funNotInstallingCardContent(), false, 2, (Object) null), $composer5, 0);
            $composer5.startReplaceableGroup(-1766209317);
            ComposerKt.sourceInformation($composer5, "51@2055L30,50@2015L125,54@2153L47");
            if (uiState.isInstallable()) {
                int $dirty5 = $dirty4;
                Density density = density$iv$iv;
                $dirty = $dirty5;
                Function3 function3 = skippableUpdate$iv$iv$iv2;
                LayoutDirection layoutDirection = layoutDirection$iv$iv;
                Function0 function03 = factory$iv$iv$iv2;
                MeasurePolicy measurePolicy = measurePolicy$iv;
                Arrangement.Horizontal horizontal = horizontalArrangement$iv2;
                $composer$iv = $composer$iv2;
                SecondaryButtonKt.SecondaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.clear, $composer5, 0), onClickClear, false, $composer5, $dirty5 & 896, 9);
                Modifier.Companion companion3 = companion;
                $composer3 = $composer5;
                i = 0;
                SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$NotInstallingCardContentKt.m2890Int$$$this$call$getdp$$arg2$callpadding$arg0$callSpacer$branch$if$fun$anonymous$$arg3$callRow$funNotInstallingCardContent()), 0.0f, 11, (Object) null), $composer3, 0);
            } else {
                LayoutDirection layoutDirection2 = layoutDirection$iv$iv;
                $composer3 = $composer5;
                MeasurePolicy measurePolicy2 = measurePolicy$iv;
                $composer$iv = $composer$iv2;
                $dirty = $dirty4;
                Function0 function04 = factory$iv$iv$iv2;
                Function3 function32 = skippableUpdate$iv$iv$iv2;
                i = 0;
                Density density2 = density$iv$iv;
            }
            $composer3.endReplaceableGroup();
            PrimaryButtonKt.PrimaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.install, $composer3, i), onClickInstall, uiState.isInstallable(), $composer3, ($dirty >> 3) & 896, 1);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer2.endReplaceableGroup();
            $composer2.endNode();
            $composer2.endReplaceableGroup();
            $composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer4.skipToGroupEnd();
            int i4 = $dirty3;
            $composer2 = $composer4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NotInstallingCardContentKt$NotInstallingCardContent$2(textFieldInteraction, uiState, onClickClear, onClickInstall, $changed));
        }
    }
}
