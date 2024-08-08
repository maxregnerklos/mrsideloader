package vegabobo.dsusideloader.ui.screen.settings;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$7 extends Lambda implements Function0 {
    public final /* synthetic */ SettingsViewModel $settingsViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$7(SettingsViewModel settingsViewModel) {
        super(0);
        this.$settingsViewModel = settingsViewModel;
    }

    public final void invoke() {
        this.$settingsViewModel.togglePreference("disable_storage_check", LiveLiterals$SettingsScreenKt.INSTANCE.m3364Boolean$arg1$calltogglePreference$fun$anonymous$$arg8$callDialogLikeBottomSheet$branch1$when$funSettings());
        this.$settingsViewModel.updateSheetDisplay(DialogSheetState.NONE);
    }
}
