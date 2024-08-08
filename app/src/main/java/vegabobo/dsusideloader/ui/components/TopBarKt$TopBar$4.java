package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: TopBar.kt */
public final class TopBarKt$TopBar$4 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ ImageVector $icon;
    public final /* synthetic */ String $iconContentDescription;
    public final /* synthetic */ Function0 $onClickIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBarKt$TopBar$4(ImageVector imageVector, Function0 function0, int i, String str) {
        super(3);
        this.$icon = imageVector;
        this.$onClickIcon = function0;
        this.$$dirty = i;
        this.$iconContentDescription = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((RowScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope $this$LargeTopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$LargeTopAppBar, "$this$LargeTopAppBar");
        ComposerKt.sourceInformation($composer, "C37@1311L204:TopBar.kt#bcxyhz");
        if (($changed & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(529225025, $changed, -1, "vegabobo.dsusideloader.ui.components.TopBar.<anonymous> (TopBar.kt:35)");
            }
            final ImageVector imageVector = this.$icon;
            if (imageVector != null) {
                Function0 function0 = this.$onClickIcon;
                final String str = this.$iconContentDescription;
                final int i = this.$$dirty;
                IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda($composer, 1715079241, true, new Function2() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                        invoke((Composer) p1, ((Number) p2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer, int $changed) {
                        ComposerKt.sourceInformation($composer, "C38@1357L140:TopBar.kt#bcxyhz");
                        if (($changed & 11) != 2 || !$composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1715079241, $changed, -1, "vegabobo.dsusideloader.ui.components.TopBar.<anonymous>.<anonymous> (TopBar.kt:37)");
                            }
                            ImageVector imageVector = imageVector;
                            String str = str;
                            int i = i;
                            IconKt.m669Iconww6aTOc(imageVector, str, (Modifier) null, 0, $composer, ((i >> 6) & 14) | ((i >> 6) & 112), 12);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        $composer.skipToGroupEnd();
                    }
                }), $composer, ((this.$$dirty >> 12) & 14) | 196608, 30);
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
