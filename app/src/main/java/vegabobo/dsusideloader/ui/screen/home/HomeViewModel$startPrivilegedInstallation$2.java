package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$startPrivilegedInstallation$2 extends Lambda implements Function1 {
    public static final HomeViewModel$startPrivilegedInstallation$2 INSTANCE = new HomeViewModel$startPrivilegedInstallation$2();

    public HomeViewModel$startPrivilegedInstallation$2() {
        super(1);
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, InstallationStep.INSTALL_SUCCESS, false, false, false, (String) null, (String) null, false, 0.0f, (String) null, 510, (Object) null);
    }
}
