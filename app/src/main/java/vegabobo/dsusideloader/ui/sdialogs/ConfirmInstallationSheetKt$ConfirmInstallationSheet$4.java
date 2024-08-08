package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: ConfirmInstallationSheet.kt */
public final class ConfirmInstallationSheetKt$ConfirmInstallationSheet$4 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ String $filename;
    public final /* synthetic */ Function0 $onClickCancel;
    public final /* synthetic */ Function0 $onClickConfirm;
    public final /* synthetic */ String $userdata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmInstallationSheetKt$ConfirmInstallationSheet$4(String str, String str2, long j, Function0 function0, Function0 function02, int i) {
        super(2);
        this.$filename = str;
        this.$userdata = str2;
        this.$fileSize = j;
        this.$onClickConfirm = function0;
        this.$onClickCancel = function02;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ConfirmInstallationSheetKt.ConfirmInstallationSheet(this.$filename, this.$userdata, this.$fileSize, this.$onClickConfirm, this.$onClickCancel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
