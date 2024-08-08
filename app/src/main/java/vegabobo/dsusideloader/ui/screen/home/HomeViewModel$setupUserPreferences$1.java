package vegabobo.dsusideloader.ui.screen.home;

import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$setupUserPreferences$1 extends SuspendLambda implements Function2 {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$setupUserPreferences$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$setupUserPreferences$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$setupUserPreferences$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        HomeViewModel homeViewModel;
        boolean shouldKeepScreenOn;
        Object $result;
        HomeViewModel$setupUserPreferences$1 homeViewModel$setupUserPreferences$1;
        Object obj2;
        HomeViewModel$setupUserPreferences$1 homeViewModel$setupUserPreferences$12;
        Object prevValue$iv;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = false;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                homeViewModel$setupUserPreferences$12 = this;
                Object obj3 = obj;
                HomeViewModel homeViewModel2 = homeViewModel$setupUserPreferences$12.this$0;
                homeViewModel$setupUserPreferences$12.label = 1;
                obj2 = homeViewModel2.readBoolPref("keep_screen_on", homeViewModel$setupUserPreferences$12);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                homeViewModel$setupUserPreferences$12 = this;
                Object $result2 = obj;
                ResultKt.throwOnFailure($result2);
                obj2 = $result2;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                homeViewModel$setupUserPreferences$1 = this;
                $result = obj;
                boolean shouldKeepScreenOn2 = homeViewModel$setupUserPreferences$1.Z$0;
                ResultKt.throwOnFailure($result);
                homeViewModel = (HomeViewModel) homeViewModel$setupUserPreferences$1.L$0;
                shouldKeepScreenOn = shouldKeepScreenOn2;
                Object obj4 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        shouldKeepScreenOn = ((Boolean) obj2).booleanValue();
        Log.d(homeViewModel$setupUserPreferences$12.this$0.tag, LiveLiterals$HomeViewModelKt.INSTANCE.m3307String$0$str$arg1$calld$fun$anonymous$$arg2$calllaunch$funsetupUserPreferences$classHomeViewModel() + shouldKeepScreenOn);
        MutableStateFlow $this$update$iv = homeViewModel$setupUserPreferences$12.this$0._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, false, shouldKeepScreenOn, 127, (Object) null)));
        homeViewModel = homeViewModel$setupUserPreferences$12.this$0;
        homeViewModel$setupUserPreferences$12.L$0 = homeViewModel;
        homeViewModel$setupUserPreferences$12.Z$0 = shouldKeepScreenOn;
        homeViewModel$setupUserPreferences$12.label = 2;
        Object readBoolPref = homeViewModel.readBoolPref("disable_storage_check", homeViewModel$setupUserPreferences$12);
        if (readBoolPref == coroutine_suspended) {
            return coroutine_suspended;
        }
        homeViewModel$setupUserPreferences$1 = homeViewModel$setupUserPreferences$12;
        $result = readBoolPref;
        homeViewModel.setDisabledStorageCheck(((Boolean) $result).booleanValue());
        String access$getTag$p = homeViewModel$setupUserPreferences$1.this$0.tag;
        String r6 = LiveLiterals$HomeViewModelKt.INSTANCE.m3316String$0$str$arg1$calld1$fun$anonymous$$arg2$calllaunch$funsetupUserPreferences$classHomeViewModel();
        if (shouldKeepScreenOn) {
            z = true;
        }
        Log.d(access$getTag$p, r6 + z);
        return Unit.INSTANCE;
    }
}
