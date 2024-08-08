package vegabobo.dsusideloader.ui.screen.settings;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$checkDevOpt$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ SettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$checkDevOpt$1(SettingsViewModel settingsViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = settingsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$checkDevOpt$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SettingsViewModel$checkDevOpt$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        SettingsViewModel$checkDevOpt$1 settingsViewModel$checkDevOpt$1;
        Object prevValue$iv;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                settingsViewModel$checkDevOpt$1 = this;
                SettingsViewModel settingsViewModel = settingsViewModel$checkDevOpt$1.this$0;
                settingsViewModel$checkDevOpt$1.label = 1;
                Object readBoolPref = settingsViewModel.readBoolPref("developer_options", settingsViewModel$checkDevOpt$1);
                if (readBoolPref != coroutine_suspended) {
                    Object obj = $result;
                    $result = readBoolPref;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                settingsViewModel$checkDevOpt$1 = this;
                Object obj2 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean isDevOptEnabled = ((Boolean) $result).booleanValue();
        MutableStateFlow $this$update$iv = settingsViewModel$checkDevOpt$1.this$0._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, SettingsUiState.copy$default((SettingsUiState) prevValue$iv, (HashMap) null, (DialogSheetState) null, false, isDevOptEnabled, 7, (Object) null)));
        if (isDevOptEnabled) {
            settingsViewModel$checkDevOpt$1.this$0.reloadPreferences();
        }
        return Unit.INSTANCE;
    }
}
