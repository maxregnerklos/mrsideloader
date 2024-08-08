package vegabobo.dsusideloader.ui.cards;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.FileSelectionBoxKt;
import vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState;

/* compiled from: ImageSizeCard.kt */
public final class ImageSizeCardKt$ImageSizeCard$2 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ Function1 $onValueChange;
    public final /* synthetic */ ImageSizeCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageSizeCardKt$ImageSizeCard$2(ImageSizeCardState imageSizeCardState, boolean z, Function1 function1, int i) {
        super(3);
        this.$uiState = imageSizeCardState;
        this.$isEnabled = z;
        this.$onValueChange = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C37@1378L1111:ImageSizeCard.kt#e34gdu");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-379977245, $changed, -1, "vegabobo.dsusideloader.ui.cards.ImageSizeCard.<anonymous> (ImageSizeCard.kt:36)");
            }
            boolean isSelected = this.$uiState.isSelected();
            EnterTransition expandVertically$default = EnterExitTransitionKt.expandVertically$default((FiniteAnimationSpec) null, (Alignment.Vertical) null, false, (Function1) null, 15, (Object) null);
            ExitTransition shrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default((FiniteAnimationSpec) null, (Alignment.Vertical) null, false, (Function1) null, 15, (Object) null);
            final boolean z = this.$isEnabled;
            final ImageSizeCardState imageSizeCardState = this.$uiState;
            final Function1 function1 = this.$onValueChange;
            final int i = this.$$dirty;
            AnimatedVisibilityKt.AnimatedVisibility(isSelected, (Modifier) null, expandVertically$default, shrinkVertically$default, (String) null, ComposableLambdaKt.composableLambda($composer, -2037778933, true, new Function3() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                    invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
                    Composer composer = $composer;
                    Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
                    ComposerKt.sourceInformation(composer, "C42@1543L936:ImageSizeCard.kt#e34gdu");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2037778933, $changed, -1, "vegabobo.dsusideloader.ui.cards.ImageSizeCard.<anonymous>.<anonymous> (ImageSizeCard.kt:41)");
                    } else {
                        int i = $changed;
                    }
                    boolean z = z;
                    ImageSizeCardState imageSizeCardState = imageSizeCardState;
                    Function1 function1 = function1;
                    int i2 = i;
                    composer.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                    Modifier modifier$iv = Modifier.Companion;
                    Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                    Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
                    MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
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
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0 factory$iv$iv$iv = companion.getConstructor();
                    int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
                    Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
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
                    Arrangement.Vertical verticalArrangement$iv2 = verticalArrangement$iv;
                    Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion.getSetMeasurePolicy());
                    Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion.getSetDensity());
                    Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion.getSetLayoutDirection());
                    Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion.getSetViewConfiguration());
                    $composer.enableReusing();
                    Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
                    skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
                    composer.startReplaceableGroup(2058660585);
                    Composer $composer$iv = $composer;
                    ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                    int $changed2 = ((0 >> 6) & 112) | 6;
                    ColumnScope $this$invoke_u24lambda_u240 = ColumnScopeInstance.INSTANCE;
                    Composer $composer2 = $composer$iv;
                    int i3 = $changed$iv$iv$iv;
                    int i4 = ($changed$iv$iv$iv >> 9) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1994174195, "C49@1910L45,43@1568L457,52@2042L423:ImageSizeCard.kt#e34gdu");
                    LiveLiterals$ImageSizeCardKt liveLiterals$ImageSizeCardKt = LiveLiterals$ImageSizeCardKt.INSTANCE;
                    Function3 function3 = skippableUpdate$iv$iv$iv2;
                    LayoutDirection layoutDirection = layoutDirection$iv$iv;
                    Density density = density$iv$iv;
                    Function0 function0 = factory$iv$iv$iv;
                    MeasurePolicy measurePolicy = measurePolicy$iv;
                    Alignment.Horizontal horizontal = horizontalAlignment$iv;
                    Modifier r8 = PaddingKt.m225paddingqDBjuR0$default(modifier$iv, 0.0f, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ImageSizeCardKt.m2847Int$$$this$call$getdp$$arg3$callpadding$valtmp0_modifier$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funImageSizeCard()), 7, (Object) null);
                    boolean z2 = true;
                    Composer $composer$iv2 = $composer$iv;
                    Arrangement.Vertical vertical = verticalArrangement$iv2;
                    Modifier modifier = r8;
                    FileSelectionBoxKt.FileSelectionBox(modifier, false, new KeyboardOptions(0, false, KeyboardType.Companion.m2156getNumberPjHm6EE(), 0, 11, (DefaultConstructorMarker) null), !z, liveLiterals$ImageSizeCardKt.m2845Boolean$arg4$callFileSelectionBox$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funImageSizeCard(), StringResources_androidKt.stringResource(C0001R$string.image_size_info, $composer2, 0), imageSizeCardState.getText(), (MutableInteractionSource) null, function1, $composer2, ((i2 << 15) & 234881024) | 384, 130);
                    if (imageSizeCardState.getText().length() != 0) {
                        z2 = false;
                    }
                    AnimatedVisibilityKt.AnimatedVisibility($this$invoke_u24lambda_u240, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ImageSizeCardKt.INSTANCE.m2841getLambda1$app_miniDebug(), $composer2, ($changed2 & 14) | 1572864, 30);
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
            }), $composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
