package vegabobo.dsusideloader.ui.cards.updater;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: UpdaterCard.kt */
public final class UpdaterCardKt$UpdaterCard$1$2$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function0 $onClickCheckUpdates;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdaterCardKt$UpdaterCard$1$2$1(Function0 function0) {
        super(1);
        this.$onClickCheckUpdates = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Boolean) p1).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean it) {
        this.$onClickCheckUpdates.invoke();
    }
}
