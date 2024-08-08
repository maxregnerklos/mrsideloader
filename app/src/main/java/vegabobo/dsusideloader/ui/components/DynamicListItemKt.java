package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicListItem.kt */
public abstract class DynamicListItemKt {
    public static final void DynamicListItem(int listLength, int currentValue, Function2 content, Composer $composer, int $changed) {
        Composer $composer2;
        RoundedCornerShape shape;
        int i = listLength;
        int i2 = currentValue;
        Function2 function2 = content;
        int i3 = $changed;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer $composer3 = $composer.startRestartGroup(-1554250677);
        ComposerKt.sourceInformation($composer3, "C(DynamicListItem)P(2,1)17@539L104:DynamicListItem.kt#bcxyhz");
        int $dirty = $changed;
        if ((i3 & 14) == 0) {
            $dirty |= $composer3.changed(i) ? 4 : 2;
        }
        if ((i3 & 112) == 0) {
            $dirty |= $composer3.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 731) != 146 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554250677, $dirty2, -1, "vegabobo.dsusideloader.ui.components.DynamicListItem (DynamicListItem.kt:7)");
            }
            LiveLiterals$DynamicListItemKt liveLiterals$DynamicListItemKt = LiveLiterals$DynamicListItemKt.INSTANCE;
            if (i2 == liveLiterals$DynamicListItemKt.m2996Int$arg1$callEQEQ$cond$when$valshape$funDynamicListItem()) {
                shape = RoundedCornerShapeKt.m337RoundedCornerShapea9UjIt4$default(Dp.m2350constructorimpl((float) liveLiterals$DynamicListItemKt.m2991Int$$$this$call$getdp$$arg0$callRoundedCornerShape$branch$when$valshape$funDynamicListItem()), Dp.m2350constructorimpl((float) liveLiterals$DynamicListItemKt.m2993Int$$$this$call$getdp$$arg1$callRoundedCornerShape$branch$when$valshape$funDynamicListItem()), 0.0f, 0.0f, 12, (Object) null);
            } else if (i2 == i) {
                shape = RoundedCornerShapeKt.m337RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$DynamicListItemKt.m2994Int$$$this$call$getdp$$arg2$callRoundedCornerShape$branch1$when$valshape$funDynamicListItem()), Dp.m2350constructorimpl((float) liveLiterals$DynamicListItemKt.m2995Int$$$this$call$getdp$$arg3$callRoundedCornerShape$branch1$when$valshape$funDynamicListItem()), 3, (Object) null);
            } else {
                shape = RoundedCornerShapeKt.m335RoundedCornerShape0680j_4(Dp.m2350constructorimpl((float) liveLiterals$DynamicListItemKt.m2992Int$$$this$call$getdp$$arg0$callRoundedCornerShape$else$when$valshape$funDynamicListItem()));
            }
            int i4 = $dirty2;
            $composer2 = $composer3;
            CardBoxKt.m2924CardBoxueL0Wzs((Modifier) null, (String) null, false, false, false, liveLiterals$DynamicListItemKt.m2990Boolean$arg5$callCardBox$funDynamicListItem(), 0, (Function1) null, shape, ComposableLambdaKt.composableLambda($composer3, -1784490438, true, new DynamicListItemKt$DynamicListItem$1(function2, $dirty2)), $composer2, 805306368, 223);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i5 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DynamicListItemKt$DynamicListItem$2(i, i2, function2, i3));
        }
    }
}
