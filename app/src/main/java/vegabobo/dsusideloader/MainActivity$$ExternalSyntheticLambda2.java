package vegabobo.dsusideloader;

import kotlin.reflect.KFunction;
import rikka.shizuku.Shizuku;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda2 implements Shizuku.OnRequestPermissionResultListener {
    public final /* synthetic */ KFunction f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda2(KFunction kFunction) {
        this.f$0 = kFunction;
    }

    public final void onRequestPermissionResult(int i, int i2) {
        MainActivity.removeShizukuListeners$lambda$1(this.f$0, i, i2);
    }
}
