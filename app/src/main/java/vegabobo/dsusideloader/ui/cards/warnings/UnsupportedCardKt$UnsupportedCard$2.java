package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import vegabobo.dsusideloader.ui.components.buttons.ErrorButtonKt;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;

/* compiled from: UnsupportedCard.kt */
public final class UnsupportedCardKt$UnsupportedCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function0 $onClickClose;
    public final /* synthetic */ Function0 $onClickContinueAnyway;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnsupportedCardKt$UnsupportedCard$2(Function0 function0, int i, Function0 function02) {
        super(2);
        this.$onClickContinueAnyway = function0;
        this.$$dirty = i;
        this.$onClickClose = function02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C29@1153L520:UnsupportedCard.kt#ypex4d");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836161387, i, -1, "vegabobo.dsusideloader.ui.cards.warnings.UnsupportedCard.<anonymous> (UnsupportedCard.kt:28)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal horizontalAlignment$iv = companion2.getEnd();
            Function0 function0 = this.$onClickContinueAnyway;
            int i2 = this.$$dirty;
            Function0 function02 = this.$onClickClose;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = arrangement.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density density$iv$iv = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd($composer);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd($composer);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
            Modifier modifier = modifier$iv;
            int $changed$iv$iv$iv = ((((390 << 3) & 112) << 9) & 7168) | 6;
            Function0 factory$iv$iv$iv2 = constructor;
            Function3 skippableUpdate$iv$iv$iv = materializerOf;
            Alignment.Horizontal horizontal = horizontalAlignment$iv;
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                composer.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer.useNode();
            }
            $composer.disableReusing();
            Function0 function03 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            Arrangement.Vertical verticalArrangement$iv2 = verticalArrangement$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
            $composer.enableReusing();
            Function0 function04 = function02;
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            int i3 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            Function3 skippableUpdate$iv$iv$iv3 = skippableUpdate$iv$iv$iv2;
            Composer $composer2 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 988705847, "C30@1247L416:UnsupportedCard.kt#ypex4d");
            $composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Modifier.Companion companion4 = companion;
            Arrangement.Horizontal horizontalArrangement$iv = arrangement.getStart();
            Alignment.Vertical verticalAlignment$iv = companion2.getTop();
            int i4 = $changed$iv$iv$iv;
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            Alignment.Vertical vertical = verticalAlignment$iv;
            $composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalDensity();
            int i5 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = $composer2.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Density density$iv$iv2 = (Density) consume4;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalLayoutDirection();
            Arrangement.Horizontal horizontal2 = horizontalArrangement$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = $composer2.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LayoutDirection layoutDirection$iv$iv2 = (LayoutDirection) consume5;
            CompositionLocal this_$iv$iv$iv4 = CompositionLocalsKt.getLocalViewConfiguration();
            LayoutDirection layoutDirection$iv$iv3 = layoutDirection$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = $composer2.consume(this_$iv$iv$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ViewConfiguration viewConfiguration$iv$iv2 = (ViewConfiguration) consume6;
            Function0 factory$iv$iv$iv3 = companion3.getConstructor();
            Function3 skippableUpdate$iv$iv$iv4 = LayoutKt.materializerOf(companion4);
            int $changed$iv$iv$iv2 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(factory$iv$iv$iv3);
            } else {
                $composer2.useNode();
            }
            $composer2.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv2 = Updater.m972constructorimpl($composer2);
            Modifier.Companion companion5 = companion4;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, measurePolicy$iv2, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, density$iv$iv2, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, layoutDirection$iv$iv2, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, viewConfiguration$iv$iv2, companion3.getSetViewConfiguration());
            $composer2.enableReusing();
            skippableUpdate$iv$iv$iv4.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer2)), $composer2, Integer.valueOf(($changed$iv$iv$iv2 >> 3) & 112));
            $composer2.startReplaceableGroup(2058660585);
            Composer $composer$iv2 = $composer2;
            ViewConfiguration viewConfiguration2 = viewConfiguration$iv$iv2;
            int i6 = ($changed$iv$iv$iv2 >> 9) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            int i7 = ((0 >> 6) & 112) | 6;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Composer $composer3 = $composer2;
            Composer $composer4 = $composer$iv2;
            ComposerKt.sourceInformationMarkerStart($composer4, -876531090, "C32@1313L45,31@1269L161,35@1447L47,38@1595L35,36@1511L138:UnsupportedCard.kt#ypex4d");
            Function0 function05 = factory$iv$iv$iv3;
            LayoutDirection layoutDirection$iv$iv4 = layoutDirection$iv$iv3;
            Function3 function3 = skippableUpdate$iv$iv$iv4;
            Composer $composer$iv3 = $composer$iv2;
            Density density = density$iv$iv;
            MeasurePolicy measurePolicy = measurePolicy$iv;
            LayoutDirection layoutDirection = layoutDirection$iv$iv4;
            Arrangement.Vertical vertical2 = verticalArrangement$iv2;
            SecondaryButtonKt.SecondaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.continue_anyway, $composer4, 0), function0, false, $composer4, (i2 << 3) & 896, 9);
            SpacerKt.Spacer(PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m2350constructorimpl((float) LiveLiterals$UnsupportedCardKt.INSTANCE.m2923Int$$$this$call$getdp$$arg2$callpadding$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUnsupportedCard()), 0.0f, 11, (Object) null), $composer4, 0);
            Composer $composer5 = $composer4;
            Composer $composer6 = $composer3;
            Function0 function06 = function04;
            Function3 function32 = skippableUpdate$iv$iv$iv3;
            ErrorButtonKt.ErrorButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.close, $composer4, 0), function04, false, $composer5, (i2 << 6) & 896, 9);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer6.endReplaceableGroup();
            $composer6.endNode();
            $composer6.endReplaceableGroup();
            $composer6.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer6);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
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
