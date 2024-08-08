package vegabobo.dsusideloader.ui.screen.home;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import vegabobo.dsusideloader.util.OperationMode;
import vegabobo.dsusideloader.util.OperationModeUtils;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$initialChecks$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$initialChecks$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$initialChecks$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$initialChecks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object $result;
        HomeViewModel$initialChecks$1 homeViewModel$initialChecks$1;
        Object prevValue$iv;
        Object prevValue$iv2;
        Object obj2;
        HomeViewModel$initialChecks$1 homeViewModel$initialChecks$12;
        Object prevValue$iv3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                homeViewModel$initialChecks$12 = this;
                Object obj3 = obj;
                HomeViewModel homeViewModel = homeViewModel$initialChecks$12.this$0;
                homeViewModel$initialChecks$12.label = 1;
                obj2 = homeViewModel.readStringPref("writable_path", homeViewModel$initialChecks$12);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                homeViewModel$initialChecks$12 = this;
                Object $result2 = obj;
                ResultKt.throwOnFailure($result2);
                obj2 = $result2;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                homeViewModel$initialChecks$1 = this;
                $result = obj;
                ResultKt.throwOnFailure($result);
                Object obj4 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!homeViewModel$initialChecks$12.this$0.storageManager.arePermissionsGrantedToFolder((String) obj2)) {
            homeViewModel$initialChecks$12.this$0.updateAdditionalCardState(AdditionalCardState.SETUP_STORAGE);
            return Unit.INSTANCE;
        } else if (homeViewModel$initialChecks$12.this$0.getSession().getOperationMode() != OperationMode.SHIZUKU || !homeViewModel$initialChecks$12.this$0.getCheckReadLogsPermission() || OperationModeUtils.Companion.isReadLogsPermissionGranted(homeViewModel$initialChecks$12.this$0.getApplication())) {
            HomeViewModel homeViewModel2 = homeViewModel$initialChecks$12.this$0;
            homeViewModel$initialChecks$12.label = 2;
            Object readBoolPref = homeViewModel2.readBoolPref("bootloader_unlocked_warning", homeViewModel$initialChecks$12);
            if (readBoolPref == coroutine_suspended) {
                return coroutine_suspended;
            }
            homeViewModel$initialChecks$1 = homeViewModel$initialChecks$12;
            $result = readBoolPref;
            if (!((Boolean) $result).booleanValue()) {
                MutableStateFlow $this$update$iv = homeViewModel$initialChecks$1.this$0._uiState;
                do {
                    prevValue$iv2 = $this$update$iv.getValue();
                } while (!$this$update$iv.compareAndSet(prevValue$iv2, HomeUiState.copy$default((HomeUiState) prevValue$iv2, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, LiveLiterals$HomeViewModelKt.INSTANCE.m3288Boolean$arg6$callcopy$fun$anonymous$$arg0$callupdate$branch$if2$fun$anonymous$$arg2$calllaunch$funinitialChecks$classHomeViewModel(), false, 191, (Object) null)));
                homeViewModel$initialChecks$1.this$0.updateAdditionalCardState(AdditionalCardState.BOOTLOADER_UNLOCKED_WARNING);
                return Unit.INSTANCE;
            }
            homeViewModel$initialChecks$1.this$0.updateAdditionalCardState(AdditionalCardState.NONE);
            MutableStateFlow $this$update$iv2 = homeViewModel$initialChecks$1.this$0._uiState;
            do {
                prevValue$iv = $this$update$iv2.getValue();
            } while (!$this$update$iv2.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, LiveLiterals$HomeViewModelKt.INSTANCE.m3289Boolean$arg6$callcopy$fun$anonymous$$arg0$callupdate$fun$anonymous$$arg2$calllaunch$funinitialChecks$classHomeViewModel(), false, 191, (Object) null)));
            return Unit.INSTANCE;
        } else {
            MutableStateFlow $this$update$iv3 = homeViewModel$initialChecks$12.this$0._uiState;
            do {
                prevValue$iv3 = $this$update$iv3.getValue();
            } while (!$this$update$iv3.compareAndSet(prevValue$iv3, HomeUiState.copy$default((HomeUiState) prevValue$iv3, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, LiveLiterals$HomeViewModelKt.INSTANCE.m3287Boolean$arg6$callcopy$fun$anonymous$$arg0$callupdate$branch$if1$fun$anonymous$$arg2$calllaunch$funinitialChecks$classHomeViewModel(), false, 191, (Object) null)));
            homeViewModel$initialChecks$12.this$0.updateAdditionalCardState(AdditionalCardState.MISSING_READ_LOGS_PERMISSION);
            return Unit.INSTANCE;
        }
    }
}
