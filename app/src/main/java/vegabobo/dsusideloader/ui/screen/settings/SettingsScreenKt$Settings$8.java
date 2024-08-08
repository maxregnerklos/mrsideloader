package vegabobo.dsusideloader.ui.screen.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SettingsScreen.kt */
public final class SettingsScreenKt$Settings$8 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function1 $navigate;
    public final /* synthetic */ SettingsViewModel $settingsViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsScreenKt$Settings$8(Function1 function1, SettingsViewModel settingsViewModel, int i, int i2) {
        super(2);
        this.$navigate = function1;
        this.$settingsViewModel = settingsViewModel;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SettingsScreenKt.Settings(this.$navigate, this.$settingsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
