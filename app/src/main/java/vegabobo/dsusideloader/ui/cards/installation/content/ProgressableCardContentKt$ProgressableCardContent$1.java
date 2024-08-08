package vegabobo.dsusideloader.ui.cards.installation.content;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ProgressableCardContent.kt */
public final class ProgressableCardContentKt$ProgressableCardContent$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $isIndeterminate;
    public final /* synthetic */ float $progress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressableCardContentKt$ProgressableCardContent$1(boolean z, float f, int i) {
        super(3);
        this.$isIndeterminate = z;
        this.$progress = f;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((AnimatedVisibilityScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C:ProgressableCardContent.kt#udsvy7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1909585688, $changed, -1, "vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContent.<anonymous> (ProgressableCardContent.kt:27)");
        } else {
            int i = $changed;
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
        LiveLiterals$ProgressableCardContentKt liveLiterals$ProgressableCardContentKt = LiveLiterals$ProgressableCardContentKt.INSTANCE;
        Modifier progressBarModifier = PaddingKt.m225paddingqDBjuR0$default(fillMaxWidth$default, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ProgressableCardContentKt.m2896Int$$$this$call$getdp$$arg1$callpadding$valprogressBarModifier$fun$anonymous$$arg5$callAnimatedVisibility$funProgressableCardContent()), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$ProgressableCardContentKt.m2898Int$$$this$call$getdp$$arg3$callpadding$valprogressBarModifier$fun$anonymous$$arg5$callAnimatedVisibility$funProgressableCardContent()), 5, (Object) null);
        if (this.$isIndeterminate) {
            composer.startReplaceableGroup(1567280647);
            ComposerKt.sourceInformation(composer, "32@1225L55");
            ProgressIndicatorKt.m682LinearProgressIndicatorRIQooxk(progressBarModifier, 0, 0, $composer, 0, 6);
            $composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1567280732);
            ComposerKt.sourceInformation(composer, "34@1310L123");
            ProgressIndicatorKt.m683LinearProgressIndicatoreaDK9VM(this.$progress, progressBarModifier, 0, 0, $composer, (this.$$dirty >> 9) & 14, 12);
            $composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
