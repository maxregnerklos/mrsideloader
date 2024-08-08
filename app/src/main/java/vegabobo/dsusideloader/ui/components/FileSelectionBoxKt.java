package vegabobo.dsusideloader.ui.components;

/* compiled from: FileSelectionBox.kt */
public abstract class FileSelectionBoxKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FileSelectionBox(androidx.compose.ui.Modifier r37, boolean r38, androidx.compose.foundation.text.KeyboardOptions r39, boolean r40, boolean r41, java.lang.String r42, java.lang.String r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, kotlin.jvm.functions.Function1 r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r12 = r42
            r11 = r43
            r10 = r47
            r9 = r48
            java.lang.String r0 = "textFieldTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "textFieldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -498109179(0xffffffffe24f7505, float:-9.5672704E20)
            r1 = r46
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(FileSelectionBox)P(4,2,3!2,7,8,6)24@892L438:FileSelectionBox.kt#bcxyhz"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            r1 = r47
            r2 = r9 & 1
            if (r2 == 0) goto L_0x002b
            r1 = r1 | 6
            r3 = r37
            goto L_0x003e
        L_0x002b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x003c
            r3 = r37
            boolean r4 = r8.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0039
            r4 = 4
            goto L_0x003a
        L_0x0039:
            r4 = 2
        L_0x003a:
            r1 = r1 | r4
            goto L_0x003e
        L_0x003c:
            r3 = r37
        L_0x003e:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0057
            r4 = r9 & 2
            if (r4 != 0) goto L_0x0051
            r4 = r38
            boolean r5 = r8.changed((boolean) r4)
            if (r5 == 0) goto L_0x0053
            r5 = 32
            goto L_0x0055
        L_0x0051:
            r4 = r38
        L_0x0053:
            r5 = 16
        L_0x0055:
            r1 = r1 | r5
            goto L_0x0059
        L_0x0057:
            r4 = r38
        L_0x0059:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0062
            r1 = r1 | 384(0x180, float:5.38E-43)
            r6 = r39
            goto L_0x0077
        L_0x0062:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0075
            r6 = r39
            boolean r7 = r8.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0071
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0073:
            r1 = r1 | r7
            goto L_0x0077
        L_0x0075:
            r6 = r39
        L_0x0077:
            r7 = r9 & 8
            if (r7 == 0) goto L_0x0080
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r7 = r40
            goto L_0x0095
        L_0x0080:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0093
            r7 = r40
            boolean r13 = r8.changed((boolean) r7)
            if (r13 == 0) goto L_0x008f
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r1 = r1 | r13
            goto L_0x0095
        L_0x0093:
            r7 = r40
        L_0x0095:
            r13 = r9 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r13 == 0) goto L_0x00a1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r13 = r41
            goto L_0x00b6
        L_0x00a1:
            r13 = r10 & r14
            if (r13 != 0) goto L_0x00b4
            r13 = r41
            boolean r15 = r8.changed((boolean) r13)
            if (r15 == 0) goto L_0x00b0
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b2
        L_0x00b0:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            r1 = r1 | r15
            goto L_0x00b6
        L_0x00b4:
            r13 = r41
        L_0x00b6:
            r15 = r9 & 32
            if (r15 == 0) goto L_0x00be
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00bc:
            r1 = r1 | r15
            goto L_0x00cf
        L_0x00be:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cf
            boolean r15 = r8.changed((java.lang.Object) r12)
            if (r15 == 0) goto L_0x00cc
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00cc:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00bc
        L_0x00cf:
            r15 = r9 & 64
            if (r15 == 0) goto L_0x00d7
            r15 = 1572864(0x180000, float:2.204052E-39)
        L_0x00d5:
            r1 = r1 | r15
            goto L_0x00e8
        L_0x00d7:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00e8
            boolean r15 = r8.changed((java.lang.Object) r11)
            if (r15 == 0) goto L_0x00e5
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00e5:
            r15 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00d5
        L_0x00e8:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r10 & r16
            if (r15 != 0) goto L_0x0104
            r15 = r9 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x00fd
            r15 = r44
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x00ff
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0101
        L_0x00fd:
            r15 = r44
        L_0x00ff:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0101:
            r1 = r1 | r17
            goto L_0x0106
        L_0x0104:
            r15 = r44
        L_0x0106:
            r14 = r9 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0111
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            r0 = r45
            goto L_0x0129
        L_0x0111:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x0127
            r0 = r45
            boolean r18 = r8.changedInstance(r0)
            if (r18 == 0) goto L_0x0122
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0124
        L_0x0122:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0124:
            r1 = r1 | r18
            goto L_0x0129
        L_0x0127:
            r0 = r45
        L_0x0129:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r1 & r18
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x0149
            boolean r0 = r8.getSkipping()
            if (r0 != 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            r8.skipToGroupEnd()
            r13 = r37
            r17 = r45
            r18 = r1
            r14 = r4
            r16 = r15
            r15 = r6
            goto L_0x024d
        L_0x0149:
            r8.startDefaults()
            r0 = r10 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0177
            boolean r0 = r8.getDefaultsInvalid()
            if (r0 == 0) goto L_0x015a
            goto L_0x0177
        L_0x015a:
            r8.skipToGroupEnd()
            r0 = r9 & 2
            if (r0 == 0) goto L_0x0163
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0163:
            r0 = r9 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0170
            r0 = r1 & r3
            r2 = r45
            r3 = r0
            r1 = r15
            r0 = r37
            goto L_0x01b6
        L_0x0170:
            r0 = r37
            r2 = r45
            r3 = r1
            r1 = r15
            goto L_0x01b6
        L_0x0177:
            if (r2 == 0) goto L_0x017c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            goto L_0x017e
        L_0x017c:
            r0 = r37
        L_0x017e:
            r2 = r9 & 2
            if (r2 == 0) goto L_0x018b
            vegabobo.dsusideloader.ui.components.LiveLiterals$FileSelectionBoxKt r2 = vegabobo.dsusideloader.ui.components.LiveLiterals$FileSelectionBoxKt.INSTANCE
            boolean r2 = r2.m2998Boolean$paramisReadOnly$funFileSelectionBox()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r2
        L_0x018b:
            if (r5 == 0) goto L_0x01a1
            androidx.compose.foundation.text.KeyboardOptions r2 = new androidx.compose.foundation.text.KeyboardOptions
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 15
            r24 = 0
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r6 = r2
        L_0x01a1:
            r2 = r9 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01ab
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r1 = r1 & r3
            r15 = r2
        L_0x01ab:
            if (r14 == 0) goto L_0x01b2
            vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$1 r2 = vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$1.INSTANCE
            r3 = r1
            r1 = r15
            goto L_0x01b6
        L_0x01b2:
            r2 = r45
            r3 = r1
            r1 = r15
        L_0x01b6:
            r8.endDefaults()
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x01c8
            r5 = -1
            java.lang.String r14 = "vegabobo.dsusideloader.ui.components.FileSelectionBox (FileSelectionBox.kt:13)"
            r15 = -498109179(0xffffffffe24f7505, float:-9.5672704E20)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r3, r5, r14)
        L_0x01c8:
            r5 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r0, r5, r15, r14)
            r14 = r15
            r15 = r5
            r18 = 0
            vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$2 r5 = new vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$2
            r5.<init>(r12, r3)
            r37 = r0
            r0 = -1340319201(0xffffffffb01c5a1f, float:-5.688054E-10)
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r0, r14, r5)
            vegabobo.dsusideloader.ui.components.ComposableSingletons$FileSelectionBoxKt r0 = vegabobo.dsusideloader.ui.components.ComposableSingletons$FileSelectionBoxKt.INSTANCE
            kotlin.jvm.functions.Function2 r20 = r0.m2933getLambda1$app_miniDebug()
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            vegabobo.dsusideloader.ui.components.LiveLiterals$FileSelectionBoxKt r0 = vegabobo.dsusideloader.ui.components.LiveLiterals$FileSelectionBoxKt.INSTANCE
            boolean r28 = r0.m2997Boolean$arg15$callOutlinedTextField$funFileSelectionBox()
            r29 = 0
            r31 = 0
            r32 = 0
            int r0 = r3 >> 18
            r0 = r0 & 14
            r5 = 14155776(0xd80000, float:1.9836467E-38)
            r0 = r0 | r5
            int r5 = r3 >> 21
            r5 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r5
            int r5 = r3 << 9
            r14 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r14
            r34 = r0 | r5
            int r0 = r3 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r5 = r3 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r5
            r5 = r3 & r16
            r35 = r0 | r5
            r36 = 874272(0xd5720, float:1.225116E-39)
            r13 = r43
            r14 = r2
            r16 = r40
            r17 = r4
            r24 = r41
            r26 = r6
            r30 = r1
            r33 = r8
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0243
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0243:
            r13 = r37
            r16 = r1
            r17 = r2
            r18 = r3
            r14 = r4
            r15 = r6
        L_0x024d:
            androidx.compose.runtime.ScopeUpdateScope r6 = r8.endRestartGroup()
            if (r6 != 0) goto L_0x0258
            r19 = r8
            r37 = r13
            goto L_0x027a
        L_0x0258:
            vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$3 r5 = new vegabobo.dsusideloader.ui.components.FileSelectionBoxKt$FileSelectionBox$3
            r0 = r5
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r40
            r12 = r5
            r5 = r41
            r37 = r13
            r13 = r6
            r6 = r42
            r7 = r43
            r19 = r8
            r8 = r16
            r9 = r17
            r10 = r47
            r11 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.updateScope(r12)
        L_0x027a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.components.FileSelectionBoxKt.FileSelectionBox(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.text.KeyboardOptions, boolean, boolean, java.lang.String, java.lang.String, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
