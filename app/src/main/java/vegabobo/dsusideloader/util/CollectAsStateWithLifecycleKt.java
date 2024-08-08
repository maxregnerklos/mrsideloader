package vegabobo.dsusideloader.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CollectAsStateWithLifecycle.kt */
public abstract class CollectAsStateWithLifecycleKt {
    public static final State collectAsStateWithLifecycle(StateFlow $this$collectAsStateWithLifecycle, Lifecycle lifecycle, Lifecycle.State minActiveState, Composer $composer, int $changed, int i) {
        Object value$iv$iv;
        Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>");
        $composer.startReplaceableGroup(-1568870746);
        ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)52@2277L7,55@2421L23,54@2373L138:CollectAsStateWithLifecycle.kt#foowrv");
        if ((i & 1) != 0) {
            CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer.consume(this_$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            lifecycle = ((LifecycleOwner) consume).getLifecycle();
        }
        if ((i & 2) != 0) {
            minActiveState = Lifecycle.State.STARTED;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568870746, $changed, -1, "vegabobo.dsusideloader.util.collectAsStateWithLifecycle (CollectAsStateWithLifecycle.kt:51)");
        }
        $composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation($composer, "CC(remember):Composables.kt#9igjgp");
        Composer $this$cache$iv$iv = $composer;
        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
        if (it$iv$iv == Composer.Companion.getEmpty()) {
            value$iv$iv = $this$collectAsStateWithLifecycle.getValue();
            $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        State collectAsStateWithLifecycle = collectAsStateWithLifecycle($this$collectAsStateWithLifecycle, value$iv$iv, lifecycle, minActiveState, $composer, (($changed << 3) & 7168) | 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return collectAsStateWithLifecycle;
    }

    public static final State collectAsStateWithLifecycle(Flow $this$collectAsStateWithLifecycle, Object initialValue, Lifecycle lifecycle, Lifecycle.State minActiveState, Composer $composer, int $changed, int i) {
        Object value$iv$iv;
        Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>");
        $composer.startReplaceableGroup(-948045255);
        ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)86@3774L7,89@3893L31,90@3936L320:CollectAsStateWithLifecycle.kt#foowrv");
        if ((i & 2) != 0) {
            CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer.consume(this_$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            lifecycle = ((LifecycleOwner) consume).getLifecycle();
        }
        if ((i & 4) != 0) {
            minActiveState = Lifecycle.State.STARTED;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-948045255, $changed, -1, "vegabobo.dsusideloader.util.collectAsStateWithLifecycle (CollectAsStateWithLifecycle.kt:84)");
        }
        $composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed((Object) $this$collectAsStateWithLifecycle);
        Composer $this$cache$iv$iv = $composer;
        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
        if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
            value$iv$iv = initialValue;
            $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        State produceState = SnapshotStateKt.produceState(value$iv$iv, $this$collectAsStateWithLifecycle, lifecycle, minActiveState, new CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2(lifecycle, minActiveState, $this$collectAsStateWithLifecycle, (Continuation) null), $composer, (8 & ($changed >> 3)) | 33344 | ($changed & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return produceState;
    }
}
