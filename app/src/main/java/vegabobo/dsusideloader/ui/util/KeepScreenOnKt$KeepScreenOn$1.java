package vegabobo.dsusideloader.ui.util;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: KeepScreenOn.kt */
public final class KeepScreenOnKt$KeepScreenOn$1 extends Lambda implements Function1 {
    public final /* synthetic */ View $currentView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeepScreenOnKt$KeepScreenOn$1(View view) {
        super(1);
        this.$currentView = view;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope $this$DisposableEffect) {
        Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
        this.$currentView.setKeepScreenOn(LiveLiterals$KeepScreenOnKt.INSTANCE.m3414Boolean$arg0$callsetKeepScreenOn$fun$anonymous$$arg1$callDisposableEffect$funKeepScreenOn());
        DisposableEffectScope disposableEffectScope = $this$DisposableEffect;
        return new KeepScreenOnKt$KeepScreenOn$1$invoke$$inlined$onDispose$1(this.$currentView);
    }
}
