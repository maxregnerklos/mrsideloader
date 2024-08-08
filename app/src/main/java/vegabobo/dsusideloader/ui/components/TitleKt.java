package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Title.kt */
public abstract class TitleKt {
    public static final void Title(String title, Modifier modifier, Composer $composer, int $changed, int i) {
        Modifier modifier2;
        Composer $composer2;
        String str = title;
        int i2 = $changed;
        int i3 = i;
        Intrinsics.checkNotNullParameter(str, "title");
        Composer $composer3 = $composer.startRestartGroup(2016231135);
        ComposerKt.sourceInformation($composer3, "C(Title)P(1)17@579L11,13@455L286:Title.kt#bcxyhz");
        int $dirty = $changed;
        if ((i3 & 1) != 0) {
            $dirty |= 6;
        } else if ((i2 & 14) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 4 : 2;
        }
        int i4 = i3 & 2;
        if (i4 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if ((i2 & 112) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed((Object) modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 91) != 18 || !$composer3.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2016231135, $dirty2, -1, "vegabobo.dsusideloader.ui.components.Title (Title.kt:12)");
            }
            LiveLiterals$TitleKt liveLiterals$TitleKt = LiveLiterals$TitleKt.INSTANCE;
            $composer2 = $composer3;
            TextKt.m754TextfLXpl1I(title, PaddingKt.m225paddingqDBjuR0$default(PaddingKt.m225paddingqDBjuR0$default(PaddingKt.m225paddingqDBjuR0$default(modifier3, Dp.m2350constructorimpl((float) liveLiterals$TitleKt.m3022Int$$$this$call$getdp$$arg0$callpadding$$$this$callpadding$$$this$callpadding$valtmp3_modifier$funTitle()), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$TitleKt.m3024Int$$$this$call$getdp$$arg3$callpadding$$$this$callpadding$valtmp3_modifier$funTitle()), 7, (Object) null), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$TitleKt.m3023Int$$$this$call$getdp$$arg1$callpadding$valtmp3_modifier$funTitle()), 0.0f, 0.0f, 13, (Object) null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).m602getSecondary0d7_KjU(), TextUnitKt.getSp(liveLiterals$TitleKt.m3025Int$$$this$call$getsp$$valtmp0_fontSize$funTitle()), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, $composer2, ($dirty2 & 14) | 196608, 0, 65488);
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
            String str2 = title;
            int i6 = $changed;
            return;
        }
        endRestartGroup.updateScope(new TitleKt$Title$1(title, modifier2, $changed, i));
    }
}
