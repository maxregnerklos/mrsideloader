package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onInstallationError$1 extends Lambda implements Function1 {
    public final /* synthetic */ InstallationStep $error;
    public final /* synthetic */ String $errorContent;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onInstallationError$1(InstallationStep installationStep, HomeViewModel homeViewModel, String str) {
        super(1);
        this.$error = installationStep;
        this.this$0 = homeViewModel;
        this.$errorContent = str;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$error != InstallationStep.ERROR_SELINUX || this.this$0.getSession().isRoot()) {
            return InstallationCardState.copy$default(it, this.$error, false, false, false, (String) null, this.$errorContent, false, 0.0f, (String) null, 478, (Object) null);
        }
        return InstallationCardState.copy$default(it, InstallationStep.ERROR_SELINUX_ROOTLESS, false, false, false, (String) null, this.$errorContent, false, 0.0f, (String) null, 478, (Object) null);
    }
}
