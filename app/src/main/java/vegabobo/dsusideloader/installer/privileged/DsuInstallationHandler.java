package vegabobo.dsusideloader.installer.privileged;

import android.os.storage.VolumeInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.service.PrivilegedProvider;

/* compiled from: DsuInstallationHandler.kt */
public class DsuInstallationHandler {
    public static final int $stable = LiveLiterals$DsuInstallationHandlerKt.INSTANCE.m2594Int$classDsuInstallationHandler();
    public final Session session;
    public final String tag = getClass().getSimpleName();

    public DsuInstallationHandler(Session session2) {
        Intrinsics.checkNotNullParameter(session2, "session");
        this.session = session2;
    }

    public final void startInstallation() {
        if (this.session.getPreferences().isUnmountSdCard()) {
            unmountSdTemporary();
        }
        forwardInstallationToDSU();
    }

    public final void forwardInstallationToDSU() {
        long userdataSize = this.session.getUserSelection().getUserSelectedUserdata();
        PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new DsuInstallationHandler$forwardInstallationToDSU$1(this.session.getDsuInstallation().getUri(), userdataSize, this.session.getDsuInstallation().getFileSize(), this, (Continuation) null), 1, (Object) null);
    }

    public final void unmountSdTemporary() {
        List<VolumeInfo> volumes = PrivilegedProvider.INSTANCE.getService().getVolumes();
        Intrinsics.checkNotNullExpressionValue(volumes, "PrivilegedProvider.getService().volumes");
        ArrayList volumesUnmount = new ArrayList();
        for (VolumeInfo volume : volumes) {
            String str = volume.id;
            Intrinsics.checkNotNullExpressionValue(str, "volume.id");
            LiveLiterals$DsuInstallationHandlerKt liveLiterals$DsuInstallationHandlerKt = LiveLiterals$DsuInstallationHandlerKt.INSTANCE;
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) liveLiterals$DsuInstallationHandlerKt.m2598String$arg0$callcontains$cond$if$body$loop$fununmountSdTemporary$classDsuInstallationHandler(), false, 2, (Object) null)) {
                PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new DsuInstallationHandler$unmountSdTemporary$1(volume, (Continuation) null), 1, (Object) null);
                volumesUnmount.add(volume.id);
                String str2 = this.tag;
                String r5 = liveLiterals$DsuInstallationHandlerKt.m2596String$0$str$arg1$calld$branch$if$body$loop$fununmountSdTemporary$classDsuInstallationHandler();
                String str3 = volume.id;
                Log.d(str2, r5 + str3);
            }
        }
        if (volumesUnmount.size() > LiveLiterals$DsuInstallationHandlerKt.INSTANCE.m2593Int$arg1$callgreater$cond$if$fununmountSdTemporary$classDsuInstallationHandler()) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())), (CoroutineContext) null, (CoroutineStart) null, new DsuInstallationHandler$unmountSdTemporary$2(volumesUnmount, this, (Continuation) null), 3, (Object) null);
        }
    }
}
