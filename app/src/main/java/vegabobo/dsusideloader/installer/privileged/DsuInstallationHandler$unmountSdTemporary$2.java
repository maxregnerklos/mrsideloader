package vegabobo.dsusideloader.installer.privileged;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import vegabobo.dsusideloader.IPrivilegedService;
import vegabobo.dsusideloader.service.PrivilegedProvider;

/* compiled from: DsuInstallationHandler.kt */
public final class DsuInstallationHandler$unmountSdTemporary$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ArrayList $volumesUnmount;
    public int label;
    public final /* synthetic */ DsuInstallationHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsuInstallationHandler$unmountSdTemporary$2(ArrayList arrayList, DsuInstallationHandler dsuInstallationHandler, Continuation continuation) {
        super(2, continuation);
        this.$volumesUnmount = arrayList;
        this.this$0 = dsuInstallationHandler;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new DsuInstallationHandler$unmountSdTemporary$2(this.$volumesUnmount, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DsuInstallationHandler$unmountSdTemporary$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        DsuInstallationHandler$unmountSdTemporary$2 dsuInstallationHandler$unmountSdTemporary$2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                LiveLiterals$DsuInstallationHandlerKt liveLiterals$DsuInstallationHandlerKt = LiveLiterals$DsuInstallationHandlerKt.INSTANCE;
                this.label = 1;
                if (DelayKt.delay((long) (liveLiterals$DsuInstallationHandlerKt.m2591Int$$this$calltimes$$this$calltoLong$arg0$calldelay$fun$anonymous$$arg2$calllaunch$branch$if$fununmountSdTemporary$classDsuInstallationHandler() * liveLiterals$DsuInstallationHandlerKt.m2592Int$arg0$calltimes$$this$calltoLong$arg0$calldelay$fun$anonymous$$arg2$calllaunch$branch$if$fununmountSdTemporary$classDsuInstallationHandler()), this) != coroutine_suspended) {
                    dsuInstallationHandler$unmountSdTemporary$2 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                dsuInstallationHandler$unmountSdTemporary$2 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = dsuInstallationHandler$unmountSdTemporary$2.$volumesUnmount.iterator();
        while (it.hasNext()) {
            final String volume = (String) it.next();
            String access$getTag$p = dsuInstallationHandler$unmountSdTemporary$2.this$0.tag;
            String r5 = LiveLiterals$DsuInstallationHandlerKt.INSTANCE.m2595String$0$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$branch$if$fununmountSdTemporary$classDsuInstallationHandler();
            Log.d(access$getTag$p, r5 + volume);
            PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new AnonymousClass1((Continuation) null), 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: vegabobo.dsusideloader.installer.privileged.DsuInstallationHandler$unmountSdTemporary$2$1  reason: invalid class name */
    /* compiled from: DsuInstallationHandler.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ Object L$0;
        public int label;

        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(volume, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
            return ((AnonymousClass1) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    ((IPrivilegedService) this.L$0).mount(volume);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
