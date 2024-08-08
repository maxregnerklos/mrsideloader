package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.icons.Icons$Outlined;
import androidx.compose.material.icons.outlined.ArrowBackKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: TopBar.kt */
public final class TopBarKt$TopBar$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $iconContentDescription;
    public final /* synthetic */ Function0 $onClickBackButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBarKt$TopBar$3(Function0 function0, int i, String str) {
        super(2);
        this.$onClickBackButton = function0;
        this.$$dirty = i;
        this.$iconContentDescription = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C27@987L230:TopBar.kt#bcxyhz");
        if (($changed & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(719508440, $changed, -1, "vegabobo.dsusideloader.ui.components.TopBar.<anonymous> (TopBar.kt:25)");
            }
            Function0 function0 = this.$onClickBackButton;
            if (function0 != null) {
                final String str = this.$iconContentDescription;
                final int i = this.$$dirty;
                IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda($composer, -1607133232, true, new Function2() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                        invoke((Composer) p1, ((Number) p2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer, int $changed) {
                        ComposerKt.sourceInformation($composer, "C28@1039L160:TopBar.kt#bcxyhz");
                        if (($changed & 11) != 2 || !$composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1607133232, $changed, -1, "vegabobo.dsusideloader.ui.components.TopBar.<anonymous>.<anonymous> (TopBar.kt:27)");
                            }
                            IconKt.m669Iconww6aTOc(ArrowBackKt.getArrowBack(Icons$Outlined.INSTANCE), str, (Modifier) null, 0, $composer, (i >> 6) & 112, 12);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        $composer.skipToGroupEnd();
                    }
                }), $composer, ((this.$$dirty >> 15) & 14) | 196608, 30);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
