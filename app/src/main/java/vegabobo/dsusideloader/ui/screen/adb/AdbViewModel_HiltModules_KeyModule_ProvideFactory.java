package vegabobo.dsusideloader.ui.screen.adb;

import dagger.internal.Preconditions;
import javax.inject.Provider;

public abstract class AdbViewModel_HiltModules_KeyModule_ProvideFactory implements Provider {
    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(AdbViewModel_HiltModules$KeyModule.provide());
    }
}
