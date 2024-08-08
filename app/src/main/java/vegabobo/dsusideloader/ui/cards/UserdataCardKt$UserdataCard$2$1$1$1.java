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
import vegabobo.dsusideloader.ui.screen.home.UserDataCardState;

/* compiled from: UserdataCard.kt */
public final class UserdataCardKt$UserdataCard$2$1$1$1 extends Lambda implements Function3 {
    public final /* synthetic */ UserDataCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserdataCardKt$UserdataCard$2$1$1$1(UserDataCardState userDataCardState) {
        super(3);
        this.$uiState = userDataCardState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C55@2225L164,59@2437L11,53@2121L442:UserdataCard.kt#e34gdu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1479643776, $changed, -1, "vegabobo.dsusideloader.ui.cards.UserdataCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserdataCard.kt:52)");
        } else {
            int i = $changed;
        }
        Modifier.Companion companion = Modifier.Companion;
        LiveLiterals$UserdataCardKt liveLiterals$UserdataCardKt = LiveLiterals$UserdataCardKt.INSTANCE;
        Modifier r1 = PaddingKt.m225paddingqDBjuR0$default(companion, Dp.m2350constructorimpl((float) liveLiterals$UserdataCardKt.m2856Int$$$this$call$getdp$$arg0$callpadding$valtmp0_modifier$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funUserdataCard()), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.allowed_userdata_allocation, new Object[]{Integer.valueOf(this.$uiState.getMaximumAllowed())}, composer, 64), r1, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m581getError0d7_KjU(), TextUnitKt.getSp(liveLiterals$UserdataCardKt.m2859Int$$$this$call$getsp$$valtmp4_fontSize$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funUserdataCard()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(liveLiterals$UserdataCardKt.m2858Int$$$this$call$getsp$$valtmp3_lineHeight$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg5$callAnimatedVisibility$fun$anonymous$$arg9$callCardBox$funUserdataCard()), 0, false, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 64496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
