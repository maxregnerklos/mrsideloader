package vegabobo.dsusideloader.ui.util;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ActivityResult.kt */
public final class ActivityResultKt$launcherAcResult$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityResultKt$launcherAcResult$1$1(Function1 function1) {
        super(1);
        this.$result = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((ActivityResult) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getResultCode() == -1) {
            Function1 function1 = this.$result;
            Intent data = it.getData();
            Intrinsics.checkNotNull(data);
            Uri data2 = data.getData();
            Intrinsics.checkNotNull(data2);
            function1.invoke(data2);
        }
    }
}
