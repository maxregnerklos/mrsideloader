package vegabobo.dsusideloader.di;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DataModules.kt */
public final class DataModules$providePreferencesDataStore$1 extends Lambda implements Function1 {
    public static final DataModules$providePreferencesDataStore$1 INSTANCE = new DataModules$providePreferencesDataStore$1();

    public DataModules$providePreferencesDataStore$1() {
        super(1);
    }

    public final Preferences invoke(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.createEmpty();
    }
}
