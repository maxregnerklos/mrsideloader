package vegabobo.dsusideloader.ui.screen.adb;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.TopBarKt;

/* compiled from: AdbScreen.kt */
public final class AdbScreenKt$AdbScreen$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdbScreenKt$AdbScreen$1(Function1 function1, int i) {
        super(3);
        this.$navigate = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((TopAppBarScrollBehavior) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TopAppBarScrollBehavior it, Composer $composer, int $changed) {
        Object value$iv$iv;
        Function0 value$iv$iv2;
        TopAppBarScrollBehavior topAppBarScrollBehavior = it;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(topAppBarScrollBehavior, "it");
        ComposerKt.sourceInformation(composer, "C32@1269L42,34@1380L38,35@1456L29,31@1234L266:AdbScreen.kt#bu660e");
        int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty |= composer.changed((Object) topAppBarScrollBehavior) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(542504677, $dirty2, -1, "vegabobo.dsusideloader.ui.screen.adb.AdbScreen.<anonymous> (AdbScreen.kt:30)");
            }
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.installation, composer, 0);
            Object key1$iv = this.$navigate;
            Function1 function1 = this.$navigate;
            int i = this.$$dirty & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv = composer.changed(key1$iv);
            Composer $this$cache$iv$iv = $composer;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new AdbScreenKt$AdbScreen$1$1$1(function1);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer.endReplaceableGroup();
            Function0 function0 = (Function0) value$iv$iv;
            Object key1$iv2 = this.$navigate;
            Function1 function12 = this.$navigate;
            int i2 = this.$$dirty & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv2 = composer.changed(key1$iv2);
            Composer $this$cache$iv$iv2 = $composer;
            Object it$iv$iv2 = $this$cache$iv$iv2.rememberedValue();
            if (invalid$iv$iv2 || it$iv$iv2 == Composer.Companion.getEmpty()) {
                value$iv$iv2 = new AdbScreenKt$AdbScreen$1$2$1(function12);
                $this$cache$iv$iv2.updateRememberedValue(value$iv$iv2);
            } else {
                value$iv$iv2 = it$iv$iv2;
            }
            $composer.endReplaceableGroup();
            TopBarKt.TopBar(it, stringResource, (ImageVector) null, (String) null, function0, value$iv$iv2, $composer, $dirty2 & 14, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
