package vegabobo.dsusideloader.ui.screen.about;

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

/* compiled from: AboutScreen.kt */
public final class AboutScreenKt$AboutScreen$2 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutScreenKt$AboutScreen$2(Function1 function1, int i) {
        super(3);
        this.$navigate = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((TopAppBarScrollBehavior) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TopAppBarScrollBehavior it, Composer $composer, int $changed) {
        Function0 value$iv$iv;
        TopAppBarScrollBehavior topAppBarScrollBehavior = it;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(topAppBarScrollBehavior, "it");
        ComposerKt.sourceInformation(composer, "C69@2665L35,71@2775L29,68@2630L189:AboutScreen.kt#bgkqvw");
        int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty |= composer.changed((Object) topAppBarScrollBehavior) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432333065, $dirty2, -1, "vegabobo.dsusideloader.ui.screen.about.AboutScreen.<anonymous> (AboutScreen.kt:67)");
            }
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.about, composer, 0);
            Object key1$iv = this.$navigate;
            Function1 function1 = this.$navigate;
            int i = this.$$dirty & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv = composer.changed(key1$iv);
            Composer $this$cache$iv$iv = $composer;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new AboutScreenKt$AboutScreen$2$1$1(function1);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer.endReplaceableGroup();
            TopBarKt.TopBar(it, stringResource, (ImageVector) null, (String) null, (Function0) null, value$iv$iv, $composer, $dirty2 & 14, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}