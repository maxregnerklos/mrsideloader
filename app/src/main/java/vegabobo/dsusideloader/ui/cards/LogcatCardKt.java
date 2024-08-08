package vegabobo.dsusideloader.ui.cards;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogcatCard.kt */
public abstract class LogcatCardKt {
    public static final void LogcatCard(String logs, Composer $composer, int $changed) {
        Composer $composer2;
        String str = logs;
        int i = $changed;
        Intrinsics.checkNotNullParameter(str, "logs");
        Composer $composer3 = $composer.startRestartGroup(-1646317011);
        ComposerKt.sourceInformation($composer3, "C(LogcatCard)24@872L11,23@833L582:LogcatCard.kt#e34gdu");
        int $dirty = $changed;
        if ((i & 14) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 11) != 2 || !$composer3.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646317011, $dirty2, -1, "vegabobo.dsusideloader.ui.cards.LogcatCard (LogcatCard.kt:20)");
            }
            long r5 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).m583getInverseOnSurface0d7_KjU();
            Modifier.Companion companion = Modifier.Companion;
            LiveLiterals$LogcatCardKt liveLiterals$LogcatCardKt = LiveLiterals$LogcatCardKt.INSTANCE;
            int i2 = $dirty2;
            $composer2 = $composer3;
            SurfaceKt.m710SurfaceT9BRK9s(SizeKt.m243height3ABfNKs(SizeKt.fillMaxWidth$default(ClipKt.clip(companion, RoundedCornerShapeKt.m335RoundedCornerShape0680j_4(Dp.m2350constructorimpl((float) liveLiterals$LogcatCardKt.m2850Int$$$this$call$getdp$$arg0$callRoundedCornerShape$arg0$callclip$$$this$callfillMaxWidth$$$this$callheight$valtmp1_modifier$funLogcatCard()))), 0.0f, 1, (Object) null), Dp.m2350constructorimpl((float) liveLiterals$LogcatCardKt.m2851Int$$$this$call$getdp$$arg0$callheight$valtmp1_modifier$funLogcatCard())), (Shape) null, r5, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.composableLambda($composer3, -787265976, true, new LogcatCardKt$LogcatCard$1(str, $dirty2)), $composer3, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            int i3 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LogcatCardKt$LogcatCard$2(str, i));
        }
    }
}
