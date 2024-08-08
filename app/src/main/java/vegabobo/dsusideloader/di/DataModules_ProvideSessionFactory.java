package vegabobo.dsusideloader.di;

import dagger.internal.Preconditions;
import javax.inject.Provider;
import vegabobo.dsusideloader.model.Session;

public abstract class DataModules_ProvideSessionFactory implements Provider {
    public static Session provideSession() {
        return (Session) Preconditions.checkNotNullFromProvides(DataModules.INSTANCE.provideSession());
    }
}
