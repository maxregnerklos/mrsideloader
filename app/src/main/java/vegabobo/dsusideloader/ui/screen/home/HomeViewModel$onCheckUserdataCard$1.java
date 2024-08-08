package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onCheckUserdataCard$1 extends Lambda implements Function1 {
    public static final HomeViewModel$onCheckUserdataCard$1 INSTANCE = new HomeViewModel$onCheckUserdataCard$1();

    public HomeViewModel$onCheckUserdataCard$1() {
        super(1);
    }

    public final UserDataCardState invoke(UserDataCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UserDataCardState.copy$default(it, !it.isSelected(), false, LiveLiterals$HomeViewModelKt.INSTANCE.m3353String$arg2$callcopy$fun$anonymous$$arg0$callupdateUserdataCard$funonCheckUserdataCard$classHomeViewModel(), 0, 10, (Object) null);
    }
}
