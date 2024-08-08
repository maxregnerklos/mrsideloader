package vegabobo.dsusideloader;

import android.app.Activity;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.SavedStateHandle;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.di.DataModules_ProvidePreferencesDataStoreFactory;
import vegabobo.dsusideloader.di.DataModules_ProvideSessionFactory;
import vegabobo.dsusideloader.di.DataModules_ProvidesStorageManagerFactory;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.ui.screen.about.AboutViewModel;
import vegabobo.dsusideloader.ui.screen.about.AboutViewModel_HiltModules_KeyModule_ProvideFactory;
import vegabobo.dsusideloader.ui.screen.adb.AdbViewModel;
import vegabobo.dsusideloader.ui.screen.adb.AdbViewModel_HiltModules_KeyModule_ProvideFactory;
import vegabobo.dsusideloader.ui.screen.home.HomeViewModel;
import vegabobo.dsusideloader.ui.screen.home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel;
import vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel_HiltModules_KeyModule_ProvideFactory;

public abstract class DaggerDSUSideloaderApplication_HiltComponents_SingletonC {
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        public ApplicationContextModule applicationContextModule;

        public Builder() {
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule2) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule2);
            return this;
        }

        public DSUSideloaderApplication_HiltComponents$SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    public static final class ActivityRetainedCBuilder implements ActivityRetainedComponentBuilder {
        public final SingletonCImpl singletonCImpl;

        public ActivityRetainedCBuilder(SingletonCImpl singletonCImpl2) {
            this.singletonCImpl = singletonCImpl2;
        }

        public DSUSideloaderApplication_HiltComponents$ActivityRetainedC build() {
            return new ActivityRetainedCImpl(this.singletonCImpl);
        }
    }

    public static final class ActivityCBuilder implements ActivityComponentBuilder {
        public Activity activity;
        public final ActivityRetainedCImpl activityRetainedCImpl;
        public final SingletonCImpl singletonCImpl;

        public ActivityCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ActivityCBuilder activity(Activity activity2) {
            this.activity = (Activity) Preconditions.checkNotNull(activity2);
            return this;
        }

        public DSUSideloaderApplication_HiltComponents$ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    public static final class ViewModelCBuilder implements ViewModelComponentBuilder {
        public final ActivityRetainedCImpl activityRetainedCImpl;
        public SavedStateHandle savedStateHandle;
        public final SingletonCImpl singletonCImpl;
        public ViewModelLifecycle viewModelLifecycle;

        public ViewModelCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle2) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle2);
            return this;
        }

        public DSUSideloaderApplication_HiltComponents$ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    public static final class ActivityCImpl extends DSUSideloaderApplication_HiltComponents$ActivityC {
        public final ActivityCImpl activityCImpl;
        public final ActivityRetainedCImpl activityRetainedCImpl;
        public final SingletonCImpl singletonCImpl;

        public ActivityCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, Activity activityParam) {
            this.activityCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        public Set getViewModelKeys() {
            return SetBuilder.newSetBuilder(4).add(AboutViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AdbViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
        }

        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        public void injectMainActivity(MainActivity arg0) {
            injectMainActivity2(arg0);
        }

        public final MainActivity injectMainActivity2(MainActivity instance) {
            MainActivity_MembersInjector.injectSession(instance, (Session) this.singletonCImpl.provideSessionProvider.get());
            return instance;
        }
    }

    public static final class ViewModelCImpl extends DSUSideloaderApplication_HiltComponents$ViewModelC {
        public Provider aboutViewModelProvider;
        public final ActivityRetainedCImpl activityRetainedCImpl;
        public Provider adbViewModelProvider;
        public Provider homeViewModelProvider;
        public Provider settingsViewModelProvider;
        public final SingletonCImpl singletonCImpl;
        public final ViewModelCImpl viewModelCImpl;

        public ViewModelCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.viewModelCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            initialize(savedStateHandleParam, viewModelLifecycleParam);
        }

        public final void initialize(SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.aboutViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.adbViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.homeViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.settingsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
        }

        public Map getHiltViewModelMap() {
            return MapBuilder.newMapBuilder(4).put("vegabobo.dsusideloader.ui.screen.about.AboutViewModel", this.aboutViewModelProvider).put("vegabobo.dsusideloader.ui.screen.adb.AdbViewModel", this.adbViewModelProvider).put("vegabobo.dsusideloader.ui.screen.home.HomeViewModel", this.homeViewModelProvider).put("vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel", this.settingsViewModelProvider).build();
        }

        public static final class SwitchingProvider implements Provider {
            public final ActivityRetainedCImpl activityRetainedCImpl;
            public final int id;
            public final SingletonCImpl singletonCImpl;
            public final ViewModelCImpl viewModelCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ViewModelCImpl viewModelCImpl2, int id2) {
                this.singletonCImpl = singletonCImpl2;
                this.activityRetainedCImpl = activityRetainedCImpl2;
                this.viewModelCImpl = viewModelCImpl2;
                this.id = id2;
            }

            public Object get() {
                switch (this.id) {
                    case 0:
                        return new AboutViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.singletonCImpl.applicationContextModule), (DataStore) this.singletonCImpl.providePreferencesDataStoreProvider.get());
                    case 1:
                        return new AdbViewModel((Session) this.singletonCImpl.provideSessionProvider.get());
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                        return new HomeViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.singletonCImpl.applicationContextModule), (DataStore) this.singletonCImpl.providePreferencesDataStoreProvider.get(), (StorageManager) this.singletonCImpl.providesStorageManagerProvider.get(), (Session) this.singletonCImpl.provideSessionProvider.get());
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER:
                        return new SettingsViewModel((DataStore) this.singletonCImpl.providePreferencesDataStoreProvider.get(), (Session) this.singletonCImpl.provideSessionProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.singletonCImpl.applicationContextModule));
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }

    public static final class ActivityRetainedCImpl extends DSUSideloaderApplication_HiltComponents$ActivityRetainedC {
        public final ActivityRetainedCImpl activityRetainedCImpl;
        public Provider provideActivityRetainedLifecycleProvider;
        public final SingletonCImpl singletonCImpl;

        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl2) {
            this.activityRetainedCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            initialize();
        }

        public final void initialize() {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return (ActivityRetainedLifecycle) this.provideActivityRetainedLifecycleProvider.get();
        }

        public static final class SwitchingProvider implements Provider {
            public final ActivityRetainedCImpl activityRetainedCImpl;
            public final int id;
            public final SingletonCImpl singletonCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, int id2) {
                this.singletonCImpl = singletonCImpl2;
                this.activityRetainedCImpl = activityRetainedCImpl2;
                this.id = id2;
            }

            public Object get() {
                switch (this.id) {
                    case 0:
                        return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }

    public static final class SingletonCImpl extends DSUSideloaderApplication_HiltComponents$SingletonC {
        public final ApplicationContextModule applicationContextModule;
        public Provider providePreferencesDataStoreProvider;
        public Provider provideSessionProvider;
        public Provider providesStorageManagerProvider;
        public final SingletonCImpl singletonCImpl;

        public SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
            this.singletonCImpl = this;
            this.applicationContextModule = applicationContextModuleParam;
            initialize(applicationContextModuleParam);
        }

        public final void initialize(ApplicationContextModule applicationContextModuleParam) {
            this.provideSessionProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 0));
            this.providePreferencesDataStoreProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 1));
            this.providesStorageManagerProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 2));
        }

        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        public void injectDSUSideloaderApplication(DSUSideloaderApplication arg0) {
        }

        public static final class SwitchingProvider implements Provider {
            public final int id;
            public final SingletonCImpl singletonCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl2, int id2) {
                this.singletonCImpl = singletonCImpl2;
                this.id = id2;
            }

            public Object get() {
                switch (this.id) {
                    case 0:
                        return DataModules_ProvideSessionFactory.provideSession();
                    case 1:
                        return DataModules_ProvidePreferencesDataStoreFactory.providePreferencesDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                        return DataModules_ProvidesStorageManagerFactory.providesStorageManager(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), (DataStore) this.singletonCImpl.providePreferencesDataStoreProvider.get());
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }
}
