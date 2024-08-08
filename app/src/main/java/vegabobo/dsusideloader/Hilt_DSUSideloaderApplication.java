package vegabobo.dsusideloader;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;

public abstract class Hilt_DSUSideloaderApplication extends Application implements GeneratedComponentManager {
    public final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() {
        public Object get() {
            return DaggerDSUSideloaderApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_DSUSideloaderApplication.this)).build();
        }
    });
    public boolean injected = false;

    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            ((DSUSideloaderApplication_GeneratedInjector) generatedComponent()).injectDSUSideloaderApplication((DSUSideloaderApplication) UnsafeCasts.unsafeCast(this));
        }
    }
}
