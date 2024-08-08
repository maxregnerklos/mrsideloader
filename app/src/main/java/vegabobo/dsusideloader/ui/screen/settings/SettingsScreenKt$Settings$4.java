package vegabobo.dsusideloader.ui.screen.settings;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$4 extends Lambda implements Function0 {
    public final /* synthetic */ SettingsViewModel $settingsViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$4(SettingsViewModel settingsViewModel) {
        super(0);
        this.$settingsViewModel = settingsViewModel;
    }

    public final void invoke() {
        this.$settingsViewModel.updateSheetDisplay(DialogSheetState.NONE);
    }
}
