package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onStepUpdate$1 extends Lambda implements Function1 {
    public final /* synthetic */ InstallationStep $step;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onStepUpdate$1(InstallationStep installationStep) {
        super(1);
        this.$step = installationStep;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, this.$step, false, false, false, (String) null, (String) null, false, 0.0f, (String) null, 510, (Object) null);
    }
}
