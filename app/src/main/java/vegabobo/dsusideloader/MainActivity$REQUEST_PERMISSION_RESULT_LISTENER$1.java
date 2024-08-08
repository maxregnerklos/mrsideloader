package vegabobo.dsusideloader;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MainActivity.kt */
public /* synthetic */ class MainActivity$REQUEST_PERMISSION_RESULT_LISTENER$1 extends FunctionReferenceImpl implements Function2 {
    public MainActivity$REQUEST_PERMISSION_RESULT_LISTENER$1(Object obj) {
        super(2, obj, MainActivity.class, "onRequestPermissionResult", "onRequestPermissionResult(II)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke(((Number) p1).intValue(), ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int p0, int p1) {
        ((MainActivity) this.receiver).onRequestPermissionResult(p0, p1);
    }
}
