package vegabobo.dsusideloader.ui.cards;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;

/* compiled from: WhatIsDsuCard.kt */
public final class WhatIsDsuCardKt$DsuInfoCard$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function0 $onClickLearnMore;
    public final /* synthetic */ Function0 $onClickViewDocs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WhatIsDsuCardKt$DsuInfoCard$1(Function0 function0, int i, Function0 function02) {
        super(2);
        this.$onClickViewDocs = function0;
        this.$$dirty = i;
        this.$onClickLearnMore = function02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C25@859L472:WhatIsDsuCard.kt#e34gdu");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-638516297, i, -1, "vegabobo.dsusideloader.ui.cards.DsuInfoCard.<anonymous> (WhatIsDsuCard.kt:24)");
            }
            Modifier.Companion companion = Modifier.Companion;
            LiveLiterals$WhatIsDsuCardKt liveLiterals$WhatIsDsuCardKt = LiveLiterals$WhatIsDsuCardKt.INSTANCE;
            Modifier modifier$iv = PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$WhatIsDsuCardKt.m2863Int$$$this$call$getdp$$arg1$callpadding$arg0$callRow$fun$anonymous$$arg9$callSimpleCard$funDsuInfoCard()), 0.0f, 0.0f, 13, (Object) null);
            Function0 function0 = this.$onClickViewDocs;
            int i2 = this.$$dirty;
            Function0 function02 = this.$onClickLearnMore;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density density$iv$iv = (Density) consume;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 factory$iv$iv$iv = companion2.getConstructor();
            int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
            Modifier modifier = modifier$iv;
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                composer.createNode(factory$iv$iv$iv);
            } else {
                $composer.useNode();
            }
            $composer.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            Function0 factory$iv$iv$iv2 = factory$iv$iv$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
            $composer.enableReusing();
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            int i3 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            Composer $composer2 = $composer$iv;
            Composer $composer$iv2 = $composer$iv;
            RowScope $this$invoke_u24lambda_u240 = RowScopeInstance.INSTANCE;
            int i4 = ((0 >> 6) & 112) | 6;
            Function0 function03 = function02;
            Composer $composer3 = $composer2;
            ComposerKt.sourceInformationMarkerStart($composer3, -515100752, "C26@918L38,28@1009L39,27@969L137,31@1119L50,33@1222L40,32@1182L139:WhatIsDsuCard.kt#e34gdu");
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            Density density = density$iv$iv;
            Function3 function3 = skippableUpdate$iv$iv$iv2;
            Function0 function04 = factory$iv$iv$iv2;
            MeasurePolicy measurePolicy = measurePolicy$iv;
            Alignment.Vertical vertical = verticalAlignment$iv;
            SpacerKt.Spacer(RowScope.weight$default($this$invoke_u24lambda_u240, companion, liveLiterals$WhatIsDsuCardKt.m2861Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg9$callSimpleCard$funDsuInfoCard(), false, 2, (Object) null), $composer3, 0);
            Arrangement.Horizontal horizontal = horizontalArrangement$iv;
            SecondaryButtonKt.SecondaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.view_docs, $composer3, 0), function0, false, $composer3, (i2 << 3) & 896, 9);
            SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion, Dp.m2350constructorimpl((float) liveLiterals$WhatIsDsuCardKt.m2862Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer1$fun$anonymous$$arg3$callRow$fun$anonymous$$arg9$callSimpleCard$funDsuInfoCard()), 0.0f, 0.0f, 0.0f, 14, (Object) null), $composer3, 0);
            Composer $composer4 = $composer3;
            SecondaryButtonKt.SecondaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.learn_more, $composer3, 0), function03, false, $composer4, i2 & 896, 9);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer.endReplaceableGroup();
            $composer.endNode();
            $composer.endReplaceableGroup();
            $composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
