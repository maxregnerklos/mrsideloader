package vegabobo.dsusideloader.ui.screen.home;

import android.net.Uri;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.cards.ImageSizeCardKt;
import vegabobo.dsusideloader.ui.cards.UserdataCardKt;
import vegabobo.dsusideloader.ui.cards.WhatIsDsuCardKt;
import vegabobo.dsusideloader.ui.cards.installation.InstallationCardKt;
import vegabobo.dsusideloader.ui.cards.warnings.LoadingCardKt;
import vegabobo.dsusideloader.ui.cards.warnings.RequiresLogPermissionCardKt;
import vegabobo.dsusideloader.ui.cards.warnings.SetupStorageKt;
import vegabobo.dsusideloader.ui.cards.warnings.StorageWarningCardKt;
import vegabobo.dsusideloader.ui.cards.warnings.UnlockedBootloaderCardKt;
import vegabobo.dsusideloader.ui.cards.warnings.UnsupportedCardKt;

/* compiled from: HomeScreen.kt */
public final class HomeScreenKt$Home$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ HomeViewModel $homeViewModel;
    public final /* synthetic */ Function1 $navigate;
    public final /* synthetic */ State $uiState$delegate;
    public final /* synthetic */ UriHandler $uriHandler;

    /* compiled from: HomeScreen.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdditionalCardState.values().length];
            try {
                iArr[AdditionalCardState.NO_DYNAMIC_PARTITIONS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AdditionalCardState.SETUP_STORAGE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AdditionalCardState.UNAVAIABLE_STORAGE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[AdditionalCardState.MISSING_READ_LOGS_PERMISSION.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[AdditionalCardState.GRANTING_READ_LOGS_PERMISSION.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[AdditionalCardState.BOOTLOADER_UNLOCKED_WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[AdditionalCardState.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$Home$3(HomeViewModel homeViewModel, Function1 function1, int i, State state, UriHandler uriHandler) {
        super(2);
        this.$homeViewModel = homeViewModel;
        this.$navigate = function1;
        this.$$dirty = i;
        this.$uiState$delegate = state;
        this.$uriHandler = uriHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Object value$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C78@3273L1533,124@6010L42,111@4924L1241,127@6182L296,133@6495L296,139@6808L201:HomeScreen.kt#btvlv4");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951050902, i, -1, "vegabobo.dsusideloader.ui.screen.home.Home.<anonymous> (HomeScreen.kt:77)");
            }
            Modifier modifier$iv = AnimationModifierKt.animateContentSize$default(Modifier.Companion, (FiniteAnimationSpec) null, (Function2) null, 3, (Object) null);
            HomeViewModel homeViewModel = this.$homeViewModel;
            State state = this.$uiState$delegate;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.rememberBoxMeasurePolicy(contentAlignment$iv, false, composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            Alignment alignment = contentAlignment$iv;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density density$iv$iv = (Density) consume;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 factory$iv$iv$iv = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier$iv);
            Modifier modifier = modifier$iv;
            int $changed$iv$iv$iv = (($changed$iv$iv << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv = materializerOf;
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                composer.createNode(factory$iv$iv$iv);
            } else {
                $composer.useNode();
            }
            $composer.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            int i2 = $changed$iv$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion.getSetViewConfiguration());
            $composer.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            int i3 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer;
            int i4 = $changed$iv$iv$iv;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = ((0 >> 6) & 112) | 6;
            Composer $composer2 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 351717294, "C:HomeScreen.kt#btvlv4");
            switch (WhenMappings.$EnumSwitchMapping$0[HomeScreenKt.Home$lambda$0(state).getAdditionalCard().ordinal()]) {
                case 1:
                    $composer2.startReplaceableGroup(351717415);
                    ComposerKt.sourceInformation($composer2, "81@3458L208");
                    UnsupportedCardKt.UnsupportedCard(HomeScreenKt$Home$3$1$1.INSTANCE, new HomeScreenKt$Home$3$1$2(homeViewModel), $composer2, 6, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351717706);
                    ComposerKt.sourceInformation($composer2, "87@3749L52");
                    SetupStorageKt.SetupStorage(new HomeScreenKt$Home$3$1$3(homeViewModel), $composer2, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351717846);
                    ComposerKt.sourceInformation($composer2, "90@3889L230");
                    StorageWarningCardKt.StorageWarningCard(String.valueOf(homeViewModel.getAllocPercentageInt()), new HomeScreenKt$Home$3$1$4(homeViewModel), $composer2, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351718174);
                    ComposerKt.sourceInformation($composer2, "96@4217L210");
                    RequiresLogPermissionCardKt.RequiresLogPermissionCard(new HomeScreenKt$Home$3$1$5(homeViewModel), new HomeScreenKt$Home$3$1$6(homeViewModel), $composer2, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.STRING_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351718483);
                    ComposerKt.sourceInformation($composer2, "102@4526L24");
                    LoadingCardKt.GrantingPermissionCard($composer2, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351718604);
                    ComposerKt.sourceInformation($composer2, "105@4647L75");
                    UnlockedBootloaderCardKt.UnlockedBootloaderCard(new HomeScreenKt$Home$3$1$7(homeViewModel), $composer2, 0, 0);
                    $composer2.endReplaceableGroup();
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER:
                    $composer2.startReplaceableGroup(351718729);
                    $composer2.endReplaceableGroup();
                    break;
                default:
                    $composer2.startReplaceableGroup(351718749);
                    $composer2.endReplaceableGroup();
                    break;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer.endReplaceableGroup();
            $composer.endNode();
            $composer.endReplaceableGroup();
            $composer.endReplaceableGroup();
            if (HomeScreenKt.Home$lambda$0(this.$uiState$delegate).getPassedInitialChecks() && HomeScreenKt.Home$lambda$0(this.$uiState$delegate).getAdditionalCard() == AdditionalCardState.NONE) {
                InstallationCardState installationCard = HomeScreenKt.Home$lambda$0(this.$uiState$delegate).getInstallationCard();
                String valueOf = String.valueOf(this.$homeViewModel.getAllocPercentageInt());
                final HomeViewModel homeViewModel2 = this.$homeViewModel;
                AnonymousClass2 r4 = new Function0() {
                    public final void invoke() {
                        homeViewModel2.resetInstallationCard();
                    }
                };
                final HomeViewModel homeViewModel3 = this.$homeViewModel;
                AnonymousClass3 r5 = new Function0() {
                    public final void invoke() {
                        homeViewModel3.onClickInstall();
                    }
                };
                final HomeViewModel homeViewModel4 = this.$homeViewModel;
                AnonymousClass4 r6 = new Function0() {
                    public final void invoke() {
                        homeViewModel4.onClickRetryInstallation();
                    }
                };
                final HomeViewModel homeViewModel5 = this.$homeViewModel;
                AnonymousClass5 r7 = new Function0() {
                    public final void invoke() {
                        homeViewModel5.onClickUnmountSdCardAndRetry();
                    }
                };
                final HomeViewModel homeViewModel6 = this.$homeViewModel;
                AnonymousClass6 r8 = new Function0() {
                    public final void invoke() {
                        homeViewModel6.onClickSetSeLinuxPermissive();
                    }
                };
                final HomeViewModel homeViewModel7 = this.$homeViewModel;
                AnonymousClass7 r9 = new Function0() {
                    public final void invoke() {
                        homeViewModel7.onClickCancel();
                    }
                };
                final HomeViewModel homeViewModel8 = this.$homeViewModel;
                AnonymousClass8 r10 = new Function0() {
                    public final void invoke() {
                        homeViewModel8.onClickDiscardGsiAndStartInstallation();
                    }
                };
                final HomeViewModel homeViewModel9 = this.$homeViewModel;
                AnonymousClass9 r11 = new Function0() {
                    public final void invoke() {
                        homeViewModel9.showDiscardSheet();
                    }
                };
                final HomeViewModel homeViewModel10 = this.$homeViewModel;
                AnonymousClass10 r12 = new Function0() {
                    public final void invoke() {
                        homeViewModel10.onClickRebootToDynOS();
                    }
                };
                final HomeViewModel homeViewModel11 = this.$homeViewModel;
                AnonymousClass11 r15 = new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((Uri) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Uri it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        homeViewModel11.onFileSelectionResult(it);
                    }
                };
                final HomeViewModel homeViewModel12 = this.$homeViewModel;
                AnonymousClass12 r2 = new Function0() {
                    public final void invoke() {
                        homeViewModel12.showLogsWarning();
                    }
                };
                Function1 function1 = this.$navigate;
                AnonymousClass12 r20 = r2;
                Function1 function12 = this.$navigate;
                AnonymousClass11 r17 = r15;
                int i6 = this.$$dirty & 14;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean invalid$iv$iv = composer.changed((Object) function1);
                Composer $this$cache$iv$iv = $composer;
                Function1 function13 = function1;
                Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                    Object obj = it$iv$iv;
                    value$iv$iv = new HomeScreenKt$Home$3$13$1(function12);
                    $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
                } else {
                    value$iv$iv = it$iv$iv;
                    Object obj2 = value$iv$iv;
                    Object it$iv$iv2 = $this$cache$iv$iv;
                }
                $composer.endReplaceableGroup();
                InstallationCardKt.InstallationCard(installationCard, (Modifier) null, valueOf, r4, r5, r6, r7, r8, r9, r10, r11, r12, r17, r20, (Function0) value$iv$iv, $composer, 0, 0, 2);
                boolean isInstalling = HomeScreenKt.Home$lambda$0(this.$uiState$delegate).isInstalling();
                UserDataCardState userDataCard = HomeScreenKt.Home$lambda$0(this.$uiState$delegate).getUserDataCard();
                final HomeViewModel homeViewModel13 = this.$homeViewModel;
                AnonymousClass14 r42 = new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        homeViewModel13.updateUserdataSize(it);
                    }
                };
                final HomeViewModel homeViewModel14 = this.$homeViewModel;
                UserdataCardKt.UserdataCard(isInstalling, userDataCard, (Modifier) null, r42, new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke(((Boolean) p1).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean it) {
                        homeViewModel14.onCheckUserdataCard();
                    }
                }, $composer, 0, 4);
                boolean isInstalling2 = HomeScreenKt.Home$lambda$0(this.$uiState$delegate).isInstalling();
                ImageSizeCardState imageSizeCard = HomeScreenKt.Home$lambda$0(this.$uiState$delegate).getImageSizeCard();
                final HomeViewModel homeViewModel15 = this.$homeViewModel;
                AnonymousClass16 r43 = new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        homeViewModel15.updateImageSize(it);
                    }
                };
                final HomeViewModel homeViewModel16 = this.$homeViewModel;
                ImageSizeCardKt.ImageSizeCard(isInstalling2, imageSizeCard, (Modifier) null, r43, new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke(((Boolean) p1).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean it) {
                        homeViewModel16.onCheckImageSizeCard();
                    }
                }, $composer, 0, 4);
                final UriHandler uriHandler = this.$uriHandler;
                AnonymousClass18 r22 = new Function0() {
                    public final void invoke() {
                        uriHandler.openUri("https://source.android.com/devices/tech/ota/dynamic-system-updates");
                    }
                };
                final UriHandler uriHandler2 = this.$uriHandler;
                WhatIsDsuCardKt.DsuInfoCard((Modifier) null, r22, new Function0() {
                    public final void invoke() {
                        uriHandler2.openUri("https://developer.android.com/topic/dsu");
                    }
                }, $composer, 0, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
