package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onInstallationProgressUpdate$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $partition;
    public final /* synthetic */ float $progress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onInstallationProgressUpdate$1(float f, String str) {
        super(1);
        this.$progress = f;
        this.$partition = str;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, (InstallationStep) null, false, false, false, (String) null, (String) null, false, this.$progress, this.$partition, 127, (Object) null);
    }
}
