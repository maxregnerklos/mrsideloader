package vegabobo.dsusideloader.ui.screen.settings;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SettingsViewModel $settingsViewModel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$1(SettingsViewModel settingsViewModel, Continuation continuation) {
        super(2, continuation);
        this.$settingsViewModel = settingsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsScreenKt$Settings$1(this.$settingsViewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SettingsScreenKt$Settings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.$settingsViewModel.checkDevOpt();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
