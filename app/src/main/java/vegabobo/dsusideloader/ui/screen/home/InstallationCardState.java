package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeUiState.kt */
public final class InstallationCardState {
    public static final int $stable = LiveLiterals$HomeUiStateKt.INSTANCE.m3213Int$classInstallationCardState();
    public final String currentPartitionText;
    public final String errorText;
    public final float installationProgress;
    public final InstallationStep installationStep;
    public final boolean isError;
    public final boolean isInstallable;
    public final boolean isProgressBarIndeterminate;
    public final boolean isTextFieldEnabled;
    public final String text;

    public static /* synthetic */ InstallationCardState copy$default(InstallationCardState installationCardState, InstallationStep installationStep2, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, float f, String str3, int i, Object obj) {
        InstallationCardState installationCardState2 = installationCardState;
        int i2 = i;
        return installationCardState.copy((i2 & 1) != 0 ? installationCardState2.installationStep : installationStep2, (i2 & 2) != 0 ? installationCardState2.isTextFieldEnabled : z, (i2 & 4) != 0 ? installationCardState2.isInstallable : z2, (i2 & 8) != 0 ? installationCardState2.isError : z3, (i2 & 16) != 0 ? installationCardState2.text : str, (i2 & 32) != 0 ? installationCardState2.errorText : str2, (i2 & 64) != 0 ? installationCardState2.isProgressBarIndeterminate : z4, (i2 & 128) != 0 ? installationCardState2.installationProgress : f, (i2 & 256) != 0 ? installationCardState2.currentPartitionText : str3);
    }

    public final InstallationCardState copy(InstallationStep installationStep2, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, float f, String str3) {
        Intrinsics.checkNotNullParameter(installationStep2, "installationStep");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(str2, "errorText");
        Intrinsics.checkNotNullParameter(str3, "currentPartitionText");
        return new InstallationCardState(installationStep2, z, z2, z3, str, str2, z4, f, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3149Boolean$branch$when$funequals$classInstallationCardState();
        }
        if (!(obj instanceof InstallationCardState)) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3153Boolean$branch$when1$funequals$classInstallationCardState();
        }
        InstallationCardState installationCardState = (InstallationCardState) obj;
        return this.installationStep != installationCardState.installationStep ? LiveLiterals$HomeUiStateKt.INSTANCE.m3158Boolean$branch$when2$funequals$classInstallationCardState() : this.isTextFieldEnabled != installationCardState.isTextFieldEnabled ? LiveLiterals$HomeUiStateKt.INSTANCE.m3162Boolean$branch$when3$funequals$classInstallationCardState() : this.isInstallable != installationCardState.isInstallable ? LiveLiterals$HomeUiStateKt.INSTANCE.m3165Boolean$branch$when4$funequals$classInstallationCardState() : this.isError != installationCardState.isError ? LiveLiterals$HomeUiStateKt.INSTANCE.m3168Boolean$branch$when5$funequals$classInstallationCardState() : !Intrinsics.areEqual((Object) this.text, (Object) installationCardState.text) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3171Boolean$branch$when6$funequals$classInstallationCardState() : !Intrinsics.areEqual((Object) this.errorText, (Object) installationCardState.errorText) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3173Boolean$branch$when7$funequals$classInstallationCardState() : this.isProgressBarIndeterminate != installationCardState.isProgressBarIndeterminate ? LiveLiterals$HomeUiStateKt.INSTANCE.m3175Boolean$branch$when8$funequals$classInstallationCardState() : Float.compare(this.installationProgress, installationCardState.installationProgress) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3177Boolean$branch$when9$funequals$classInstallationCardState() : !Intrinsics.areEqual((Object) this.currentPartitionText, (Object) installationCardState.currentPartitionText) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3155Boolean$branch$when10$funequals$classInstallationCardState() : LiveLiterals$HomeUiStateKt.INSTANCE.m3180Boolean$funequals$classInstallationCardState();
    }

    public int hashCode() {
        int hashCode = this.installationStep.hashCode();
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        int r2 = liveLiterals$HomeUiStateKt.m3194Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classInstallationCardState() * hashCode;
        boolean z = this.isTextFieldEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int r0 = liveLiterals$HomeUiStateKt.m3197Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classInstallationCardState() * (r2 + (z ? 1 : 0));
        boolean z3 = this.isInstallable;
        if (z3) {
            z3 = true;
        }
        int r22 = liveLiterals$HomeUiStateKt.m3200Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classInstallationCardState() * (r0 + (z3 ? 1 : 0));
        boolean z4 = this.isError;
        if (z4) {
            z4 = true;
        }
        int r02 = liveLiterals$HomeUiStateKt.m3203Int$arg0$calltimes$$this$callplus$setresult3$funhashCode$classInstallationCardState();
        int r03 = liveLiterals$HomeUiStateKt.m3207Int$arg0$calltimes$$this$callplus$setresult5$funhashCode$classInstallationCardState() * ((liveLiterals$HomeUiStateKt.m3205Int$arg0$calltimes$$this$callplus$setresult4$funhashCode$classInstallationCardState() * ((r02 * (r22 + (z4 ? 1 : 0))) + this.text.hashCode())) + this.errorText.hashCode());
        boolean z5 = this.isProgressBarIndeterminate;
        if (!z5) {
            z2 = z5;
        }
        return (liveLiterals$HomeUiStateKt.m3210Int$arg0$calltimes$$this$callplus$setresult7$funhashCode$classInstallationCardState() * ((liveLiterals$HomeUiStateKt.m3209Int$arg0$calltimes$$this$callplus$setresult6$funhashCode$classInstallationCardState() * (r03 + (z2 ? 1 : 0))) + Float.hashCode(this.installationProgress))) + this.currentPartitionText.hashCode();
    }

    public String toString() {
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        String r2 = liveLiterals$HomeUiStateKt.m3218String$0$str$funtoString$classInstallationCardState();
        String r3 = liveLiterals$HomeUiStateKt.m3222String$1$str$funtoString$classInstallationCardState();
        InstallationStep installationStep2 = this.installationStep;
        String r5 = liveLiterals$HomeUiStateKt.m3250String$3$str$funtoString$classInstallationCardState();
        String r6 = liveLiterals$HomeUiStateKt.m3254String$4$str$funtoString$classInstallationCardState();
        boolean z = this.isTextFieldEnabled;
        String r8 = liveLiterals$HomeUiStateKt.m3258String$6$str$funtoString$classInstallationCardState();
        String r9 = liveLiterals$HomeUiStateKt.m3261String$7$str$funtoString$classInstallationCardState();
        boolean z2 = this.isInstallable;
        String r11 = liveLiterals$HomeUiStateKt.m3264String$9$str$funtoString$classInstallationCardState();
        String r12 = liveLiterals$HomeUiStateKt.m3225String$10$str$funtoString$classInstallationCardState();
        boolean z3 = this.isError;
        String r14 = liveLiterals$HomeUiStateKt.m3228String$12$str$funtoString$classInstallationCardState();
        String r16 = liveLiterals$HomeUiStateKt.m3231String$13$str$funtoString$classInstallationCardState();
        String str = this.text;
        String r18 = liveLiterals$HomeUiStateKt.m3233String$15$str$funtoString$classInstallationCardState();
        String r19 = liveLiterals$HomeUiStateKt.m3235String$16$str$funtoString$classInstallationCardState();
        String str2 = this.errorText;
        String r21 = liveLiterals$HomeUiStateKt.m3237String$18$str$funtoString$classInstallationCardState();
        String r22 = liveLiterals$HomeUiStateKt.m3239String$19$str$funtoString$classInstallationCardState();
        boolean z4 = this.isProgressBarIndeterminate;
        String r24 = liveLiterals$HomeUiStateKt.m3241String$21$str$funtoString$classInstallationCardState();
        String r25 = liveLiterals$HomeUiStateKt.m3243String$22$str$funtoString$classInstallationCardState();
        float f = this.installationProgress;
        String r27 = liveLiterals$HomeUiStateKt.m3245String$24$str$funtoString$classInstallationCardState();
        String r28 = liveLiterals$HomeUiStateKt.m3246String$25$str$funtoString$classInstallationCardState();
        String str3 = this.currentPartitionText;
        String r1 = liveLiterals$HomeUiStateKt.m3247String$27$str$funtoString$classInstallationCardState();
        return r2 + r3 + installationStep2 + r5 + r6 + z + r8 + r9 + z2 + r11 + r12 + z3 + r14 + r16 + str + r18 + r19 + str2 + r21 + r22 + z4 + r24 + r25 + f + r27 + r28 + str3 + r1;
    }

    public InstallationCardState(InstallationStep installationStep2, boolean isTextFieldEnabled2, boolean isInstallable2, boolean isError2, String text2, String errorText2, boolean isProgressBarIndeterminate2, float installationProgress2, String currentPartitionText2) {
        Intrinsics.checkNotNullParameter(installationStep2, "installationStep");
        Intrinsics.checkNotNullParameter(text2, "text");
        Intrinsics.checkNotNullParameter(errorText2, "errorText");
        Intrinsics.checkNotNullParameter(currentPartitionText2, "currentPartitionText");
        this.installationStep = installationStep2;
        this.isTextFieldEnabled = isTextFieldEnabled2;
        this.isInstallable = isInstallable2;
        this.isError = isError2;
        this.text = text2;
        this.errorText = errorText2;
        this.isProgressBarIndeterminate = isProgressBarIndeterminate2;
        this.installationProgress = installationProgress2;
        this.currentPartitionText = currentPartitionText2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstallationCardState(vegabobo.dsusideloader.preparation.InstallationStep r10, boolean r11, boolean r12, boolean r13, java.lang.String r14, java.lang.String r15, boolean r16, float r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            vegabobo.dsusideloader.preparation.InstallationStep r1 = vegabobo.dsusideloader.preparation.InstallationStep.NOT_INSTALLING
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r2 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r2 = r2.m3188Boolean$paramisTextFieldEnabled$classInstallationCardState()
            goto L_0x0016
        L_0x0015:
            r2 = r11
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0021
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r3 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r3 = r3.m3184Boolean$paramisInstallable$classInstallationCardState()
            goto L_0x0022
        L_0x0021:
            r3 = r12
        L_0x0022:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r4 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r4 = r4.m3182Boolean$paramisError$classInstallationCardState()
            goto L_0x002e
        L_0x002d:
            r4 = r13
        L_0x002e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r5 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            java.lang.String r5 = r5.m3270String$paramtext$classInstallationCardState()
            goto L_0x003a
        L_0x0039:
            r5 = r14
        L_0x003a:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0045
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r6 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            java.lang.String r6 = r6.m3267String$paramerrorText$classInstallationCardState()
            goto L_0x0046
        L_0x0045:
            r6 = r15
        L_0x0046:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0051
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r7 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r7 = r7.m3185Boolean$paramisProgressBarIndeterminate$classInstallationCardState()
            goto L_0x0053
        L_0x0051:
            r7 = r16
        L_0x0053:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005e
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r8 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            float r8 = r8.m3191Float$paraminstallationProgress$classInstallationCardState()
            goto L_0x0060
        L_0x005e:
            r8 = r17
        L_0x0060:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x006b
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r0 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            java.lang.String r0 = r0.m3266String$paramcurrentPartitionText$classInstallationCardState()
            goto L_0x006d
        L_0x006b:
            r0 = r18
        L_0x006d:
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.home.InstallationCardState.<init>(vegabobo.dsusideloader.preparation.InstallationStep, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, float, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final InstallationStep getInstallationStep() {
        return this.installationStep;
    }

    public final boolean isTextFieldEnabled() {
        return this.isTextFieldEnabled;
    }

    public final boolean isInstallable() {
        return this.isInstallable;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final String getText() {
        return this.text;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final float getInstallationProgress() {
        return this.installationProgress;
    }

    public final String getCurrentPartitionText() {
        return this.currentPartitionText;
    }
}
