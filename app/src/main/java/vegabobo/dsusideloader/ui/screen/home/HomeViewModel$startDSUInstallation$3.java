package vegabobo.dsusideloader.ui.screen.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeViewModel.kt */
public /* synthetic */ class HomeViewModel$startDSUInstallation$3 extends FunctionReferenceImpl implements Function1 {
    public HomeViewModel$startDSUInstallation$3(Object obj) {
        super(1, obj, HomeViewModel.class, "onCreatePartition", "onCreatePartition(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((String) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((HomeViewModel) this.receiver).onCreatePartition(p0);
    }
}
