package vegabobo.dsusideloader.installer.adb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.model.Session;

/* compiled from: AdbInstallationHandler.kt */
public final class AdbInstallationHandler {
    public static final int $stable = LiveLiterals$AdbInstallationHandlerKt.INSTANCE.m2571Int$classAdbInstallationHandler();
    public final Session session;
    public final StorageManager storageManager;

    public AdbInstallationHandler(StorageManager storageManager2, Session session2) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(session2, "session");
        this.storageManager = storageManager2;
        this.session = session2;
    }

    public final void generate(Function1 onGenerated) {
        Intrinsics.checkNotNullParameter(onGenerated, "onGenerated");
        onGenerated.invoke(new GenerateInstallationScript(this.storageManager, this.session.getInstallationParameters(), this.session.getPreferences()).writeToFile());
    }
}
