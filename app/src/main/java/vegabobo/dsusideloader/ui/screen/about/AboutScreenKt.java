package vegabobo.dsusideloader.ui.screen.about;

import androidx.compose.runtime.State;

/* compiled from: AboutScreen.kt */
public abstract class AboutScreenKt {
    /* JADX WARNING: type inference failed for: r9v8, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AboutScreen(kotlin.jvm.functions.Function1 r28, vegabobo.dsusideloader.ui.screen.about.AboutViewModel r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r6 = r28
            r7 = r31
            r8 = r32
            java.lang.String r0 = "navigate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 1038108518(0x3de04766, float:0.10951118)
            r1 = r30
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AboutScreen)P(1)36@1573L15,38@1636L29,39@1703L7,40@1742L7,42@1755L754,65@2515L2878:AboutScreen.kt#bgkqvw"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r31
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
            if (r2 != r3) goto L_0x004d
            r3 = r1 & 91
            r4 = 18
            if (r3 != r4) goto L_0x004d
            boolean r3 = r5.getSkipping()
            if (r3 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r5.skipToGroupEnd()
            r0 = r29
            goto L_0x0199
        L_0x004d:
            r5.startDefaults()
            r3 = r7 & 1
            if (r3 == 0) goto L_0x0063
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            r5.skipToGroupEnd()
            if (r2 == 0) goto L_0x00c2
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00c2
        L_0x0063:
            if (r2 == 0) goto L_0x00c2
            r2 = 0
            r3 = 0
            r4 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r5.startReplaceableGroup(r4)
            java.lang.String r4 = "C(hiltViewModel)*42@1777L7,46@1895L47,47@1954L49:HiltViewModel.kt#9mcars"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r4)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r4 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE
            r9 = 8
            androidx.lifecycle.ViewModelStoreOwner r4 = r4.getCurrent(r5, r9)
            if (r4 == 0) goto L_0x00b4
            androidx.lifecycle.ViewModelProvider$Factory r16 = androidx.hilt.navigation.compose.HiltViewModelKt.createHiltViewModelFactory(r4, r5, r9)
            r9 = 520(0x208, float:7.29E-43)
            r17 = r9
            r18 = 0
            r9 = 564614654(0x21a755fe, float:1.1339122E-18)
            r5.startReplaceableGroup(r9)
            java.lang.String r9 = "C(viewModel)P(2,1)*41@1904L7,46@2077L60:ViewModel.kt#3tja67"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r9)
            r19 = 0
            java.lang.Class<vegabobo.dsusideloader.ui.screen.about.AboutViewModel> r9 = vegabobo.dsusideloader.ui.screen.about.AboutViewModel.class
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
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r2 = (vegabobo.dsusideloader.ui.screen.about.AboutViewModel) r2
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
            r15 = r2
            goto L_0x00c5
        L_0x00b4:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L_0x00c2:
            r15 = r29
            r4 = r1
        L_0x00c5:
            r5.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00d4
            r1 = -1
            java.lang.String r2 = "vegabobo.dsusideloader.ui.screen.about.AboutScreen (AboutScreen.kt:34)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r1, r2)
        L_0x00d4:
            kotlinx.coroutines.flow.StateFlow r9 = r15.getUiState()
            r10 = 0
            r11 = 0
            r13 = 8
            r14 = 3
            r12 = r5
            androidx.compose.runtime.State r14 = vegabobo.dsusideloader.util.CollectAsStateWithLifecycleKt.collectAsStateWithLifecycle(r9, r10, r11, r12, r13, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler()
            r1 = 0
            r2 = 0
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r3, r9)
            java.lang.Object r10 = r5.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r20 = r10
            androidx.compose.ui.platform.UriHandler r20 = (androidx.compose.ui.platform.UriHandler) r20
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            r1 = 0
            r2 = 0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r3, r9)
            java.lang.Object r3 = r5.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r13 = r3
            android.content.Context r13 = (android.content.Context) r13
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$1 r1 = new vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$1
            r2 = 0
            r1.<init>(r15, r14, r13, r2)
            r2 = 70
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2) r1, (androidx.compose.runtime.Composer) r5, (int) r2)
            androidx.compose.ui.Modifier$Companion r21 = androidx.compose.ui.Modifier.Companion
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutScreenKt r0 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutScreenKt.INSTANCE
            int r1 = r0.m3039Int$$$this$call$getdp$$arg0$callpadding$arg0$callApplicationScreen$funAboutScreen()
            r2 = 0
            float r3 = (float) r1
            float r22 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r3)
            r23 = 0
            int r0 = r0.m3042Int$$$this$call$getdp$$arg2$callpadding$arg0$callApplicationScreen$funAboutScreen()
            r1 = 0
            float r2 = (float) r0
            float r24 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r2)
            r25 = 0
            r26 = 10
            r27 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.m225paddingqDBjuR0$default(r21, r22, r23, r24, r25, r26, r27)
            r10 = 0
            vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$2 r0 = new vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$2
            r0.<init>(r6, r4)
            r1 = 432333065(0x19c4e109, float:2.0356816E-23)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r1, r3, r0)
            r17 = 0
            r18 = 0
            vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$3 r2 = new vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$3
            r0 = r2
            r1 = r14
            r12 = r2
            r2 = r15
            r11 = r3
            r3 = r20
            r21 = r4
            r4 = r28
            r19 = r15
            r15 = r5
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1126364708(0xffffffffbcdd09dc, float:-0.02698224)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r11, r12)
            r1 = 12607488(0xc06000, float:1.7666854E-38)
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            r11 = r3
            r3 = 0
            r12 = r3
            r3 = r13
            r13 = r16
            r4 = r14
            r14 = r17
            r5 = r15
            r22 = r19
            r15 = r18
            r16 = r0
            r17 = r5
            r18 = r1
            r19 = r2
            vegabobo.dsusideloader.ui.components.ApplicationScreenKt.ApplicationScreen(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0195
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0195:
            r1 = r21
            r0 = r22
        L_0x0199:
            androidx.compose.runtime.ScopeUpdateScope r2 = r5.endRestartGroup()
            if (r2 != 0) goto L_0x01a0
            goto L_0x01a8
        L_0x01a0:
            vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$4 r3 = new vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$4
            r3.<init>(r6, r0, r7, r8)
            r2.updateScope(r3)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.about.AboutScreenKt.AboutScreen(kotlin.jvm.functions.Function1, vegabobo.dsusideloader.ui.screen.about.AboutViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AboutScreenUiState AboutScreen$lambda$0(State $uiState$delegate) {
        return (AboutScreenUiState) $uiState$delegate.getValue();
    }
}
