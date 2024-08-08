package vegabobo.dsusideloader.ui.screen.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.PreferenceItemKt;
import vegabobo.dsusideloader.ui.components.TitleKt;
import vegabobo.dsusideloader.util.OperationMode;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function1 $navigate;
    public final /* synthetic */ SettingsViewModel $settingsViewModel;
    public final /* synthetic */ State $uiState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$3(SettingsViewModel settingsViewModel, Function1 function1, int i, State state) {
        super(2);
        this.$settingsViewModel = settingsViewModel;
        this.$navigate = function1;
        this.$$dirty = i;
        this.$uiState$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        String str;
        Object value$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C43@1644L42,43@1630L57,45@1732L47,44@1696L887,65@2628L46,66@2702L52,64@2592L358,72@2995L44,71@2959L286,103@4561L35,103@4547L50,105@4642L44,104@4606L157,109@4808L35,110@4871L47,111@4942L32,108@4772L213:SettingsScreen.kt#u9sfrg");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-907090206, i, -1, "vegabobo.dsusideloader.ui.screen.settings.Settings.<anonymous> (SettingsScreen.kt:42)");
            }
            TitleKt.Title(StringResources_androidKt.stringResource(C0001R$string.installation, composer, 0), (Modifier) null, composer, 0, 2);
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.builtin_installer, composer, 0);
            if (this.$settingsViewModel.isAndroidQ()) {
                composer.startReplaceableGroup(-497928253);
                ComposerKt.sourceInformation(composer, "48@1873L41");
                str = StringResources_androidKt.stringResource(C0001R$string.unsupported, composer, 0);
                $composer.endReplaceableGroup();
            } else if (SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).isRoot()) {
                composer.startReplaceableGroup(-497928154);
                ComposerKt.sourceInformation(composer, "50@1972L59");
                str = StringResources_androidKt.stringResource(C0001R$string.builtin_installer_description, composer, 0);
                $composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-497928057);
                ComposerKt.sourceInformation(composer, "52@2069L38");
                str = StringResources_androidKt.stringResource(C0001R$string.requires_root, composer, 0);
                $composer.endReplaceableGroup();
            }
            boolean z = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).isRoot() && !this.$settingsViewModel.isAndroidQ();
            Object obj = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).getPreferences().get("builtin_installer");
            Intrinsics.checkNotNull(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            final SettingsViewModel settingsViewModel = this.$settingsViewModel;
            AnonymousClass1 r4 = new Function1() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    invoke(((Boolean) p1).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    if (!it) {
                        settingsViewModel.updateSheetDisplay(DialogSheetState.BUILT_IN_INSTALLER);
                    }
                    settingsViewModel.togglePreference("builtin_installer", !it);
                }
            };
            LiveLiterals$SettingsScreenKt liveLiterals$SettingsScreenKt = LiveLiterals$SettingsScreenKt.INSTANCE;
            Composer composer2 = $composer;
            PreferenceItemKt.PreferenceItem(stringResource, str, (ImageVector) null, r4, booleanValue, liveLiterals$SettingsScreenKt.m3367Boolean$arg5$callPreferenceItem$fun$anonymous$$arg7$callApplicationScreen$funSettings(), z, composer2, 0, 4);
            String stringResource2 = StringResources_androidKt.stringResource(C0001R$string.unmount_sd_title, composer, 0);
            String stringResource3 = StringResources_androidKt.stringResource(C0001R$string.unmount_sd_description, composer, 0);
            Object obj2 = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).getPreferences().get("umount_sd");
            Intrinsics.checkNotNull(obj2);
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            final SettingsViewModel settingsViewModel2 = this.$settingsViewModel;
            PreferenceItemKt.PreferenceItem(stringResource2, stringResource3, (ImageVector) null, new Function1() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    invoke(((Boolean) p1).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    settingsViewModel2.togglePreference("umount_sd", !it);
                }
            }, booleanValue2, liveLiterals$SettingsScreenKt.m3368Boolean$arg5$callPreferenceItem1$fun$anonymous$$arg7$callApplicationScreen$funSettings(), false, composer2, 0, 68);
            String stringResource4 = StringResources_androidKt.stringResource(C0001R$string.keep_screen_on, composer, 0);
            Object obj3 = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).getPreferences().get("keep_screen_on");
            Intrinsics.checkNotNull(obj3);
            boolean booleanValue3 = ((Boolean) obj3).booleanValue();
            final SettingsViewModel settingsViewModel3 = this.$settingsViewModel;
            PreferenceItemKt.PreferenceItem(stringResource4, (String) null, (ImageVector) null, new Function1() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    invoke(((Boolean) p1).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean it) {
                    settingsViewModel3.togglePreference("keep_screen_on", !it);
                }
            }, booleanValue3, liveLiterals$SettingsScreenKt.m3369Boolean$arg5$callPreferenceItem2$fun$anonymous$$arg7$callApplicationScreen$funSettings(), false, composer2, 0, 70);
            composer.startReplaceableGroup(-497926853);
            ComposerKt.sourceInformation(composer, "79@3312L47,79@3298L62,81@3413L49,82@3494L55,80@3373L602,94@4113L55,95@4204L61,93@4069L444");
            if (SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).isDevOptEnabled()) {
                TitleKt.Title(StringResources_androidKt.stringResource(C0001R$string.developer_options, composer, 0), (Modifier) null, composer, 0, 2);
                String stringResource5 = StringResources_androidKt.stringResource(C0001R$string.storage_check_title, composer, 0);
                String stringResource6 = StringResources_androidKt.stringResource(C0001R$string.storage_check_description, composer, 0);
                Object obj4 = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).getPreferences().get("disable_storage_check");
                Intrinsics.checkNotNull(obj4);
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                final SettingsViewModel settingsViewModel4 = this.$settingsViewModel;
                PreferenceItemKt.PreferenceItem(stringResource5, stringResource6, (ImageVector) null, new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke(((Boolean) p1).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean it) {
                        if (!it) {
                            settingsViewModel4.updateSheetDisplay(DialogSheetState.DISABLE_STORAGE_CHECK);
                        }
                        settingsViewModel4.togglePreference("disable_storage_check", !it);
                    }
                }, booleanValue4, liveLiterals$SettingsScreenKt.m3366Boolean$arg5$callPreferenceItem$branch$if$fun$anonymous$$arg7$callApplicationScreen$funSettings(), false, $composer, 0, 68);
                if (this.$settingsViewModel.getOperationMode() != OperationMode.ADB) {
                    String stringResource7 = StringResources_androidKt.stringResource(C0001R$string.full_logcat_logging_title, composer, 0);
                    String stringResource8 = StringResources_androidKt.stringResource(C0001R$string.full_logcat_logging_description, composer, 0);
                    Object obj5 = SettingsScreenKt.Settings$lambda$0(this.$uiState$delegate).getPreferences().get("full_logcat_logging");
                    Intrinsics.checkNotNull(obj5);
                    boolean booleanValue5 = ((Boolean) obj5).booleanValue();
                    final SettingsViewModel settingsViewModel5 = this.$settingsViewModel;
                    PreferenceItemKt.PreferenceItem(stringResource7, stringResource8, (ImageVector) null, new Function1() {
                        public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                            invoke(((Boolean) p1).booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean it) {
                            settingsViewModel5.togglePreference("full_logcat_logging", !it);
                        }
                    }, booleanValue5, liveLiterals$SettingsScreenKt.m3365Boolean$arg5$callPreferenceItem$branch$if$branch$if$fun$anonymous$$arg7$callApplicationScreen$funSettings(), false, $composer, 0, 68);
                }
            }
            $composer.endReplaceableGroup();
            TitleKt.Title(StringResources_androidKt.stringResource(C0001R$string.other, composer, 0), (Modifier) null, composer, 0, 2);
            PreferenceItemKt.PreferenceItem(StringResources_androidKt.stringResource(C0001R$string.operation_mode, composer, 0), this.$settingsViewModel.checkOperationMode(), (ImageVector) null, (Function1) null, false, false, false, $composer, 0, 124);
            String stringResource9 = StringResources_androidKt.stringResource(C0001R$string.about, composer, 0);
            String stringResource10 = StringResources_androidKt.stringResource(C0001R$string.about_description, composer, 0);
            Object key1$iv = this.$navigate;
            Function1 function1 = this.$navigate;
            int i2 = this.$$dirty & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv = composer.changed(key1$iv);
            Composer $this$cache$iv$iv = $composer;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new SettingsScreenKt$Settings$3$6$1(function1);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer.endReplaceableGroup();
            PreferenceItemKt.PreferenceItem(stringResource9, stringResource10, (ImageVector) null, value$iv$iv, false, false, false, $composer, 0, 116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
