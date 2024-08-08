package vegabobo.dsusideloader.ui.screen.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onFileSelectionResult$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onFileSelectionResult$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$onFileSelectionResult$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$onFileSelectionResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        HomeViewModel$onFileSelectionResult$1 homeViewModel$onFileSelectionResult$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.this$0.updateInstallationCard(AnonymousClass1.INSTANCE);
                long r2 = LiveLiterals$HomeViewModelKt.INSTANCE.m3294Long$arg0$calldelay$fun$anonymous$$arg2$calllaunch$branch$if1$funonFileSelectionResult$classHomeViewModel();
                this.label = 1;
                if (DelayKt.delay(r2, this) != coroutine_suspended) {
                    homeViewModel$onFileSelectionResult$1 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                homeViewModel$onFileSelectionResult$1 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel$onFileSelectionResult$1.this$0.updateInstallationCard(AnonymousClass2.INSTANCE);
        return Unit.INSTANCE;
    }
}
