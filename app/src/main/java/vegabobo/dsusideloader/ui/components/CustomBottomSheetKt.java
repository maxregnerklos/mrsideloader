package vegabobo.dsusideloader.ui.components;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomBottomSheet.kt */
public abstract class CustomBottomSheetKt {
    public static final void CustomBottomSheet(Modifier modifier, String title, ImageVector icon, Function0 onDismiss, Function4 content, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        Function0 function0;
        Composer $composer2;
        Function0 onDismiss2;
        Modifier modifier3;
        Modifier modifier4;
        Object value$iv$iv$iv;
        Object obj;
        Object value$iv$iv;
        String str = title;
        ImageVector imageVector = icon;
        Function4 function4 = content;
        int i2 = $changed;
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(function4, "content");
        Composer $composer3 = $composer.startRestartGroup(-135586497);
        ComposerKt.sourceInformation($composer3, "C(CustomBottomSheet)P(2,4,1,3)41@1754L24,42@1800L164,53@2409L33,54@2473L33,55@2511L530,72@3047L93,99@4110L11,76@3146L996,105@4270L137:CustomBottomSheet.kt#bcxyhz");
        int $dirty = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed((Object) modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty |= 384;
        } else if ((i2 & 896) == 0) {
            $dirty |= $composer3.changed((Object) imageVector) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            function0 = onDismiss;
        } else if ((i2 & 7168) == 0) {
            function0 = onDismiss;
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        } else {
            function0 = onDismiss;
        }
        if ((i & 16) != 0) {
            $dirty |= 24576;
        } else if ((57344 & i2) == 0) {
            $dirty |= $composer3.changedInstance(function4) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if ((46811 & $dirty2) != 9362 || !$composer3.getSkipping()) {
            if (i3 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                onDismiss2 = CustomBottomSheetKt$CustomBottomSheet$1.INSTANCE;
            } else {
                onDismiss2 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135586497, $dirty2, -1, "vegabobo.dsusideloader.ui.components.CustomBottomSheet (CustomBottomSheet.kt:34)");
            }
            $composer3.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation($composer3, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            Composer composer$iv = $composer3;
            $composer3.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation($composer3, "CC(remember):Composables.kt#9igjgp");
            Composer $this$cache$iv$iv$iv = $composer3;
            Object it$iv$iv$iv = $this$cache$iv$iv$iv.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (it$iv$iv$iv == companion.getEmpty()) {
                value$iv$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer$iv));
                $this$cache$iv$iv$iv.updateRememberedValue(value$iv$iv$iv);
            } else {
                Composer composer = $this$cache$iv$iv$iv;
                value$iv$iv$iv = it$iv$iv$iv;
            }
            $composer3.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) value$iv$iv$iv).getCoroutineScope();
            $composer3.endReplaceableGroup();
            CoroutineScope coroutineScope2 = coroutineScope;
            ModalBottomSheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec) null, CustomBottomSheetKt$CustomBottomSheet$sheetState$1.INSTANCE, false, $composer3, 390, 10);
            $composer3.startReplaceableGroup(-492369756);
            String str2 = "CC(remember):Composables.kt#9igjgp";
            ComposerKt.sourceInformation($composer3, str2);
            Composer $this$cache$iv$iv = $composer3;
            Object value$iv$iv2 = $this$cache$iv$iv.rememberedValue();
            if (value$iv$iv2 == companion.getEmpty()) {
                Object obj2 = value$iv$iv2;
                value$iv$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(LiveLiterals$CustomBottomSheetKt.INSTANCE.m2967Boolean$arg0$callmutableStateOf$fun$anonymous$$arg0$callremember$valisFirst$funCustomBottomSheet()), (SnapshotMutationPolicy) null, 2, (Object) null);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv2);
            } else {
                Object it$iv$iv = value$iv$iv2;
            }
            $composer3.endReplaceableGroup();
            MutableState isFirst = (MutableState) value$iv$iv2;
            $composer3.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation($composer3, str2);
            Composer $this$cache$iv$iv2 = $composer3;
            Object it$iv$iv2 = $this$cache$iv$iv2.rememberedValue();
            if (it$iv$iv2 == companion.getEmpty()) {
                obj = null;
                value$iv$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(LiveLiterals$CustomBottomSheetKt.INSTANCE.m2968Boolean$arg0$callmutableStateOf$fun$anonymous$$arg0$callremember$valshouldCallOnDismiss$funCustomBottomSheet()), (SnapshotMutationPolicy) null, 2, (Object) null);
                $this$cache$iv$iv2.updateRememberedValue(value$iv$iv);
            } else {
                obj = null;
                value$iv$iv = it$iv$iv2;
            }
            $composer3.endReplaceableGroup();
            MutableState shouldCallOnDismiss = (MutableState) value$iv$iv;
            Unit unit = Unit.INSTANCE;
            CustomBottomSheetKt$CustomBottomSheet$2 customBottomSheetKt$CustomBottomSheet$2 = r2;
            Object obj3 = obj;
            CustomBottomSheetKt$CustomBottomSheet$2 customBottomSheetKt$CustomBottomSheet$22 = new CustomBottomSheetKt$CustomBottomSheet$2(sheetState, isFirst, shouldCallOnDismiss, onDismiss2, (Continuation) null);
            EffectsKt.LaunchedEffect((Object) unit, (Function2) customBottomSheetKt$CustomBottomSheet$2, $composer3, 70);
            BackHandlerKt.BackHandler(sheetState.isVisible(), new CustomBottomSheetKt$CustomBottomSheet$3(coroutineScope2, sheetState), $composer3, 0, 0);
            Modifier modifier5 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, obj3);
            LiveLiterals$CustomBottomSheetKt liveLiterals$CustomBottomSheetKt = LiveLiterals$CustomBottomSheetKt.INSTANCE;
            RoundedCornerShape r17 = RoundedCornerShapeKt.m337RoundedCornerShapea9UjIt4$default(Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2970Int$$$this$call$getdp$$arg0$callRoundedCornerShape$valtmp1_sheetShape$funCustomBottomSheet()), Dp.m2350constructorimpl((float) liveLiterals$CustomBottomSheetKt.m2972Int$$$this$call$getdp$$arg1$callRoundedCornerShape$valtmp1_sheetShape$funCustomBottomSheet()), 0.0f, 0.0f, 12, (Object) null);
            long r18 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).m580getBackground0d7_KjU();
            ModalBottomSheetState sheetState2 = sheetState;
            CustomBottomSheetKt$CustomBottomSheet$4 customBottomSheetKt$CustomBottomSheet$4 = r0;
            CustomBottomSheetKt$CustomBottomSheet$4 customBottomSheetKt$CustomBottomSheet$42 = new CustomBottomSheetKt$CustomBottomSheet$4(title, icon, $dirty2, content, sheetState2, shouldCallOnDismiss);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda($composer3, -2088738323, true, customBottomSheetKt$CustomBottomSheet$4);
            ComposableSingletons$CustomBottomSheetKt composableSingletons$CustomBottomSheetKt = ComposableSingletons$CustomBottomSheetKt.INSTANCE;
            CoroutineScope coroutineScope3 = coroutineScope2;
            ComposableLambda composableLambda2 = composableLambda;
            Modifier modifier6 = modifier4;
            int i5 = $dirty2;
            $composer2 = $composer3;
            ModalBottomSheetKt.m517ModalBottomSheetLayoutBzaUkTc(composableLambda2, modifier5, sheetState2, r17, 0.0f, r18, 0, 0, composableSingletons$CustomBottomSheetKt.m2930getLambda1$app_miniDebug(), $composer2, (ModalBottomSheetState.$stable << 6) | 100663302, 208);
            if (((Boolean) isFirst.getValue()).booleanValue()) {
                SurfaceKt.m537SurfaceFjzlyU(AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, obj3), liveLiterals$CustomBottomSheetKt.m2969Float$arg0$callalpha$arg0$callSurface$branch$if$funCustomBottomSheet()), (Shape) null, 0, 0, (BorderStroke) null, 0.0f, composableSingletons$CustomBottomSheetKt.m2931getLambda2$app_miniDebug(), $composer2, 1572864, 62);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            $composer3.skipToGroupEnd();
            modifier3 = modifier2;
            onDismiss2 = function0;
            int i6 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CustomBottomSheetKt$CustomBottomSheet$5(modifier3, title, icon, onDismiss2, content, $changed, i));
        }
    }
}
