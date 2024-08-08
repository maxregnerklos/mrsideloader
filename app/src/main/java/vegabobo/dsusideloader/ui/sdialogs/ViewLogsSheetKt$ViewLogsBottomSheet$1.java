package vegabobo.dsusideloader.ui.sdialogs;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.cards.LogcatCardKt;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;

/* compiled from: ViewLogsSheet.kt */
public final class ViewLogsSheetKt$ViewLogsBottomSheet$1 extends Lambda implements Function4 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $logs;
    public final /* synthetic */ ManagedActivityResultLauncher $saveLogsResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLogsSheetKt$ViewLogsBottomSheet$1(String str, int i, ManagedActivityResultLauncher managedActivityResultLauncher) {
        super(4);
        this.$logs = str;
        this.$$dirty = i;
        this.$saveLogsResult = managedActivityResultLauncher;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
        invoke((ColumnScope) p1, (Function1) p2, (Composer) p3, ((Number) p4).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope $this$CustomBottomSheet, Function1 it, Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$CustomBottomSheet, "$this$CustomBottomSheet");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C41@1463L23,42@1495L628:ViewLogsSheet.kt#c2k7s9");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-454292390, $changed, -1, "vegabobo.dsusideloader.ui.sdialogs.ViewLogsBottomSheet.<anonymous> (ViewLogsSheet.kt:40)");
        } else {
            int i = $changed;
        }
        LogcatCardKt.LogcatCard(this.$logs, composer, this.$$dirty & 14);
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
        LiveLiterals$ViewLogsSheetKt liveLiterals$ViewLogsSheetKt = LiveLiterals$ViewLogsSheetKt.INSTANCE;
        Modifier modifier$iv = PaddingKt.m225paddingqDBjuR0$default(fillMaxWidth$default, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ViewLogsSheetKt.m3409Int$$$this$call$getdp$$arg1$callpadding$arg0$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funViewLogsBottomSheet()), 0.0f, 0.0f, 13, (Object) null);
        ManagedActivityResultLauncher managedActivityResultLauncher = this.$saveLogsResult;
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
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd($composer);
        ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
        Function0 factory$iv$iv$iv2 = companion2.getConstructor();
        Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
        Modifier modifier = modifier$iv;
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
        Function0 function0 = factory$iv$iv$iv;
        Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
        $composer.enableReusing();
        skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        Composer $composer$iv = $composer;
        ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
        LayoutDirection layoutDirection = layoutDirection$iv$iv;
        RowScope $this$invoke_u24lambda_u240 = RowScopeInstance.INSTANCE;
        Composer $composer2 = $composer$iv;
        int i2 = ((0 >> 6) & 112) | 6;
        int i3 = ($changed$iv$iv$iv >> 9) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 325398849, "C47@1626L38,49@1715L39,48@1677L436:ViewLogsSheet.kt#c2k7s9");
        Density density = density$iv$iv;
        float r10 = liveLiterals$ViewLogsSheetKt.m3408Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funViewLogsBottomSheet();
        MeasurePolicy measurePolicy = measurePolicy$iv;
        Alignment.Vertical vertical = verticalAlignment$iv;
        Arrangement.Horizontal horizontal = horizontalArrangement$iv;
        SpacerKt.Spacer(RowScope.weight$default($this$invoke_u24lambda_u240, companion, r10, false, 2, (Object) null), $composer2, 0);
        PrimaryButtonKt.PrimaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.save_logs, $composer2, 0), new ViewLogsSheetKt$ViewLogsBottomSheet$1$1$1(managedActivityResultLauncher), false, $composer2, 0, 9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer.endReplaceableGroup();
        $composer.endNode();
        $composer.endReplaceableGroup();
        $composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
