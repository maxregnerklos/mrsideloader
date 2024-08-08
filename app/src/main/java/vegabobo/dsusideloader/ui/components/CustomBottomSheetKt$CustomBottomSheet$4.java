package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$4 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function4 $content;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ ModalBottomSheetState $sheetState;
    public final /* synthetic */ MutableState $shouldCallOnDismiss;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$4(String str, ImageVector imageVector, int i, Function4 function4, ModalBottomSheetState modalBottomSheetState, MutableState mutableState) {
        super(3);
        this.$title = str;
        this.$icon = imageVector;
        this.$$dirty = i;
        this.$content = function4;
        this.$sheetState = modalBottomSheetState;
        this.$shouldCallOnDismiss = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope $this$ModalBottomSheetLayout, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        ComposerKt.sourceInformation($composer, "C79@3240L695:CustomBottomSheet.kt#bcxyhz");
        int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty |= $composer.changed((Object) $this$ModalBottomSheetLayout) ? 4 : 2;
        }
        if (($dirty & 91) != 18 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088738323, $changed, -1, "vegabobo.dsusideloader.ui.components.CustomBottomSheet.<anonymous> (CustomBottomSheet.kt:78)");
            }
            String str = this.$title;
            ImageVector imageVector = this.$icon;
            final Function4 function4 = this.$content;
            final int i = this.$$dirty;
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            final MutableState mutableState = this.$shouldCallOnDismiss;
            final ColumnScope columnScope = $this$ModalBottomSheetLayout;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda($composer, 187894625, true, new Function2() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                    invoke((Composer) p1, ((Number) p2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    Function0 factory$iv$iv$iv;
                    Composer composer = $composer;
                    int i = $changed;
                    ComposerKt.sourceInformation(composer, "C84@3399L10,86@3485L17,87@3519L402:CustomBottomSheet.kt#bcxyhz");
                    if ((i & 11) != 2 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(187894625, i, -1, "vegabobo.dsusideloader.ui.components.CustomBottomSheet.<anonymous>.<anonymous> (CustomBottomSheet.kt:82)");
                        }
                        PaddingValues insets = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m260onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composer, 8), WindowInsetsSides.Companion.m275getVerticalJoeWqyM()), composer, 0);
                        ColumnScope columnScope = columnScope;
                        Modifier.Companion companion = Modifier.Companion;
                        Alignment.Companion companion2 = Alignment.Companion;
                        Modifier align = columnScope.align(companion, companion2.getEnd());
                        LiveLiterals$CustomBottomSheetKt liveLiterals$CustomBottomSheetKt = LiveLiterals$CustomBottomSheetKt.INSTANCE;
                        float r7 = Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2973Int$$$this$call$getdp$$valtmp1_end$arg0$callColumn$fun$anonymous$$arg2$callBottomSheetContent$fun$anonymous$$arg0$callModalBottomSheetLayout$funCustomBottomSheet());
                        Modifier modifier$iv = PaddingKt.m224paddingqDBjuR0(align, Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2974Int$$$this$call$getdp$$valtmp2_start$arg0$callColumn$fun$anonymous$$arg2$callBottomSheetContent$fun$anonymous$$arg0$callModalBottomSheetLayout$funCustomBottomSheet()), Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2975Int$$$this$call$getdp$$valtmp4_top$arg0$callColumn$fun$anonymous$$arg2$callBottomSheetContent$fun$anonymous$$arg0$callModalBottomSheetLayout$funCustomBottomSheet()), r7, Dp.m2350constructorimpl(insets.m229calculateBottomPaddingD9Ej5fM() + Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2971Int$$$this$call$getdp$$arg0$callplus$valtmp3_bottom$arg0$callColumn$fun$anonymous$$arg2$callBottomSheetContent$fun$anonymous$$arg0$callModalBottomSheetLayout$funCustomBottomSheet())));
                        Function4 function4 = function4;
                        int i2 = i;
                        ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                        MutableState mutableState = mutableState;
                        composer.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                        Alignment.Horizontal horizontalAlignment$iv = companion2.getStart();
                        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        composer.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
                        PaddingValues paddingValues = insets;
                        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer.consume(this_$iv$iv$iv);
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
                        int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
                        Function3 skippableUpdate$iv$iv$iv = materializerOf;
                        Function0 factory$iv$iv$iv2 = constructor;
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
                        Arrangement.Vertical vertical = verticalArrangement$iv;
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
                        $composer.enableReusing();
                        skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
                        composer.startReplaceableGroup(2058660585);
                        int i3 = ($changed$iv$iv$iv >> 9) & 14;
                        Composer $composer$iv = $composer;
                        Density density = density$iv$iv;
                        ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                        ColumnScope $this$invoke_u24lambda_u240 = ColumnScopeInstance.INSTANCE;
                        LayoutDirection layoutDirection = layoutDirection$iv$iv;
                        ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
                        int i4 = $changed$iv$iv$iv;
                        Composer $composer2 = $composer$iv;
                        ComposerKt.sourceInformationMarkerStart($composer2, 443749893, "C93@3838L65:CustomBottomSheet.kt#bcxyhz");
                        function4.invoke($this$invoke_u24lambda_u240, new CustomBottomSheetKt$CustomBottomSheet$4$1$1$1(modalBottomSheetState, mutableState, (Continuation) null), $composer2, Integer.valueOf(((((0 >> 6) & 112) | 6) & 14) | 64 | ((i2 >> 6) & 896)));
                        ComposerKt.sourceInformationMarkerEnd($composer2);
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
            });
            int i2 = this.$$dirty;
            BottomSheetContentKt.BottomSheetContent(str, imageVector, composableLambda, $composer, ((i2 >> 3) & 112) | ((i2 >> 3) & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
