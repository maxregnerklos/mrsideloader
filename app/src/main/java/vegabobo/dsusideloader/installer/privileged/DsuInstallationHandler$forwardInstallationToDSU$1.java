package vegabobo.dsusideloader.installer.privileged;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: DsuInstallationHandler.kt */
public final class DsuInstallationHandler$forwardInstallationToDSU$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Uri $fileUri;
    public final /* synthetic */ long $length;
    public final /* synthetic */ long $userdataSize;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DsuInstallationHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsuInstallationHandler$forwardInstallationToDSU$1(Uri uri, long j, long j2, DsuInstallationHandler dsuInstallationHandler, Continuation continuation) {
        super(2, continuation);
        this.$fileUri = uri;
        this.$userdataSize = j;
        this.$length = j2;
        this.this$0 = dsuInstallationHandler;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        DsuInstallationHandler$forwardInstallationToDSU$1 dsuInstallationHandler$forwardInstallationToDSU$1 = new DsuInstallationHandler$forwardInstallationToDSU$1(this.$fileUri, this.$userdataSize, this.$length, this.this$0, continuation);
        dsuInstallationHandler$forwardInstallationToDSU$1.L$0 = obj;
        return dsuInstallationHandler$forwardInstallationToDSU$1;
    }

    public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
        return ((DsuInstallationHandler$forwardInstallationToDSU$1) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                IPrivilegedService $this$run = (IPrivilegedService) this.L$0;
                $this$run.setDynProp();
                LiveLiterals$DsuInstallationHandlerKt liveLiterals$DsuInstallationHandlerKt = LiveLiterals$DsuInstallationHandlerKt.INSTANCE;
                $this$run.forceStopPackage(liveLiterals$DsuInstallationHandlerKt.m2599String$arg0$callforceStopPackage$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler());
                Intent dynIntent = new Intent();
                dynIntent.setClassName(liveLiterals$DsuInstallationHandlerKt.m2603String$arg0$callsetClassName$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler(), liveLiterals$DsuInstallationHandlerKt.m2604String$arg1$callsetClassName$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler());
                dynIntent.setFlags(dynIntent.getFlags() + 268435456);
                dynIntent.setAction(liveLiterals$DsuInstallationHandlerKt.m2602String$arg0$callsetAction$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler());
                dynIntent.setData(this.$fileUri);
                dynIntent.putExtra(liveLiterals$DsuInstallationHandlerKt.m2600String$arg0$callputExtra$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler(), this.$userdataSize);
                dynIntent.putExtra(liveLiterals$DsuInstallationHandlerKt.m2601String$arg0$callputExtra1$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler(), this.$length);
                String access$getTag$p = this.this$0.tag;
                String r2 = liveLiterals$DsuInstallationHandlerKt.m2597String$0$str$arg1$calld$fun$anonymous$$arg1$callrun$funforwardInstallationToDSU$classDsuInstallationHandler();
                Log.d(access$getTag$p, r2 + dynIntent);
                $this$run.startActivity(dynIntent);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
