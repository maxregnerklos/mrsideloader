package vegabobo.dsusideloader.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Theme.kt */
public final class ThemeKt$DSUHelperTheme$1 extends Lambda implements Function0 {
    public final /* synthetic */ boolean $darkTheme;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThemeKt$DSUHelperTheme$1(View view, boolean z) {
        super(0);
        this.$view = view;
        this.$darkTheme = z;
    }

    public final void invoke() {
        Context context = this.$view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        WindowCompat.getInsetsController(window, this.$view).setAppearanceLightStatusBars(!this.$darkTheme);
        WindowCompat.getInsetsController(window, this.$view).setAppearanceLightNavigationBars(!this.$darkTheme);
    }
}
