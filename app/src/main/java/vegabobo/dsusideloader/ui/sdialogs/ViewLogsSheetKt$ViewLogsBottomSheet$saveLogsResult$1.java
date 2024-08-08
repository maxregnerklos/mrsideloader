package vegabobo.dsusideloader.ui.sdialogs;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewLogsSheet.kt */
public final class ViewLogsSheetKt$ViewLogsBottomSheet$saveLogsResult$1 extends Lambda implements Function1 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $logsSavedText;
    public final /* synthetic */ Function1 $onClickSaveLogs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLogsSheetKt$ViewLogsBottomSheet$saveLogsResult$1(Function1 function1, Context context, String str) {
        super(1);
        this.$onClickSaveLogs = function1;
        this.$context = context;
        this.$logsSavedText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((Uri) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onClickSaveLogs.invoke(it);
        Toast.makeText(this.$context, this.$logsSavedText, 0).show();
    }
}
