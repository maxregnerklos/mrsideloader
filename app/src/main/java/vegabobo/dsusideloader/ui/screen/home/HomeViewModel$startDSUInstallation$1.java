package vegabobo.dsusideloader.ui.screen.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public /* synthetic */ class HomeViewModel$startDSUInstallation$1 extends FunctionReferenceImpl implements Function2 {
    public HomeViewModel$startDSUInstallation$1(Object obj) {
        super(2, obj, HomeViewModel.class, "onInstallationError", "onInstallationError(Lvegabobo/dsusideloader/preparation/InstallationStep;Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((InstallationStep) p1, (String) p2);
        return Unit.INSTANCE;
    }

    public final void invoke(InstallationStep p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((HomeViewModel) this.receiver).onInstallationError(p0, p1);
    }
}
