package vegabobo.dsusideloader.ui.cards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: LogcatCard.kt */
public final class LogcatCardKt$LogcatCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $logs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogcatCardKt$LogcatCard$2(String str, int i) {
        super(2);
        this.$logs = str;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LogcatCardKt.LogcatCard(this.$logs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
