package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onFileSelectionResult$2 extends Lambda implements Function1 {
    public final /* synthetic */ String $filename;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onFileSelectionResult$2(String str) {
        super(1);
        this.$filename = str;
    }

    public final InstallationCardState invoke(InstallationCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        return InstallationCardState.copy$default(it, (InstallationStep) null, liveLiterals$HomeViewModelKt.m3278Boolean$arg1$callcopy$fun$anonymous$$arg0$callupdateInstallationCard$funonFileSelectionResult$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3284Boolean$arg2$callcopy$fun$anonymous$$arg0$callupdateInstallationCard$funonFileSelectionResult$classHomeViewModel(), false, this.$filename, (String) null, false, 0.0f, (String) null, 489, (Object) null);
    }
}
