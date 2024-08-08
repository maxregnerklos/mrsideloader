package vegabobo.dsusideloader.ui.screen.settings;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$reloadPreferences$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map.Entry $entry;
    public int label;
    public final /* synthetic */ SettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$reloadPreferences$1$1(SettingsViewModel settingsViewModel, Map.Entry entry, Continuation continuation) {
        super(2, continuation);
        this.this$0 = settingsViewModel;
        this.$entry = entry;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$reloadPreferences$1$1(this.this$0, this.$entry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SettingsViewModel$reloadPreferences$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        SettingsViewModel$reloadPreferences$1$1 settingsViewModel$reloadPreferences$1$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                settingsViewModel$reloadPreferences$1$1 = this;
                settingsViewModel$reloadPreferences$1$1.label = 1;
                Object readBoolPref = settingsViewModel$reloadPreferences$1$1.this$0.readBoolPref((String) settingsViewModel$reloadPreferences$1$1.$entry.getKey(), settingsViewModel$reloadPreferences$1$1);
                if (readBoolPref != coroutine_suspended) {
                    Object obj = $result;
                    $result = readBoolPref;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                settingsViewModel$reloadPreferences$1$1 = this;
                Object obj2 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean isEnabled = ((Boolean) $result).booleanValue();
        SettingsViewModel settingsViewModel = settingsViewModel$reloadPreferences$1$1.this$0;
        String str = (String) settingsViewModel$reloadPreferences$1$1.$entry.getKey();
        if (!isEnabled) {
            z = false;
        }
        settingsViewModel.togglePreference(str, z);
        return Unit.INSTANCE;
    }
}
