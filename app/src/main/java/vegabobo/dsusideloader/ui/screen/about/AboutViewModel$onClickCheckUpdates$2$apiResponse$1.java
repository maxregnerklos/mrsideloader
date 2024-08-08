package vegabobo.dsusideloader.ui.screen.about;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel$onClickCheckUpdates$2$apiResponse$1 extends Lambda implements Function1 {
    public static final AboutViewModel$onClickCheckUpdates$2$apiResponse$1 INSTANCE = new AboutViewModel$onClickCheckUpdates$2$apiResponse$1();

    public AboutViewModel$onClickCheckUpdates$2$apiResponse$1() {
        super(1);
    }

    public final UpdaterCardState invoke(UpdaterCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UpdaterCardState.copy$default(it, UpdateStatus.NO_UPDATE_FOUND, false, (String) null, 0.0f, 14, (Object) null);
    }
}
