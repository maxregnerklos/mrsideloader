package vegabobo.dsusideloader.ui.screen.adb;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.model.Session;

/* compiled from: AdbViewModel.kt */
public final class AdbViewModel extends ViewModel {
    public static final int $stable = LiveLiterals$AdbViewModelKt.INSTANCE.m3142Int$classAdbViewModel();
    public final Session session;

    public AdbViewModel(Session session2) {
        Intrinsics.checkNotNullParameter(session2, "session");
        this.session = session2;
    }

    public final String obtainScriptPath() {
        return this.session.getInstallationScriptPath();
    }
}
