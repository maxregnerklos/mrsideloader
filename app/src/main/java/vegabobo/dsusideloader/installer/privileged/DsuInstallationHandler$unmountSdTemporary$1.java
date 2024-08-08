package vegabobo.dsusideloader.installer.privileged;

import android.os.storage.VolumeInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: DsuInstallationHandler.kt */
public final class DsuInstallationHandler$unmountSdTemporary$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ VolumeInfo $volume;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsuInstallationHandler$unmountSdTemporary$1(VolumeInfo volumeInfo, Continuation continuation) {
        super(2, continuation);
        this.$volume = volumeInfo;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        DsuInstallationHandler$unmountSdTemporary$1 dsuInstallationHandler$unmountSdTemporary$1 = new DsuInstallationHandler$unmountSdTemporary$1(this.$volume, continuation);
        dsuInstallationHandler$unmountSdTemporary$1.L$0 = obj;
        return dsuInstallationHandler$unmountSdTemporary$1;
    }

    public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
        return ((DsuInstallationHandler$unmountSdTemporary$1) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ((IPrivilegedService) this.L$0).unmount(this.$volume.id);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
