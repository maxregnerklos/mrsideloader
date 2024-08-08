package vegabobo.dsusideloader.ui.screen.home;

import dagger.internal.Preconditions;
import javax.inject.Provider;

public abstract class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements Provider {
    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(HomeViewModel_HiltModules$KeyModule.provide());
    }
}
