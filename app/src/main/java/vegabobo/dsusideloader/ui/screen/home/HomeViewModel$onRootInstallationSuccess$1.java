package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onRootInstallationSuccess$1 extends Lambda implements Function1 {
    public static final HomeViewModel$onRootInstallationSuccess$1 INSTANCE = new HomeViewModel$onRootInstallationSuccess$1();

    public HomeViewModel$onRootInstallationSuccess$1() {
        super(1);
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, InstallationStep.INSTALL_SUCCESS_REBOOT_DYN_OS, false, false, false, (String) null, (String) null, false, 0.0f, (String) null, 510, (Object) null);
    }
}
