package vegabobo.dsusideloader.ui.screen.settings;

import android.util.Log;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$togglePreference$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $preference;
    public final /* synthetic */ boolean $value;
    public int label;
    public final /* synthetic */ SettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$togglePreference$1(SettingsViewModel settingsViewModel, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = settingsViewModel;
        this.$preference = str;
        this.$value = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$togglePreference$1(this.this$0, this.$preference, this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SettingsViewModel$togglePreference$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final SettingsViewModel settingsViewModel = this.this$0;
                final String str = this.$preference;
                final boolean z = this.$value;
                AnonymousClass1 r5 = new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke(((Boolean) p1).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean it) {
                        Object prevValue$iv;
                        HashMap cloneMap;
                        MutableStateFlow $this$update$iv = settingsViewModel._uiState;
                        SettingsViewModel settingsViewModel = settingsViewModel;
                        String str = str;
                        boolean z = z;
                        do {
                            prevValue$iv = $this$update$iv.getValue();
                            cloneMap = new HashMap();
                            cloneMap.putAll(((SettingsUiState) settingsViewModel.getUiState().getValue()).getPreferences());
                            cloneMap.put(str, Boolean.valueOf(z));
                            String access$getTag$p = settingsViewModel.tag;
                            LiveLiterals$SettingsViewModelKt liveLiterals$SettingsViewModelKt = LiveLiterals$SettingsViewModelKt.INSTANCE;
                            String r9 = liveLiterals$SettingsViewModelKt.m3400String$0$str$arg1$calld$fun$anonymous$$arg0$callupdate$fun$anonymous$$arg2$callupdateBoolPref$fun$anonymous$$arg2$calllaunch$funtogglePreference$classSettingsViewModel();
                            String r8 = liveLiterals$SettingsViewModelKt.m3401String$2$str$arg1$calld$fun$anonymous$$arg0$callupdate$fun$anonymous$$arg2$callupdateBoolPref$fun$anonymous$$arg2$calllaunch$funtogglePreference$classSettingsViewModel();
                            Log.d(access$getTag$p, r9 + str + r8 + z);
                            HashMap hashMap = cloneMap;
                        } while (!$this$update$iv.compareAndSet(prevValue$iv, SettingsUiState.copy$default((SettingsUiState) prevValue$iv, cloneMap, (DialogSheetState) null, false, false, 14, (Object) null)));
                    }
                };
                this.label = 1;
                if (settingsViewModel.updateBoolPref(str, z, r5, this) != coroutine_suspended) {
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
