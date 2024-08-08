package vegabobo.dsusideloader.ui.screen.home;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeScreen.kt */
public final class HomeScreenKt$Home$12 extends Lambda implements Function1 {
    public final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$Home$12(HomeViewModel homeViewModel) {
        super(1);
        this.$homeViewModel = homeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((Uri) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$homeViewModel.saveLogs(it);
    }
}
