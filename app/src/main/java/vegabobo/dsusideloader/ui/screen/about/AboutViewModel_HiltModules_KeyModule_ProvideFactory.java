package vegabobo.dsusideloader.ui.screen.about;

import dagger.internal.Preconditions;
import javax.inject.Provider;

public abstract class AboutViewModel_HiltModules_KeyModule_ProvideFactory implements Provider {
    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(AboutViewModel_HiltModules$KeyModule.provide());
    }
}
