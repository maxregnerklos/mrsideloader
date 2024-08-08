package vegabobo.dsusideloader.ui.screen.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import vegabobo.dsusideloader.util.OperationMode;

/* compiled from: HomeScreen.kt */
public final class HomeScreenKt$Home$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ HomeViewModel $homeViewModel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$Home$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.$homeViewModel = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenKt$Home$1(this.$homeViewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeScreenKt$Home$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$1$1  reason: invalid class name */
    /* compiled from: HomeScreen.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public int label;

        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(homeViewModel, continuation);
        }

        public final Object invoke(OperationMode operationMode, Continuation continuation) {
            return ((AnonymousClass1) create(operationMode, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    homeViewModel.initialChecks();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$homeViewModel.setupUserPreferences();
                MutableStateFlow operationMode = this.$homeViewModel.getSession().getOperationMode();
                final HomeViewModel homeViewModel = this.$homeViewModel;
                AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                this.label = 1;
                if (FlowKt.collectLatest(operationMode, r3, this) != coroutine_suspended) {
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
