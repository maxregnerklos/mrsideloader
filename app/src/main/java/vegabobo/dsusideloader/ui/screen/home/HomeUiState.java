package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: HomeUiState.kt */
public final class HomeUiState {
    public static final int $stable = LiveLiterals$HomeUiStateKt.INSTANCE.m3211Int$classHomeUiState();
    public final AdditionalCardState additionalCard;
    public final ImageSizeCardState imageSizeCard;
    public final InstallationCardState installationCard;
    public final String installationLogs;
    public final boolean passedInitialChecks;
    public final SheetDisplayState sheetDisplay;
    public final boolean shouldKeepScreenOn;
    public final UserDataCardState userDataCard;

    public static /* synthetic */ HomeUiState copy$default(HomeUiState homeUiState, InstallationCardState installationCardState, UserDataCardState userDataCardState, ImageSizeCardState imageSizeCardState, AdditionalCardState additionalCardState, SheetDisplayState sheetDisplayState, String str, boolean z, boolean z2, int i, Object obj) {
        HomeUiState homeUiState2 = homeUiState;
        int i2 = i;
        return homeUiState.copy((i2 & 1) != 0 ? homeUiState2.installationCard : installationCardState, (i2 & 2) != 0 ? homeUiState2.userDataCard : userDataCardState, (i2 & 4) != 0 ? homeUiState2.imageSizeCard : imageSizeCardState, (i2 & 8) != 0 ? homeUiState2.additionalCard : additionalCardState, (i2 & 16) != 0 ? homeUiState2.sheetDisplay : sheetDisplayState, (i2 & 32) != 0 ? homeUiState2.installationLogs : str, (i2 & 64) != 0 ? homeUiState2.passedInitialChecks : z, (i2 & 128) != 0 ? homeUiState2.shouldKeepScreenOn : z2);
    }

    public final HomeUiState copy(InstallationCardState installationCardState, UserDataCardState userDataCardState, ImageSizeCardState imageSizeCardState, AdditionalCardState additionalCardState, SheetDisplayState sheetDisplayState, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(installationCardState, "installationCard");
        Intrinsics.checkNotNullParameter(userDataCardState, "userDataCard");
        Intrinsics.checkNotNullParameter(imageSizeCardState, "imageSizeCard");
        Intrinsics.checkNotNullParameter(additionalCardState, "additionalCard");
        Intrinsics.checkNotNullParameter(sheetDisplayState, "sheetDisplay");
        Intrinsics.checkNotNullParameter(str, "installationLogs");
        return new HomeUiState(installationCardState, userDataCardState, imageSizeCardState, additionalCardState, sheetDisplayState, str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3147Boolean$branch$when$funequals$classHomeUiState();
        }
        if (!(obj instanceof HomeUiState)) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3151Boolean$branch$when1$funequals$classHomeUiState();
        }
        HomeUiState homeUiState = (HomeUiState) obj;
        return !Intrinsics.areEqual((Object) this.installationCard, (Object) homeUiState.installationCard) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3156Boolean$branch$when2$funequals$classHomeUiState() : !Intrinsics.areEqual((Object) this.userDataCard, (Object) homeUiState.userDataCard) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3160Boolean$branch$when3$funequals$classHomeUiState() : !Intrinsics.areEqual((Object) this.imageSizeCard, (Object) homeUiState.imageSizeCard) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3164Boolean$branch$when4$funequals$classHomeUiState() : this.additionalCard != homeUiState.additionalCard ? LiveLiterals$HomeUiStateKt.INSTANCE.m3167Boolean$branch$when5$funequals$classHomeUiState() : this.sheetDisplay != homeUiState.sheetDisplay ? LiveLiterals$HomeUiStateKt.INSTANCE.m3170Boolean$branch$when6$funequals$classHomeUiState() : !Intrinsics.areEqual((Object) this.installationLogs, (Object) homeUiState.installationLogs) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3172Boolean$branch$when7$funequals$classHomeUiState() : this.passedInitialChecks != homeUiState.passedInitialChecks ? LiveLiterals$HomeUiStateKt.INSTANCE.m3174Boolean$branch$when8$funequals$classHomeUiState() : this.shouldKeepScreenOn != homeUiState.shouldKeepScreenOn ? LiveLiterals$HomeUiStateKt.INSTANCE.m3176Boolean$branch$when9$funequals$classHomeUiState() : LiveLiterals$HomeUiStateKt.INSTANCE.m3178Boolean$funequals$classHomeUiState();
    }

    public int hashCode() {
        int hashCode = this.installationCard.hashCode();
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        int r0 = liveLiterals$HomeUiStateKt.m3196Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classHomeUiState();
        int r2 = liveLiterals$HomeUiStateKt.m3199Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classHomeUiState();
        int r02 = liveLiterals$HomeUiStateKt.m3202Int$arg0$calltimes$$this$callplus$setresult3$funhashCode$classHomeUiState();
        int r03 = liveLiterals$HomeUiStateKt.m3206Int$arg0$calltimes$$this$callplus$setresult5$funhashCode$classHomeUiState() * ((liveLiterals$HomeUiStateKt.m3204Int$arg0$calltimes$$this$callplus$setresult4$funhashCode$classHomeUiState() * ((r02 * ((r2 * ((r0 * ((liveLiterals$HomeUiStateKt.m3192Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classHomeUiState() * hashCode) + this.userDataCard.hashCode())) + this.imageSizeCard.hashCode())) + this.additionalCard.hashCode())) + this.sheetDisplay.hashCode())) + this.installationLogs.hashCode());
        boolean z = this.passedInitialChecks;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int r1 = liveLiterals$HomeUiStateKt.m3208Int$arg0$calltimes$$this$callplus$setresult6$funhashCode$classHomeUiState() * (r03 + (z ? 1 : 0));
        boolean z3 = this.shouldKeepScreenOn;
        if (!z3) {
            z2 = z3;
        }
        return r1 + (z2 ? 1 : 0);
    }

    public String toString() {
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        String r2 = liveLiterals$HomeUiStateKt.m3216String$0$str$funtoString$classHomeUiState();
        String r3 = liveLiterals$HomeUiStateKt.m3220String$1$str$funtoString$classHomeUiState();
        InstallationCardState installationCardState = this.installationCard;
        String r5 = liveLiterals$HomeUiStateKt.m3248String$3$str$funtoString$classHomeUiState();
        String r6 = liveLiterals$HomeUiStateKt.m3252String$4$str$funtoString$classHomeUiState();
        UserDataCardState userDataCardState = this.userDataCard;
        String r8 = liveLiterals$HomeUiStateKt.m3256String$6$str$funtoString$classHomeUiState();
        String r9 = liveLiterals$HomeUiStateKt.m3260String$7$str$funtoString$classHomeUiState();
        ImageSizeCardState imageSizeCardState = this.imageSizeCard;
        String r11 = liveLiterals$HomeUiStateKt.m3263String$9$str$funtoString$classHomeUiState();
        String r12 = liveLiterals$HomeUiStateKt.m3224String$10$str$funtoString$classHomeUiState();
        AdditionalCardState additionalCardState = this.additionalCard;
        String r14 = liveLiterals$HomeUiStateKt.m3227String$12$str$funtoString$classHomeUiState();
        String r16 = liveLiterals$HomeUiStateKt.m3230String$13$str$funtoString$classHomeUiState();
        SheetDisplayState sheetDisplayState = this.sheetDisplay;
        String r18 = liveLiterals$HomeUiStateKt.m3232String$15$str$funtoString$classHomeUiState();
        String r19 = liveLiterals$HomeUiStateKt.m3234String$16$str$funtoString$classHomeUiState();
        String str = this.installationLogs;
        String r21 = liveLiterals$HomeUiStateKt.m3236String$18$str$funtoString$classHomeUiState();
        String r22 = liveLiterals$HomeUiStateKt.m3238String$19$str$funtoString$classHomeUiState();
        boolean z = this.passedInitialChecks;
        String r24 = liveLiterals$HomeUiStateKt.m3240String$21$str$funtoString$classHomeUiState();
        String r25 = liveLiterals$HomeUiStateKt.m3242String$22$str$funtoString$classHomeUiState();
        boolean z2 = this.shouldKeepScreenOn;
        String r1 = liveLiterals$HomeUiStateKt.m3244String$24$str$funtoString$classHomeUiState();
        return r2 + r3 + installationCardState + r5 + r6 + userDataCardState + r8 + r9 + imageSizeCardState + r11 + r12 + additionalCardState + r14 + r16 + sheetDisplayState + r18 + r19 + str + r21 + r22 + z + r24 + r25 + z2 + r1;
    }

    public HomeUiState(InstallationCardState installationCard2, UserDataCardState userDataCard2, ImageSizeCardState imageSizeCard2, AdditionalCardState additionalCard2, SheetDisplayState sheetDisplay2, String installationLogs2, boolean passedInitialChecks2, boolean shouldKeepScreenOn2) {
        Intrinsics.checkNotNullParameter(installationCard2, "installationCard");
        Intrinsics.checkNotNullParameter(userDataCard2, "userDataCard");
        Intrinsics.checkNotNullParameter(imageSizeCard2, "imageSizeCard");
        Intrinsics.checkNotNullParameter(additionalCard2, "additionalCard");
        Intrinsics.checkNotNullParameter(sheetDisplay2, "sheetDisplay");
        Intrinsics.checkNotNullParameter(installationLogs2, "installationLogs");
        this.installationCard = installationCard2;
        this.userDataCard = userDataCard2;
        this.imageSizeCard = imageSizeCard2;
        this.additionalCard = additionalCard2;
        this.sheetDisplay = sheetDisplay2;
        this.installationLogs = installationLogs2;
        this.passedInitialChecks = passedInitialChecks2;
        this.shouldKeepScreenOn = shouldKeepScreenOn2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HomeUiState(vegabobo.dsusideloader.ui.screen.home.InstallationCardState r15, vegabobo.dsusideloader.ui.screen.home.UserDataCardState r16, vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState r17, vegabobo.dsusideloader.ui.screen.home.AdditionalCardState r18, vegabobo.dsusideloader.ui.screen.home.SheetDisplayState r19, java.lang.String r20, boolean r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r14 = this;
            r0 = r23
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0019
            vegabobo.dsusideloader.ui.screen.home.InstallationCardState r1 = new vegabobo.dsusideloader.ui.screen.home.InstallationCardState
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 511(0x1ff, float:7.16E-43)
            r13 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x001a
        L_0x0019:
            r1 = r15
        L_0x001a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x002c
            vegabobo.dsusideloader.ui.screen.home.UserDataCardState r2 = new vegabobo.dsusideloader.ui.screen.home.UserDataCardState
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x002e
        L_0x002c:
            r2 = r16
        L_0x002e:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x003b
            vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState r3 = new vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState
            r4 = 0
            r5 = 3
            r6 = 0
            r3.<init>(r4, r6, r5, r6)
            goto L_0x003d
        L_0x003b:
            r3 = r17
        L_0x003d:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0044
            vegabobo.dsusideloader.ui.screen.home.AdditionalCardState r4 = vegabobo.dsusideloader.ui.screen.home.AdditionalCardState.NONE
            goto L_0x0046
        L_0x0044:
            r4 = r18
        L_0x0046:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x004d
            vegabobo.dsusideloader.ui.screen.home.SheetDisplayState r5 = vegabobo.dsusideloader.ui.screen.home.SheetDisplayState.NONE
            goto L_0x004f
        L_0x004d:
            r5 = r19
        L_0x004f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x005a
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r6 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            java.lang.String r6 = r6.m3268String$paraminstallationLogs$classHomeUiState()
            goto L_0x005c
        L_0x005a:
            r6 = r20
        L_0x005c:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0067
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r7 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r7 = r7.m3189Boolean$parampassedInitialChecks$classHomeUiState()
            goto L_0x0069
        L_0x0067:
            r7 = r21
        L_0x0069:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0074
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt r0 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeUiStateKt.INSTANCE
            boolean r0 = r0.m3190Boolean$paramshouldKeepScreenOn$classHomeUiState()
            goto L_0x0076
        L_0x0074:
            r0 = r22
        L_0x0076:
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.home.HomeUiState.<init>(vegabobo.dsusideloader.ui.screen.home.InstallationCardState, vegabobo.dsusideloader.ui.screen.home.UserDataCardState, vegabobo.dsusideloader.ui.screen.home.ImageSizeCardState, vegabobo.dsusideloader.ui.screen.home.AdditionalCardState, vegabobo.dsusideloader.ui.screen.home.SheetDisplayState, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final InstallationCardState getInstallationCard() {
        return this.installationCard;
    }

    public final UserDataCardState getUserDataCard() {
        return this.userDataCard;
    }

    public final ImageSizeCardState getImageSizeCard() {
        return this.imageSizeCard;
    }

    public final AdditionalCardState getAdditionalCard() {
        return this.additionalCard;
    }

    public final SheetDisplayState getSheetDisplay() {
        return this.sheetDisplay;
    }

    public final String getInstallationLogs() {
        return this.installationLogs;
    }

    public final boolean getPassedInitialChecks() {
        return this.passedInitialChecks;
    }

    public final boolean getShouldKeepScreenOn() {
        return this.shouldKeepScreenOn;
    }

    public final boolean isInstalling() {
        return this.installationCard.getInstallationStep() != InstallationStep.NOT_INSTALLING;
    }
}
