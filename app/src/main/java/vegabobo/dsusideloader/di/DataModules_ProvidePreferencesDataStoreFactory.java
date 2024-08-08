package vegabobo.dsusideloader.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public abstract class DataModules_ProvidePreferencesDataStoreFactory implements Provider {
    public static DataStore providePreferencesDataStore(Context appContext) {
        return (DataStore) Preconditions.checkNotNullFromProvides(DataModules.INSTANCE.providePreferencesDataStore(appContext));
    }
}
