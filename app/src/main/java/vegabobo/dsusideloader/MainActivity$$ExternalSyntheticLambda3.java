package vegabobo.dsusideloader;

import kotlin.reflect.KFunction;
import rikka.shizuku.Shizuku;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda3 implements Shizuku.OnRequestPermissionResultListener {
    public final /* synthetic */ KFunction f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda3(KFunction kFunction) {
        this.f$0 = kFunction;
    }

    public final void onRequestPermissionResult(int i, int i2) {
        MainActivity.addShizukuListeners$lambda$0(this.f$0, i, i2);
    }
}
