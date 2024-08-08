package vegabobo.dsusideloader.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: Connection.kt */
public final class Connection implements ServiceConnection {
    public static final int $stable = LiveLiterals$ConnectionKt.INSTANCE.m2797Int$classConnection();
    public IPrivilegedService SERVICE;

    public final IPrivilegedService getSERVICE() {
        return this.SERVICE;
    }

    public final void set(IPrivilegedService service) {
        if (this.SERVICE == null) {
            this.SERVICE = service;
        }
    }

    public void onServiceConnected(ComponentName name, IBinder service) {
        set(IPrivilegedService.Stub.asInterface(service));
    }

    public void onServiceDisconnected(ComponentName name) {
        this.SERVICE = null;
    }
}
