package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: vegabobo.dsusideloader.ui.cards.warnings.ComposableSingletons$LoadingCardKt$lambda-1$1  reason: invalid class name */
/* compiled from: LoadingCard.kt */
public final class ComposableSingletons$LoadingCardKt$lambda1$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$LoadingCardKt$lambda1$1 INSTANCE = new ComposableSingletons$LoadingCardKt$lambda1$1();

    public ComposableSingletons$LoadingCardKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        int i = $changed;
        ComposerKt.sourceInformation($composer, "C19@716L136:LoadingCard.kt#ypex4d");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-998372336, i, -1, "vegabobo.dsusideloader.ui.cards.warnings.ComposableSingletons$LoadingCardKt.lambda-1.<anonymous> (LoadingCard.kt:18)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            LiveLiterals$LoadingCardKt liveLiterals$LoadingCardKt = LiveLiterals$LoadingCardKt.INSTANCE;
            ProgressIndicatorKt.m682LinearProgressIndicatorRIQooxk(PaddingKt.m225paddingqDBjuR0$default(fillMaxWidth$default, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$LoadingCardKt.m2920Int$$$this$call$getdp$$arg1$callpadding$arg0$callLinearProgressIndicator$fun$anonymous$$arg9$callSimpleCard$funGrantingPermissionCard()), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$LoadingCardKt.m2921Int$$$this$call$getdp$$arg3$callpadding$arg0$callLinearProgressIndicator$fun$anonymous$$arg9$callSimpleCard$funGrantingPermissionCard()), 5, (Object) null), 0, 0, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
