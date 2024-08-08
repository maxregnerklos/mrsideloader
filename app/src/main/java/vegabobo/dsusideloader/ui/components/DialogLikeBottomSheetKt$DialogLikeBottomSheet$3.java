package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
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
import kotlinx.coroutines.CoroutineScope;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;

/* compiled from: DialogLikeBottomSheet.kt */
public final class DialogLikeBottomSheetKt$DialogLikeBottomSheet$3 extends Lambda implements Function4 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $confirmText;
    public final /* synthetic */ Function3 $content;
    public final /* synthetic */ CoroutineScope $coroutineScope;
    public final /* synthetic */ Function0 $onClickCancel;
    public final /* synthetic */ Function0 $onClickConfirm;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLikeBottomSheetKt$DialogLikeBottomSheet$3(String str, int i, Function3 function3, int i2, String str2, String str3, CoroutineScope coroutineScope, Function0 function0, Function0 function02) {
        super(4);
        this.$text = str;
        this.$$dirty = i;
        this.$content = function3;
        this.$$dirty1 = i2;
        this.$cancelText = str2;
        this.$confirmText = str3;
        this.$coroutineScope = coroutineScope;
        this.$onClickCancel = function0;
        this.$onClickConfirm = function02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
        invoke((ColumnScope) p1, (Function1) p2, (Composer) p3, ((Number) p4).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope $this$CustomBottomSheet, Function1 it, Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        ColumnScope columnScope = $this$CustomBottomSheet;
        Function1 function1 = it;
        Composer composer = $composer;
        int i = $changed;
        Intrinsics.checkNotNullParameter(columnScope, "$this$CustomBottomSheet");
        Intrinsics.checkNotNullParameter(function1, "it");
        ComposerKt.sourceInformation(composer, "C54@1936L11,50@1780L191,56@1980L9,57@1998L546:DialogLikeBottomSheet.kt#bcxyhz");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(972084261, i, -1, "vegabobo.dsusideloader.ui.components.DialogLikeBottomSheet.<anonymous> (DialogLikeBottomSheet.kt:49)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
        int r16 = TextAlign.Companion.m2279getJustifye0LSkKk();
        Modifier.Companion companion2 = companion;
        TextKt.m754TextfLXpl1I(this.$text, fillMaxWidth$default, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m586getOnBackground0d7_KjU(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m2270boximpl(r16), 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, ((this.$$dirty >> 9) & 14) | 48, 0, 65016);
        Composer composer2 = $composer;
        this.$content.invoke(columnScope, composer2, Integer.valueOf(($changed & 14) | ((this.$$dirty1 << 3) & 112)));
        LiveLiterals$DialogLikeBottomSheetKt liveLiterals$DialogLikeBottomSheetKt = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE;
        Modifier modifier$iv = PaddingKt.m225paddingqDBjuR0$default(companion2, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$DialogLikeBottomSheetKt.m2985Int$$$this$call$getdp$$arg1$callpadding$arg0$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funDialogLikeBottomSheet()), 0.0f, 0.0f, 13, (Object) null);
        String str = this.$cancelText;
        int i2 = this.$$dirty;
        String str2 = this.$confirmText;
        CoroutineScope coroutineScope = this.$coroutineScope;
        Function0 function0 = this.$onClickCancel;
        Function0 function02 = this.$onClickConfirm;
        composer2.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer2.consume(this_$iv$iv$iv);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density$iv$iv = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd($composer);
        LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
        Alignment.Vertical verticalAlignment$iv2 = verticalAlignment$iv;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd($composer);
        ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
        Modifier modifier = modifier$iv;
        int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
        Function3 skippableUpdate$iv$iv$iv = materializerOf;
        Function0 factory$iv$iv$iv2 = constructor;
        Arrangement.Horizontal horizontalArrangement$iv2 = horizontalArrangement$iv;
        if (!($composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        $composer.startReusableNode();
        if ($composer.getInserting()) {
            factory$iv$iv$iv = factory$iv$iv$iv2;
            composer2.createNode(factory$iv$iv$iv);
        } else {
            factory$iv$iv$iv = factory$iv$iv$iv2;
            $composer.useNode();
        }
        $composer.disableReusing();
        Function0 factory$iv$iv$iv3 = factory$iv$iv$iv;
        Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
        Function0 function03 = function02;
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
        $composer.enableReusing();
        Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
        skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer2, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
        composer2.startReplaceableGroup(2058660585);
        int i3 = ($changed$iv$iv$iv >> 9) & 14;
        Composer $composer$iv = $composer;
        LayoutDirection layoutDirection = layoutDirection$iv$iv;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
        int i4 = ((0 >> 6) & 112) | 6;
        Density density = density$iv$iv;
        RowScope $this$invoke_u24lambda_u240 = RowScopeInstance.INSTANCE;
        Composer $composer2 = $composer$iv;
        ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
        ComposerKt.sourceInformationMarkerStart($composer2, -147383042, "C58@2058L38,59@2109L179,63@2301L41,64@2355L179:DialogLikeBottomSheet.kt#bcxyhz");
        MeasurePolicy measurePolicy = measurePolicy$iv;
        Alignment.Vertical vertical = verticalAlignment$iv2;
        Composer $composer$iv2 = $composer$iv;
        Arrangement.Horizontal horizontal = horizontalArrangement$iv2;
        Function0 function04 = factory$iv$iv$iv3;
        Function3 function3 = skippableUpdate$iv$iv$iv2;
        int i5 = $changed$iv$iv$iv;
        SpacerKt.Spacer(RowScope.weight$default($this$invoke_u24lambda_u240, companion2, liveLiterals$DialogLikeBottomSheetKt.m2983Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funDialogLikeBottomSheet(), false, 2, (Object) null), $composer2, 0);
        SecondaryButtonKt.SecondaryButton((Modifier) null, str, new DialogLikeBottomSheetKt$DialogLikeBottomSheet$3$1$1(coroutineScope, function1, function0), false, $composer2, (i2 >> 12) & 112, 9);
        SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(companion2, Dp.m2350constructorimpl((float) liveLiterals$DialogLikeBottomSheetKt.m2984Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer1$fun$anonymous$$arg3$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funDialogLikeBottomSheet())), $composer2, 0);
        PrimaryButtonKt.PrimaryButton((Modifier) null, str2, new DialogLikeBottomSheetKt$DialogLikeBottomSheet$3$1$2(coroutineScope, function1, function03), false, $composer2, (i2 >> 9) & 112, 9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
        $composer.endReplaceableGroup();
        $composer.endNode();
        $composer.endReplaceableGroup();
        $composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
