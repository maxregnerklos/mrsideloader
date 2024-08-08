package vegabobo.dsusideloader.model;

import android.net.Uri;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import vegabobo.dsusideloader.util.FilenameUtils;
import vegabobo.dsusideloader.util.OperationMode;

/* compiled from: Session.kt */
public final class Session {
    public static final int $stable = LiveLiterals$SessionKt.INSTANCE.m2733Int$classSession();
    public DSUInstallationSource dsuInstallation;
    public String installationScriptPath;
    public MutableStateFlow operationMode;
    public InstallationPreferences preferences;
    public UserSelection userSelection;

    public Session(UserSelection userSelection2, DSUInstallationSource dsuInstallation2, InstallationPreferences preferences2, MutableStateFlow operationMode2) {
        Intrinsics.checkNotNullParameter(userSelection2, "userSelection");
        Intrinsics.checkNotNullParameter(dsuInstallation2, "dsuInstallation");
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        Intrinsics.checkNotNullParameter(operationMode2, "operationMode");
        this.userSelection = userSelection2;
        this.dsuInstallation = dsuInstallation2;
        this.preferences = preferences2;
        this.operationMode = operationMode2;
        this.installationScriptPath = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Session(UserSelection userSelection2, DSUInstallationSource dSUInstallationSource, InstallationPreferences installationPreferences, MutableStateFlow mutableStateFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UserSelection(0, 0, (Uri) null, (String) null, 15, (DefaultConstructorMarker) null) : userSelection2, (i & 2) != 0 ? new DSUInstallationSource((Type) null, (Uri) null, 0, (List) null, 15, (DefaultConstructorMarker) null) : dSUInstallationSource, (i & 4) != 0 ? new InstallationPreferences(false, false, 3, (DefaultConstructorMarker) null) : installationPreferences, (i & 8) != 0 ? StateFlowKt.MutableStateFlow(OperationMode.ADB) : mutableStateFlow);
    }

    public final UserSelection getUserSelection() {
        return this.userSelection;
    }

    public final DSUInstallationSource getDsuInstallation() {
        return this.dsuInstallation;
    }

    public final void setDsuInstallation(DSUInstallationSource dSUInstallationSource) {
        Intrinsics.checkNotNullParameter(dSUInstallationSource, "<set-?>");
        this.dsuInstallation = dSUInstallationSource;
    }

    public final InstallationPreferences getPreferences() {
        return this.preferences;
    }

    public final MutableStateFlow getOperationMode() {
        return this.operationMode;
    }

    public final boolean isRoot() {
        return this.operationMode.getValue() == OperationMode.SYSTEM_AND_ROOT || this.operationMode.getValue() == OperationMode.ROOT;
    }

    /* renamed from: getOperationMode  reason: collision with other method in class */
    public final OperationMode m2758getOperationMode() {
        return (OperationMode) this.operationMode.getValue();
    }

    public final void setOperationMode(OperationMode newOpMode) {
        Intrinsics.checkNotNullParameter(newOpMode, "newOpMode");
        this.operationMode.setValue(newOpMode);
    }

    public final String getInstallationScriptPath() {
        return this.installationScriptPath;
    }

    public final void setInstallationScriptPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.installationScriptPath = str;
    }

    public final Triple getInstallationParameters() {
        long userdataSize = this.userSelection.getUserSelectedUserdata();
        String absoluteFilePath = FilenameUtils.Companion.getFilePath(this.dsuInstallation.getUri(), LiveLiterals$SessionKt.INSTANCE.m2723Boolean$arg1$callgetFilePath$valabsoluteFilePath$fungetInstallationParameters$classSession());
        long imageSize = this.dsuInstallation.getFileSize();
        if (this.userSelection.isCustomImageSize()) {
            imageSize = this.userSelection.getUserSelectedImageSize();
        }
        return new Triple(Long.valueOf(userdataSize), absoluteFilePath, Long.valueOf(imageSize));
    }

    public String toString() {
        UserSelection userSelection2 = this.userSelection;
        LiveLiterals$SessionKt liveLiterals$SessionKt = LiveLiterals$SessionKt.INSTANCE;
        String r2 = liveLiterals$SessionKt.m2747String$1$str$funtoString$classSession();
        DSUInstallationSource dSUInstallationSource = this.dsuInstallation;
        String r4 = liveLiterals$SessionKt.m2753String$3$str$funtoString$classSession();
        InstallationPreferences installationPreferences = this.preferences;
        String r1 = liveLiterals$SessionKt.m2755String$5$str$funtoString$classSession();
        Object value = this.operationMode.getValue();
        return userSelection2 + r2 + dSUInstallationSource + r4 + installationPreferences + r1 + value;
    }
}
