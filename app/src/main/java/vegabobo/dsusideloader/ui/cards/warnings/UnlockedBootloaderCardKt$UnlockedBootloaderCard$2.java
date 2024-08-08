package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;

/* compiled from: UnlockedBootloaderCard.kt */
public final class UnlockedBootloaderCardKt$UnlockedBootloaderCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function0 $onClickClose;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnlockedBootloaderCardKt$UnlockedBootloaderCard$2(Function0 function0, int i) {
        super(2);
        this.$onClickClose = function0;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C22@809L284:UnlockedBootloaderCard.kt#ypex4d");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783197847, i, -1, "vegabobo.dsusideloader.ui.cards.warnings.UnlockedBootloaderCard.<anonymous> (UnlockedBootloaderCard.kt:21)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal horizontalAlignment$iv = companion2.getEnd();
            Function0 function0 = this.$onClickClose;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = arrangement.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density density$iv$iv = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd($composer);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            Alignment.Horizontal horizontal = horizontalAlignment$iv;
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
            Arrangement.Vertical verticalArrangement$iv2 = verticalArrangement$iv;
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
            Function0 factory$iv$iv$iv3 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
            $composer.enableReusing();
            Density density$iv$iv2 = density$iv$iv;
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            int i3 = ($changed$iv$iv$iv >> 9) & 14;
            Function3 skippableUpdate$iv$iv$iv3 = skippableUpdate$iv$iv$iv2;
            Composer $composer$iv = $composer;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            int i4 = ((390 >> 6) & 112) | 6;
            Composer $composer2 = $composer$iv;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 790765846, "C23@903L180:UnlockedBootloaderCard.kt#ypex4d");
            $composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Modifier.Companion companion4 = companion;
            Arrangement.Horizontal horizontalArrangement$iv = arrangement.getStart();
            Alignment.Vertical verticalAlignment$iv = companion2.getTop();
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            Arrangement.Horizontal horizontal2 = horizontalArrangement$iv;
            $composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            int i5 = $changed$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = $composer2.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Density density$iv$iv3 = (Density) consume4;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            Alignment.Vertical vertical = verticalAlignment$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = $composer2.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LayoutDirection layoutDirection$iv$iv2 = (LayoutDirection) consume5;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = $composer2.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ViewConfiguration viewConfiguration$iv$iv2 = (ViewConfiguration) consume6;
            Function0 factory$iv$iv$iv4 = companion3.getConstructor();
            Function3 skippableUpdate$iv$iv$iv4 = LayoutKt.materializerOf(companion4);
            int $changed$iv$iv$iv2 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(factory$iv$iv$iv4);
            } else {
                $composer2.useNode();
            }
            $composer2.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv2 = Updater.m972constructorimpl($composer2);
            Modifier.Companion companion5 = companion4;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, measurePolicy$iv2, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, density$iv$iv3, companion3.getSetDensity());
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
            ComposerKt.sourceInformationMarkerStart($composer4, 1476805837, "C25@969L37,24@925L144:UnlockedBootloaderCard.kt#ypex4d");
            MeasurePolicy measurePolicy = measurePolicy$iv2;
            Density density = density$iv$iv2;
            Function3 function3 = skippableUpdate$iv$iv$iv3;
            MeasurePolicy measurePolicy2 = measurePolicy$iv;
            Composer $composer5 = $composer3;
            Arrangement.Vertical vertical2 = verticalArrangement$iv2;
            Function0 function02 = factory$iv$iv$iv3;
            Arrangement.Vertical vertical3 = vertical2;
            SecondaryButtonKt.SecondaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.proceed, $composer4, 0), function0, false, $composer4, (i2 << 6) & 896, 9);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer5.endReplaceableGroup();
            $composer5.endNode();
            $composer5.endReplaceableGroup();
            $composer5.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer5);
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
