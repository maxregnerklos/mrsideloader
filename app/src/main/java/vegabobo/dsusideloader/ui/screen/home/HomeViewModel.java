package vegabobo.dsusideloader.ui.screen.home;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import vegabobo.dsusideloader.core.BaseViewModel;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.installer.adb.AdbInstallationHandler;
import vegabobo.dsusideloader.installer.privileged.DsuInstallationHandler;
import vegabobo.dsusideloader.installer.privileged.LogcatDiagnostic;
import vegabobo.dsusideloader.installer.root.DSUInstaller;
import vegabobo.dsusideloader.model.DSUInstallationSource;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.model.Type;
import vegabobo.dsusideloader.preparation.InstallationStep;
import vegabobo.dsusideloader.service.PrivilegedProvider;
import vegabobo.dsusideloader.util.DevicePropUtils;
import vegabobo.dsusideloader.util.FilenameUtils;
import vegabobo.dsusideloader.util.OperationMode;
import vegabobo.dsusideloader.util.OperationModeUtils;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends BaseViewModel {
    public static final int $stable = LiveLiterals$HomeViewModelKt.INSTANCE.m3292Int$classHomeViewModel();
    public final MutableStateFlow _uiState;
    public final float allocPercentage;
    public final int allocPercentageInt;
    public final Application application;
    public boolean checkDynamicPartitions;
    public boolean checkReadLogsPermission;
    public boolean checkUnavaiableStorage;
    public final DataStore dataStore;
    public boolean disabledStorageCheck;
    public final boolean hasAvailableStorage;
    public Job installationJob;
    public LogcatDiagnostic logger;
    public final int maximumAllowedForAllocation;
    public Session session;
    public final StorageManager storageManager;
    public final Pair storageStats;
    public final String tag = getClass().getSimpleName();
    public final StateFlow uiState;

    public final Application getApplication() {
        return this.application;
    }

    public DataStore getDataStore() {
        return this.dataStore;
    }

    public final Session getSession() {
        return this.session;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HomeViewModel(android.app.Application r18, androidx.datastore.core.DataStore r19, vegabobo.dsusideloader.core.StorageManager r20, vegabobo.dsusideloader.model.Session r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "application"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "dataStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "storageManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "session"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r0.<init>(r2)
            r0.application = r1
            r0.dataStore = r2
            r0.storageManager = r3
            r0.session = r4
            java.lang.Class r5 = r17.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r0.tag = r5
            vegabobo.dsusideloader.ui.screen.home.HomeUiState r5 = new vegabobo.dsusideloader.ui.screen.home.HomeUiState
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 255(0xff, float:3.57E-43)
            r16 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            kotlinx.coroutines.flow.MutableStateFlow r5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r5)
            r0._uiState = r5
            kotlinx.coroutines.flow.StateFlow r5 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r5)
            r0.uiState = r5
            r5 = 1
            r0.checkDynamicPartitions = r5
            r0.checkUnavaiableStorage = r5
            r0.checkReadLogsPermission = r5
            r6 = 0
            kotlinx.coroutines.CompletableJob r7 = kotlinx.coroutines.JobKt__JobKt.Job$default(r6, r5, r6)
            r0.installationJob = r7
            vegabobo.dsusideloader.util.DevicePropUtils$Companion r7 = vegabobo.dsusideloader.util.DevicePropUtils.Companion
            float r7 = r7.getGsidBinaryAllowedPerc()
            r0.allocPercentage = r7
            kotlin.jvm.internal.StringCompanionObject r8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r9 = 100
            float r9 = (float) r9
            float r9 = r9 * r7
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            java.lang.String r9 = "%.0f"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.String r9 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            int r8 = java.lang.Integer.parseInt(r8)
            r0.allocPercentageInt = r8
            vegabobo.dsusideloader.util.StorageUtils$Companion r8 = vegabobo.dsusideloader.util.StorageUtils.Companion
            kotlin.Pair r7 = r8.getAllocInfo(r7)
            r0.storageStats = r7
            java.lang.Object r8 = r7.getFirst()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0.hasAvailableStorage = r8
            java.lang.Object r7 = r7.getSecond()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.maximumAllowedForAllocation = r7
            vegabobo.dsusideloader.model.Session r7 = r0.session
            boolean r7 = r7.isRoot()
            if (r7 == 0) goto L_0x00be
            vegabobo.dsusideloader.service.PrivilegedProvider r7 = vegabobo.dsusideloader.service.PrivilegedProvider.INSTANCE
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel$1 r8 = new vegabobo.dsusideloader.ui.screen.home.HomeViewModel$1
            r8.<init>(r0, r6)
            vegabobo.dsusideloader.service.PrivilegedProvider.run$default(r7, r6, r8, r5, r6)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.home.HomeViewModel.<init>(android.app.Application, androidx.datastore.core.DataStore, vegabobo.dsusideloader.core.StorageManager, vegabobo.dsusideloader.model.Session):void");
    }

    public final StateFlow getUiState() {
        return this.uiState;
    }

    public final boolean getCheckReadLogsPermission() {
        return this.checkReadLogsPermission;
    }

    public final void setDisabledStorageCheck(boolean z) {
        this.disabledStorageCheck = z;
    }

    public final Job getInstallationJob() {
        return this.installationJob;
    }

    public final LogcatDiagnostic getLogger() {
        return this.logger;
    }

    public final int getAllocPercentageInt() {
        return this.allocPercentageInt;
    }

    public final void updateAdditionalCardState(AdditionalCardState additionalCard) {
        Object prevValue$iv;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, additionalCard, (SheetDisplayState) null, (String) null, false, false, 247, (Object) null)));
    }

    public final void updateUserdataCard(Function1 update) {
        Object prevValue$iv;
        HomeUiState it;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
            it = (HomeUiState) prevValue$iv;
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default(it, (InstallationCardState) null, (UserDataCardState) update.invoke(UserDataCardState.copy$default(it.getUserDataCard(), false, false, (String) null, 0, 15, (Object) null)), (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, false, false, 253, (Object) null)));
    }

    public final void updateInstallationCard(Function1 update) {
        Object prevValue$iv;
        HomeUiState it;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
            it = (HomeUiState) prevValue$iv;
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default(it, (InstallationCardState) update.invoke(InstallationCardState.copy$default(it.getInstallationCard(), (InstallationStep) null, false, false, false, (String) null, (String) null, false, 0.0f, (String) null, 511, (Object) null)), (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, (String) null, false, false, 254, (Object) null)));
    }

    public final void updateImageSizeCard(Function1 update) {
        Object prevValue$iv;
        HomeUiState it;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
            it = (HomeUiState) prevValue$iv;
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default(it, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) update.invoke(ImageSizeCardState.copy$default(it.getImageSizeCard(), false, (String) null, 3, (Object) null)), (AdditionalCardState) null, (SheetDisplayState) null, (String) null, false, false, 251, (Object) null)));
    }

    public final void updateSheetState(SheetDisplayState sheetDisplay) {
        Object prevValue$iv;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, sheetDisplay, (String) null, false, false, 239, (Object) null)));
    }

    public final void resetInstallationCard() {
        Object prevValue$iv;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, new InstallationCardState((InstallationStep) null, false, false, false, (String) null, (String) null, false, 0.0f, (String) null, 511, (DefaultConstructorMarker) null), (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, SheetDisplayState.NONE, (String) null, false, false, 238, (Object) null)));
    }

    public final void dismissSheet() {
        updateSheetState(SheetDisplayState.NONE);
    }

    public final void initialChecks() {
        if (this.checkDynamicPartitions && !DevicePropUtils.Companion.hasDynamicPartitions()) {
            updateAdditionalCardState(AdditionalCardState.NO_DYNAMIC_PARTITIONS);
        } else if (!this.checkUnavaiableStorage || this.hasAvailableStorage) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$initialChecks$1(this, (Continuation) null), 3, (Object) null);
        } else {
            updateAdditionalCardState(AdditionalCardState.UNAVAIABLE_STORAGE);
        }
    }

    public final void setupUserPreferences() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$setupUserPreferences$1(this, (Continuation) null), 3, (Object) null);
    }

    public final void overrideDynamicPartitionCheck() {
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        this.checkDynamicPartitions = liveLiterals$HomeViewModelKt.m3272Boolean$arg0$call$setcheckDynamicPartitions$$funoverrideDynamicPartitionCheck$classHomeViewModel();
        String str = this.tag;
        String r0 = liveLiterals$HomeViewModelKt.m3310String$0$str$arg1$calld$funoverrideDynamicPartitionCheck$classHomeViewModel();
        boolean z = this.checkDynamicPartitions;
        Log.d(str, r0 + z);
        initialChecks();
    }

    public final void overrideUnavaiableStorage() {
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        this.checkUnavaiableStorage = liveLiterals$HomeViewModelKt.m3274Boolean$arg0$call$setcheckUnavaiableStorage$$funoverrideUnavaiableStorage$classHomeViewModel();
        String str = this.tag;
        String r0 = liveLiterals$HomeViewModelKt.m3311String$0$str$arg1$calld$funoverrideUnavaiableStorage$classHomeViewModel();
        boolean z = this.checkUnavaiableStorage;
        Log.d(str, r0 + z);
        initialChecks();
    }

    public final void onClickBootloaderUnlockedWarning() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$onClickBootloaderUnlockedWarning$1(this, (Continuation) null), 3, (Object) null);
    }

    public final String obtainSelectedFilename() {
        return this.session.getUserSelection().getSelectedFileName();
    }

    public final void onClickCancel() {
        if (((HomeUiState) this.uiState.getValue()).isInstalling()) {
            updateSheetState(SheetDisplayState.CANCEL_INSTALLATION);
        }
    }

    public final void onClickInstall() {
        this.session.getUserSelection().setUserDataSize(((HomeUiState) this.uiState.getValue()).getUserDataCard().getText());
        this.session.getUserSelection().setImageSize(((HomeUiState) this.uiState.getValue()).getImageSizeCard().getText());
        updateSheetState(SheetDisplayState.CONFIRM_INSTALLATION);
    }

    public final void onConfirmInstallationSheet() {
        dismissSheet();
        updateInstallationCard(HomeViewModel$onConfirmInstallationSheet$1.INSTANCE);
        this.installationJob = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(this.installationJob), (CoroutineStart) null, new HomeViewModel$onConfirmInstallationSheet$2(this, (Continuation) null), 2, (Object) null);
    }

    public final void onPreparationFinished(DSUInstallationSource dsuInstallation) {
        String str = this.tag;
        String r1 = LiveLiterals$HomeViewModelKt.INSTANCE.m3309String$0$str$arg1$calld$funonPreparationFinished$classHomeViewModel();
        Log.d(str, r1 + dsuInstallation);
        this.session.setDsuInstallation(dsuInstallation);
        startInstallation();
    }

    public final void startInstallation() {
        String str = this.tag;
        String r1 = LiveLiterals$HomeViewModelKt.INSTANCE.m3314String$0$str$arg1$calld$funstartInstallation$classHomeViewModel();
        Session session2 = this.session;
        Log.d(str, r1 + session2);
        updateInstallationCard(HomeViewModel$startInstallation$1.INSTANCE);
        if (this.session.getOperationMode() == OperationMode.ADB) {
            setupAdbInstallation();
        } else if (!this.session.getPreferences().getUseBuiltinInstaller() || !this.session.isRoot()) {
            startPrivilegedInstallation();
        } else {
            startDSUInstallation();
        }
    }

    public final void setupAdbInstallation() {
        new AdbInstallationHandler(this.storageManager, this.session).generate(new HomeViewModel$setupAdbInstallation$1(this));
    }

    public final void startDSUInstallation() {
        new DSUInstaller(this.application, this.session.getUserSelection().getUserSelectedUserdata(), this.session.getDsuInstallation(), this.installationJob, new HomeViewModel$startDSUInstallation$1(this), new HomeViewModel$startDSUInstallation$2(this), new HomeViewModel$startDSUInstallation$3(this), new HomeViewModel$startDSUInstallation$4(this), new HomeViewModel$startDSUInstallation$5(this)).invoke();
    }

    public final void startPrivilegedInstallation() {
        updateInstallationCard(HomeViewModel$startPrivilegedInstallation$1.INSTANCE);
        new DsuInstallationHandler(this.session).startInstallation();
        if (this.session.isRoot() || OperationModeUtils.Companion.isReadLogsPermissionGranted(this.application)) {
            startLogging();
        } else {
            updateInstallationCard(HomeViewModel$startPrivilegedInstallation$2.INSTANCE);
        }
    }

    public final void startLogging() {
        if (this.logger == null) {
            this.logger = new LogcatDiagnostic(new HomeViewModel$startLogging$1(this), new HomeViewModel$startLogging$2(this), new HomeViewModel$startLogging$3(this), new HomeViewModel$startLogging$4(this), new HomeViewModel$startLogging$5(this));
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(this.installationJob), (CoroutineStart) null, new HomeViewModel$startLogging$6(this, (Continuation) null), 2, (Object) null);
    }

    public final String generateUsefulLogInfo() {
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        String r2 = liveLiterals$HomeViewModelKt.m3296String$0$str$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String str = Build.MODEL;
        String r4 = liveLiterals$HomeViewModelKt.m3323String$2$str$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r5 = liveLiterals$HomeViewModelKt.m3297String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String str2 = Build.VERSION.RELEASE;
        String r7 = liveLiterals$HomeViewModelKt.m3324String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        int i = Build.VERSION.SDK_INT;
        String r9 = liveLiterals$HomeViewModelKt.m3337String$4$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        Session session2 = this.session;
        String r11 = liveLiterals$HomeViewModelKt.m3320String$1$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r12 = liveLiterals$HomeViewModelKt.m3298String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r13 = liveLiterals$HomeViewModelKt.m3325String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r14 = liveLiterals$HomeViewModelKt.m3299String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r16 = liveLiterals$HomeViewModelKt.m3326String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r17 = liveLiterals$HomeViewModelKt.m3338String$4$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r18 = liveLiterals$HomeViewModelKt.m3341String$6$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r19 = liveLiterals$HomeViewModelKt.m3300String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        boolean z = this.checkDynamicPartitions;
        String r21 = liveLiterals$HomeViewModelKt.m3327String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r22 = liveLiterals$HomeViewModelKt.m3301String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        boolean z2 = this.checkUnavaiableStorage;
        String r24 = liveLiterals$HomeViewModelKt.m3328String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r25 = liveLiterals$HomeViewModelKt.m3302String$0$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        boolean z3 = this.checkReadLogsPermission;
        String r27 = liveLiterals$HomeViewModelKt.m3329String$2$str$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r28 = liveLiterals$HomeViewModelKt.m3303String$0$str$arg0$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        float f = this.allocPercentage;
        String r30 = liveLiterals$HomeViewModelKt.m3330String$2$str$arg0$callplus$$this$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r31 = liveLiterals$HomeViewModelKt.m3304String$0$str$arg0$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        boolean z4 = this.hasAvailableStorage;
        String r33 = liveLiterals$HomeViewModelKt.m3331String$2$str$arg0$callplus$$this$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        String r34 = liveLiterals$HomeViewModelKt.m3305String$0$str$arg0$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        int i2 = this.maximumAllowedForAllocation;
        String r1 = liveLiterals$HomeViewModelKt.m3332String$2$str$arg0$callplus$fungenerateUsefulLogInfo$classHomeViewModel();
        return r2 + str + r4 + r5 + str2 + r7 + i + r9 + session2 + r11 + r12 + "vegabobo.dsusideloader" + r13 + r14 + "2.03" + r16 + "8" + r17 + "miniDebug" + r18 + r19 + z + r21 + r22 + z2 + r24 + r25 + z3 + r27 + r28 + f + r30 + r31 + z4 + r33 + r34 + i2 + r1;
    }

    public final void saveLogs(Uri uriToSaveLogs) {
        Intrinsics.checkNotNullParameter(uriToSaveLogs, "uriToSaveLogs");
        String str = this.tag;
        String r1 = LiveLiterals$HomeViewModelKt.INSTANCE.m3313String$0$str$arg1$calld$funsaveLogs$classHomeViewModel();
        Log.d(str, r1 + uriToSaveLogs);
        this.storageManager.writeStringToUri(((HomeUiState) this.uiState.getValue()).getInstallationLogs(), uriToSaveLogs);
    }

    public final void onClickCancelInstallationButton() {
        LogcatDiagnostic logcatDiagnostic;
        resetInstallationCard();
        if (!(this.session.getOperationMode() == OperationMode.ADB || (logcatDiagnostic = this.logger) == null)) {
            Intrinsics.checkNotNull(logcatDiagnostic);
            if (logcatDiagnostic.isLogging().get()) {
                LogcatDiagnostic logcatDiagnostic2 = this.logger;
                Intrinsics.checkNotNull(logcatDiagnostic2);
                logcatDiagnostic2.destroy();
                PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new HomeViewModel$onClickCancelInstallationButton$1((Continuation) null), 1, (Object) null);
            }
        }
        if (this.installationJob.isActive()) {
            Job.DefaultImpls.cancel$default(this.installationJob, (CancellationException) null, 1, (Object) null);
        }
        this.session.setDsuInstallation(new DSUInstallationSource((Type) null, (Uri) null, 0, (List) null, 15, (DefaultConstructorMarker) null));
    }

    public final void onClickRebootToDynOS() {
        updateInstallationCard(HomeViewModel$onClickRebootToDynOS$1.INSTANCE);
        PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new HomeViewModel$onClickRebootToDynOS$2((Continuation) null), 1, (Object) null);
    }

    public final void onClickDiscardGsiAndStartInstallation() {
        updateInstallationCard(HomeViewModel$onClickDiscardGsiAndStartInstallation$1.INSTANCE);
        PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new HomeViewModel$onClickDiscardGsiAndStartInstallation$2(this, (Continuation) null), 1, (Object) null);
    }

    public final void onClickDiscardGsi() {
        updateInstallationCard(HomeViewModel$onClickDiscardGsi$1.INSTANCE);
        PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new HomeViewModel$onClickDiscardGsi$2(this, (Continuation) null), 1, (Object) null);
    }

    public final void onClickRetryInstallation() {
        updateInstallationCard(HomeViewModel$onClickRetryInstallation$1.INSTANCE);
        startInstallation();
    }

    public final void onClickUnmountSdCardAndRetry() {
        updateInstallationCard(HomeViewModel$onClickUnmountSdCardAndRetry$1.INSTANCE);
        this.session.getPreferences().setUnmountSdCard(LiveLiterals$HomeViewModelKt.INSTANCE.m3275Boolean$arg0$call$setisUnmountSdCard$$funonClickUnmountSdCardAndRetry$classHomeViewModel());
        startInstallation();
    }

    public final void onClickSetSeLinuxPermissive() {
        updateInstallationCard(HomeViewModel$onClickSetSeLinuxPermissive$1.INSTANCE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$onClickSetSeLinuxPermissive$2(this, (Continuation) null), 3, (Object) null);
    }

    public final void showDiscardSheet() {
        updateSheetState(SheetDisplayState.DISCARD_DSU);
    }

    public final void onCheckUserdataCard() {
        updateUserdataCard(HomeViewModel$onCheckUserdataCard$1.INSTANCE);
    }

    public final void updateUserdataSize(String input) {
        int i;
        Intrinsics.checkNotNullParameter(input, "input");
        FilenameUtils.Companion companion = FilenameUtils.Companion;
        String selectedSize = companion.getDigits(input);
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        String sizeWithSuffix = companion.appendToDigitsToString(input, liveLiterals$HomeViewModelKt.m3350String$arg1$callappendToDigitsToString$valsizeWithSuffix$funupdateUserdataSize$classHomeViewModel());
        String str = this.tag;
        String r5 = liveLiterals$HomeViewModelKt.m3315String$0$str$arg1$calld$funupdateUserdataSize$classHomeViewModel();
        boolean z = this.disabledStorageCheck;
        String r7 = liveLiterals$HomeViewModelKt.m3334String$2$str$arg1$calld$funupdateUserdataSize$classHomeViewModel();
        String r8 = liveLiterals$HomeViewModelKt.m3340String$4$str$arg1$calld$funupdateUserdataSize$classHomeViewModel();
        int i2 = this.maximumAllowedForAllocation;
        Log.d(str, r5 + z + r7 + selectedSize + r8 + i2);
        if (!this.disabledStorageCheck) {
            if ((selectedSize.length() > 0) && Integer.parseInt(selectedSize) > (i = this.maximumAllowedForAllocation)) {
                updateUserdataCard(new HomeViewModel$updateUserdataSize$1(this, companion.appendToDigitsToString(String.valueOf(i), liveLiterals$HomeViewModelKt.m3348String$arg1$callappendToDigitsToString$valfixedSize$branch$if$funupdateUserdataSize$classHomeViewModel())));
                Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$updateUserdataSize$2(this, (Continuation) null), 3, (Object) null);
                return;
            }
        }
        updateUserdataCard(new HomeViewModel$updateUserdataSize$3(sizeWithSuffix));
    }

    public final void onCheckImageSizeCard() {
        if (!((HomeUiState) this.uiState.getValue()).getImageSizeCard().isSelected()) {
            updateSheetState(SheetDisplayState.IMAGESIZE_WARNING);
        } else {
            dismissSheet();
        }
        updateImageSizeCard(HomeViewModel$onCheckImageSizeCard$1.INSTANCE);
    }

    public final void updateImageSize(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        updateImageSizeCard(new HomeViewModel$updateImageSize$1(FilenameUtils.Companion.appendToDigitsToString(input, LiveLiterals$HomeViewModelKt.INSTANCE.m3349String$arg1$callappendToDigitsToString$valinputWithSuffix$funupdateImageSize$classHomeViewModel())));
    }

    public final void takeUriPermission(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.application.getContentResolver().takePersistableUriPermission(uri, 3);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$takeUriPermission$1(this, uri, (Continuation) null), 3, (Object) null);
    }

    public final void onFileSelectionResult(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        FilenameUtils.Companion companion = FilenameUtils.Companion;
        ContentResolver contentResolver = this.application.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "application.contentResolver");
        String filename = companion.queryName(contentResolver, uri);
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        String extension = StringsKt__StringsKt.substringAfterLast(filename, liveLiterals$HomeViewModelKt.m3347String$arg0$callsubstringAfterLast$valextension$funonFileSelectionResult$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3352String$arg1$callsubstringAfterLast$valextension$funonFileSelectionResult$classHomeViewModel());
        ArrayList supportedFiles = CollectionsKt__CollectionsKt.arrayListOf(liveLiterals$HomeViewModelKt.m3317String$0$vararg$arg0$callarrayListOf$valsupportedFiles$funonFileSelectionResult$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3322String$1$vararg$arg0$callarrayListOf$valsupportedFiles$funonFileSelectionResult$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3335String$2$vararg$arg0$callarrayListOf$valsupportedFiles$funonFileSelectionResult$classHomeViewModel(), liveLiterals$HomeViewModelKt.m3336String$3$vararg$arg0$callarrayListOf$valsupportedFiles$funonFileSelectionResult$classHomeViewModel());
        if (Build.VERSION.SDK_INT > liveLiterals$HomeViewModelKt.m3290Int$arg1$callgreater$cond$if$funonFileSelectionResult$classHomeViewModel()) {
            supportedFiles.add(liveLiterals$HomeViewModelKt.m3342String$arg0$calladd$branch$if$funonFileSelectionResult$classHomeViewModel());
        }
        boolean isFileSupported = supportedFiles.contains(extension);
        String str = this.tag;
        String r6 = liveLiterals$HomeViewModelKt.m3308String$0$str$arg1$calld$funonFileSelectionResult$classHomeViewModel();
        String r7 = liveLiterals$HomeViewModelKt.m3333String$2$str$arg1$calld$funonFileSelectionResult$classHomeViewModel();
        String r1 = liveLiterals$HomeViewModelKt.m3339String$4$str$arg1$calld$funonFileSelectionResult$classHomeViewModel();
        Log.d(str, r6 + isFileSupported + r7 + extension + r1 + filename);
        if (!isFileSupported) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$onFileSelectionResult$1(this, (Continuation) null), 3, (Object) null);
            return;
        }
        this.session.getUserSelection().setSelectedFileName(filename);
        this.session.getUserSelection().setSelectedFileUri(uri);
        updateInstallationCard(new HomeViewModel$onFileSelectionResult$2(filename));
    }

    public final void grantReadLogs() {
        updateAdditionalCardState(AdditionalCardState.GRANTING_READ_LOGS_PERMISSION);
        Intent intent = new Intent();
        String r1 = LiveLiterals$HomeViewModelKt.INSTANCE.m3321String$1$str$arg1$callsetClassName$fungrantReadLogs$classHomeViewModel();
        intent.setClassName("vegabobo.dsusideloader", "vegabobo.dsusideloader" + r1);
        intent.setFlags(intent.getFlags() + 268435456);
        PrivilegedProvider.run$default(PrivilegedProvider.INSTANCE, (Function0) null, new HomeViewModel$grantReadLogs$1(intent, (Continuation) null), 1, (Object) null);
    }

    public final void refuseReadLogs() {
        LiveLiterals$HomeViewModelKt liveLiterals$HomeViewModelKt = LiveLiterals$HomeViewModelKt.INSTANCE;
        this.checkReadLogsPermission = liveLiterals$HomeViewModelKt.m3273Boolean$arg0$call$setcheckReadLogsPermission$$funrefuseReadLogs$classHomeViewModel();
        String str = this.tag;
        String r0 = liveLiterals$HomeViewModelKt.m3312String$0$str$arg1$calld$funrefuseReadLogs$classHomeViewModel();
        boolean z = this.checkReadLogsPermission;
        Log.d(str, r0 + z);
        initialChecks();
    }

    public final void showLogsWarning() {
        updateSheetState(SheetDisplayState.VIEW_LOGS);
    }

    public final void onRootInstallationSuccess() {
        updateInstallationCard(HomeViewModel$onRootInstallationSuccess$1.INSTANCE);
    }

    public final void onInstallationSuccess() {
        updateInstallationCard(HomeViewModel$onInstallationSuccess$1.INSTANCE);
    }

    public final void onLogLineReceived() {
        Object prevValue$iv;
        LogcatDiagnostic logcatDiagnostic;
        MutableStateFlow $this$update$iv = this._uiState;
        do {
            prevValue$iv = $this$update$iv.getValue();
            logcatDiagnostic = this.logger;
            Intrinsics.checkNotNull(logcatDiagnostic);
        } while (!$this$update$iv.compareAndSet(prevValue$iv, HomeUiState.copy$default((HomeUiState) prevValue$iv, (InstallationCardState) null, (UserDataCardState) null, (ImageSizeCardState) null, (AdditionalCardState) null, (SheetDisplayState) null, logcatDiagnostic.getLogs(), false, false, 223, (Object) null)));
    }

    public final void onStepUpdate(InstallationStep step) {
        updateInstallationCard(new HomeViewModel$onStepUpdate$1(step));
    }

    public final void onPreparationProgressUpdate(float progress) {
        updateInstallationCard(new HomeViewModel$onPreparationProgressUpdate$1(progress));
    }

    public final void onInstallationError(InstallationStep error, String errorContent) {
        updateInstallationCard(new HomeViewModel$onInstallationError$1(error, this, errorContent));
    }

    public final void onInstallationProgressUpdate(float progress, String partition) {
        updateInstallationCard(new HomeViewModel$onInstallationProgressUpdate$1(progress, partition));
    }

    public final void onCreatePartition(String partition) {
        updateInstallationCard(new HomeViewModel$onCreatePartition$1(partition));
    }
}
