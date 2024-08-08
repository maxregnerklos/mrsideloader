package vegabobo.dsusideloader.ui.cards.warnings;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: SetupStorage.kt */
public final class SetupStorageKt$SetupStorage$1$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ ManagedActivityResultLauncher $launcherSetupStorage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetupStorageKt$SetupStorage$1$1$1(ManagedActivityResultLauncher managedActivityResultLauncher, Intent intent) {
        super(0);
        this.$launcherSetupStorage = managedActivityResultLauncher;
        this.$intent = intent;
    }

    public final void invoke() {
        this.$launcherSetupStorage.launch(this.$intent);
    }
}
