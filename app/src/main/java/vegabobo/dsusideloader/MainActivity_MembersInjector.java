package vegabobo.dsusideloader;

import vegabobo.dsusideloader.model.Session;

public abstract class MainActivity_MembersInjector {
    public static void injectSession(MainActivity instance, Session session) {
        instance.session = session;
    }
}
