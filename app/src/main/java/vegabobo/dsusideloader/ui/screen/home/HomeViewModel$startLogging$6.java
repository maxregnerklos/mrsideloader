package vegabobo.dsusideloader.ui.screen.home;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vegabobo.dsusideloader.installer.privileged.LogcatDiagnostic;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$startLogging$6 extends SuspendLambda implements Function2 {
    public Object L$0;
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$startLogging$6(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$startLogging$6(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$startLogging$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        LogcatDiagnostic logcatDiagnostic;
        HomeViewModel$startLogging$6 homeViewModel$startLogging$6;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                homeViewModel$startLogging$6 = this;
                logcatDiagnostic = homeViewModel$startLogging$6.this$0.getLogger();
                Intrinsics.checkNotNull(logcatDiagnostic);
                HomeViewModel homeViewModel = homeViewModel$startLogging$6.this$0;
                homeViewModel$startLogging$6.L$0 = logcatDiagnostic;
                homeViewModel$startLogging$6.label = 1;
                Object readBoolPref = homeViewModel.readBoolPref("full_logcat_logging", homeViewModel$startLogging$6);
                if (readBoolPref != coroutine_suspended) {
                    Object obj = $result;
                    $result = readBoolPref;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                logcatDiagnostic = (LogcatDiagnostic) this.L$0;
                homeViewModel$startLogging$6 = this;
                Object obj2 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        logcatDiagnostic.setShouldLogEverything(((Boolean) $result).booleanValue());
        LogcatDiagnostic logger = homeViewModel$startLogging$6.this$0.getLogger();
        Intrinsics.checkNotNull(logger);
        logger.startLogging(homeViewModel$startLogging$6.this$0.generateUsefulLogInfo());
        return Unit.INSTANCE;
    }
}
