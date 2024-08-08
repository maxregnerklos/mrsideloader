package vegabobo.dsusideloader.ui.screen.adb;

/* compiled from: AdbScreen.kt */
public abstract class AdbScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AdbScreen(kotlin.jvm.functions.Function1 r21, vegabobo.dsusideloader.ui.screen.adb.AdbViewModel r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            java.lang.String r3 = "navigate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 1968704066(0x75580a42, float:2.7386332E32)
            r4 = r23
            androidx.compose.runtime.Composer r15 = r4.startRestartGroup(r3)
            java.lang.String r4 = "C(AdbScreen)P(1)21@849L15,27@1060L834:AdbScreen.kt#bu660e"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            r4 = r24
            r5 = r2 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0023
            r4 = r4 | 6
            goto L_0x0031
        L_0x0023:
            r5 = r1 & 14
            if (r5 != 0) goto L_0x0031
            boolean r5 = r15.changedInstance(r0)
            if (r5 == 0) goto L_0x002f
            r5 = 4
            goto L_0x0030
        L_0x002f:
            r5 = r6
        L_0x0030:
            r4 = r4 | r5
        L_0x0031:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0037
            r4 = r4 | 16
        L_0x0037:
            r11 = r4
            if (r5 != r6) goto L_0x004e
            r4 = r11 & 91
            r6 = 18
            if (r4 != r6) goto L_0x004e
            boolean r4 = r15.getSkipping()
            if (r4 != 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            r15.skipToGroupEnd()
            r3 = r22
            goto L_0x0180
        L_0x004e:
            r15.startDefaults()
            r4 = r1 & 1
            if (r4 == 0) goto L_0x0067
            boolean r4 = r15.getDefaultsInvalid()
            if (r4 == 0) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            r15.skipToGroupEnd()
            if (r5 == 0) goto L_0x00c7
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            r16 = r22
            r14 = r11
            goto L_0x00ca
        L_0x0067:
            if (r5 == 0) goto L_0x00c7
            r12 = 0
            r13 = 0
            r4 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "C(hiltViewModel)*42@1777L7,46@1895L47,47@1954L49:HiltViewModel.kt#9mcars"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r4 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE
            r5 = 8
            androidx.lifecycle.ViewModelStoreOwner r4 = r4.getCurrent(r15, r5)
            if (r4 == 0) goto L_0x00b9
            r14 = r4
            androidx.lifecycle.ViewModelProvider$Factory r16 = androidx.hilt.navigation.compose.HiltViewModelKt.createHiltViewModelFactory(r14, r15, r5)
            r4 = 520(0x208, float:7.29E-43)
            r17 = r4
            r18 = 0
            r4 = 564614654(0x21a755fe, float:1.1339122E-18)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "C(viewModel)P(2,1)*41@1904L7,46@2077L60:ViewModel.kt#3tja67"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            r19 = 0
            java.lang.Class<vegabobo.dsusideloader.ui.screen.adb.AdbViewModel> r4 = vegabobo.dsusideloader.ui.screen.adb.AdbViewModel.class
            int r5 = r17 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r9 = r5 | 4168(0x1048, float:5.84E-42)
            r10 = 0
            r5 = r14
            r6 = r19
            r7 = r16
            r8 = r15
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(r4, r5, r6, r7, r8, r9, r10)
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            vegabobo.dsusideloader.ui.screen.adb.AdbViewModel r4 = (vegabobo.dsusideloader.ui.screen.adb.AdbViewModel) r4
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            r16 = r4
            r14 = r11
            goto L_0x00ca
        L_0x00b9:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00c7:
            r16 = r22
            r14 = r11
        L_0x00ca:
            r15.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00d9
            r4 = -1
            java.lang.String r5 = "vegabobo.dsusideloader.ui.screen.adb.AdbScreen (AdbScreen.kt:19)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r14, r4, r5)
        L_0x00d9:
            java.lang.String r3 = r16.obtainScriptPath()
            vegabobo.dsusideloader.ui.screen.adb.LiveLiterals$AdbScreenKt r4 = vegabobo.dsusideloader.ui.screen.adb.LiveLiterals$AdbScreenKt.INSTANCE
            java.lang.String r5 = r4.m3139String$0$str$valstartInstallationCommand$funAdbScreen()
            java.lang.String r6 = r4.m3141String$2$str$valstartInstallationCommand$funAdbScreen()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r13 = r7.toString()
            java.lang.String r5 = r4.m3140String$0$str$valstartInstallationCommandAdb$funAdbScreen()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r13)
            java.lang.String r12 = r6.toString()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            int r6 = r4.m3136Int$$$this$call$getdp$$arg0$callpadding$arg0$callApplicationScreen$funAdbScreen()
            r7 = 0
            float r8 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r8)
            r7 = 0
            int r8 = r4.m3138Int$$$this$call$getdp$$arg2$callpadding$arg0$callApplicationScreen$funAdbScreen()
            r9 = 0
            float r10 = (float) r8
            float r8 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r10)
            r9 = 0
            r10 = 10
            r11 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m225paddingqDBjuR0$default(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            int r4 = r4.m3137Int$$$this$call$getdp$$arg0$callspacedBy$arg1$callApplicationScreen$funAdbScreen()
            r7 = 0
            float r8 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r8)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r6 = r6.m196spacedBy0680j_4(r4)
            r7 = 0
            r8 = 0
            vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$1 r4 = new vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$1
            r4.<init>(r0, r14)
            r9 = 542504677(0x2055f6e5, float:1.8123492E-19)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r9, r10, r4)
            r17 = 0
            vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$2 r4 = new vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$2
            r4.<init>(r12, r13)
            r11 = -1813929288(0xffffffff93e1a2b8, float:-5.695844E-27)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r11, r10, r4)
            r18 = 12607488(0xc06000, float:1.7666854E-38)
            r19 = 108(0x6c, float:1.51E-43)
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = 0
            r10 = r17
            r17 = r12
            r12 = r15
            r20 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            vegabobo.dsusideloader.ui.components.ApplicationScreenKt.ApplicationScreen(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x017c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017c:
            r3 = r16
            r11 = r18
        L_0x0180:
            androidx.compose.runtime.ScopeUpdateScope r4 = r15.endRestartGroup()
            if (r4 != 0) goto L_0x0187
            goto L_0x018f
        L_0x0187:
            vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$3 r5 = new vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt$AdbScreen$3
            r5.<init>(r0, r3, r1, r2)
            r4.updateScope(r5)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt.AdbScreen(kotlin.jvm.functions.Function1, vegabobo.dsusideloader.ui.screen.adb.AdbViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
