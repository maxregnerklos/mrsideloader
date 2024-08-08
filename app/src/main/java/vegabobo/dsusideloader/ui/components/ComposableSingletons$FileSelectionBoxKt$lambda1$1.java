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

/* renamed from: vegabobo.dsusideloader.ui.components.ComposableSingletons$FileSelectionBoxKt$lambda-1$1  reason: invalid class name */
/* compiled from: FileSelectionBox.kt */
public final class ComposableSingletons$FileSelectionBoxKt$lambda1$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$FileSelectionBoxKt$lambda1$1 INSTANCE = new ComposableSingletons$FileSelectionBoxKt$lambda1$1();

    public ComposableSingletons$FileSelectionBoxKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        int i = $changed;
        ComposerKt.sourceInformation($composer, "C27@1011L15:FileSelectionBox.kt#bcxyhz");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825264450, i, -1, "vegabobo.dsusideloader.ui.components.ComposableSingletons$FileSelectionBoxKt.lambda-1.<anonymous> (FileSelectionBox.kt:27)");
            }
            TextKt.m754TextfLXpl1I(LiveLiterals$FileSelectionBoxKt.INSTANCE.m2999String$arg0$callText$fun$anonymous$$arg7$callOutlinedTextField$funFileSelectionBox(), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
