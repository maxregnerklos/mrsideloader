package vegabobo.dsusideloader.ui.screen.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vegabobo.dsusideloader.core.BaseViewModel;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onClickBootloaderUnlockedWarning$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onClickBootloaderUnlockedWarning$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$onClickBootloaderUnlockedWarning$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$onClickBootloaderUnlockedWarning$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        HomeViewModel$onClickBootloaderUnlockedWarning$1 homeViewModel$onClickBootloaderUnlockedWarning$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                HomeViewModel homeViewModel = this.this$0;
                boolean r3 = LiveLiterals$HomeViewModelKt.INSTANCE.m3283Boolean$arg1$callupdateBoolPref$fun$anonymous$$arg2$calllaunch$funonClickBootloaderUnlockedWarning$classHomeViewModel();
                this.label = 1;
                if (BaseViewModel.updateBoolPref$default(homeViewModel, "bootloader_unlocked_warning", r3, (Function1) null, this, 4, (Object) null) != coroutine_suspended) {
                    homeViewModel$onClickBootloaderUnlockedWarning$1 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                homeViewModel$onClickBootloaderUnlockedWarning$1 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel$onClickBootloaderUnlockedWarning$1.this$0.initialChecks();
        return Unit.INSTANCE;
    }
}
