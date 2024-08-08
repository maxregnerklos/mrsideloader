package vegabobo.dsusideloader.ui.screen.about;

import android.app.Application;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import vegabobo.dsusideloader.BuildConfig;
import vegabobo.dsusideloader.core.BaseViewModel;
import vegabobo.dsusideloader.util.SignatureUtilsKt;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel extends BaseViewModel {
    public static final int $stable = LiveLiterals$AboutViewModelKt.INSTANCE.m3112Int$classAboutViewModel();
    public final MutableStateFlow _uiState;
    public final Application application;
    public final DataStore dataStore;
    public int developerOptionsCounter;
    public UpdaterResponse response;
    public final String tag = getClass().getSimpleName();
    public final StateFlow uiState;

    public final Application getApplication() {
        return this.application;
    }

    public DataStore getDataStore() {
        return this.dataStore;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutViewModel(Application application2, DataStore dataStore2) {
        super(dataStore2);
        Object prevValue$iv;
        Intrinsics.checkNotNullParameter(application2, "application");
        Intrinsics.checkNotNullParameter(dataStore2, "dataStore");
        this.application = application2;
        this.dataStore = dataStore2;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new AboutScreenUiState((UpdaterCardState) null, (MutableStateFlow) null, false, 7, (DefaultConstructorMarker) null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        this.response = new UpdaterResponse((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        boolean isSignedByAuthor = SignatureUtilsKt.isBuildSignedByAuthor(application2);
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, AboutScreenUiState.copy$default((AboutScreenUiState) prevValue$iv, (UpdaterCardState) null, (MutableStateFlow) null, isSignedByAuthor || BuildConfig.DEBUG, 3, (Object) null)));
    }

    public final StateFlow getUiState() {
        return this.uiState;
    }

    public final UpdaterResponse getResponse() {
        return this.response;
    }

    public final void setResponse(UpdaterResponse updaterResponse) {
        Intrinsics.checkNotNullParameter(updaterResponse, "<set-?>");
        this.response = updaterResponse;
    }

    public final void resetDeveloperOptionsCounter() {
        this.developerOptionsCounter = LiveLiterals$AboutViewModelKt.INSTANCE.m3103Int$arg0$call$setdeveloperOptionsCounter$$funresetDeveloperOptionsCounter$classAboutViewModel();
    }

    public final void updateUpdaterCard(Function1 update) {
        Object prevValue$iv;
        AboutScreenUiState it;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
            it = (AboutScreenUiState) prevValue$iv;
        } while (!$this$update$iv.compareAndSet(prevValue$iv, AboutScreenUiState.copy$default(it, (UpdaterCardState) update.invoke(UpdaterCardState.copy$default(it.getUpdaterCardState(), (UpdateStatus) null, false, (String) null, 0.0f, 15, (Object) null)), (MutableStateFlow) null, false, 6, (Object) null)));
    }

    public final void onClickCheckUpdates() {
        String str = this.tag;
        String r1 = LiveLiterals$AboutViewModelKt.INSTANCE.m3117String$0$str$arg1$calld$funonClickCheckUpdates$classAboutViewModel();
        Log.d(str, r1 + "https://raw.githubusercontent.com/VegaBobo/DSU-Sideloader/master/other/updater.json");
        updateUpdaterCard(AboutViewModel$onClickCheckUpdates$1.INSTANCE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AboutViewModel$onClickCheckUpdates$2(this, (Continuation) null), 2, (Object) null);
    }

    public final void onClickDownloadUpdate() {
        if (!((AboutScreenUiState) this.uiState.getValue()).getUpdaterCardState().isDownloading()) {
            updateUpdaterCard(AboutViewModel$onClickDownloadUpdate$1.INSTANCE);
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AboutViewModel$onClickDownloadUpdate$2(this, (Continuation) null), 2, (Object) null);
        }
    }

    public final void onClickImage() {
        int i = this.developerOptionsCounter + 1;
        this.developerOptionsCounter = i;
        if (i > LiveLiterals$AboutViewModelKt.INSTANCE.m3109Int$arg1$callgreater$cond$if$funonClickImage$classAboutViewModel()) {
            resetDeveloperOptionsCounter();
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AboutViewModel$onClickImage$1(this, (Continuation) null), 3, (Object) null);
        }
    }
}
