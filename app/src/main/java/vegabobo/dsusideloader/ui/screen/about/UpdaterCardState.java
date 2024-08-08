package vegabobo.dsusideloader.ui.screen.about;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutUiState.kt */
public final class UpdaterCardState {
    public static final int $stable = LiveLiterals$AboutUiStateKt.INSTANCE.m3070Int$classUpdaterCardState();
    public final boolean isDownloading;
    public final float progressBar;
    public final UpdateStatus updateStatus;
    public final String updateVersion;

    public static /* synthetic */ UpdaterCardState copy$default(UpdaterCardState updaterCardState, UpdateStatus updateStatus2, boolean z, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            updateStatus2 = updaterCardState.updateStatus;
        }
        if ((i & 2) != 0) {
            z = updaterCardState.isDownloading;
        }
        if ((i & 4) != 0) {
            str = updaterCardState.updateVersion;
        }
        if ((i & 8) != 0) {
            f = updaterCardState.progressBar;
        }
        return updaterCardState.copy(updateStatus2, z, str, f);
    }

    public final UpdaterCardState copy(UpdateStatus updateStatus2, boolean z, String str, float f) {
        Intrinsics.checkNotNullParameter(updateStatus2, "updateStatus");
        Intrinsics.checkNotNullParameter(str, "updateVersion");
        return new UpdaterCardState(updateStatus2, z, str, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$AboutUiStateKt.INSTANCE.m3049Boolean$branch$when$funequals$classUpdaterCardState();
        }
        if (!(obj instanceof UpdaterCardState)) {
            return LiveLiterals$AboutUiStateKt.INSTANCE.m3051Boolean$branch$when1$funequals$classUpdaterCardState();
        }
        UpdaterCardState updaterCardState = (UpdaterCardState) obj;
        return this.updateStatus != updaterCardState.updateStatus ? LiveLiterals$AboutUiStateKt.INSTANCE.m3053Boolean$branch$when2$funequals$classUpdaterCardState() : this.isDownloading != updaterCardState.isDownloading ? LiveLiterals$AboutUiStateKt.INSTANCE.m3055Boolean$branch$when3$funequals$classUpdaterCardState() : !Intrinsics.areEqual((Object) this.updateVersion, (Object) updaterCardState.updateVersion) ? LiveLiterals$AboutUiStateKt.INSTANCE.m3057Boolean$branch$when4$funequals$classUpdaterCardState() : Float.compare(this.progressBar, updaterCardState.progressBar) != 0 ? LiveLiterals$AboutUiStateKt.INSTANCE.m3058Boolean$branch$when5$funequals$classUpdaterCardState() : LiveLiterals$AboutUiStateKt.INSTANCE.m3060Boolean$funequals$classUpdaterCardState();
    }

    public int hashCode() {
        int hashCode = this.updateStatus.hashCode();
        LiveLiterals$AboutUiStateKt liveLiterals$AboutUiStateKt = LiveLiterals$AboutUiStateKt.INSTANCE;
        int r2 = liveLiterals$AboutUiStateKt.m3065Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classUpdaterCardState() * hashCode;
        boolean z = this.isDownloading;
        if (z) {
            z = true;
        }
        int r0 = liveLiterals$AboutUiStateKt.m3067Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classUpdaterCardState();
        return (liveLiterals$AboutUiStateKt.m3068Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classUpdaterCardState() * ((r0 * (r2 + (z ? 1 : 0))) + this.updateVersion.hashCode())) + Float.hashCode(this.progressBar);
    }

    public String toString() {
        LiveLiterals$AboutUiStateKt liveLiterals$AboutUiStateKt = LiveLiterals$AboutUiStateKt.INSTANCE;
        String r1 = liveLiterals$AboutUiStateKt.m3072String$0$str$funtoString$classUpdaterCardState();
        String r2 = liveLiterals$AboutUiStateKt.m3074String$1$str$funtoString$classUpdaterCardState();
        UpdateStatus updateStatus2 = this.updateStatus;
        String r4 = liveLiterals$AboutUiStateKt.m3078String$3$str$funtoString$classUpdaterCardState();
        String r5 = liveLiterals$AboutUiStateKt.m3080String$4$str$funtoString$classUpdaterCardState();
        boolean z = this.isDownloading;
        String r7 = liveLiterals$AboutUiStateKt.m3082String$6$str$funtoString$classUpdaterCardState();
        String r8 = liveLiterals$AboutUiStateKt.m3084String$7$str$funtoString$classUpdaterCardState();
        String str = this.updateVersion;
        String r10 = liveLiterals$AboutUiStateKt.m3086String$9$str$funtoString$classUpdaterCardState();
        String r11 = liveLiterals$AboutUiStateKt.m3075String$10$str$funtoString$classUpdaterCardState();
        float f = this.progressBar;
        String r0 = liveLiterals$AboutUiStateKt.m3076String$12$str$funtoString$classUpdaterCardState();
        return r1 + r2 + updateStatus2 + r4 + r5 + z + r7 + r8 + str + r10 + r11 + f + r0;
    }

    public UpdaterCardState(UpdateStatus updateStatus2, boolean isDownloading2, String updateVersion2, float progressBar2) {
        Intrinsics.checkNotNullParameter(updateStatus2, "updateStatus");
        Intrinsics.checkNotNullParameter(updateVersion2, "updateVersion");
        this.updateStatus = updateStatus2;
        this.isDownloading = isDownloading2;
        this.updateVersion = updateVersion2;
        this.progressBar = progressBar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdaterCardState(UpdateStatus updateStatus2, boolean z, String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UpdateStatus.NOT_CHECKED : updateStatus2, (i & 2) != 0 ? LiveLiterals$AboutUiStateKt.INSTANCE.m3061Boolean$paramisDownloading$classUpdaterCardState() : z, (i & 4) != 0 ? LiveLiterals$AboutUiStateKt.INSTANCE.m3087String$paramupdateVersion$classUpdaterCardState() : str, (i & 8) != 0 ? LiveLiterals$AboutUiStateKt.INSTANCE.m3063Float$paramprogressBar$classUpdaterCardState() : f);
    }

    public final UpdateStatus getUpdateStatus() {
        return this.updateStatus;
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public final String getUpdateVersion() {
        return this.updateVersion;
    }

    public final float getProgressBar() {
        return this.progressBar;
    }
}
