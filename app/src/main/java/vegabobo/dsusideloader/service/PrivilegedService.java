package vegabobo.dsusideloader.service;

import android.app.IActivityManager;
import android.app.IApplicationThread;
import android.app.ProfilerInfo;
import android.content.Intent;
import android.content.pm.IPackageManager;
import android.gsi.GsiProgress;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemProperties;
import android.os.image.IDynamicSystemService;
import android.os.storage.IStorageManager;
import android.os.storage.VolumeInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.lsposed.hiddenapibypass.HiddenApiBypass;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: PrivilegedService.kt */
public final class PrivilegedService extends IPrivilegedService.Stub {
    public static final int $stable = LiveLiterals$PrivilegedServiceKt.INSTANCE.m2830Int$classPrivilegedService();
    public IActivityManager ACTIVITY_MANAGER;
    public IDynamicSystemService DYNAMIC_SYSTEM;
    public IPackageManager PACKAGE_MANAGER;
    public IStorageManager STORAGE_MANAGER;

    public void exit() {
        destroy();
    }

    public void destroy() {
        System.exit(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2816Int$arg0$callexitProcess$fundestroy$classPrivilegedService());
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final IBinder getBinder(String service) {
        LiveLiterals$PrivilegedServiceKt liveLiterals$PrivilegedServiceKt = LiveLiterals$PrivilegedServiceKt.INSTANCE;
        Object binder = HiddenApiBypass.invoke(Class.forName(liveLiterals$PrivilegedServiceKt.m2831String$arg0$callforName$valserviceManager$fungetBinder$classPrivilegedService()), (Object) null, liveLiterals$PrivilegedServiceKt.m2838String$arg2$callinvoke$valbinder$fungetBinder$classPrivilegedService(), service);
        Intrinsics.checkNotNull(binder, "null cannot be cast to non-null type android.os.IBinder");
        return (IBinder) binder;
    }

    public final void setProp(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            SystemProperties.set(key, value);
        } catch (Exception e) {
            Log.w("vegabobo.dsusideloader", ExceptionsKt__ExceptionsKt.stackTraceToString(e));
        }
    }

    public void setDynProp() {
        LiveLiterals$PrivilegedServiceKt liveLiterals$PrivilegedServiceKt = LiveLiterals$PrivilegedServiceKt.INSTANCE;
        setProp(liveLiterals$PrivilegedServiceKt.m2836String$arg0$callsetProp$funsetDynProp$classPrivilegedService(), liveLiterals$PrivilegedServiceKt.m2837String$arg1$callsetProp$funsetDynProp$classPrivilegedService());
    }

    public int getUid() {
        return Process.myUid();
    }

    public final void requiresActivityManager() {
        if (this.ACTIVITY_MANAGER == null) {
            this.ACTIVITY_MANAGER = IActivityManager.Stub.asInterface(getBinder(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2832String$arg0$callgetBinder$arg0$callasInterface$arg0$call$setACTIVITY_MANAGER$$branch$if$funrequiresActivityManager$classPrivilegedService()));
        }
    }

    public void startActivity(Intent intent) {
        requiresActivityManager();
        String callerPackage = (getUid() == 2000 || getUid() == LiveLiterals$PrivilegedServiceKt.INSTANCE.m2818Int$arg1$callEQEQ$else$cond$if$valcallerPackage$funstartActivity$classPrivilegedService()) ? LiveLiterals$PrivilegedServiceKt.INSTANCE.m2840String$branch$if$valcallerPackage$funstartActivity$classPrivilegedService() : "vegabobo.dsusideloader";
        int i = Build.VERSION.SDK_INT;
        LiveLiterals$PrivilegedServiceKt liveLiterals$PrivilegedServiceKt = LiveLiterals$PrivilegedServiceKt.INSTANCE;
        if (i > liveLiterals$PrivilegedServiceKt.m2820Int$arg1$callgreater$cond$if$funstartActivity$classPrivilegedService()) {
            IActivityManager iActivityManager = this.ACTIVITY_MANAGER;
            Intrinsics.checkNotNull(iActivityManager);
            iActivityManager.startActivityAsUserWithFeature((IApplicationThread) null, callerPackage, (String) null, intent, (String) null, (IBinder) null, (String) null, liveLiterals$PrivilegedServiceKt.m2828Int$arg7$callstartActivityAsUserWithFeature$branch$if$funstartActivity$classPrivilegedService(), liveLiterals$PrivilegedServiceKt.m2829Int$arg8$callstartActivityAsUserWithFeature$branch$if$funstartActivity$classPrivilegedService(), (ProfilerInfo) null, (Bundle) null, liveLiterals$PrivilegedServiceKt.m2824Int$arg11$callstartActivityAsUserWithFeature$branch$if$funstartActivity$classPrivilegedService());
            return;
        }
        IActivityManager iActivityManager2 = this.ACTIVITY_MANAGER;
        Intrinsics.checkNotNull(iActivityManager2);
        iActivityManager2.startActivityAsUser((IApplicationThread) null, callerPackage, intent, (String) null, (IBinder) null, (String) null, liveLiterals$PrivilegedServiceKt.m2826Int$arg6$callstartActivityAsUser$else$if$funstartActivity$classPrivilegedService(), liveLiterals$PrivilegedServiceKt.m2827Int$arg7$callstartActivityAsUser$else$if$funstartActivity$classPrivilegedService(), (ProfilerInfo) null, (Bundle) null, liveLiterals$PrivilegedServiceKt.m2823Int$arg10$callstartActivityAsUser$else$if$funstartActivity$classPrivilegedService());
    }

    public void forceStopPackage(String packageName) {
        requiresActivityManager();
        IActivityManager iActivityManager = this.ACTIVITY_MANAGER;
        Intrinsics.checkNotNull(iActivityManager);
        iActivityManager.forceStopPackage(packageName, LiveLiterals$PrivilegedServiceKt.INSTANCE.m2819Int$arg1$callforceStopPackage$funforceStopPackage$classPrivilegedService());
    }

    public final void requiresPackageManager() {
        if (this.PACKAGE_MANAGER == null) {
            this.PACKAGE_MANAGER = IPackageManager.Stub.asInterface(getBinder(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2834String$arg0$callgetBinder$arg0$callasInterface$arg0$call$setPACKAGE_MANAGER$$branch$if$funrequiresPackageManager$classPrivilegedService()));
        }
    }

    public void grantPermission(String permissionName) {
        requiresPackageManager();
        IPackageManager iPackageManager = this.PACKAGE_MANAGER;
        Intrinsics.checkNotNull(iPackageManager);
        iPackageManager.grantRuntimePermission("vegabobo.dsusideloader", permissionName, LiveLiterals$PrivilegedServiceKt.INSTANCE.m2825Int$arg2$callgrantRuntimePermission$fungrantPermission$classPrivilegedService());
    }

    public final void requiresStorageManager() {
        if (this.STORAGE_MANAGER == null) {
            this.STORAGE_MANAGER = IStorageManager.Stub.asInterface(getBinder(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2835String$arg0$callgetBinder$arg0$callasInterface$arg0$call$setSTORAGE_MANAGER$$branch$if$funrequiresStorageManager$classPrivilegedService()));
        }
    }

    public List getVolumes() {
        requiresStorageManager();
        ArrayList vols = new ArrayList();
        IStorageManager iStorageManager = this.STORAGE_MANAGER;
        Intrinsics.checkNotNull(iStorageManager);
        VolumeInfo[] volumes = iStorageManager.getVolumes(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2817Int$arg0$callgetVolumes$arg0$calladdAll$fungetVolumes$classPrivilegedService());
        Intrinsics.checkNotNullExpressionValue(volumes, "STORAGE_MANAGER!!.getVolumes(0)");
        CollectionsKt__MutableCollectionsKt.addAll((Collection) vols, (Object[]) volumes);
        return vols;
    }

    public void unmount(String volId) {
        requiresStorageManager();
        IStorageManager iStorageManager = this.STORAGE_MANAGER;
        Intrinsics.checkNotNull(iStorageManager);
        iStorageManager.unmount(volId);
    }

    public void mount(String volId) {
        requiresStorageManager();
        IStorageManager iStorageManager = this.STORAGE_MANAGER;
        Intrinsics.checkNotNull(iStorageManager);
        iStorageManager.mount(volId);
    }

    public final void requiresDynamicSystem() {
        if (this.DYNAMIC_SYSTEM == null) {
            this.DYNAMIC_SYSTEM = IDynamicSystemService.Stub.asInterface(getBinder(LiveLiterals$PrivilegedServiceKt.INSTANCE.m2833String$arg0$callgetBinder$arg0$callasInterface$arg0$call$setDYNAMIC_SYSTEM$$branch$if$funrequiresDynamicSystem$classPrivilegedService()));
        }
    }

    public boolean closePartition() {
        int i = Build.VERSION.SDK_INT;
        LiveLiterals$PrivilegedServiceKt liveLiterals$PrivilegedServiceKt = LiveLiterals$PrivilegedServiceKt.INSTANCE;
        if (i <= liveLiterals$PrivilegedServiceKt.m2822Int$arg1$calllessOrEqual$cond$if$funclosePartition$classPrivilegedService()) {
            return liveLiterals$PrivilegedServiceKt.m2815Boolean$branch$if$funclosePartition$classPrivilegedService();
        }
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.closePartition();
    }

    public boolean finishInstallation() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.finishInstallation();
    }

    public GsiProgress getInstallationProgress() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.getInstallationProgress();
    }

    public boolean abort() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.abort();
    }

    public boolean isEnabled() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.isEnabled();
    }

    public boolean remove() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.remove();
    }

    public boolean setEnable(boolean enable, boolean oneShot) {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.setEnable(enable, oneShot);
    }

    public boolean startInstallation(String dsuSlot) {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.startInstallation(dsuSlot);
    }

    public int createPartition(String name, long size, boolean readOnly) {
        requiresDynamicSystem();
        int i = Build.VERSION.SDK_INT;
        LiveLiterals$PrivilegedServiceKt liveLiterals$PrivilegedServiceKt = LiveLiterals$PrivilegedServiceKt.INSTANCE;
        if (i < liveLiterals$PrivilegedServiceKt.m2821Int$arg1$callless$cond$if$funcreatePartition$classPrivilegedService()) {
            IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
            Intrinsics.checkNotNull(iDynamicSystemService);
            Class<?> cls = iDynamicSystemService.getClass();
            IDynamicSystemService iDynamicSystemService2 = this.DYNAMIC_SYSTEM;
            Intrinsics.checkNotNull(iDynamicSystemService2);
            Object result = HiddenApiBypass.invoke(cls, iDynamicSystemService2, liveLiterals$PrivilegedServiceKt.m2839String$arg2$callinvoke$valresult$branch$if$funcreatePartition$classPrivilegedService(), name, Long.valueOf(size), Boolean.valueOf(readOnly));
            Intrinsics.checkNotNull(result, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) result).booleanValue() ^ true ? 1 : 0;
        }
        IDynamicSystemService iDynamicSystemService3 = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService3);
        return iDynamicSystemService3.createPartition(name, size, readOnly);
    }

    public boolean setAshmem(ParcelFileDescriptor fd, long size) {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.setAshmem(fd, size);
    }

    public boolean submitFromAshmem(long bytes) {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.submitFromAshmem(bytes);
    }

    public long suggestScratchSize() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.suggestScratchSize();
    }

    public boolean isInUse() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.isInUse();
    }

    public boolean isInstalled() {
        requiresDynamicSystem();
        IDynamicSystemService iDynamicSystemService = this.DYNAMIC_SYSTEM;
        Intrinsics.checkNotNull(iDynamicSystemService);
        return iDynamicSystemService.isInstalled();
    }
}
