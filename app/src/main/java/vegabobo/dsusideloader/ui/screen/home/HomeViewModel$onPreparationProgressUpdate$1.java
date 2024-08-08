package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onPreparationProgressUpdate$1 extends Lambda implements Function1 {
    public final /* synthetic */ float $progress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onPreparationProgressUpdate$1(float f) {
        super(1);
        this.$progress = f;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, (InstallationStep) null, false, false, false, (String) null, (String) null, false, this.$progress, (String) null, 383, (Object) null);
    }
}
