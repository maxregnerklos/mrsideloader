package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$updateImageSize$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $inputWithSuffix;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateImageSize$1(String str) {
        super(1);
        this.$inputWithSuffix = str;
    }

    public final ImageSizeCardState invoke(ImageSizeCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ImageSizeCardState.copy$default(it, false, this.$inputWithSuffix, 1, (Object) null);
    }
}
