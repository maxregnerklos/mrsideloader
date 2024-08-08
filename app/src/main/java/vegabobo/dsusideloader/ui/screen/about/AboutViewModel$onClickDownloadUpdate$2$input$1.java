package vegabobo.dsusideloader.ui.screen.about;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel$onClickDownloadUpdate$2$input$1 extends Lambda implements Function1 {
    public static final AboutViewModel$onClickDownloadUpdate$2$input$1 INSTANCE = new AboutViewModel$onClickDownloadUpdate$2$input$1();

    public AboutViewModel$onClickDownloadUpdate$2$input$1() {
        super(1);
    }

    public final UpdaterCardState invoke(UpdaterCardState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return UpdaterCardState.copy$default(it, (UpdateStatus) null, LiveLiterals$AboutViewModelKt.INSTANCE.m3088Boolean$arg1$callcopy$fun$anonymous$$arg0$callupdateUpdaterCard$catch$valinput$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel(), (String) null, 0.0f, 13, (Object) null);
    }
}
