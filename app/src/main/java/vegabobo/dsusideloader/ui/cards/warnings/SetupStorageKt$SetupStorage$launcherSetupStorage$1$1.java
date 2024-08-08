package vegabobo.dsusideloader.ui.cards.warnings;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SetupStorage.kt */
public final class SetupStorageKt$SetupStorage$launcherSetupStorage$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $onSetupStorageSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetupStorageKt$SetupStorage$launcherSetupStorage$1$1(Function1 function1) {
        super(1);
        this.$onSetupStorageSuccess = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((Uri) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onSetupStorageSuccess.invoke(it);
    }
}
