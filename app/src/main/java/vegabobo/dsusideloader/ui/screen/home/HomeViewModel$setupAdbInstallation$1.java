package vegabobo.dsusideloader.ui.screen.home;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$setupAdbInstallation$1 extends Lambda implements Function1 {
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$setupAdbInstallation$1(HomeViewModel homeViewModel) {
        super(1);
        this.this$0 = homeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((String) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(String scriptPath) {
        Intrinsics.checkNotNullParameter(scriptPath, "scriptPath");
        String access$getTag$p = this.this$0.tag;
        String r1 = LiveLiterals$HomeViewModelKt.INSTANCE.m3306String$0$str$arg1$calld$fun$anonymous$$arg0$callgenerate$funsetupAdbInstallation$classHomeViewModel();
        Log.d(access$getTag$p, r1 + scriptPath);
        this.this$0.getSession().setInstallationScriptPath(scriptPath);
        this.this$0.resetInstallationCard();
        this.this$0.updateInstallationCard(AnonymousClass1.INSTANCE);
    }
}
