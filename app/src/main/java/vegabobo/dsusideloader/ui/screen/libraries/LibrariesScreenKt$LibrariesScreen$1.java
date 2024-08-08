package vegabobo.dsusideloader.ui.screen.libraries;

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

/* compiled from: LibrariesScreen.kt */
public final class LibrariesScreenKt$LibrariesScreen$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function1 $navigate;
    public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibrariesScreenKt$LibrariesScreen$1(TopAppBarScrollBehavior topAppBarScrollBehavior, Function1 function1, int i) {
        super(3);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$navigate = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((TopAppBarScrollBehavior) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TopAppBarScrollBehavior it, Composer $composer, int $changed) {
        Object value$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C49@2041L45,51@2173L29,48@2006L211:LibrariesScreen.kt#qseziw");
        if ((i & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81221220, i, -1, "vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreen.<anonymous> (LibrariesScreen.kt:47)");
            }
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.libraries_title, composer, 0);
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
            Object key1$iv = this.$navigate;
            Function1 function1 = this.$navigate;
            int i2 = this.$$dirty & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean invalid$iv$iv = composer.changed(key1$iv);
            Composer $this$cache$iv$iv = $composer;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new LibrariesScreenKt$LibrariesScreen$1$1$1(function1);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                value$iv$iv = it$iv$iv;
            }
            $composer.endReplaceableGroup();
            TopBarKt.TopBar(topAppBarScrollBehavior, stringResource, (ImageVector) null, (String) null, (Function0) null, value$iv$iv, $composer, 0, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
