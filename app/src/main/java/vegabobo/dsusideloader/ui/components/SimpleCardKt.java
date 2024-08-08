package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: SimpleCard.kt */
public abstract class SimpleCardKt {
    /* renamed from: SimpleCard-Yod850M  reason: not valid java name */
    public static final void m3027SimpleCardYod850M(Modifier modifier, String cardTitle, String text, boolean addToggle, boolean isToggleEnabled, long cardColor, boolean justifyText, boolean textScrollable, boolean addPadding, Function2 content, Composer $composer, int $changed, int i) {
        String text2;
        boolean addToggle2;
        boolean isToggleEnabled2;
        long cardColor2;
        boolean z;
        boolean z2;
        boolean addPadding2;
        Function2 content2;
        boolean addPadding3;
        boolean textScrollable2;
        boolean justifyText2;
        long cardColor3;
        boolean isToggleEnabled3;
        boolean addToggle3;
        String text3;
        String cardTitle2;
        Modifier modifier2;
        int $dirty;
        boolean textScrollable3;
        String cardTitle3;
        boolean justifyText3;
        Function2 content3;
        Modifier modifier3;
        Modifier modifier4;
        Modifier modifier5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = $changed;
        int i11 = i;
        Composer $composer2 = $composer.startRestartGroup(-258752245);
        ComposerKt.sourceInformation($composer2, "C(SimpleCard)P(7,3,8,1,5,2:c#ui.graphics.Color,6,9)18@629L11,24@812L565:SimpleCard.kt#bcxyhz");
        int $dirty2 = $changed;
        int i12 = i11 & 1;
        if (i12 != 0) {
            $dirty2 |= 6;
            Modifier modifier6 = modifier;
        } else if ((i10 & 14) == 0) {
            $dirty2 |= $composer2.changed((Object) modifier) ? 4 : 2;
        } else {
            Modifier modifier7 = modifier;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) != 0) {
                String str = cardTitle;
            } else if ($composer2.changed((Object) cardTitle)) {
                i9 = 32;
                $dirty2 |= i9;
            }
            i9 = 16;
            $dirty2 |= i9;
        } else {
            String str2 = cardTitle;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                text2 = text;
                if ($composer2.changed((Object) text2)) {
                    i8 = 256;
                    $dirty2 |= i8;
                }
            } else {
                text2 = text;
            }
            i8 = 128;
            $dirty2 |= i8;
        } else {
            text2 = text;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                addToggle2 = addToggle;
                if ($composer2.changed(addToggle2)) {
                    i7 = 2048;
                    $dirty2 |= i7;
                }
            } else {
                addToggle2 = addToggle;
            }
            i7 = 1024;
            $dirty2 |= i7;
        } else {
            addToggle2 = addToggle;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                isToggleEnabled2 = isToggleEnabled;
                if ($composer2.changed(isToggleEnabled2)) {
                    i6 = 16384;
                    $dirty2 |= i6;
                }
            } else {
                isToggleEnabled2 = isToggleEnabled;
            }
            i6 = 8192;
            $dirty2 |= i6;
        } else {
            isToggleEnabled2 = isToggleEnabled;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                cardColor2 = cardColor;
                if ($composer2.changed(cardColor2)) {
                    i5 = 131072;
                    $dirty2 |= i5;
                }
            } else {
                cardColor2 = cardColor;
            }
            i5 = 65536;
            $dirty2 |= i5;
        } else {
            cardColor2 = cardColor;
        }
        if ((i10 & 3670016) == 0) {
            if ((i11 & 64) == 0) {
                z = justifyText;
                if ($composer2.changed(z)) {
                    i4 = 1048576;
                    $dirty2 |= i4;
                }
            } else {
                z = justifyText;
            }
            i4 = 524288;
            $dirty2 |= i4;
        } else {
            z = justifyText;
        }
        if ((i10 & 29360128) == 0) {
            if ((i11 & 128) == 0) {
                z2 = textScrollable;
                if ($composer2.changed(z2)) {
                    i3 = 8388608;
                    $dirty2 |= i3;
                }
            } else {
                z2 = textScrollable;
            }
            i3 = 4194304;
            $dirty2 |= i3;
        } else {
            z2 = textScrollable;
        }
        if ((i10 & 234881024) == 0) {
            if ((i11 & 256) == 0) {
                addPadding2 = addPadding;
                if ($composer2.changed(addPadding2)) {
                    i2 = 67108864;
                    $dirty2 |= i2;
                }
            } else {
                addPadding2 = addPadding;
            }
            i2 = 33554432;
            $dirty2 |= i2;
        } else {
            addPadding2 = addPadding;
        }
        int i13 = i11 & 512;
        if (i13 != 0) {
            $dirty2 |= 805306368;
            Function2 function2 = content;
        } else if ((i10 & 1879048192) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 536870912 : 268435456;
        } else {
            Function2 function22 = content;
        }
        if (($dirty2 & 1533916891) != 306783378 || !$composer2.getSkipping()) {
            $composer2.startDefaults();
            if ((i10 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i12 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier;
                }
                if ((i11 & 2) != 0) {
                    cardTitle3 = LiveLiterals$SimpleCardKt.INSTANCE.m3020String$paramcardTitle$funSimpleCard();
                    $dirty2 &= -113;
                } else {
                    cardTitle3 = cardTitle;
                }
                if ((i11 & 4) != 0) {
                    text2 = LiveLiterals$SimpleCardKt.INSTANCE.m3021String$paramtext$funSimpleCard();
                    $dirty2 &= -897;
                }
                if ((i11 & 8) != 0) {
                    addToggle2 = LiveLiterals$SimpleCardKt.INSTANCE.m3015Boolean$paramaddToggle$funSimpleCard();
                    $dirty2 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    isToggleEnabled2 = LiveLiterals$SimpleCardKt.INSTANCE.m3016Boolean$paramisToggleEnabled$funSimpleCard();
                    $dirty2 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    modifier5 = modifier4;
                    cardColor2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).m583getInverseOnSurface0d7_KjU();
                    $dirty2 &= -458753;
                } else {
                    modifier5 = modifier4;
                }
                if ((i11 & 64) != 0) {
                    justifyText3 = LiveLiterals$SimpleCardKt.INSTANCE.m3017Boolean$paramjustifyText$funSimpleCard();
                    $dirty2 &= -3670017;
                } else {
                    justifyText3 = z;
                }
                if ((i11 & 128) != 0) {
                    textScrollable3 = LiveLiterals$SimpleCardKt.INSTANCE.m3018Boolean$paramtextScrollable$funSimpleCard();
                    $dirty2 &= -29360129;
                } else {
                    textScrollable3 = z2;
                }
                if ((i11 & 256) != 0) {
                    addPadding2 = LiveLiterals$SimpleCardKt.INSTANCE.m3014Boolean$paramaddPadding$funSimpleCard();
                    $dirty2 &= -234881025;
                }
                if (i13 != 0) {
                    $dirty = $dirty2;
                    content3 = ComposableSingletons$SimpleCardKt.INSTANCE.m2934getLambda1$app_miniDebug();
                    modifier3 = modifier5;
                } else {
                    modifier3 = modifier5;
                    $dirty = $dirty2;
                    content3 = content;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    $dirty2 &= -113;
                }
                if ((i11 & 4) != 0) {
                    $dirty2 &= -897;
                }
                if ((i11 & 8) != 0) {
                    $dirty2 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    $dirty2 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    $dirty2 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    $dirty2 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    $dirty2 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    int i14 = -234881025 & $dirty2;
                    cardTitle3 = cardTitle;
                    content3 = content;
                    textScrollable3 = z2;
                    justifyText3 = z;
                    $dirty = i14;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    cardTitle3 = cardTitle;
                    textScrollable3 = z2;
                    justifyText3 = z;
                    $dirty = $dirty2;
                    content3 = content;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258752245, $dirty, -1, "vegabobo.dsusideloader.ui.components.SimpleCard (SimpleCard.kt:12)");
            }
            CardBoxKt.m2924CardBoxueL0Wzs(modifier3, cardTitle3, addToggle2, isToggleEnabled2, false, addPadding2, cardColor2, (Function1) null, (RoundedCornerShape) null, ComposableLambdaKt.composableLambda($composer2, -1748144452, true, new SimpleCardKt$SimpleCard$1(text2, justifyText3, textScrollable3, $dirty, content3)), $composer2, ($dirty & 14) | 805306368 | ($dirty & 112) | (($dirty >> 3) & 896) | (($dirty >> 3) & 7168) | (($dirty >> 9) & 458752) | (($dirty << 3) & 3670016), 400);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            content2 = content3;
            justifyText2 = justifyText3;
            cardTitle2 = cardTitle3;
            textScrollable2 = textScrollable3;
            text3 = text2;
            addToggle3 = addToggle2;
            isToggleEnabled3 = isToggleEnabled2;
            addPadding3 = addPadding2;
            cardColor3 = cardColor2;
            int i15 = $dirty;
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            content2 = content;
            int i16 = $dirty2;
            text3 = text2;
            addToggle3 = addToggle2;
            isToggleEnabled3 = isToggleEnabled2;
            addPadding3 = addPadding2;
            cardColor3 = cardColor2;
            textScrollable2 = z2;
            justifyText2 = z;
            cardTitle2 = cardTitle;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            Composer composer = $composer2;
            Modifier modifier8 = modifier2;
            String str3 = cardTitle2;
            return;
        }
        Modifier modifier9 = modifier2;
        SimpleCardKt$SimpleCard$2 simpleCardKt$SimpleCard$2 = r0;
        Composer composer2 = $composer2;
        String str4 = cardTitle2;
        SimpleCardKt$SimpleCard$2 simpleCardKt$SimpleCard$22 = new SimpleCardKt$SimpleCard$2(modifier2, cardTitle2, text3, addToggle3, isToggleEnabled3, cardColor3, justifyText2, textScrollable2, addPadding3, content2, $changed, i);
        endRestartGroup.updateScope(simpleCardKt$SimpleCard$2);
    }
}
