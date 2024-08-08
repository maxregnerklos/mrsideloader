package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTitle.kt */
public abstract class CardTitleKt {
    public static final void CardTitle(Modifier modifier, String cardTitle, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        Composer $composer2;
        String str = cardTitle;
        int i2 = $changed;
        int i3 = i;
        Intrinsics.checkNotNullParameter(str, "cardTitle");
        Composer $composer3 = $composer.startRestartGroup(-609604013);
        ComposerKt.sourceInformation($composer3, "C(CardTitle)P(1)12@450L22,18@641L10,13@477L196:CardTitle.kt#bcxyhz");
        int $dirty = $changed;
        int i4 = i3 & 1;
        if (i4 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed((Object) modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if ((i3 & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer3.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609604013, $dirty2, -1, "vegabobo.dsusideloader.ui.components.CardTitle (CardTitle.kt:11)");
            }
            LiveLiterals$CardTitleKt liveLiterals$CardTitleKt = LiveLiterals$CardTitleKt.INSTANCE;
            $composer2 = $composer3;
            TextKt.m754TextfLXpl1I(cardTitle, ScrollKt.horizontalScroll$default(modifier3, ScrollKt.rememberScrollState(liveLiterals$CardTitleKt.m2963Int$arg0$callrememberScrollState$valscroll$funCardTitle(), $composer3, 0, 0), false, (FlingBehavior) null, false, 14, (Object) null), 0, TextUnitKt.getSp(liveLiterals$CardTitleKt.m2962Int$$$this$call$getsp$$valtmp1_fontSize$funCardTitle()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, liveLiterals$CardTitleKt.m2964Int$arg13$callText$funCardTitle(), (Function1) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getHeadlineMedium(), $composer2, ($dirty2 >> 3) & 14, 0, 24564);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            $composer3.skipToGroupEnd();
            int i5 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            String str2 = cardTitle;
            int i6 = $changed;
            return;
        }
        endRestartGroup.updateScope(new CardTitleKt$CardTitle$1(modifier2, cardTitle, $changed, i));
    }
}
