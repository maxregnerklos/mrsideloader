package vegabobo.dsusideloader.ui.screen.settings;

import androidx.compose.runtime.State;

/* compiled from: SettingsScreen.kt */
public abstract class SettingsScreenKt {

    /* compiled from: SettingsScreen.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogSheetState.values().length];
            try {
                iArr[DialogSheetState.BUILT_IN_INSTALLER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DialogSheetState.DISABLE_STORAGE_CHECK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Settings(kotlin.jvm.functions.Function1 r21, vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            java.lang.String r3 = "navigate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = -1662233364(0xffffffff9cec54ec, float:-1.5639122E-21)
            r4 = r23
            androidx.compose.runtime.Composer r15 = r4.startRestartGroup(r3)
            java.lang.String r4 = "C(Settings)26@1185L15,28@1251L29,30@1286L68,34@1360L3631:SettingsScreen.kt#u9sfrg"
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
            if (r5 != r6) goto L_0x004f
            r4 = r11 & 91
            r6 = 18
            if (r4 != r6) goto L_0x004f
            boolean r4 = r15.getSkipping()
            if (r4 != 0) goto L_0x0047
            goto L_0x004f
        L_0x0047:
            r15.skipToGroupEnd()
            r0 = r22
            r5 = r15
            goto L_0x0209
        L_0x004f:
            r15.startDefaults()
            r4 = r1 & 1
            if (r4 == 0) goto L_0x0068
            boolean r4 = r15.getDefaultsInvalid()
            if (r4 == 0) goto L_0x005d
            goto L_0x0068
        L_0x005d:
            r15.skipToGroupEnd()
            if (r5 == 0) goto L_0x00c7
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            r14 = r22
            r13 = r11
            goto L_0x00ca
        L_0x0068:
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
            java.lang.Class<vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel> r4 = vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel.class
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
            vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel r4 = (vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel) r4
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            r14 = r4
            r13 = r11
            goto L_0x00ca
        L_0x00b9:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00c7:
            r14 = r22
            r13 = r11
        L_0x00ca:
            r15.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00d9
            r4 = -1
            java.lang.String r5 = "vegabobo.dsusideloader.ui.screen.settings.Settings (SettingsScreen.kt:24)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r13, r4, r5)
        L_0x00d9:
            kotlinx.coroutines.flow.StateFlow r4 = r14.getUiState()
            r5 = 0
            r6 = 0
            r8 = 8
            r9 = 3
            r7 = r15
            androidx.compose.runtime.State r3 = vegabobo.dsusideloader.util.CollectAsStateWithLifecycleKt.collectAsStateWithLifecycle(r4, r5, r6, r7, r8, r9)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$1 r5 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$1
            r5.<init>(r14, r6)
            r6 = 70
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r4, (kotlin.jvm.functions.Function2) r5, (androidx.compose.runtime.Composer) r15, (int) r6)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$2 r8 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$2
            r8.<init>(r0, r13)
            r9 = 1171384399(0x45d1e84f, float:6717.0386)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r9, r10, r8)
            r9 = 0
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$3 r12 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$3
            r12.<init>(r14, r0, r13, r3)
            r11 = -907090206(0xffffffffc9eee6e2, float:-1957084.2)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r11, r10, r12)
            r16 = 12607488(0xc06000, float:1.7666854E-38)
            r17 = 111(0x6f, float:1.56E-43)
            r10 = 0
            r12 = r15
            r19 = r13
            r13 = r16
            r0 = r14
            r14 = r17
            vegabobo.dsusideloader.ui.components.ApplicationScreenKt.ApplicationScreen(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            vegabobo.dsusideloader.ui.screen.settings.SettingsUiState r4 = Settings$lambda$0(r3)
            vegabobo.dsusideloader.ui.screen.settings.DialogSheetState r4 = r4.getDialogSheetDisplay()
            int[] r5 = vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 0
            switch(r4) {
                case 1: goto L_0x01a2;
                case 2: goto L_0x0145;
                default: goto L_0x0136;
            }
        L_0x0136:
            r22 = r15
            r4 = 184255668(0xafb84b4, float:2.4220338E-32)
            r5 = r22
            r5.startReplaceableGroup(r4)
            r5.endReplaceableGroup()
            goto L_0x01fe
        L_0x0145:
            r4 = 184254922(0xafb81ca, float:2.4219242E-32)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "132@5910L57,134@6044L63,135@6139L45,136@6215L36,131@5863L728"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            int r4 = vegabobo.dsusideloader.C0001R$string.warning_storage_check_title
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            androidx.compose.material.icons.Icons$Outlined r4 = androidx.compose.material.icons.Icons$Outlined.INSTANCE
            androidx.compose.ui.graphics.vector.ImageVector r7 = androidx.compose.material.icons.outlined.WarningAmberKt.getWarningAmber(r4)
            int r4 = vegabobo.dsusideloader.C0001R$string.warning_storage_check_description
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            int r4 = vegabobo.dsusideloader.C0001R$string.continue_anyway
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            int r4 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            r4 = 0
            r11 = 0
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$6 r12 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$6
            r12.<init>(r0)
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$7 r13 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$7
            r13.<init>(r0)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1601(0x641, float:2.243E-42)
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r22 = r15
            r16 = r17
            r17 = r18
            r18 = r20
            vegabobo.dsusideloader.ui.components.DialogLikeBottomSheetKt.DialogLikeBottomSheet(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r22.endReplaceableGroup()
            r5 = r22
            goto L_0x01fe
        L_0x01a2:
            r22 = r15
            r4 = 184254151(0xafb7ec7, float:2.4218109E-32)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "118@5139L50,120@5265L62,121@5359L33,122@5423L36,117@5092L707"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            int r4 = vegabobo.dsusideloader.C0001R$string.experimental_feature
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            androidx.compose.material.icons.Icons$Outlined r4 = androidx.compose.material.icons.Icons$Outlined.INSTANCE
            androidx.compose.ui.graphics.vector.ImageVector r7 = androidx.compose.material.icons.outlined.NewReleasesKt.getNewReleases(r4)
            int r4 = vegabobo.dsusideloader.C0001R$string.experimental_feature_description
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            int r4 = vegabobo.dsusideloader.C0001R$string.yes
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            int r4 = vegabobo.dsusideloader.C0001R$string.cancel
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r4, r15, r5)
            r4 = 0
            r11 = 0
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$4 r12 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$4
            r12.<init>(r0)
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$5 r13 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$5
            r13.<init>(r0)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1601(0x641, float:2.243E-42)
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            vegabobo.dsusideloader.ui.components.DialogLikeBottomSheetKt.DialogLikeBottomSheet(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r22.endReplaceableGroup()
            r5 = r22
        L_0x01fe:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0207
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0207:
            r11 = r19
        L_0x0209:
            androidx.compose.runtime.ScopeUpdateScope r3 = r5.endRestartGroup()
            if (r3 != 0) goto L_0x0212
            r6 = r21
            goto L_0x021c
        L_0x0212:
            vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$8 r4 = new vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt$Settings$8
            r6 = r21
            r4.<init>(r6, r0, r1, r2)
            r3.updateScope(r4)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt.Settings(kotlin.jvm.functions.Function1, vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SettingsUiState Settings$lambda$0(State $uiState$delegate) {
        return (SettingsUiState) $uiState$delegate.getValue();
    }
}
