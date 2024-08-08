package vegabobo.dsusideloader.ui.screen.home;

import com.topjohnwu.superuser.Shell;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onClickSetSeLinuxPermissive$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onClickSetSeLinuxPermissive$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$onClickSetSeLinuxPermissive$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$onClickSetSeLinuxPermissive$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        HomeViewModel$onClickSetSeLinuxPermissive$2 homeViewModel$onClickSetSeLinuxPermissive$2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
                Shell.cmd(liveLiterals$HomeViewModelKt.m3319String$0$vararg$arg0$callcmd$$this$callexec$fun$anonymous$$arg2$calllaunch$funonClickSetSeLinuxPermissive$classHomeViewModel()).exec();
                long r3 = liveLiterals$HomeViewModelKt.m3295Long$arg0$calldelay$fun$anonymous$$arg2$calllaunch$funonClickSetSeLinuxPermissive$classHomeViewModel();
                this.label = 1;
                if (DelayKt.delay(r3, this) != coroutine_suspended) {
                    homeViewModel$onClickSetSeLinuxPermissive$2 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                homeViewModel$onClickSetSeLinuxPermissive$2 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel$onClickSetSeLinuxPermissive$2.this$0.startInstallation();
        return Unit.INSTANCE;
    }
}
