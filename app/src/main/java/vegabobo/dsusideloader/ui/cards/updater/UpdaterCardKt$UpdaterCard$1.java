package vegabobo.dsusideloader.ui.cards.updater;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.PreferenceItemKt;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;
import vegabobo.dsusideloader.ui.components.buttons.SecondaryButtonKt;
import vegabobo.dsusideloader.ui.screen.about.UpdateStatus;
import vegabobo.dsusideloader.ui.screen.about.UpdaterCardState;

/* compiled from: UpdaterCard.kt */
public final class UpdaterCardKt$UpdaterCard$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $isUpdaterAvailable;
    public final /* synthetic */ Function0 $onClickCheckUpdates;
    public final /* synthetic */ Function0 $onClickDownloadUpdate;
    public final /* synthetic */ Function0 $onClickImage;
    public final /* synthetic */ Function0 $onClickViewChangelog;
    public final /* synthetic */ UpdaterCardState $uiState;

    /* compiled from: UpdaterCard.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateStatus.values().length];
            try {
                iArr[UpdateStatus.NO_UPDATE_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[UpdateStatus.UPDATE_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdaterCardKt$UpdaterCard$1(boolean z, UpdaterCardState updaterCardState, Function0 function0, int i, Function0 function02, Function0 function03, Function0 function04) {
        super(2);
        this.$isUpdaterAvailable = z;
        this.$uiState = updaterCardState;
        this.$onClickCheckUpdates = function0;
        this.$$dirty = i;
        this.$onClickImage = function02;
        this.$onClickViewChangelog = function03;
        this.$onClickDownloadUpdate = function04;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        String str;
        Object value$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C62@2489L2341,120@4839L41:UpdaterCard.kt#ogv8z");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942992799, i, -1, "vegabobo.dsusideloader.ui.cards.updater.UpdaterCard.<anonymous> (UpdaterCard.kt:61)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getCenterHorizontally();
            UpdaterCardState updaterCardState = this.$uiState;
            Function0 function0 = this.$onClickImage;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(center, horizontalAlignment$iv, composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            Arrangement.HorizontalOrVertical horizontalOrVertical = center;
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
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
            Modifier modifier = modifier$iv;
            int $changed$iv$iv$iv = ((((438 << 3) & 112) << 9) & 7168) | 6;
            Function0 factory$iv$iv$iv2 = constructor;
            Function3 skippableUpdate$iv$iv$iv = materializerOf;
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
            Function0 function02 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
            $composer.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            Composer $composer$iv = $composer;
            Density density = density$iv$iv;
            int i3 = $changed$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            Composer $composer2 = $composer$iv;
            Composer composer2 = $composer2;
            Composer composer3 = $composer2;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((438 >> 6) & 112) | 6;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            Composer $composer3 = $composer2;
            ComposerKt.sourceInformationMarkerStart($composer3, 1533536154, "C72@2866L11,68@2704L1516,104@4262L38,106@4374L10,103@4233L227,110@4502L173,109@4473L347:UpdaterCard.kt#ogv8z");
            LiveLiterals$UpdaterCardKt liveLiterals$UpdaterCardKt = LiveLiterals$UpdaterCardKt.INSTANCE;
            int i5 = ($changed$iv$iv$iv >> 9) & 14;
            Modifier r26 = PaddingKt.m225paddingqDBjuR0$default(PaddingKt.m221padding3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2908Int$$$this$call$getdp$$arg0$callpadding$$$this$callpadding$arg0$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard())), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2913Int$$$this$call$getdp$$arg1$callpadding$arg0$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()), 0.0f, 0.0f, 13, (Object) null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            SurfaceKt.m710SurfaceT9BRK9s(r26, (Shape) null, materialTheme.getColorScheme($composer3, i6).m583getInverseOnSurface0d7_KjU(), 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.composableLambda($composer3, -171530638, true, new UpdaterCardKt$UpdaterCard$1$1$1(updaterCardState, function0, i2)), $composer3, 12582912, 122);
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.app_name, $composer3, 0);
            long sp = TextUnitKt.getSp(liveLiterals$UpdaterCardKt.m2916Int$$$this$call$getsp$$valtmp1_fontSize$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard());
            TextStyle headlineMedium = materialTheme.getTypography($composer3, i6).getHeadlineMedium();
            TextAlign.Companion companion3 = TextAlign.Companion;
            TextKt.m754TextfLXpl1I(stringResource, (Modifier) null, 0, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m2270boximpl(companion3.m2277getCentere0LSkKk()), 0, 0, false, 0, (Function1) null, headlineMedium, composer3, 0, 0, 32246);
            TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.version_info, new Object[]{"2.03", 8}, $composer3, 64), AlphaKt.alpha(companion, liveLiterals$UpdaterCardKt.m2903Float$arg0$callalpha$valtmp7_modifier$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()), 0, TextUnitKt.getSp(liveLiterals$UpdaterCardKt.m2917Int$$$this$call$getsp$$valtmp5_fontSize$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m2270boximpl(companion3.m2277getCentere0LSkKk()), 0, 0, false, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 65012);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer.endReplaceableGroup();
            $composer.endNode();
            $composer.endReplaceableGroup();
            $composer.endReplaceableGroup();
            SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2910Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard())), composer, 0);
            if (this.$isUpdaterAvailable) {
                composer.startReplaceableGroup(1576747930);
                ComposerKt.sourceInformation(composer, "123@4967L49,135@5526L25,122@4927L639,137@5579L760");
                String stringResource2 = StringResources_androidKt.stringResource(C0001R$string.check_updates_title, composer, 0);
                switch (WhenMappings.$EnumSwitchMapping$0[this.$uiState.getUpdateStatus().ordinal()]) {
                    case 1:
                        composer.startReplaceableGroup(1576748187);
                        ComposerKt.sourceInformation(composer, "127@5170L56");
                        str = StringResources_androidKt.stringResource(C0001R$string.check_updates_text_updated, composer, 0);
                        $composer.endReplaceableGroup();
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                        composer.startReplaceableGroup(1576748318);
                        ComposerKt.sourceInformation(composer, "130@5301L72");
                        str = StringResources_androidKt.stringResource(C0001R$string.check_updates_text_found, new Object[]{this.$uiState.getUpdateVersion()}, composer, 64);
                        $composer.endReplaceableGroup();
                        break;
                    default:
                        composer.startReplaceableGroup(1576748444);
                        ComposerKt.sourceInformation(composer, "133@5427L53");
                        str = StringResources_androidKt.stringResource(C0001R$string.check_updates_text_idle, composer, 0);
                        $composer.endReplaceableGroup();
                        break;
                }
                Object key1$iv = this.$onClickCheckUpdates;
                Function0 function03 = this.$onClickCheckUpdates;
                int i7 = (this.$$dirty >> 9) & 14;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean invalid$iv$iv = composer.changed(key1$iv);
                Composer $this$cache$iv$iv = $composer;
                Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                    value$iv$iv = new UpdaterCardKt$UpdaterCard$1$2$1(function03);
                    $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
                } else {
                    value$iv$iv = it$iv$iv;
                }
                $composer.endReplaceableGroup();
                PreferenceItemKt.PreferenceItem(stringResource2, str, (ImageVector) null, (Function1) value$iv$iv, false, false, false, $composer, 0, 116);
                boolean access$UpdaterCard$isUpdateFound = UpdaterCardKt.UpdaterCard$isUpdateFound(this.$uiState);
                final Function0 function04 = this.$onClickViewChangelog;
                final int i8 = this.$$dirty;
                final Function0 function05 = this.$onClickDownloadUpdate;
                AnimatedVisibilityKt.AnimatedVisibility(access$UpdaterCard$isUpdateFound, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -891807980, true, new Function3() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                        invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
                        Function0 function0;
                        Object value$iv$iv;
                        Composer composer = $composer;
                        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
                        ComposerKt.sourceInformation(composer, "C138@5643L682:UpdaterCard.kt#ogv8z");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-891807980, $changed, -1, "vegabobo.dsusideloader.ui.cards.updater.UpdaterCard.<anonymous>.<anonymous> (UpdaterCard.kt:137)");
                        } else {
                            int i = $changed;
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        LiveLiterals$UpdaterCardKt liveLiterals$UpdaterCardKt = LiveLiterals$UpdaterCardKt.INSTANCE;
                        Modifier modifier$iv = PaddingKt.m225paddingqDBjuR0$default(PaddingKt.m221padding3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2907Int$$$this$call$getdp$$arg0$callpadding$$$this$callpadding$arg0$callRow$fun$anonymous$$arg5$callAnimatedVisibility$branch$if$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard())), 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2914Int$$$this$call$getdp$$arg2$callpadding$arg0$callRow$fun$anonymous$$arg5$callAnimatedVisibility$branch$if$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()), 0.0f, 11, (Object) null);
                        Function0 function02 = function04;
                        int i2 = i8;
                        Function0 function03 = function05;
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
                        Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
                        Modifier modifier = modifier$iv;
                        int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
                        Function3 skippableUpdate$iv$iv$iv = materializerOf;
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
                        Function0 function04 = factory$iv$iv$iv;
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
                        Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
                        $composer.enableReusing();
                        Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
                        skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
                        composer.startReplaceableGroup(2058660585);
                        Composer $composer$iv = $composer;
                        ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
                        ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                        Function3 function3 = skippableUpdate$iv$iv$iv2;
                        RowScope $this$invoke_u24lambda_u242 = RowScopeInstance.INSTANCE;
                        Composer $composer2 = $composer$iv;
                        int i3 = ((0 >> 6) & 112) | 6;
                        int i4 = ($changed$iv$iv$iv >> 9) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, -1617316121, "C143@5820L38,145@5927L39,146@6002L26,144@5879L237,150@6183L38,151@6257L27,149@6137L170:UpdaterCard.kt#ogv8z");
                        LayoutDirection layoutDirection = layoutDirection$iv$iv;
                        Density density = density$iv$iv;
                        MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
                        Alignment.Vertical vertical = verticalAlignment$iv;
                        Arrangement.Horizontal horizontal = horizontalArrangement$iv;
                        SpacerKt.Spacer(RowScope.weight$default($this$invoke_u24lambda_u242, companion, liveLiterals$UpdaterCardKt.m2904Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg5$callAnimatedVisibility$branch$if$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard(), false, 2, (Object) null), $composer2, 0);
                        String stringResource = StringResources_androidKt.stringResource(C0001R$string.changelog, $composer2, 0);
                        Function0 function05 = function03;
                        int i5 = i2;
                        Modifier r26 = PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2915Int$$$this$call$getdp$$arg2$callpadding$valtmp1_modifier$fun$anonymous$$arg3$callRow$fun$anonymous$$arg5$callAnimatedVisibility$branch$if$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()), 0.0f, 11, (Object) null);
                        int i6 = (i5 >> 15) & 14;
                        $composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation($composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean invalid$iv$iv = $composer2.changed((Object) function02);
                        Composer $this$cache$iv$iv = $composer2;
                        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                        if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                            MeasurePolicy measurePolicy = measurePolicy$iv2;
                            function0 = new UpdaterCardKt$UpdaterCard$1$3$1$1$1(function02);
                            $this$cache$iv$iv.updateRememberedValue(function0);
                        } else {
                            MeasurePolicy measurePolicy2 = measurePolicy$iv2;
                            function0 = it$iv$iv;
                        }
                        $composer2.endReplaceableGroup();
                        SecondaryButtonKt.SecondaryButton(r26, stringResource, function0, false, $composer2, 0, 8);
                        String stringResource2 = StringResources_androidKt.stringResource(C0001R$string.download, $composer2, 0);
                        int i7 = (i5 >> 12) & 14;
                        $composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation($composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean invalid$iv$iv2 = $composer2.changed((Object) function05);
                        Composer $this$cache$iv$iv2 = $composer2;
                        Object it$iv$iv2 = $this$cache$iv$iv2.rememberedValue();
                        if (invalid$iv$iv2 || it$iv$iv2 == Composer.Companion.getEmpty()) {
                            value$iv$iv = new UpdaterCardKt$UpdaterCard$1$3$1$2$1(function05);
                            $this$cache$iv$iv2.updateRememberedValue(value$iv$iv);
                        } else {
                            value$iv$iv = it$iv$iv2;
                        }
                        $composer2.endReplaceableGroup();
                        PrimaryButtonKt.PrimaryButton((Modifier) null, stringResource2, (Function0) value$iv$iv, false, $composer2, 0, 9);
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
                }), $composer, 196608, 30);
                $composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1576749372);
                ComposerKt.sourceInformation(composer, "156@6369L41");
                SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$UpdaterCardKt.m2909Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer$else$if$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard())), composer, 0);
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
}
