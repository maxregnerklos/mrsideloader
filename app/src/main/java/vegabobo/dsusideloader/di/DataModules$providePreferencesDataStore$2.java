package vegabobo.dsusideloader.di;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: DataModules.kt */
public final class DataModules$providePreferencesDataStore$2 extends Lambda implements Function0 {
    public final /* synthetic */ Context $appContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataModules$providePreferencesDataStore$2(Context context) {
        super(0);
        this.$appContext = context;
    }

    public final File invoke() {
        return PreferenceDataStoreFile.preferencesDataStoreFile(this.$appContext, "user_preferences");
    }
}
