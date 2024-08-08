package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewLogsSheet.kt */
public final class ViewLogsSheetKt$ViewLogsBottomSheet$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $logs;
    public final /* synthetic */ Function1 $onClickSaveLogs;
    public final /* synthetic */ Function0 $onDismiss;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLogsSheetKt$ViewLogsBottomSheet$2(String str, Function1 function1, Function0 function0, int i) {
        super(2);
        this.$logs = str;
        this.$onClickSaveLogs = function1;
        this.$onDismiss = function0;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ViewLogsSheetKt.ViewLogsBottomSheet(this.$logs, this.$onClickSaveLogs, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
