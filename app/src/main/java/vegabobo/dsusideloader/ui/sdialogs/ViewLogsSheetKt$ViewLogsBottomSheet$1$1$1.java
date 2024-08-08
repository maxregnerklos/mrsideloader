package vegabobo.dsusideloader.ui.sdialogs;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewLogsSheet.kt */
public final class ViewLogsSheetKt$ViewLogsBottomSheet$1$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ ManagedActivityResultLauncher $saveLogsResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLogsSheetKt$ViewLogsBottomSheet$1$1$1(ManagedActivityResultLauncher managedActivityResultLauncher) {
        super(0);
        this.$saveLogsResult = managedActivityResultLauncher;
    }

    public final void invoke() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        LiveLiterals$ViewLogsSheetKt liveLiterals$ViewLogsSheetKt = LiveLiterals$ViewLogsSheetKt.INSTANCE;
        intent.setType(liveLiterals$ViewLogsSheetKt.m3410String$arg0$callsetType$fun$anonymous$$arg2$callPrimaryButton$fun$anonymous$$arg3$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funViewLogsBottomSheet());
        intent.putExtra("android.intent.extra.TITLE", liveLiterals$ViewLogsSheetKt.m3411String$arg1$callputExtra$fun$anonymous$$arg2$callPrimaryButton$fun$anonymous$$arg3$callRow$fun$anonymous$$arg4$callCustomBottomSheet$funViewLogsBottomSheet());
        this.$saveLogsResult.launch(intent);
    }
}
