package vegabobo.dsusideloader.ui.screen.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public /* synthetic */ class HomeViewModel$startLogging$2 extends FunctionReferenceImpl implements Function1 {
    public HomeViewModel$startLogging$2(Object obj) {
        super(1, obj, HomeViewModel.class, "onStepUpdate", "onStepUpdate(Lvegabobo/dsusideloader/preparation/InstallationStep;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((InstallationStep) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(InstallationStep p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((HomeViewModel) this.receiver).onStepUpdate(p0);
    }
}
