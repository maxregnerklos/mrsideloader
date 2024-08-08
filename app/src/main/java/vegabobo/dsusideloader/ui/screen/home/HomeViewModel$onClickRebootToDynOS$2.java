package vegabobo.dsusideloader.ui.screen.home;

import com.topjohnwu.superuser.Shell;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onClickRebootToDynOS$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;

    public HomeViewModel$onClickRebootToDynOS$2(Continuation continuation) {
        super(2, continuation);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$onClickRebootToDynOS$2 homeViewModel$onClickRebootToDynOS$2 = new HomeViewModel$onClickRebootToDynOS$2(continuation);
        homeViewModel$onClickRebootToDynOS$2.L$0 = obj;
        return homeViewModel$onClickRebootToDynOS$2;
    }

    public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
        return ((HomeViewModel$onClickRebootToDynOS$2) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
                ((IPrivilegedService) this.L$0).setEnable(liveLiterals$HomeViewModelKt.m3276Boolean$arg0$callsetEnable$fun$anonymous$$arg1$callrun$funonClickRebootToDynOS$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3282Boolean$arg1$callsetEnable$fun$anonymous$$arg1$callrun$funonClickRebootToDynOS$classHomeViewModel());
                Shell.cmd(liveLiterals$HomeViewModelKt.m3318String$0$vararg$arg0$callcmd$$this$callexec$fun$anonymous$$arg1$callrun$funonClickRebootToDynOS$classHomeViewModel()).exec();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
