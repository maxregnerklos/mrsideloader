package vegabobo.dsusideloader.ui.screen.about;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AboutUiState.kt */
public final class AboutScreenUiState {
    public static final int $stable = LiveLiterals$AboutUiStateKt.INSTANCE.m3069Int$classAboutScreenUiState();
    public final boolean isUpdaterAvailable;
    public final MutableStateFlow toastDisplay;
    public final UpdaterCardState updaterCardState;

    public static /* synthetic */ AboutScreenUiState copy$default(AboutScreenUiState aboutScreenUiState, UpdaterCardState updaterCardState2, MutableStateFlow mutableStateFlow, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            updaterCardState2 = aboutScreenUiState.updaterCardState;
        }
        if ((i & 2) != 0) {
            mutableStateFlow = aboutScreenUiState.toastDisplay;
        }
        if ((i & 4) != 0) {
            z = aboutScreenUiState.isUpdaterAvailable;
        }
        return aboutScreenUiState.copy(updaterCardState2, mutableStateFlow, z);
    }

    public final AboutScreenUiState copy(UpdaterCardState updaterCardState2, MutableStateFlow mutableStateFlow, boolean z) {
        Intrinsics.checkNotNullParameter(updaterCardState2, "updaterCardState");
        Intrinsics.checkNotNullParameter(mutableStateFlow, "toastDisplay");
        return new AboutScreenUiState(updaterCardState2, mutableStateFlow, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$AboutUiStateKt.INSTANCE.m3048Boolean$branch$when$funequals$classAboutScreenUiState();
        }
        if (!(obj instanceof AboutScreenUiState)) {
            return LiveLiterals$AboutUiStateKt.INSTANCE.m3050Boolean$branch$when1$funequals$classAboutScreenUiState();
        }
        AboutScreenUiState aboutScreenUiState = (AboutScreenUiState) obj;
        return !Intrinsics.areEqual((Object) this.updaterCardState, (Object) aboutScreenUiState.updaterCardState) ? LiveLiterals$AboutUiStateKt.INSTANCE.m3052Boolean$branch$when2$funequals$classAboutScreenUiState() : !Intrinsics.areEqual((Object) this.toastDisplay, (Object) aboutScreenUiState.toastDisplay) ? LiveLiterals$AboutUiStateKt.INSTANCE.m3054Boolean$branch$when3$funequals$classAboutScreenUiState() : this.isUpdaterAvailable != aboutScreenUiState.isUpdaterAvailable ? LiveLiterals$AboutUiStateKt.INSTANCE.m3056Boolean$branch$when4$funequals$classAboutScreenUiState() : LiveLiterals$AboutUiStateKt.INSTANCE.m3059Boolean$funequals$classAboutScreenUiState();
    }

    public int hashCode() {
        int hashCode = this.updaterCardState.hashCode();
        LiveLiterals$AboutUiStateKt liveLiterals$AboutUiStateKt = LiveLiterals$AboutUiStateKt.INSTANCE;
        int r0 = liveLiterals$AboutUiStateKt.m3066Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classAboutScreenUiState() * ((liveLiterals$AboutUiStateKt.m3064Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classAboutScreenUiState() * hashCode) + this.toastDisplay.hashCode());
        boolean z = this.isUpdaterAvailable;
        if (z) {
            z = true;
        }
        return r0 + (z ? 1 : 0);
    }

    public String toString() {
        LiveLiterals$AboutUiStateKt liveLiterals$AboutUiStateKt = LiveLiterals$AboutUiStateKt.INSTANCE;
        String r1 = liveLiterals$AboutUiStateKt.m3071String$0$str$funtoString$classAboutScreenUiState();
        String r2 = liveLiterals$AboutUiStateKt.m3073String$1$str$funtoString$classAboutScreenUiState();
        UpdaterCardState updaterCardState2 = this.updaterCardState;
        String r4 = liveLiterals$AboutUiStateKt.m3077String$3$str$funtoString$classAboutScreenUiState();
        String r5 = liveLiterals$AboutUiStateKt.m3079String$4$str$funtoString$classAboutScreenUiState();
        MutableStateFlow mutableStateFlow = this.toastDisplay;
        String r7 = liveLiterals$AboutUiStateKt.m3081String$6$str$funtoString$classAboutScreenUiState();
        String r8 = liveLiterals$AboutUiStateKt.m3083String$7$str$funtoString$classAboutScreenUiState();
        boolean z = this.isUpdaterAvailable;
        String r0 = liveLiterals$AboutUiStateKt.m3085String$9$str$funtoString$classAboutScreenUiState();
        return r1 + r2 + updaterCardState2 + r4 + r5 + mutableStateFlow + r7 + r8 + z + r0;
    }

    public AboutScreenUiState(UpdaterCardState updaterCardState2, MutableStateFlow toastDisplay2, boolean isUpdaterAvailable2) {
        Intrinsics.checkNotNullParameter(updaterCardState2, "updaterCardState");
        Intrinsics.checkNotNullParameter(toastDisplay2, "toastDisplay");
        this.updaterCardState = updaterCardState2;
        this.toastDisplay = toastDisplay2;
        this.isUpdaterAvailable = isUpdaterAvailable2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AboutScreenUiState(UpdaterCardState updaterCardState2, MutableStateFlow mutableStateFlow, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UpdaterCardState((UpdateStatus) null, false, (String) null, 0.0f, 15, (DefaultConstructorMarker) null) : updaterCardState2, (i & 2) != 0 ? StateFlowKt.MutableStateFlow(DevOptToastDisplay.NONE) : mutableStateFlow, (i & 4) != 0 ? LiveLiterals$AboutUiStateKt.INSTANCE.m3062Boolean$paramisUpdaterAvailable$classAboutScreenUiState() : z);
    }

    public final UpdaterCardState getUpdaterCardState() {
        return this.updaterCardState;
    }

    public final MutableStateFlow getToastDisplay() {
        return this.toastDisplay;
    }

    public final boolean isUpdaterAvailable() {
        return this.isUpdaterAvailable;
    }
}
