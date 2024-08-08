package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onCheckImageSizeCard$1 extends Lambda implements Function1 {
    public static final HomeViewModel$onCheckImageSizeCard$1 INSTANCE = new HomeViewModel$onCheckImageSizeCard$1();

    public HomeViewModel$onCheckImageSizeCard$1() {
        super(1);
    }

    public final ImageSizeCardState invoke(ImageSizeCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(!it.isSelected(), LiveLiterals$HomeViewModelKt.INSTANCE.m3351String$arg1$callcopy$fun$anonymous$$arg0$callupdateImageSizeCard$funonCheckImageSizeCard$classHomeViewModel());
    }
}
