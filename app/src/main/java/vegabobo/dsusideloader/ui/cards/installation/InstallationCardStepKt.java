package vegabobo.dsusideloader.ui.cards.installation;

import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: InstallationCardStep.kt */
public abstract class InstallationCardStepKt {

    /* compiled from: InstallationCardStep.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstallationStep.values().length];
            try {
                iArr[InstallationStep.NOT_INSTALLING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[InstallationStep.DSU_ALREADY_INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[InstallationStep.DSU_ALREADY_RUNNING_DYN_OS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[InstallationStep.PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[InstallationStep.COPYING_FILE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[InstallationStep.DECOMPRESSING_XZ.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[InstallationStep.COMPRESSING_TO_GZ.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InstallationStep.DECOMPRESSING_GZIP.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[InstallationStep.EXTRACTING_FILE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[InstallationStep.DISCARD_CURRENT_GSI.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[InstallationStep.WAITING_USER_CONFIRMATION.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[InstallationStep.PROCESSING_LOG_READABLE.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[InstallationStep.INSTALLING.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[InstallationStep.INSTALLING_ROOTED.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[InstallationStep.CREATING_PARTITION.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[InstallationStep.ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[InstallationStep.ERROR_CANCELED.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[InstallationStep.ERROR_REQUIRES_DISCARD_DSU.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[InstallationStep.ERROR_ALREADY_RUNNING_DYN_OS.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[InstallationStep.ERROR_CREATE_PARTITION.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[InstallationStep.ERROR_EXTERNAL_SDCARD_ALLOC.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[InstallationStep.ERROR_NO_AVAIL_STORAGE.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[InstallationStep.ERROR_F2FS_WRONG_PATH.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[InstallationStep.ERROR_EXTENTS.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[InstallationStep.ERROR_SELINUX.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[InstallationStep.ERROR_SELINUX_ROOTLESS.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[InstallationStep.INSTALL_SUCCESS.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr[InstallationStep.INSTALL_SUCCESS_REBOOT_DYN_OS.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr[InstallationStep.REQUIRES_ADB_CMD_TO_CONTINUE.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0719  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0769  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07f4  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0870  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x092a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x09a2  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0a23  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0a2c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0a2f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void InstallationCardStep(vegabobo.dsusideloader.ui.screen.home.InstallationCardState r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, java.lang.String r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function0 r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function0 r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, kotlin.jvm.functions.Function0 r43, kotlin.jvm.functions.Function0 r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, int r47, int r48, int r49) {
        /*
            r15 = r32
            r14 = r33
            r13 = r35
            r12 = r36
            r11 = r37
            r10 = r38
            r9 = r39
            r8 = r40
            r7 = r41
            r6 = r42
            r5 = r43
            r4 = r44
            r3 = r45
            r2 = r47
            r1 = r48
            r0 = r49
            java.lang.String r1 = "uiState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "textFieldInteraction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "onClickClear"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "onClickInstall"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "onClickRetryInstallation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.String r1 = "onClickUnmountSdCardAndRetry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.String r1 = "onClickSetSeLinuxPermissive"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "onClickCancelInstallation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "onClickDiscardInstalledGsiAndInstall"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "onClickDiscardDsu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "onClickRebootToDynOS"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "onClickViewLogs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "onClickViewCommands"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            r1 = -1266817803(0xffffffffb47de4f5, float:-2.3645755E-7)
            r3 = r46
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r1)
            java.lang.String r1 = "C(InstallationCardStep)P(13,12!1,2,5,7,9,8!1,4!2,11):InstallationCardStep.kt#hydgom"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r1)
            r1 = r47
            r16 = r48
            r17 = r0 & 1
            r18 = 2
            r19 = 4
            if (r17 == 0) goto L_0x007e
            r1 = r1 | 6
            goto L_0x008f
        L_0x007e:
            r17 = r2 & 14
            if (r17 != 0) goto L_0x008f
            boolean r17 = r3.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x008b
            r17 = r19
            goto L_0x008d
        L_0x008b:
            r17 = r18
        L_0x008d:
            r1 = r1 | r17
        L_0x008f:
            r17 = r0 & 2
            r20 = 32
            r21 = 16
            if (r17 == 0) goto L_0x009a
            r1 = r1 | 48
            goto L_0x00ab
        L_0x009a:
            r17 = r2 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x00ab
            boolean r17 = r3.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x00a7
            r17 = r20
            goto L_0x00a9
        L_0x00a7:
            r17 = r21
        L_0x00a9:
            r1 = r1 | r17
        L_0x00ab:
            r14 = r2 & 896(0x380, float:1.256E-42)
            r17 = 256(0x100, float:3.59E-43)
            r22 = 128(0x80, float:1.794E-43)
            if (r14 != 0) goto L_0x00c9
            r14 = r0 & 4
            if (r14 != 0) goto L_0x00c2
            r14 = r34
            boolean r23 = r3.changed((java.lang.Object) r14)
            if (r23 == 0) goto L_0x00c4
            r23 = r17
            goto L_0x00c6
        L_0x00c2:
            r14 = r34
        L_0x00c4:
            r23 = r22
        L_0x00c6:
            r1 = r1 | r23
            goto L_0x00cb
        L_0x00c9:
            r14 = r34
        L_0x00cb:
            r23 = r0 & 8
            r24 = 2048(0x800, float:2.87E-42)
            r25 = 1024(0x400, float:1.435E-42)
            if (r23 == 0) goto L_0x00d6
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00e6
        L_0x00d6:
            r14 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x00e6
            boolean r14 = r3.changedInstance(r13)
            if (r14 == 0) goto L_0x00e3
            r14 = r24
            goto L_0x00e5
        L_0x00e3:
            r14 = r25
        L_0x00e5:
            r1 = r1 | r14
        L_0x00e6:
            r14 = r0 & 16
            if (r14 == 0) goto L_0x00ed
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ff
        L_0x00ed:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r2
            if (r14 != 0) goto L_0x00ff
            boolean r14 = r3.changedInstance(r12)
            if (r14 == 0) goto L_0x00fc
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00fe
        L_0x00fc:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00fe:
            r1 = r1 | r14
        L_0x00ff:
            r14 = r0 & 32
            if (r14 == 0) goto L_0x0107
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x0105:
            r1 = r1 | r14
            goto L_0x0118
        L_0x0107:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r2
            if (r14 != 0) goto L_0x0118
            boolean r14 = r3.changedInstance(r11)
            if (r14 == 0) goto L_0x0115
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0105
        L_0x0115:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0105
        L_0x0118:
            r14 = r0 & 64
            r23 = 3670016(0x380000, float:5.142788E-39)
            if (r14 == 0) goto L_0x0122
            r14 = 1572864(0x180000, float:2.204052E-39)
        L_0x0120:
            r1 = r1 | r14
            goto L_0x0132
        L_0x0122:
            r14 = r2 & r23
            if (r14 != 0) goto L_0x0132
            boolean r14 = r3.changedInstance(r10)
            if (r14 == 0) goto L_0x012f
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0120
        L_0x012f:
            r14 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0120
        L_0x0132:
            r14 = r0 & 128(0x80, float:1.794E-43)
            r26 = 29360128(0x1c00000, float:7.052966E-38)
            if (r14 == 0) goto L_0x013c
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x013a:
            r1 = r1 | r14
            goto L_0x014c
        L_0x013c:
            r14 = r2 & r26
            if (r14 != 0) goto L_0x014c
            boolean r14 = r3.changedInstance(r9)
            if (r14 == 0) goto L_0x0149
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x013a
        L_0x0149:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x013a
        L_0x014c:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0154
            r14 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0152:
            r1 = r1 | r14
            goto L_0x0165
        L_0x0154:
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r2
            if (r14 != 0) goto L_0x0165
            boolean r14 = r3.changedInstance(r8)
            if (r14 == 0) goto L_0x0162
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0152
        L_0x0162:
            r14 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0152
        L_0x0165:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x016d
            r14 = 805306368(0x30000000, float:4.656613E-10)
        L_0x016b:
            r1 = r1 | r14
            goto L_0x017e
        L_0x016d:
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r2
            if (r14 != 0) goto L_0x017e
            boolean r14 = r3.changedInstance(r7)
            if (r14 == 0) goto L_0x017b
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x016b
        L_0x017b:
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x016b
        L_0x017e:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0187
            r16 = r16 | 6
            r14 = r48
            goto L_0x0197
        L_0x0187:
            r14 = r48
            r27 = r14 & 14
            if (r27 != 0) goto L_0x0197
            boolean r27 = r3.changedInstance(r6)
            if (r27 == 0) goto L_0x0195
            r18 = r19
        L_0x0195:
            r16 = r16 | r18
        L_0x0197:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x019e
            r16 = r16 | 48
            goto L_0x01ad
        L_0x019e:
            r6 = r14 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x01ad
            boolean r6 = r3.changedInstance(r5)
            if (r6 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r20 = r21
        L_0x01ab:
            r16 = r16 | r20
        L_0x01ad:
            r6 = r16
            r5 = r0 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x01b6
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01c5
        L_0x01b6:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x01c5
            boolean r5 = r3.changedInstance(r4)
            if (r5 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r17 = r22
        L_0x01c3:
            r6 = r6 | r17
        L_0x01c5:
            r5 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x01ce
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            r5 = r45
            goto L_0x01e2
        L_0x01ce:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01e0
            r5 = r45
            boolean r16 = r3.changedInstance(r5)
            if (r16 == 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r24 = r25
        L_0x01dd:
            r6 = r6 | r24
            goto L_0x01e2
        L_0x01e0:
            r5 = r45
        L_0x01e2:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r1 & r16
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x0205
            r4 = r6 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0205
            boolean r4 = r3.getSkipping()
            if (r4 != 0) goto L_0x01f9
            goto L_0x0205
        L_0x01f9:
            r3.skipToGroupEnd()
            r27 = r34
            r28 = r1
            r14 = r3
            r29 = r6
            goto L_0x0a26
        L_0x0205:
            r3.startDefaults()
            r4 = r2 & 1
            if (r4 == 0) goto L_0x021d
            boolean r4 = r3.getDefaultsInvalid()
            if (r4 == 0) goto L_0x0213
            goto L_0x021d
        L_0x0213:
            r3.skipToGroupEnd()
            r4 = r0 & 4
            if (r4 == 0) goto L_0x022d
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x022d
        L_0x021d:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x022d
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r4 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            java.lang.String r4 = r4.m2884String$paramminPercentageOfFreeStorage$funInstallationCardStep()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r1
            r27 = r4
            goto L_0x0230
        L_0x022d:
            r27 = r34
            r5 = r1
        L_0x0230:
            r3.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0241
            r1 = -1266817803(0xffffffffb47de4f5, float:-2.3645755E-7)
            java.lang.String r4 = "vegabobo.dsusideloader.ui.cards.installation.InstallationCardStep (InstallationCardStep.kt:12)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r5, r6, r4)
        L_0x0241:
            vegabobo.dsusideloader.preparation.InstallationStep r1 = r32.getInstallationStep()
            int[] r4 = vegabobo.dsusideloader.ui.cards.installation.InstallationCardStepKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            switch(r1) {
                case 1: goto L_0x09e5;
                case 2: goto L_0x09a2;
                case 3: goto L_0x096d;
                case 4: goto L_0x092a;
                case 5: goto L_0x08ec;
                case 6: goto L_0x08ae;
                case 7: goto L_0x0870;
                case 8: goto L_0x0832;
                case 9: goto L_0x07f4;
                case 10: goto L_0x07ad;
                case 11: goto L_0x0769;
                case 12: goto L_0x0719;
                case 13: goto L_0x06c2;
                case 14: goto L_0x067a;
                case 15: goto L_0x0632;
                case 16: goto L_0x05e4;
                case 17: goto L_0x05a0;
                case 18: goto L_0x055c;
                case 19: goto L_0x0521;
                case 20: goto L_0x04e6;
                case 21: goto L_0x049a;
                case 22: goto L_0x0450;
                case 23: goto L_0x0402;
                case 24: goto L_0x03be;
                case 25: goto L_0x037a;
                case 26: goto L_0x0336;
                case 27: goto L_0x02fb;
                case 28: goto L_0x02b7;
                case 29: goto L_0x0263;
                default: goto L_0x0251;
            }
        L_0x0251:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355889099(0xffffffffeac99035, float:-1.2183754E26)
            r14.startReplaceableGroup(r0)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0263:
            r1 = -355889482(0xffffffffeac98eb6, float:-1.2183401E26)
            r3.startReplaceableGroup(r1)
            java.lang.String r1 = "259@13012L52,260@13100L42,262@13237L37,258@12964L377"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r1)
            int r1 = vegabobo.dsusideloader.C0001R$string.require_adb_cmd_to_continue
            r4 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r3, r4)
            int r0 = vegabobo.dsusideloader.C0001R$string.see_commands
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r3, r4)
            int r0 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r17 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r3, r4)
            r4 = 0
            r18 = 0
            r19 = 0
            int r0 = r6 << 9
            r0 = r0 & r23
            int r20 = r5 << 12
            r20 = r20 & r26
            r20 = r0 | r20
            r21 = 14
            r0 = r1
            r1 = r4
            r2 = r18
            r14 = r3
            r3 = r19
            r4 = r16
            r28 = r5
            r5 = r17
            r29 = r6
            r6 = r45
            r7 = r35
            r8 = r14
            r9 = r20
            r10 = r21
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x02b7:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355889932(0xffffffffeac98cf4, float:-1.2182986E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "251@12562L46,252@12644L45,254@12785L37,250@12514L380"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installation_finished
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.reboot_into_dsu
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.discard
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 15
            r6 = r6 & r23
            int r7 = r29 << 21
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r43
            r7 = r42
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x02fb:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355890247(0xffffffffeac98bb9, float:-1.2182696E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "245@12247L55,246@12339L37,244@12199L244"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installation_finished_rootless
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r6, r14, r1)
            r7 = 0
            int r1 = r28 << 12
            r9 = r1 & r26
            r10 = 94
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0336:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355890672(0xffffffffeac98a10, float:-1.2182304E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "237@11822L50,238@11908L39,240@12038L37,236@11774L368"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.selinux_error_description
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 12
            r6 = r6 & r23
            int r7 = r28 << 12
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r44
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x037a:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355891139(0xffffffffeac9883d, float:-1.2181873E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "229@11355L50,230@11441L50,232@11594L36,228@11307L403"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.selinux_error_description
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.selinux_error_action
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r28 >> 3
            r6 = r6 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r39
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x03be:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355891562(0xffffffffeac98696, float:-1.2181483E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "221@10932L50,222@11018L39,224@11148L37,220@10884L368"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.extents_error_description
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 12
            r6 = r6 & r23
            int r7 = r28 << 12
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r44
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0402:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355892065(0xffffffffeac9849f, float:-1.2181019E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "210@10429L132,214@10597L39,216@10727L35,209@10381L448"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.fs_features_error_description
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getErrorText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            int r1 = vegabobo.dsusideloader.C0001R$string.clear
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 12
            r6 = r6 & r23
            int r7 = r28 << 12
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r44
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0450:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355892545(0xffffffffeac982bf, float:-1.2180576E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "202@9949L78,203@10063L39,205@10202L36,201@9901L417"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.storage_error_description
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 0
            r1[r2] = r27
            r3 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r3)
            int r1 = vegabobo.dsusideloader.C0001R$string.try_again
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r2)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r28 << 3
            r6 = r6 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r37
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x049a:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355893097(0xffffffffeac98097, float:-1.2180067E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "191@9397L131,195@9564L53,197@9721L36,190@9349L488"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.allocation_error_description
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getErrorText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.allocation_error_action
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            int r1 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = r28 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r38
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x04e6:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355893403(0xffffffffeac97f65, float:-1.2179785E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "185@9091L48,186@9176L37,184@9043L237"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.failed_create_partition
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r6, r14, r1)
            r7 = 0
            int r1 = r28 << 12
            r9 = r1 & r26
            r10 = 94
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0521:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355893700(0xffffffffeac97e3c, float:-1.2179511E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "179@8794L44,180@8875L37,178@8746L233"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.already_running_dsu
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r6, r14, r1)
            r7 = 0
            int r1 = r28 << 12
            r9 = r1 & r26
            r10 = 94
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x055c:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355894159(0xffffffffeac97c71, float:-1.2179087E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "171@8335L40,172@8411L37,174@8560L36,170@8287L389"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.discard_dsu_otg
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.discard
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r28 >> 9
            r6 = r6 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r41
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x05a0:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355894591(0xffffffffeac97ac1, float:-1.2178689E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "163@7903L46,164@7985L39,166@8115L37,162@7855L364"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installation_canceled
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 12
            r6 = r6 & r23
            int r7 = r28 << 12
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r44
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x05e4:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355895022(0xffffffffeac97912, float:-1.2178291E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "155@7472L57,156@7565L39,158@7695L37,154@7424L375"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.unknown_error
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getErrorText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            int r1 = vegabobo.dsusideloader.C0001R$string.mreturn
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 12
            r6 = r6 & r23
            int r7 = r28 << 12
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r44
            r7 = r35
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0632:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355895440(0xffffffffeac97770, float:-1.2177906E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "147@7054L73,148@7164L36,146@7006L371"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.creating_partition
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getCurrentPartitionText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2875Boolean$arg1$callProgressableCardContent$branch14$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x067a:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355895897(0xffffffffeac975a7, float:-1.2177484E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "138@6611L75,139@6723L36,137@6563L373"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installing_partition
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getCurrentPartitionText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2874Boolean$arg1$callProgressableCardContent$branch13$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x06c2:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355896470(0xffffffffeac9736a, float:-1.2176956E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "127@6038L75,128@6149L36,130@6286L39,126@5990L502"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installing_partition
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r32.getCurrentPartitionText()
            r3 = 0
            r1[r3] = r2
            r2 = 64
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r14, r2)
            int r1 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            int r1 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r1, r14, r3)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2873Boolean$arg1$callProgressableCardContent$branch12$when$funInstallationCardStep()
            r2 = 0
            int r6 = r28 >> 6
            r6 = r6 & r23
            int r7 = r29 << 15
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 4
            r6 = r40
            r7 = r44
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0719:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355896955(0xffffffffeac97185, float:-1.21765085E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "117@5539L35,118@5610L36,120@5747L39,116@5491L445"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installing
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.view_logs
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r2 = r1.m2872Boolean$arg1$callProgressableCardContent$branch11$when$funInstallationCardStep()
            boolean r3 = r1.m2882Boolean$arg2$callProgressableCardContent$branch11$when$funInstallationCardStep()
            r6 = 0
            int r1 = r28 >> 6
            r1 = r1 & r23
            int r7 = r29 << 15
            r7 = r7 & r26
            r9 = r1 | r7
            r10 = 8
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r40
            r7 = r44
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0769:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355897427(0xffffffffeac96fad, float:-1.2176073E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "108@5081L44,109@5161L39,111@5300L36,107@5033L383"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.installation_prompt
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.try_again
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r28 << 3
            r6 = r6 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r37
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x07ad:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355897956(0xffffffffeac96d9c, float:-1.2175585E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "98@4552L40,99@4628L41,101@4781L36,97@4504L450"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.discard_dsu_otg
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.discard_dsu
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            r1 = 0
            r2 = 0
            int r6 = r28 >> 9
            r6 = r6 & r23
            int r7 = r28 >> 3
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 6
            r6 = r41
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x07f4:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355898343(0xffffffffeac96c19, float:-1.2175228E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "90@4151L40,91@4228L36,89@4103L338"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.extracting_file
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2881Boolean$arg1$callProgressableCardContent$branch8$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0832:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355898738(0xffffffffeac96a8e, float:-1.2174864E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "82@3756L40,83@3833L36,81@3708L338"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.extracting_file
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2880Boolean$arg1$callProgressableCardContent$branch7$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x0870:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355899138(0xffffffffeac968fe, float:-1.2174495E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "74@3356L42,75@3435L36,73@3308L340"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.compressing_to_gz
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2879Boolean$arg1$callProgressableCardContent$branch6$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x08ae:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355899536(0xffffffffeac96770, float:-1.2174128E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "66@2958L41,67@3036L36,65@2910L339"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.decompressing_xz
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2878Boolean$arg1$callProgressableCardContent$branch5$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x08ec:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355899929(0xffffffffeac965e7, float:-1.21737655E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "58@2565L37,59@2639L36,57@2517L335"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.copying_file
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            float r3 = r32.getInstallationProgress()
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r1 = r1.m2877Boolean$arg1$callProgressableCardContent$branch4$when$funInstallationCardStep()
            r2 = 0
            r4 = 0
            r6 = 0
            int r7 = r28 >> 3
            r9 = r7 & r26
            r10 = 84
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x092a:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355900299(0xffffffffeac96475, float:-1.2173424E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "50@2195L35,51@2267L36,49@2147L316"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.processing
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt r1 = vegabobo.dsusideloader.ui.cards.installation.LiveLiterals$InstallationCardStepKt.INSTANCE
            boolean r2 = r1.m2876Boolean$arg1$callProgressableCardContent$branch3$when$funInstallationCardStep()
            boolean r3 = r1.m2883Boolean$arg2$callProgressableCardContent$branch3$when$funInstallationCardStep()
            r4 = 0
            r6 = 0
            r7 = 0
            int r1 = r28 >> 3
            r9 = r1 & r26
            r10 = 88
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r40
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x096d:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355900458(0xffffffffeac963d6, float:-1.2173278E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "46@2036L44,45@1988L107"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.already_running_dsu
            r1 = 0
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 254(0xfe, float:3.56E-43)
            r24 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x09a2:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355900906(0xffffffffeac96216, float:-1.2172864E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "38@1588L46,39@1670L45,41@1811L37,37@1540L380"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.dsu_already_installed
            r1 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.reboot_into_dsu
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            int r2 = vegabobo.dsusideloader.C0001R$string.discard
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r2, r14, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            int r6 = r29 << 15
            r6 = r6 & r23
            int r7 = r29 << 21
            r7 = r7 & r26
            r9 = r6 | r7
            r10 = 14
            r6 = r43
            r7 = r42
            r8 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.ProgressableCardContentKt.ProgressableCardContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0a1d
        L_0x09e5:
            r14 = r3
            r28 = r5
            r29 = r6
            r0 = -355901198(0xffffffffeac960f2, float:-1.2172595E26)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "30@1248L229"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            int r0 = r28 >> 3
            r0 = r0 & 14
            int r1 = r28 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r28 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r28 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r33
            r1 = r32
            r2 = r35
            r3 = r36
            r4 = r14
            vegabobo.dsusideloader.ui.cards.installation.content.NotInstallingCardContentKt.NotInstallingCardContent(r0, r1, r2, r3, r4, r5)
            r14.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0a1d:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0a26
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0a26:
            androidx.compose.runtime.ScopeUpdateScope r10 = r14.endRestartGroup()
            if (r10 != 0) goto L_0x0a2f
            r18 = r14
            goto L_0x0a64
        L_0x0a2f:
            vegabobo.dsusideloader.ui.cards.installation.InstallationCardStepKt$InstallationCardStep$1 r9 = new vegabobo.dsusideloader.ui.cards.installation.InstallationCardStepKt$InstallationCardStep$1
            r0 = r9
            r1 = r32
            r2 = r33
            r3 = r27
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r30 = r9
            r9 = r40
            r31 = r10
            r10 = r41
            r11 = r42
            r12 = r43
            r13 = r44
            r18 = r14
            r14 = r45
            r15 = r47
            r16 = r48
            r17 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r30
            r0 = r31
            r0.updateScope(r1)
        L_0x0a64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.cards.installation.InstallationCardStepKt.InstallationCardStep(vegabobo.dsusideloader.ui.screen.home.InstallationCardState, androidx.compose.foundation.interaction.MutableInteractionSource, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
