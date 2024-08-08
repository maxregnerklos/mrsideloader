package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.ColumnScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SimpleCard.kt */
public final class SimpleCardKt$SimpleCard$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $justifyText;
    public final /* synthetic */ String $text;
    public final /* synthetic */ boolean $textScrollable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleCardKt$SimpleCard$1(String str, boolean z, boolean z2, int i, Function2 function2) {
        super(3);
        this.$text = str;
        this.$justifyText = z;
        this.$textScrollable = z2;
        this.$$dirty = i;
        this.$content = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope it, Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C32@1048L22,40@1362L9:SimpleCard.kt#bcxyhz");
        if ((i & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1748144452, i, -1, "vegabobo.dsusideloader.ui.components.SimpleCard.<anonymous> (SimpleCard.kt:31)");
            }
            boolean z = false;
            ScrollState scroll = ScrollKt.rememberScrollState(LiveLiterals$SimpleCardKt.INSTANCE.m3019Int$arg0$callrememberScrollState$valscroll$fun$anonymous$$arg9$callCardBox$funSimpleCard(), composer, 0, 0);
            composer.startReplaceableGroup(-1340657265);
            ComposerKt.sourceInformation(composer, "34@1116L227");
            if (this.$text.length() > 0) {
                z = true;
            }
            if (z) {
                Composer composer2 = composer;
                TextKt.m754TextfLXpl1I(this.$text, this.$textScrollable ? ScrollKt.verticalScroll$default(Modifier.Companion, scroll, false, (FlingBehavior) null, false, 14, (Object) null) : Modifier.Companion, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.m2270boximpl(this.$justifyText ? TextAlign.Companion.m2279getJustifye0LSkKk() : TextAlign.Companion.m2282getStarte0LSkKk()), 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer, (this.$$dirty >> 6) & 14, 0, 65020);
            }
            $composer.endReplaceableGroup();
            this.$content.invoke($composer, Integer.valueOf((this.$$dirty >> 27) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
        Composer composer3 = composer;
    }
}
