package vegabobo.dsusideloader.ui.cards.installation;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: InstallationCard.kt */
public final class InstallationCardKt$InstallationCard$launcherSelectFile$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $onSelectFileSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstallationCardKt$InstallationCard$launcherSelectFile$1$1(Function1 function1) {
        super(1);
        this.$onSelectFileSuccess = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((Uri) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onSelectFileSuccess.invoke(it);
    }
}
