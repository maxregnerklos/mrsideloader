package vegabobo.dsusideloader.ui.screen.settings;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsUiState.kt */
public final class SettingsUiState {
    public static final int $stable = LiveLiterals$SettingsUiStateKt.INSTANCE.m3387Int$classSettingsUiState();
    public final DialogSheetState dialogSheetDisplay;
    public final boolean isDevOptEnabled;
    public final boolean isRoot;
    public final HashMap preferences;

    public static /* synthetic */ SettingsUiState copy$default(SettingsUiState settingsUiState, HashMap hashMap, DialogSheetState dialogSheetState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = settingsUiState.preferences;
        }
        if ((i & 2) != 0) {
            dialogSheetState = settingsUiState.dialogSheetDisplay;
        }
        if ((i & 4) != 0) {
            z = settingsUiState.isRoot;
        }
        if ((i & 8) != 0) {
            z2 = settingsUiState.isDevOptEnabled;
        }
        return settingsUiState.copy(hashMap, dialogSheetState, z, z2);
    }

    public final SettingsUiState copy(HashMap hashMap, DialogSheetState dialogSheetState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hashMap, "preferences");
        Intrinsics.checkNotNullParameter(dialogSheetState, "dialogSheetDisplay");
        return new SettingsUiState(hashMap, dialogSheetState, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$SettingsUiStateKt.INSTANCE.m3375Boolean$branch$when$funequals$classSettingsUiState();
        }
        if (!(obj instanceof SettingsUiState)) {
            return LiveLiterals$SettingsUiStateKt.INSTANCE.m3376Boolean$branch$when1$funequals$classSettingsUiState();
        }
        SettingsUiState settingsUiState = (SettingsUiState) obj;
        return !Intrinsics.areEqual((Object) this.preferences, (Object) settingsUiState.preferences) ? LiveLiterals$SettingsUiStateKt.INSTANCE.m3377Boolean$branch$when2$funequals$classSettingsUiState() : this.dialogSheetDisplay != settingsUiState.dialogSheetDisplay ? LiveLiterals$SettingsUiStateKt.INSTANCE.m3378Boolean$branch$when3$funequals$classSettingsUiState() : this.isRoot != settingsUiState.isRoot ? LiveLiterals$SettingsUiStateKt.INSTANCE.m3379Boolean$branch$when4$funequals$classSettingsUiState() : this.isDevOptEnabled != settingsUiState.isDevOptEnabled ? LiveLiterals$SettingsUiStateKt.INSTANCE.m3380Boolean$branch$when5$funequals$classSettingsUiState() : LiveLiterals$SettingsUiStateKt.INSTANCE.m3381Boolean$funequals$classSettingsUiState();
    }

    public int hashCode() {
        int hashCode = this.preferences.hashCode();
        LiveLiterals$SettingsUiStateKt liveLiterals$SettingsUiStateKt = LiveLiterals$SettingsUiStateKt.INSTANCE;
        int r0 = liveLiterals$SettingsUiStateKt.m3385Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classSettingsUiState() * ((liveLiterals$SettingsUiStateKt.m3384Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classSettingsUiState() * hashCode) + this.dialogSheetDisplay.hashCode());
        boolean z = this.isRoot;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int r1 = liveLiterals$SettingsUiStateKt.m3386Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classSettingsUiState() * (r0 + (z ? 1 : 0));
        boolean z3 = this.isDevOptEnabled;
        if (!z3) {
            z2 = z3;
        }
        return r1 + (z2 ? 1 : 0);
    }

    public String toString() {
        LiveLiterals$SettingsUiStateKt liveLiterals$SettingsUiStateKt = LiveLiterals$SettingsUiStateKt.INSTANCE;
        String r1 = liveLiterals$SettingsUiStateKt.m3388String$0$str$funtoString$classSettingsUiState();
        String r2 = liveLiterals$SettingsUiStateKt.m3389String$1$str$funtoString$classSettingsUiState();
        HashMap hashMap = this.preferences;
        String r4 = liveLiterals$SettingsUiStateKt.m3392String$3$str$funtoString$classSettingsUiState();
        String r5 = liveLiterals$SettingsUiStateKt.m3393String$4$str$funtoString$classSettingsUiState();
        DialogSheetState dialogSheetState = this.dialogSheetDisplay;
        String r7 = liveLiterals$SettingsUiStateKt.m3394String$6$str$funtoString$classSettingsUiState();
        String r8 = liveLiterals$SettingsUiStateKt.m3395String$7$str$funtoString$classSettingsUiState();
        boolean z = this.isRoot;
        String r10 = liveLiterals$SettingsUiStateKt.m3396String$9$str$funtoString$classSettingsUiState();
        String r11 = liveLiterals$SettingsUiStateKt.m3390String$10$str$funtoString$classSettingsUiState();
        boolean z2 = this.isDevOptEnabled;
        String r0 = liveLiterals$SettingsUiStateKt.m3391String$12$str$funtoString$classSettingsUiState();
        return r1 + r2 + hashMap + r4 + r5 + dialogSheetState + r7 + r8 + z + r10 + r11 + z2 + r0;
    }

    public SettingsUiState(HashMap preferences2, DialogSheetState dialogSheetDisplay2, boolean isRoot2, boolean isDevOptEnabled2) {
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        Intrinsics.checkNotNullParameter(dialogSheetDisplay2, "dialogSheetDisplay");
        this.preferences = preferences2;
        this.dialogSheetDisplay = dialogSheetDisplay2;
        this.isRoot = isRoot2;
        this.isDevOptEnabled = isDevOptEnabled2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SettingsUiState(java.util.HashMap r3, vegabobo.dsusideloader.ui.screen.settings.DialogSheetState r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r2 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L_0x0067
            r3 = 5
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt r8 = vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt.INSTANCE
            boolean r0 = r8.m3370Boolean$arg0$callto$0$vararg$arg0$callhashMapOf$parampreferences$classSettingsUiState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "builtin_installer"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r1 = 0
            r3[r1] = r0
            boolean r0 = r8.m3371Boolean$arg0$callto$1$vararg$arg0$callhashMapOf$parampreferences$classSettingsUiState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "keep_screen_on"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r1 = 1
            r3[r1] = r0
            boolean r0 = r8.m3372Boolean$arg0$callto$2$vararg$arg0$callhashMapOf$parampreferences$classSettingsUiState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "umount_sd"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r1 = 2
            r3[r1] = r0
            boolean r0 = r8.m3373Boolean$arg0$callto$3$vararg$arg0$callhashMapOf$parampreferences$classSettingsUiState()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "disable_storage_check"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            r1 = 3
            r3[r1] = r0
            boolean r8 = r8.m3374Boolean$arg0$callto$4$vararg$arg0$callhashMapOf$parampreferences$classSettingsUiState()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "full_logcat_logging"
            kotlin.Pair r8 = kotlin.TuplesKt.to(r0, r8)
            r0 = 4
            r3[r0] = r8
            java.util.HashMap r3 = kotlin.collections.MapsKt__MapsKt.hashMapOf(r3)
        L_0x0067:
            r8 = r7 & 2
            if (r8 == 0) goto L_0x006d
            vegabobo.dsusideloader.ui.screen.settings.DialogSheetState r4 = vegabobo.dsusideloader.ui.screen.settings.DialogSheetState.NONE
        L_0x006d:
            r8 = r7 & 4
            if (r8 == 0) goto L_0x0077
            vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt r5 = vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt.INSTANCE
            boolean r5 = r5.m3383Boolean$paramisRoot$classSettingsUiState()
        L_0x0077:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0081
            vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt r6 = vegabobo.dsusideloader.ui.screen.settings.LiveLiterals$SettingsUiStateKt.INSTANCE
            boolean r6 = r6.m3382Boolean$paramisDevOptEnabled$classSettingsUiState()
        L_0x0081:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.settings.SettingsUiState.<init>(java.util.HashMap, vegabobo.dsusideloader.ui.screen.settings.DialogSheetState, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final HashMap getPreferences() {
        return this.preferences;
    }

    public final DialogSheetState getDialogSheetDisplay() {
        return this.dialogSheetDisplay;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final boolean isDevOptEnabled() {
        return this.isDevOptEnabled;
    }
}
