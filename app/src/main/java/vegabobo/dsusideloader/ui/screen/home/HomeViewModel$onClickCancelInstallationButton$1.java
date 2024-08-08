package vegabobo.dsusideloader.ui.screen.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onClickCancelInstallationButton$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;

    public HomeViewModel$onClickCancelInstallationButton$1(Continuation continuation) {
        super(2, continuation);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$onClickCancelInstallationButton$1 homeViewModel$onClickCancelInstallationButton$1 = new HomeViewModel$onClickCancelInstallationButton$1(continuation);
        homeViewModel$onClickCancelInstallationButton$1.L$0 = obj;
        return homeViewModel$onClickCancelInstallationButton$1;
    }

    public final Object invoke(IPrivilegedService iPrivilegedService, Continuation continuation) {
        return ((HomeViewModel$onClickCancelInstallationButton$1) create(iPrivilegedService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ((IPrivilegedService) this.L$0).forceStopPackage(LiveLiterals$HomeViewModelKt.INSTANCE.m3343String$arg0$callforceStopPackage$fun$anonymous$$arg1$callrun$branch$if$funonClickCancelInstallationButton$classHomeViewModel());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
