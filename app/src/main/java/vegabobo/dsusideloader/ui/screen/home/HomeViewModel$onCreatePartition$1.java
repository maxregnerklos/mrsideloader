package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onCreatePartition$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $partition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onCreatePartition$1(String str) {
        super(1);
        this.$partition = str;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InstallationCardState.copy$default(it, InstallationStep.CREATING_PARTITION, false, false, false, (String) null, (String) null, false, 0.0f, this.$partition, 254, (Object) null);
    }
}
