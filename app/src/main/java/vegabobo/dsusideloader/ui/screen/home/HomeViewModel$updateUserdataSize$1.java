package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$updateUserdataSize$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $fixedSize;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateUserdataSize$1(HomeViewModel homeViewModel, String str) {
        super(1);
        this.this$0 = homeViewModel;
        this.$fixedSize = str;
    }

    public final UserDataCardState invoke(UserDataCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UserDataCardState.copy$default(it, false, LiveLiterals$HomeViewModelKt.INSTANCE.m3280Boolean$arg1$callcopy$fun$anonymous$$arg0$callupdateUserdataCard$branch$if$funupdateUserdataSize$classHomeViewModel(), this.$fixedSize, this.this$0.maximumAllowedForAllocation, 1, (Object) null);
    }
}
