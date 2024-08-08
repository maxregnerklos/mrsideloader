package vegabobo.dsusideloader.installer.root;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: DSUInstaller.kt */
public final class DSUInstaller$installWritablePartition$2 extends SuspendLambda implements Function2 {
    public int label;

    public DSUInstaller$installWritablePartition$2(Continuation continuation) {
        super(2, continuation);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new DSUInstaller$installWritablePartition$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DSUInstaller$installWritablePartition$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                long r2 = LiveLiterals$DSUInstallerKt.INSTANCE.m2660Long$arg0$calldelay$fun$anonymous$$arg1$callrunBlocking$body$loop$funinstallWritablePartition$classDSUInstaller();
                this.label = 1;
                if (DelayKt.delay(r2, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
