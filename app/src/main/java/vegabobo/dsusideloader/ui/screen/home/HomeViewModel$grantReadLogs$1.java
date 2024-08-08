package vegabobo.dsusideloader.ui.screen.home;

import android.content.Intent;
import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$grantReadLogs$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent $intent;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$grantReadLogs$1(Intent intent, Continuation continuation) {
        super(2, continuation);
        this.$intent = intent;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$grantReadLogs$1 homeViewModel$grantReadLogs$1 = new HomeViewModel$grantReadLogs$1(this.$intent, continuation);
        homeViewModel$grantReadLogs$1.L$0 = obj;
        return homeViewModel$grantReadLogs$1;
    }

    public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
        return ((HomeViewModel$grantReadLogs$1) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                IPrivilegedService $this$run = (IPrivilegedService) this.L$0;
                LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
                $this$run.grantPermission(liveLiterals$HomeViewModelKt.m3346String$arg0$callgrantPermission$fun$anonymous$$arg1$callrun$fungrantReadLogs$classHomeViewModel());
                if (Build.VERSION.SDK_INT <= liveLiterals$HomeViewModelKt.m3291Int$arg1$calllessOrEqual$cond$if$fun$anonymous$$arg1$callrun$fungrantReadLogs$classHomeViewModel()) {
                    $this$run.forceStopPackage("vegabobo.dsusideloader");
                }
                $this$run.startActivity(this.$intent);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
