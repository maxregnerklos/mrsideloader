package vegabobo.dsusideloader.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivilegedBinder.kt */
public final class PrivilegedSystemService extends Service {
    public static final int $stable = LiveLiterals$PrivilegedBinderKt.INSTANCE.m2799Int$classPrivilegedSystemService();

    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new PrivilegedService();
    }
}
