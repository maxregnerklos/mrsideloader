package vegabobo.dsusideloader.ui.screen.settings;

import android.app.Application;
import android.os.Build;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModelKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import vegabobo.dsusideloader.core.BaseViewModel;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.util.OperationMode;
import vegabobo.dsusideloader.util.OperationModeUtils;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel extends BaseViewModel {
    public static final int $stable = LiveLiterals$SettingsViewModelKt.INSTANCE.m3399Int$classSettingsViewModel();
    public final MutableStateFlow _uiState;
    public final Application application;
    public final DataStore dataStore;
    public final Session session;
    public final String tag = getClass().getSimpleName();
    public final StateFlow uiState;

    public DataStore getDataStore() {
        return this.dataStore;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(DataStore dataStore2, Session session2, Application application2) {
        super(dataStore2);
        Intrinsics.checkNotNullParameter(dataStore2, "dataStore");
        Intrinsics.checkNotNullParameter(session2, "session");
        Intrinsics.checkNotNullParameter(application2, "application");
        this.dataStore = dataStore2;
        this.session = session2;
        this.application = application2;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new SettingsUiState((HashMap) null, (DialogSheetState) null, false, false, 15, (DefaultConstructorMarker) null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        reloadPreferences();
    }

    public final StateFlow getUiState() {
        return this.uiState;
    }

    public final void reloadPreferences() {
        Object prevValue$iv;
        for (Map.Entry element$iv : ((SettingsUiState) this.uiState.getValue()).getPreferences().entrySet()) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new SettingsViewModel$reloadPreferences$1$1(this, element$iv, (Continuation) null), 3, (Object) null);
        }
        if (this.session.isRoot()) {
            MutableStateFlow $this$update$iv = this._uiState;
            do {
                prevValue$iv = $this$update$iv.getValue();
            } while (!$this$update$iv.compareAndSet(prevValue$iv, SettingsUiState.copy$default((SettingsUiState) prevValue$iv, (HashMap) null, (DialogSheetState) null, LiveLiterals$SettingsViewModelKt.INSTANCE.m3397Boolean$arg2$callcopy$fun$anonymous$$arg0$callupdate$branch$if$funreloadPreferences$classSettingsViewModel(), false, 11, (Object) null)));
        }
    }

    public final void togglePreference(String preference, boolean value) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new SettingsViewModel$togglePreference$1(this, preference, value, (Continuation) null), 3, (Object) null);
    }

    public final boolean isAndroidQ() {
        return Build.VERSION.SDK_INT == LiveLiterals$SettingsViewModelKt.INSTANCE.m3398Int$arg1$callEQEQ$funisAndroidQ$classSettingsViewModel();
    }

    public final void updateSheetDisplay(DialogSheetState sheet) {
        Object prevValue$iv;
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, SettingsUiState.copy$default((SettingsUiState) prevValue$iv, (HashMap) null, sheet, false, false, 13, (Object) null)));
    }

    public final String checkOperationMode() {
        return OperationModeUtils.Companion.getOperationModeAsString(this.session.getOperationMode());
    }

    public final OperationMode getOperationMode() {
        return this.session.getOperationMode();
    }

    public final void checkDevOpt() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new SettingsViewModel$checkDevOpt$1(this, (Continuation) null), 3, (Object) null);
    }
}
