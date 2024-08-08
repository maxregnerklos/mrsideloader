package vegabobo.dsusideloader.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.model.DSUInstallationSource;
import vegabobo.dsusideloader.model.InstallationPreferences;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.model.UserSelection;

/* compiled from: DataModules.kt */
public final class DataModules {
    public static final int $stable = LiveLiterals$DataModulesKt.INSTANCE.m2570Int$classDataModules();
    public static final DataModules INSTANCE = new DataModules();

    public final DataStore providePreferencesDataStore(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, new ReplaceFileCorruptionHandler(DataModules$providePreferencesDataStore$1.INSTANCE), (List) null, CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new DataModules$providePreferencesDataStore$2(appContext), 2, (Object) null);
    }

    public final StorageManager providesStorageManager(Context appContext, DataStore preferences) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StorageManager(appContext, preferences);
    }

    public final Session provideSession() {
        return new Session((UserSelection) null, (DSUInstallationSource) null, (InstallationPreferences) null, (MutableStateFlow) null, 15, (DefaultConstructorMarker) null);
    }
}
