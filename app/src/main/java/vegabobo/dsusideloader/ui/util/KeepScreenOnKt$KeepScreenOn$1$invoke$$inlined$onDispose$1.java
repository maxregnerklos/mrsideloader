package vegabobo.dsusideloader.ui.util;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: Effects.kt */
public final class KeepScreenOnKt$KeepScreenOn$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ View $currentView$inlined;

    public KeepScreenOnKt$KeepScreenOn$1$invoke$$inlined$onDispose$1(View view) {
        this.$currentView$inlined = view;
    }

    public void dispose() {
        this.$currentView$inlined.setKeepScreenOn(LiveLiterals$KeepScreenOnKt.INSTANCE.m3413Boolean$arg0$callsetKeepScreenOn$fun$anonymous$$arg0$callonDispose$fun$anonymous$$arg1$callDisposableEffect$funKeepScreenOn());
    }
}
