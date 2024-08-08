package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeScreen.kt */
public final class HomeScreenKt$Home$9 extends Lambda implements Function0 {
    public final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$Home$9(HomeViewModel homeViewModel) {
        super(0);
        this.$homeViewModel = homeViewModel;
    }

    public final void invoke() {
        this.$homeViewModel.onCheckImageSizeCard();
    }
}
