package vegabobo.dsusideloader.ui.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: TopBar.kt */
public final class TopBarKt$TopBar$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $barTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopBarKt$TopBar$2(String str, int i) {
        super(2);
        this.$barTitle = str;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        int i = $changed;
        ComposerKt.sourceInformation($composer, "C24@874L21:TopBar.kt#bcxyhz");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(220951638, i, -1, "vegabobo.dsusideloader.ui.components.TopBar.<anonymous> (TopBar.kt:24)");
            }
            TextKt.m754TextfLXpl1I(this.$barTitle, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, (this.$$dirty >> 3) & 14, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
