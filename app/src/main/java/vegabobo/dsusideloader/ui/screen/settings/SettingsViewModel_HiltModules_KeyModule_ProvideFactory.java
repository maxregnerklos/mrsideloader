package vegabobo.dsusideloader.ui.screen.settings;

import dagger.internal.Preconditions;
import javax.inject.Provider;

public abstract class SettingsViewModel_HiltModules_KeyModule_ProvideFactory implements Provider {
    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SettingsViewModel_HiltModules$KeyModule.provide());
    }
}
