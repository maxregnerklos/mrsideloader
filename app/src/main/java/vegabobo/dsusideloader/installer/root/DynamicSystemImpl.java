package vegabobo.dsusideloader.installer.root;

import android.gsi.GsiProgress;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.image.IDynamicSystemService;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.service.PrivilegedProvider;

/* compiled from: DynamicSystemImpl.kt */
public abstract class DynamicSystemImpl implements IDynamicSystemService {
    public static final int $stable = LiveLiterals$DynamicSystemImplKt.INSTANCE.m2692Int$classDynamicSystemImpl();

    public IBinder asBinder() {
        return null;
    }

    public GsiProgress getInstallationProgress() {
        GsiProgress installationProgress = PrivilegedProvider.INSTANCE.getService().getInstallationProgress();
        Intrinsics.checkNotNullExpressionValue(installationProgress, "PrivilegedProvider.getSe…ce().installationProgress");
        return installationProgress;
    }

    public boolean abort() {
        return PrivilegedProvider.INSTANCE.getService().abort();
    }

    public boolean isInUse() {
        return PrivilegedProvider.INSTANCE.getService().isInUse();
    }

    public boolean isInstalled() {
        return PrivilegedProvider.INSTANCE.getService().isInstalled();
    }

    public boolean isEnabled() {
        return PrivilegedProvider.INSTANCE.getService().isEnabled();
    }

    public boolean remove() {
        return PrivilegedProvider.INSTANCE.getService().remove();
    }

    public boolean setEnable(boolean enable, boolean oneShot) {
        return PrivilegedProvider.INSTANCE.getService().setEnable(enable, oneShot);
    }

    public boolean finishInstallation() {
        return PrivilegedProvider.INSTANCE.getService().finishInstallation();
    }

    public boolean startInstallation(String dsuSlot) {
        Intrinsics.checkNotNullParameter(dsuSlot, "dsuSlot");
        return PrivilegedProvider.INSTANCE.getService().startInstallation(dsuSlot);
    }

    public int createPartition(String name, long size, boolean readOnly) {
        Intrinsics.checkNotNullParameter(name, "name");
        return PrivilegedProvider.INSTANCE.getService().createPartition(name, size, readOnly);
    }

    public boolean closePartition() {
        return PrivilegedProvider.INSTANCE.getService().closePartition();
    }

    public boolean setAshmem(ParcelFileDescriptor fd, long size) {
        Intrinsics.checkNotNullParameter(fd, "fd");
        return PrivilegedProvider.INSTANCE.getService().setAshmem(fd, size);
    }

    public boolean submitFromAshmem(long bytes) {
        return PrivilegedProvider.INSTANCE.getService().submitFromAshmem(bytes);
    }

    public long suggestScratchSize() {
        return PrivilegedProvider.INSTANCE.getService().suggestScratchSize();
    }

    public final void forceStopDSU() {
        PrivilegedProvider.INSTANCE.getService().forceStopPackage(LiveLiterals$DynamicSystemImplKt.INSTANCE.m2693String$arg0$callforceStopPackage$funforceStopDSU$classDynamicSystemImpl());
    }
}
