package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$updateUserdataSize$3 extends Lambda implements Function1 {
    public final /* synthetic */ String $sizeWithSuffix;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateUserdataSize$3(String str) {
        super(1);
        this.$sizeWithSuffix = str;
    }

    public final UserDataCardState invoke(UserDataCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UserDataCardState.copy$default(it, false, false, this.$sizeWithSuffix, 0, 11, (Object) null);
    }
}
