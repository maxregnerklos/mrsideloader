package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetContent.kt */
public abstract class BottomSheetContentKt {
    public static final void BottomSheetContent(String title, ImageVector icon, Function2 content, Composer $composer, int $changed) {
        Composer $composer2;
        Function2 function2;
        Function0 factory$iv$iv$iv;
        String str = title;
        ImageVector imageVector = icon;
        Function2 function22 = content;
        int i = $changed;
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(function22, "content");
        Composer $composer3 = $composer.startRestartGroup(-1516766942);
        ComposerKt.sourceInformation($composer3, "C(BottomSheetContent)P(2,1)29@1077L1215:BottomSheetContent.kt#bcxyhz");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 4 : 2;
        }
        if ((i & 112) == 0) {
            $dirty |= $composer3.changed((Object) imageVector) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            $dirty |= $composer3.changedInstance(function22) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 731) != 146 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1516766942, $dirty2, -1, "vegabobo.dsusideloader.ui.components.BottomSheetContent (BottomSheetContent.kt:24)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null);
            LiveLiterals$BottomSheetContentKt liveLiterals$BottomSheetContentKt = LiveLiterals$BottomSheetContentKt.INSTANCE;
            Modifier modifier$iv = ClipKt.clip(PaddingKt.m221padding3ABfNKs(fillMaxWidth$default, Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2944Int$$$this$call$getdp$$arg0$callpadding$$$this$callclip$arg0$callColumn$funBottomSheetContent())), RoundedCornerShapeKt.m337RoundedCornerShapea9UjIt4$default(Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2940Int$$$this$call$getdp$$arg0$callRoundedCornerShape$arg0$callclip$arg0$callColumn$funBottomSheetContent()), Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2947Int$$$this$call$getdp$$arg1$callRoundedCornerShape$arg0$callclip$arg0$callColumn$funBottomSheetContent()), 0.0f, 0.0f, 12, (Object) null));
            $composer3.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation($composer3, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal horizontalAlignment$iv = companion2.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density$iv$iv = (Density) consume;
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 factory$iv$iv$iv2 = companion3.getConstructor();
            Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
            int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer3.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer3.useNode();
            }
            $composer3.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer3);
            Arrangement.Vertical verticalArrangement$iv2 = verticalArrangement$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
            $composer3.enableReusing();
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer3)), $composer3, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            $composer3.startReplaceableGroup(2058660585);
            int i2 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer3;
            Density density$iv$iv2 = density$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            int i3 = ((0 >> 6) & 112) | 6;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer $composer4 = $composer$iv;
            Composer composer = $composer4;
            Composer $composer$iv2 = $composer$iv;
            MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
            ComposerKt.sourceInformationMarkerStart($composer4, -1966169569, "C36@1301L11,35@1258L344,46@1611L41,48@1700L11,47@1661L297,57@2007L11,59@2093L10,56@1967L251,63@2227L41,64@2277L9:BottomSheetContent.kt#bcxyhz");
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            SurfaceKt.m537SurfaceFjzlyU(columnScopeInstance.align(SizeKt.fillMaxWidth$default(SizeKt.m250width3ABfNKs(SizeKt.m243height3ABfNKs(AlphaKt.alpha(companion, liveLiterals$BottomSheetContentKt.m2939Float$arg0$callalpha$$$this$callheight$$$this$callwidth$$$this$callfillMaxWidth$$$this$callalign$valtmp2_modifier$fun$anonymous$$arg3$callColumn$funBottomSheetContent()), Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2941Int$$$this$call$getdp$$arg0$callheight$$$this$callwidth$$$this$callfillMaxWidth$$$this$callalign$valtmp2_modifier$fun$anonymous$$arg3$callColumn$funBottomSheetContent())), Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2946Int$$$this$call$getdp$$arg0$callwidth$$$this$callfillMaxWidth$$$this$callalign$valtmp2_modifier$fun$anonymous$$arg3$callColumn$funBottomSheetContent())), 0.0f, 1, (Object) null), companion2.getCenterHorizontally()), RoundedCornerShapeKt.getCircleShape(), materialTheme.getColorScheme($composer4, i4).m586getOnBackground0d7_KjU(), 0, (BorderStroke) null, 0.0f, ComposableSingletons$BottomSheetContentKt.INSTANCE.m2929getLambda1$app_miniDebug(), $composer4, 1572864, 56);
            SpacerKt.Spacer(SizeKt.m243height3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2942Int$$$this$call$getdp$$arg0$callheight$arg0$callSpacer$fun$anonymous$$arg3$callColumn$funBottomSheetContent())), $composer4, 0);
            Function0 factory$iv$iv$iv3 = factory$iv$iv$iv;
            Density density = density$iv$iv2;
            Composer $composer5 = $composer4;
            MeasurePolicy measurePolicy = measurePolicy$iv2;
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            Arrangement.Vertical vertical = verticalArrangement$iv2;
            Alignment.Horizontal horizontal = horizontalAlignment$iv;
            Function3 function3 = skippableUpdate$iv$iv$iv2;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            int i5 = i4;
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            IconKt.m514Iconww6aTOc(icon, liveLiterals$BottomSheetContentKt.m2948String$arg1$callIcon$fun$anonymous$$arg3$callColumn$funBottomSheetContent(), PaddingKt.m221padding3ABfNKs(columnScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null), companion2.getCenterHorizontally()), Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2945Int$$$this$call$getdp$$arg0$callpadding$valtmp4_modifier$fun$anonymous$$arg3$callColumn$funBottomSheetContent())), materialTheme.getColorScheme($composer4, i4).m586getOnBackground0d7_KjU(), $composer5, ($dirty2 >> 3) & 14, 0);
            Composer $composer6 = $composer5;
            long r2 = materialTheme.getColorScheme($composer6, i5).m586getOnBackground0d7_KjU();
            TextStyle headlineSmall = materialTheme.getTypography($composer6, i5).getHeadlineSmall();
            Function0 function0 = factory$iv$iv$iv3;
            int $dirty3 = $dirty2;
            $composer2 = $composer3;
            Function2 function23 = function22;
            TextKt.m545Text4IGK_g(title, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, (Object) null), r2, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m2270boximpl(TextAlign.Companion.m2277getCentere0LSkKk()), 0, 0, false, 0, 0, (Function1) null, headlineSmall, composer, ($dirty3 & 14) | 48, 0, 65016);
            Composer $composer7 = $composer6;
            SpacerKt.Spacer(SizeKt.m243height3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$BottomSheetContentKt.m2943Int$$$this$call$getdp$$arg0$callheight$arg0$callSpacer1$fun$anonymous$$arg3$callColumn$funBottomSheetContent())), $composer7, 0);
            function2 = content;
            function2.invoke($composer7, Integer.valueOf(($dirty3 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd($composer7);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer2.endReplaceableGroup();
            $composer2.endNode();
            $composer2.endReplaceableGroup();
            $composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i6 = $dirty2;
            $composer2 = $composer3;
            function2 = function22;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            String str2 = title;
            ImageVector imageVector2 = icon;
            int i7 = $changed;
            return;
        }
        endRestartGroup.updateScope(new BottomSheetContentKt$BottomSheetContent$2(title, icon, function2, $changed));
    }
}
