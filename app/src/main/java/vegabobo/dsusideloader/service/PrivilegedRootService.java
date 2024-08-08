package vegabobo.dsusideloader.service;

import android.content.Intent;
import android.os.IBinder;
import com.topjohnwu.superuser.ipc.RootService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivilegedBinder.kt */
public final class PrivilegedRootService extends RootService {
    public static final int $stable = LiveLiterals$PrivilegedBinderKt.INSTANCE.m2798Int$classPrivilegedRootService();

    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new PrivilegedService();
    }
}
