package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;

/* renamed from: vegabobo.dsusideloader.ui.cards.installation.content.ComposableSingletons$NotInstallingCardContentKt$lambda-1$1  reason: invalid class name */
/* compiled from: NotInstallingCardContent.kt */
public final class ComposableSingletons$NotInstallingCardContentKt$lambda1$1 extends Lambda implements Function3 {
    public static final ComposableSingletons$NotInstallingCardContentKt$lambda1$1 INSTANCE = new ComposableSingletons$NotInstallingCardContentKt$lambda1$1();

    public ComposableSingletons$NotInstallingCardContentKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C43@1731L46,45@1876L11,42@1702L206:NotInstallingCardContent.kt#udsvy7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1460158689, $changed, -1, "vegabobo.dsusideloader.ui.cards.installation.content.ComposableSingletons$NotInstallingCardContentKt.lambda-1.<anonymous> (NotInstallingCardContent.kt:41)");
        } else {
            int i = $changed;
        }
        TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.file_unsupported, composer, 0), PaddingKt.m225paddingqDBjuR0$default(Modifier.Companion, Dp.m2350constructorimpl((float) LiveLiterals$NotInstallingCardContentKt.INSTANCE.m2888Int$$$this$call$getdp$$arg0$callpadding$arg1$callText$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callRow$funNotInstallingCardContent()), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m581getError0d7_KjU(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 65528);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
