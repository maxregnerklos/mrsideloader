package vegabobo.dsusideloader.installer.root;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DSUInstaller.kt */
public final class DSUInstaller$installWritablePartition$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CompletableJob $job;
    public final /* synthetic */ String $partition;
    public final /* synthetic */ long $partitionSize;
    public final /* synthetic */ boolean $readOnly;
    public int label;
    public final /* synthetic */ DSUInstaller this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DSUInstaller$installWritablePartition$1(DSUInstaller dSUInstaller, String str, long j, boolean z, CompletableJob completableJob, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dSUInstaller;
        this.$partition = str;
        this.$partitionSize = j;
        this.$readOnly = z;
        this.$job = completableJob;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new DSUInstaller$installWritablePartition$1(this.this$0, this.$partition, this.$partitionSize, this.$readOnly, this.$job, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DSUInstaller$installWritablePartition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.this$0.createNewPartition(this.$partition, this.$partitionSize, this.$readOnly);
                this.$job.complete();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
