package vegabobo.dsusideloader.ui.cards;

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
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;

/* renamed from: vegabobo.dsusideloader.ui.cards.ComposableSingletons$ImageSizeCardKt$lambda-1$1  reason: invalid class name */
/* compiled from: ImageSizeCard.kt */
public final class ComposableSingletons$ImageSizeCardKt$lambda1$1 extends Lambda implements Function3 {
    public static final ComposableSingletons$ImageSizeCardKt$lambda1$1 INSTANCE = new ComposableSingletons$ImageSizeCardKt$lambda1$1();

    public ComposableSingletons$ImageSizeCardKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C55@2221L52,56@2321L11,53@2117L330:ImageSizeCard.kt#e34gdu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(306363901, $changed, -1, "vegabobo.dsusideloader.ui.cards.ComposableSingletons$ImageSizeCardKt.lambda-1.<anonymous> (ImageSizeCard.kt:52)");
        } else {
            int i = $changed;
        }
        Modifier.Companion companion = Modifier.Companion;
        LiveLiterals$ImageSizeCardKt liveLiterals$ImageSizeCardKt = LiveLiterals$ImageSizeCardKt.INSTANCE;
        Modifier r1 = PaddingKt.m225paddingqDBjuR0$default(companion, Dp.m2350constructorimpl((float) liveLiterals$ImageSizeCardKt.m2846Int$$$this$call$getdp$$arg0$callpadding$valtmp0_modifier$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funImageSizeCard()), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.not_recommended_option, composer, 0), r1, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m581getError0d7_KjU(), TextUnitKt.getSp(liveLiterals$ImageSizeCardKt.m2849Int$$$this$call$getsp$$valtmp4_fontSize$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funImageSizeCard()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(liveLiterals$ImageSizeCardKt.m2848Int$$$this$call$getsp$$valtmp3_lineHeight$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funImageSizeCard()), 0, false, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 64496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
