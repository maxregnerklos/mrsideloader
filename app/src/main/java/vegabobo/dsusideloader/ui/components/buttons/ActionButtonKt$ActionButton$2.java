package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ActionButton.kt */
public final class ActionButtonKt$ActionButton$2 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Color $colorText;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionButtonKt$ActionButton$2(String str, Color color, int i, Function2 function2) {
        super(3);
        this.$text = str;
        this.$colorText = color;
        this.$$dirty = i;
        this.$content = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((RowScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope $this$FilledTonalButton, Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        Intrinsics.checkNotNullParameter($this$FilledTonalButton, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C38@1151L120,42@1284L9:ActionButton.kt#90uv7e");
        if ((i & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551231500, i, -1, "vegabobo.dsusideloader.ui.components.buttons.ActionButton.<anonymous> (ActionButton.kt:37)");
            }
            String str = this.$text;
            Color color = this.$colorText;
            composer.startReplaceableGroup(2104568639);
            ComposerKt.sourceInformation(composer, "40@1237L11");
            long r25 = color == null ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m604getSurface0d7_KjU() : color.m1196unboximpl();
            $composer.endReplaceableGroup();
            Composer composer2 = composer;
            TextKt.m754TextfLXpl1I(str, (Modifier) null, r25, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, (this.$$dirty >> 3) & 14, 0, 65530);
            this.$content.invoke($composer, Integer.valueOf((this.$$dirty >> 21) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
