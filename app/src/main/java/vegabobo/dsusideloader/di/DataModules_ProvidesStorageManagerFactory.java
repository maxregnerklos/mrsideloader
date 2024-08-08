package vegabobo.dsusideloader.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import vegabobo.dsusideloader.core.StorageManager;

public abstract class DataModules_ProvidesStorageManagerFactory implements Provider {
    public static StorageManager providesStorageManager(Context appContext, DataStore preferences) {
        return (StorageManager) Preconditions.checkNotNullFromProvides(DataModules.INSTANCE.providesStorageManager(appContext, preferences));
    }
}
