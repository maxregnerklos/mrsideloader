package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ApplicationScreen.kt */
public final class ApplicationScreenKt$ApplicationScreen$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2 $bottomBar;
    public final /* synthetic */ boolean $columnContent;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $enableDefaultScrollBehavior;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    public final /* synthetic */ Modifier $scrollBehaviorModifier;
    public final /* synthetic */ Function3 $topBar;
    public final /* synthetic */ Arrangement.HorizontalOrVertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplicationScreenKt$ApplicationScreen$1(Modifier modifier, Function3 function3, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, Function2 function2, boolean z, boolean z2, Modifier modifier2, Arrangement.HorizontalOrVertical horizontalOrVertical, Function2 function22) {
        super(2);
        this.$scrollBehaviorModifier = modifier;
        this.$topBar = function3;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$dirty = i;
        this.$bottomBar = function2;
        this.$enableDefaultScrollBehavior = z;
        this.$columnContent = z2;
        this.$modifier = modifier2;
        this.$verticalArrangement = horizontalOrVertical;
        this.$content = function22;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C54@2308L1177:ApplicationScreen.kt#bcxyhz");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170159228, i, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen.<anonymous> (ApplicationScreen.kt:53)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(this.$scrollBehaviorModifier, 0.0f, 1, (Object) null);
            final Function3 function3 = this.$topBar;
            final TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
            final int i2 = this.$$dirty;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -513295808, true, new Function2() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                    invoke((Composer) p1, ((Number) p2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C57@2419L22:ApplicationScreen.kt#bcxyhz");
                    if (($changed & 11) != 2 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-513295808, $changed, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen.<anonymous>.<anonymous> (ApplicationScreen.kt:57)");
                        }
                        function3.invoke(topAppBarScrollBehavior, $composer, Integer.valueOf((i2 >> 9) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            });
            final Function2 function2 = this.$bottomBar;
            final int i3 = this.$$dirty;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, -630932577, true, new Function2() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                    invoke((Composer) p1, ((Number) p2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C58@2471L11:ApplicationScreen.kt#bcxyhz");
                    if (($changed & 11) != 2 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-630932577, $changed, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen.<anonymous>.<anonymous> (ApplicationScreen.kt:58)");
                        }
                        function2.invoke($composer, Integer.valueOf((i3 >> 15) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            });
            boolean z = this.$enableDefaultScrollBehavior;
            boolean z2 = this.$columnContent;
            Modifier modifier = this.$modifier;
            Arrangement.HorizontalOrVertical horizontalOrVertical = this.$verticalArrangement;
            final boolean z3 = z;
            final boolean z4 = z2;
            final Modifier modifier2 = modifier;
            final Arrangement.HorizontalOrVertical horizontalOrVertical2 = horizontalOrVertical;
            final int i4 = this.$$dirty;
            final Function2 function22 = this.$content;
            ScaffoldKt.m693ScaffoldTvnljyQ(fillMaxSize$default, composableLambda, composableLambda2, (Function2) null, (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.composableLambda(composer, 1787153557, true, new Function3() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                    invoke((PaddingValues) p1, (Composer) p2, ((Number) p3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues innerPadding, Composer $composer, int $changed) {
                    Function0 factory$iv$iv$iv;
                    final PaddingValues paddingValues = innerPadding;
                    Composer composer = $composer;
                    int i = $changed;
                    Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
                    ComposerKt.sourceInformation(composer, "C:ApplicationScreen.kt#bcxyhz");
                    int $dirty = $changed;
                    if ((i & 14) == 0) {
                        $dirty |= composer.changed((Object) paddingValues) ? 4 : 2;
                    }
                    if (($dirty & 91) != 18 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1787153557, i, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen.<anonymous>.<anonymous> (ApplicationScreen.kt:59)");
                        }
                        composer.startReplaceableGroup(-1335782908);
                        ComposerKt.sourceInformation(composer, "61@2640L21");
                        Modifier verticalScroll$default = z3 ? ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null) : Modifier.Companion;
                        $composer.endReplaceableGroup();
                        Modifier scrollModifier = verticalScroll$default;
                        if (z4) {
                            composer.startReplaceableGroup(-1335782779);
                            ComposerKt.sourceInformation(composer, "63@2734L427");
                            Modifier modifier$iv = PaddingKt.m225paddingqDBjuR0$default(modifier2, 0.0f, innerPadding.m232calculateTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, (Object) null).then(scrollModifier);
                            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVertical2;
                            Function2 function2 = function22;
                            int i2 = i4;
                            int $changed$iv = i2 & 112;
                            composer.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
                            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(horizontalOrVertical, horizontalAlignment$iv, composer, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
                            int $changed$iv$iv = ($changed$iv << 3) & 112;
                            composer.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
                            Arrangement.HorizontalOrVertical horizontalOrVertical2 = horizontalOrVertical;
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
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
                            Modifier modifier = modifier$iv;
                            int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
                            Function3 skippableUpdate$iv$iv$iv = materializerOf;
                            Function0 factory$iv$iv$iv2 = constructor;
                            int i3 = $changed$iv$iv;
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
                            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion.getSetMeasurePolicy());
                            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion.getSetDensity());
                            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion.getSetLayoutDirection());
                            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion.getSetViewConfiguration());
                            $composer.enableReusing();
                            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
                            composer.startReplaceableGroup(2058660585);
                            int i4 = ($changed$iv$iv$iv >> 9) & 14;
                            Composer $composer$iv = $composer;
                            int i5 = $changed$iv$iv$iv;
                            LayoutDirection layoutDirection = layoutDirection$iv$iv;
                            ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i6 = (($changed$iv >> 6) & 112) | 6;
                            Density density = density$iv$iv;
                            Composer $composer2 = $composer$iv;
                            ComposerKt.sourceInformationMarkerStart($composer2, -946660763, "C69@3031L9,70@3065L74:ApplicationScreen.kt#bcxyhz");
                            function2.invoke($composer2, Integer.valueOf((i2 >> 21) & 14));
                            SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(Modifier.Companion, innerPadding.m229calculateBottomPaddingD9Ej5fM()), $composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd($composer2);
                            ComposerKt.sourceInformationMarkerEnd($composer$iv);
                            $composer.endReplaceableGroup();
                            $composer.endNode();
                            $composer.endReplaceableGroup();
                            $composer.endReplaceableGroup();
                            $composer.endReplaceableGroup();
                            Modifier modifier2 = scrollModifier;
                        } else {
                            composer.startReplaceableGroup(-1335782306);
                            ComposerKt.sourceInformation(composer, "73@3207L235");
                            Modifier r2 = PaddingKt.m225paddingqDBjuR0$default(modifier2, 0.0f, innerPadding.m232calculateTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, (Object) null);
                            final Function2 function22 = function22;
                            final int i7 = i4;
                            Modifier modifier3 = scrollModifier;
                            SurfaceKt.m710SurfaceT9BRK9s(r2, (Shape) null, 0, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.composableLambda(composer, -225857388, true, new Function2() {
                                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                                    invoke((Composer) p1, ((Number) p2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer $composer, int $changed) {
                                    ComposerKt.sourceInformation($composer, "C74@3312L9,75@3346L74:ApplicationScreen.kt#bcxyhz");
                                    if (($changed & 11) != 2 || !$composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-225857388, $changed, -1, "vegabobo.dsusideloader.ui.components.ApplicationScreen.<anonymous>.<anonymous>.<anonymous> (ApplicationScreen.kt:73)");
                                        }
                                        function22.invoke($composer, Integer.valueOf((i7 >> 21) & 14));
                                        SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(Modifier.Companion, paddingValues.m229calculateBottomPaddingD9Ej5fM()), $composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    $composer.skipToGroupEnd();
                                }
                            }), $composer, 12582912, 126);
                            $composer.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            }), $composer, 805306800, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
