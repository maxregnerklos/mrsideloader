package vegabobo.dsusideloader.ui.screen.home;

import androidx.compose.runtime.State;

/* compiled from: HomeScreen.kt */
public abstract class HomeScreenKt {

    /* compiled from: HomeScreen.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetDisplayState.values().length];
            try {
                iArr[SheetDisplayState.CONFIRM_INSTALLATION.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SheetDisplayState.CANCEL_INSTALLATION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SheetDisplayState.IMAGESIZE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SheetDisplayState.DISCARD_DSU.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[SheetDisplayState.VIEW_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[SheetDisplayState.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARNING: type inference failed for: r9v9, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0281  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Home(kotlin.jvm.functions.Function1 r29, vegabobo.dsusideloader.ui.screen.home.HomeViewModel r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r6 = r29
            r7 = r32
            r8 = r33
            java.lang.String r0 = "navigate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 2043942260(0x79d41574, float:1.3765026E35)
            r1 = r31
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Home)P(1)50@2412L15,52@2474L29,53@2541L7,59@2622L185,66@2813L4227:HomeScreen.kt#btvlv4"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r32
            r2 = r8 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0023
            r1 = r1 | 6
            goto L_0x0031
        L_0x0023:
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0031
            boolean r2 = r5.changedInstance(r6)
            if (r2 == 0) goto L_0x002f
            r2 = 4
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r8 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 16
        L_0x0037:
            if (r2 != r3) goto L_0x004e
            r3 = r1 & 91
            r4 = 18
            if (r3 != r4) goto L_0x004e
            boolean r3 = r5.getSkipping()
            if (r3 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            r5.skipToGroupEnd()
            r4 = r30
            r3 = r5
            goto L_0x0286
        L_0x004e:
            r5.startDefaults()
            r3 = r7 & 1
            if (r3 == 0) goto L_0x0064
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            r5.skipToGroupEnd()
            if (r2 == 0) goto L_0x00c3
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00c3
        L_0x0064:
            if (r2 == 0) goto L_0x00c3
            r2 = 0
            r3 = 0
            r4 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.startReplaceableGroup(r4)
            java.lang.String r4 = "C(hiltViewModel)*42@1777L7,46@1895L47,47@1954L49:HiltViewModel.kt#9mcars"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r4)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r4 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE
            r9 = 8
            androidx.lifecycle.ViewModelStoreOwner r4 = r4.getCurrent(r5, r9)
            if (r4 == 0) goto L_0x00b5
            androidx.lifecycle.ViewModelProvider$Factory r16 = androidx.hilt.navigation.compose.HiltViewModelKt.createHiltViewModelFactory(r4, r5, r9)
            r9 = 520(0x208, float:7.29E-43)
            r17 = r9
            r18 = 0
            r9 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.startReplaceableGroup(r9)
            java.lang.String r9 = "C(viewModel)P(2,1)*41@1904L7,46@2077L60:ViewModel.kt#3tja67"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r9)
            r19 = 0
            java.lang.Class<vegabobo.dsusideloader.ui.screen.home.HomeViewModel> r9 = vegabobo.dsusideloader.ui.screen.home.HomeViewModel.class
            int r10 = r17 << 3
            r10 = r10 & 896(0x380, float:1.256E-42)
            r14 = r10 | 4168(0x1048, float:5.84E-42)
            r15 = 0
            r10 = r4
            r11 = r19
            r12 = r16
            r13 = r5
            androidx.lifecycle.ViewModel r9 = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(r9, r10, r11, r12, r13, r14, r15)
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r2 = r9
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel r2 = (vegabobo.dsusideloader.ui.screen.home.HomeViewModel) r2
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
            r15 = r2
            goto L_0x00c6
        L_0x00b5:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L_0x00c3:
            r15 = r30
            r4 = r1
        L_0x00c6:
            r5.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00d5
            r1 = -1
            java.lang.String r2 = "vegabobo.dsusideloader.ui.screen.home.Home (HomeScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r1, r2)
        L_0x00d5:
            kotlinx.coroutines.flow.StateFlow r9 = r15.getUiState()
            r10 = 0
            r11 = 0
            r13 = 8
            r14 = 3
            r12 = r5
            androidx.compose.runtime.State r20 = vegabobo.dsusideloader.util.CollectAsStateWithLifecycleKt.collectAsStateWithLifecycle(r9, r10, r11, r12, r13, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler()
            r1 = 0
            r2 = 0
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r3, r9)
            java.lang.Object r3 = r5.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r21 = r3
            androidx.compose.ui.platform.UriHandler r21 = (androidx.compose.ui.platform.UriHandler) r21
            r0 = 1695261405(0x650ba2dd, float:4.1213327E22)
            r5.startReplaceableGroup(r0)
            java.lang.String r0 = "56@2596L14"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r0)
            vegabobo.dsusideloader.ui.screen.home.HomeUiState r0 = Home$lambda$0(r20)
            boolean r0 = r0.getShouldKeepScreenOn()
            r14 = 0
            if (r0 == 0) goto L_0x0115
            vegabobo.dsusideloader.ui.util.KeepScreenOnKt.KeepScreenOn(r5, r14)
        L_0x0115:
            r5.endReplaceableGroup()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$1 r1 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$1
            r2 = 0
            r1.<init>(r15, r2)
            r2 = 70
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2) r1, (androidx.compose.runtime.Composer) r5, (int) r2)
            androidx.compose.ui.Modifier$Companion r22 = androidx.compose.ui.Modifier.Companion
            vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeScreenKt r0 = vegabobo.dsusideloader.ui.screen.home.LiveLiterals$HomeScreenKt.INSTANCE
            int r1 = r0.m3143Int$$$this$call$getdp$$arg0$callpadding$arg0$callApplicationScreen$funHome()
            r2 = 0
            float r3 = (float) r1
            float r23 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r3)
            r24 = 0
            int r1 = r0.m3145Int$$$this$call$getdp$$arg2$callpadding$arg0$callApplicationScreen$funHome()
            r2 = 0
            float r3 = (float) r1
            float r25 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r3)
            r26 = 0
            r27 = 10
            r28 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.m225paddingqDBjuR0$default(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            int r0 = r0.m3144Int$$$this$call$getdp$$arg0$callspacedBy$arg1$callApplicationScreen$funHome()
            r2 = 0
            float r3 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r3)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r10 = r1.m196spacedBy0680j_4(r0)
            r11 = 0
            r12 = 0
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$2 r0 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$2
            r0.<init>(r6, r4)
            r1 = 2073743063(0x7b9aced7, float:1.6076179E36)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r1, r13, r0)
            r17 = 0
            r18 = 0
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$3 r3 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$3
            r0 = r3
            r1 = r15
            r2 = r29
            r14 = r3
            r3 = r4
            r22 = r4
            r4 = r20
            r31 = r15
            r15 = r5
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1951050902(0xffffffff8bb5536a, float:-6.984417E-32)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r13, r14)
            r1 = 12607488(0xc06000, float:1.7666854E-38)
            r19 = 108(0x6c, float:1.51E-43)
            r13 = r16
            r2 = 0
            r14 = r17
            r4 = r31
            r3 = r15
            r15 = r18
            r16 = r0
            r17 = r3
            r18 = r1
            vegabobo.dsusideloader.ui.components.ApplicationScreenKt.ApplicationScreen(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            vegabobo.dsusideloader.ui.screen.home.HomeUiState r0 = Home$lambda$0(r20)
            vegabobo.dsusideloader.ui.screen.home.SheetDisplayState r0 = r0.getSheetDisplay()
            int[] r1 = vegabobo.dsusideloader.ui.screen.home.HomeScreenKt.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0241;
                case 2: goto L_0x0225;
                case 3: goto L_0x0209;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01c8;
                case 6: goto L_0x01bd;
                default: goto L_0x01b2;
            }
        L_0x01b2:
            r0 = 1695267424(0x650bba60, float:4.1240435E22)
            r3.startReplaceableGroup(r0)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x01bd:
            r0 = 1695267416(0x650bba58, float:4.12404E22)
            r3.startReplaceableGroup(r0)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x01c8:
            r0 = 1695267169(0x650bb961, float:4.1239286E22)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "176@8318L211"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            vegabobo.dsusideloader.ui.screen.home.HomeUiState r0 = Home$lambda$0(r20)
            java.lang.String r0 = r0.getInstallationLogs()
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$12 r1 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$12
            r1.<init>(r4)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$13 r5 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$13
            r5.<init>(r4)
            vegabobo.dsusideloader.ui.sdialogs.ViewLogsSheetKt.ViewLogsBottomSheet(r0, r1, r5, r3, r2)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x01ed:
            r0 = 1695266948(0x650bb884, float:4.123829E22)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "170@8097L168"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$10 r0 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$10
            r0.<init>(r4)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$11 r1 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$11
            r1.<init>(r4)
            vegabobo.dsusideloader.ui.sdialogs.DiscardDSUSheetKt.DiscardDSUSheet(r0, r1, r3, r2)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x0209:
            r0 = 1695266716(0x650bb79c, float:4.1237246E22)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "164@7865L177"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$8 r0 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$8
            r0.<init>(r4)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$9 r1 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$9
            r1.<init>(r4)
            vegabobo.dsusideloader.ui.sdialogs.ImageSizeWarningSheetKt.ImageSizeWarningSheet(r0, r1, r3, r2)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x0225:
            r0 = 1695266477(0x650bb6ad, float:4.123617E22)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "158@7626L178"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$6 r0 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$6
            r0.<init>(r4)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$7 r1 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$7
            r1.<init>(r4)
            vegabobo.dsusideloader.ui.sdialogs.CancelSheetKt.CancelSheet(r0, r1, r3, r2)
            r3.endReplaceableGroup()
            goto L_0x027b
        L_0x0241:
            r0 = 1695265989(0x650bb4c5, float:4.123397E22)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "149@7138L425"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            java.lang.String r9 = r4.obtainSelectedFilename()
            vegabobo.dsusideloader.model.Session r0 = r4.getSession()
            vegabobo.dsusideloader.model.UserSelection r0 = r0.getUserSelection()
            java.lang.String r10 = r0.getUserDataSizeAsGB()
            vegabobo.dsusideloader.model.Session r0 = r4.getSession()
            vegabobo.dsusideloader.model.UserSelection r0 = r0.getUserSelection()
            long r11 = r0.getUserSelectedImageSize()
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$4 r13 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$4
            r13.<init>(r4)
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$5 r14 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$5
            r14.<init>(r4)
            r16 = 0
            r15 = r3
            vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheetKt.ConfirmInstallationSheet(r9, r10, r11, r13, r14, r15, r16)
            r3.endReplaceableGroup()
        L_0x027b:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0284
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0284:
            r1 = r22
        L_0x0286:
            androidx.compose.runtime.ScopeUpdateScope r0 = r3.endRestartGroup()
            if (r0 != 0) goto L_0x028d
            goto L_0x0295
        L_0x028d:
            vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$14 r2 = new vegabobo.dsusideloader.ui.screen.home.HomeScreenKt$Home$14
            r2.<init>(r6, r4, r7, r8)
            r0.updateScope(r2)
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.home.HomeScreenKt.Home(kotlin.jvm.functions.Function1, vegabobo.dsusideloader.ui.screen.home.HomeViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final HomeUiState Home$lambda$0(State $uiState$delegate) {
        return (HomeUiState) $uiState$delegate.getValue();
    }
}
