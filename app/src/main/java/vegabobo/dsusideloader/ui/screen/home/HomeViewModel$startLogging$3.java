package vegabobo.dsusideloader.ui.screen.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeViewModel.kt */
public /* synthetic */ class HomeViewModel$startLogging$3 extends FunctionReferenceImpl implements Function2 {
    public HomeViewModel$startLogging$3(Object obj) {
        super(2, obj, HomeViewModel.class, "onInstallationProgressUpdate", "onInstallationProgressUpdate(FLjava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke(((Number) p1).floatValue(), (String) p2);
        return Unit.INSTANCE;
    }

    public final void invoke(float p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((HomeViewModel) this.receiver).onInstallationProgressUpdate(p0, p1);
    }
}
