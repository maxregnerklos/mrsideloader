package vegabobo.dsusideloader.ui.sdialogs;

/* compiled from: ConfirmInstallationSheet.kt */
public abstract class ConfirmInstallationSheetKt {
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConfirmInstallationSheet(java.lang.String r28, java.lang.String r29, long r30, kotlin.jvm.functions.Function0 r32, kotlin.jvm.functions.Function0 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r8 = r28
            r9 = r29
            r10 = r32
            r11 = r33
            r12 = r35
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "userdata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onClickConfirm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onClickCancel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 676272603(0x284f19db, float:1.1496415E-14)
            r1 = r34
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ConfirmInstallationSheet)P(1,4!1,3)28@1053L50,30@1165L62,54@2238L37,55@2298L36,56@2361L20,57@2407L19,27@1014L1419:ConfirmInstallationSheet.kt#c2k7s9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r1)
            r1 = r35
            r2 = r12 & 14
            if (r2 != 0) goto L_0x003c
            boolean r2 = r7.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x003a
            r2 = 4
            goto L_0x003b
        L_0x003a:
            r2 = 2
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r7.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0049
            r2 = 32
            goto L_0x004b
        L_0x0049:
            r2 = 16
        L_0x004b:
            r1 = r1 | r2
        L_0x004c:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x005f
            r14 = r30
            boolean r2 = r7.changed((long) r14)
            if (r2 == 0) goto L_0x005b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r2
            goto L_0x0061
        L_0x005f:
            r14 = r30
        L_0x0061:
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0071
            boolean r2 = r7.changedInstance(r10)
            if (r2 == 0) goto L_0x006e
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r1 = r1 | r2
        L_0x0071:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0083
            boolean r2 = r7.changedInstance(r11)
            if (r2 == 0) goto L_0x0080
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0082
        L_0x0080:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0082:
            r1 = r1 | r2
        L_0x0083:
            r6 = r1
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r6
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r2) goto L_0x0098
            boolean r1 = r7.getSkipping()
            if (r1 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r7.skipToGroupEnd()
            goto L_0x018e
        L_0x0098:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a4
            r1 = -1
            java.lang.String r2 = "vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheet (ConfirmInstallationSheet.kt:20)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x00a4:
            int r0 = vegabobo.dsusideloader.C0001R$string.proceed_installation
            r1 = 0
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r7, r1)
            androidx.compose.material.icons.Icons$Outlined r0 = androidx.compose.material.icons.Icons$Outlined.INSTANCE
            androidx.compose.ui.graphics.vector.ImageVector r17 = androidx.compose.material.icons.outlined.InstallMobileKt.getInstallMobile(r0)
            int r0 = vegabobo.dsusideloader.C0001R$string.proceed_installation_description
            java.lang.String r18 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r7, r1)
            int r0 = vegabobo.dsusideloader.C0001R$string.proceed
            java.lang.String r19 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r7, r1)
            int r0 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r20 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r7, r1)
            r21 = 0
            int r0 = r6 >> 9
            r0 = r0 & 14
            r1 = 0
            r2 = 1157296644(0x44faf204, float:2007.563)
            r7.startReplaceableGroup(r2)
            java.lang.String r3 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            boolean r4 = r7.changed((java.lang.Object) r10)
            r5 = r7
            r22 = 0
            java.lang.Object r13 = r5.rememberedValue()
            r23 = 0
            if (r4 != 0) goto L_0x00f6
            androidx.compose.runtime.Composer$Companion r24 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r24.getEmpty()
            if (r13 != r2) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            r24 = r0
            r0 = r13
            goto L_0x0103
        L_0x00f6:
            r2 = 0
            r24 = r0
            vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$1$1 r0 = new vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$1$1
            r0.<init>(r10)
            r5.updateRememberedValue(r0)
        L_0x0103:
            r7.endReplaceableGroup()
            r22 = r0
            kotlin.jvm.functions.Function0 r22 = (kotlin.jvm.functions.Function0) r22
            int r0 = r6 >> 12
            r0 = r0 & 14
            r1 = 0
            r2 = 1157296644(0x44faf204, float:2007.563)
            r7.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            boolean r2 = r7.changed((java.lang.Object) r11)
            r3 = r7
            r4 = 0
            java.lang.Object r5 = r3.rememberedValue()
            r13 = 0
            if (r2 != 0) goto L_0x0135
            androidx.compose.runtime.Composer$Companion r23 = androidx.compose.runtime.Composer.Companion
            r24 = r0
            java.lang.Object r0 = r23.getEmpty()
            if (r5 != r0) goto L_0x0133
            goto L_0x0137
        L_0x0133:
            r0 = r5
            goto L_0x0144
        L_0x0135:
            r24 = r0
        L_0x0137:
            r0 = 0
            r23 = r0
            vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$2$1 r0 = new vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$2$1
            r0.<init>(r11)
            r3.updateRememberedValue(r0)
        L_0x0144:
            r7.endReplaceableGroup()
            r23 = r0
            kotlin.jvm.functions.Function0 r23 = (kotlin.jvm.functions.Function0) r23
            r24 = 0
            vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$3 r13 = new vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$3
            r0 = r13
            r1 = r28
            r2 = r6
            r3 = r29
            r4 = r30
            r0.<init>(r1, r2, r3, r4)
            r0 = -1610812904(0xffffffff9ffcf218, float:-1.0712666E-19)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r7, r0, r1, r13)
            r25 = 0
            r26 = 6
            r27 = 577(0x241, float:8.09E-43)
            r1 = 0
            r13 = r1
            r14 = r17
            r15 = r16
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r0
            r24 = r7
            vegabobo.dsusideloader.ui.components.DialogLikeBottomSheetKt.DialogLikeBottomSheet(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x018e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x018e:
            androidx.compose.runtime.ScopeUpdateScope r13 = r7.endRestartGroup()
            if (r13 != 0) goto L_0x0198
            r15 = r6
            r16 = r7
            goto L_0x01b0
        L_0x0198:
            vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$4 r14 = new vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt$ConfirmInstallationSheet$4
            r0 = r14
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r32
            r15 = r6
            r6 = r33
            r16 = r7
            r7 = r35
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r13.updateScope(r14)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt.ConfirmInstallationSheet(java.lang.String, java.lang.String, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
