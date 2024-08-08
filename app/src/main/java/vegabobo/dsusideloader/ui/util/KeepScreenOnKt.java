package vegabobo.dsusideloader.ui.util;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;

/* compiled from: KeepScreenOn.kt */
public abstract class KeepScreenOnKt {
    public static final void KeepScreenOn(Composer $composer, int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1192656229);
        ComposerKt.sourceInformation($composer2, "C(KeepScreenOn)8@244L7,9@256L145:KeepScreenOn.kt#k5p5kd");
        if ($changed != 0 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192656229, $changed, -1, "vegabobo.dsusideloader.ui.util.KeepScreenOn (KeepScreenOn.kt:7)");
            }
            CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(this_$iv);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(Unit.INSTANCE, new KeepScreenOnKt$KeepScreenOn$1((View) consume), $composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new KeepScreenOnKt$KeepScreenOn$2($changed));
        }
    }
}
