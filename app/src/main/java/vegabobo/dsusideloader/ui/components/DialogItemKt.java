package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogItem.kt */
public abstract class DialogItemKt {
    /* renamed from: DialogItem-ww6aTOc  reason: not valid java name */
    public static final void m2935DialogItemww6aTOc(ImageVector icon, String title, String text, long textColor, Composer $composer, int $changed, int i) {
        long j;
        Composer $composer2;
        long textColor2;
        Function0 factory$iv$iv$iv;
        ImageVector imageVector = icon;
        String str = title;
        String str2 = text;
        int i2 = $changed;
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "text");
        Composer $composer3 = $composer.startRestartGroup(174266202);
        ComposerKt.sourceInformation($composer3, "C(DialogItem)P(!1,3!,2:c#ui.graphics.Color)25@837L676:DialogItem.kt#bcxyhz");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if ((i2 & 14) == 0) {
            $dirty |= $composer3.changed((Object) imageVector) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
        } else if ((i2 & 112) == 0) {
            $dirty |= $composer3.changed((Object) str) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty |= 384;
        } else if ((i2 & 896) == 0) {
            $dirty |= $composer3.changed((Object) str2) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            j = textColor;
        } else if ((i2 & 7168) == 0) {
            j = textColor;
            $dirty |= $composer3.changed(j) ? 2048 : 1024;
        } else {
            j = textColor;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 5851) != 1170 || !$composer3.getSkipping()) {
            if (i3 != 0) {
                textColor2 = Color.Companion.m1201getUnspecified0d7_KjU();
            } else {
                textColor2 = j;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(174266202, $dirty2, -1, "vegabobo.dsusideloader.ui.components.DialogItem (DialogItem.kt:19)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical verticalAlignment$iv = companion.getCenterVertically();
            $composer3.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer3, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal horizontalArrangement$iv = arrangement.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            $composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density$iv$iv = (Density) consume;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer3.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer3.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 factory$iv$iv$iv2 = companion2.getConstructor();
            int $changed$iv$iv$iv = ((((384 << 3) & 112) << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(modifier$iv);
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer3.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer3.useNode();
            }
            $composer3.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer3);
            Arrangement.Horizontal horizontalArrangement$iv2 = horizontalArrangement$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion2.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion2.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion2.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion2.getSetViewConfiguration());
            $composer3.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer3)), $composer3, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            $composer3.startReplaceableGroup(2058660585);
            int i4 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            int i5 = ((384 >> 6) & 112) | 6;
            Composer $composer4 = $composer$iv;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer4, 370516194, "C30@1037L11,26@899L250,34@1158L349:DialogItem.kt#bcxyhz");
            LiveLiterals$DialogItemKt liveLiterals$DialogItemKt = LiveLiterals$DialogItemKt.INSTANCE;
            ViewConfiguration viewConfiguration = viewConfiguration$iv$iv;
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            Density density = density$iv$iv;
            Function3 function3 = skippableUpdate$iv$iv$iv;
            Composer $composer$iv2 = $composer$iv;
            MeasurePolicy measurePolicy = measurePolicy$iv;
            Function0 function0 = factory$iv$iv$iv;
            Composer $composer5 = $composer3;
            Arrangement.Horizontal horizontal = horizontalArrangement$iv2;
            Composer $composer6 = $composer4;
            IconKt.m669Iconww6aTOc(icon, liveLiterals$DialogItemKt.m2981String$arg1$callIcon$fun$anonymous$$arg3$callRow$funDialogItem(), PaddingKt.m225paddingqDBjuR0$default(SizeKt.m248size3ABfNKs(modifier$iv, Dp.m2350constructorimpl((float) liveLiterals$DialogItemKt.m2977Int$$$this$call$getdp$$arg0$callsize$$$this$callpadding$valtmp0_modifier$fun$anonymous$$arg3$callRow$funDialogItem())), 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$DialogItemKt.m2978Int$$$this$call$getdp$$arg2$callpadding$valtmp0_modifier$fun$anonymous$$arg3$callRow$funDialogItem()), 0.0f, 11, (Object) null), MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).m594getOnSurfaceVariant0d7_KjU(), $composer4, $dirty2 & 14, 0);
            Modifier modifier$iv2 = PaddingKt.m221padding3ABfNKs(modifier$iv, Dp.m2350constructorimpl((float) liveLiterals$DialogItemKt.m2976Int$$$this$call$getdp$$arg0$callpadding$arg0$callColumn$fun$anonymous$$arg3$callRow$funDialogItem()));
            $composer6.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation($composer6, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = arrangement.getTop();
            Alignment.Horizontal horizontalAlignment$iv = companion.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer6, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer6.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = $composer6.consume(this_$iv$iv$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            Density density$iv$iv2 = (Density) consume4;
            CompositionLocal this_$iv$iv$iv5 = CompositionLocalsKt.getLocalLayoutDirection();
            Arrangement.Vertical vertical = verticalArrangement$iv;
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = $composer6.consume(this_$iv$iv$iv5);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            LayoutDirection layoutDirection$iv$iv2 = (LayoutDirection) consume5;
            CompositionLocal this_$iv$iv$iv6 = CompositionLocalsKt.getLocalViewConfiguration();
            Alignment.Horizontal horizontal2 = horizontalAlignment$iv;
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = $composer6.consume(this_$iv$iv$iv6);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            ViewConfiguration viewConfiguration$iv$iv2 = (ViewConfiguration) consume6;
            Function0 factory$iv$iv$iv3 = companion2.getConstructor();
            Function3 skippableUpdate$iv$iv$iv2 = LayoutKt.materializerOf(modifier$iv2);
            int $changed$iv$iv$iv2 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer6.startReusableNode();
            if ($composer6.getInserting()) {
                $composer6.createNode(factory$iv$iv$iv3);
            } else {
                $composer6.useNode();
            }
            $composer6.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv2 = Updater.m972constructorimpl($composer6);
            Modifier modifier = modifier$iv2;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, measurePolicy$iv2, companion2.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, density$iv$iv2, companion2.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, layoutDirection$iv$iv2, companion2.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, viewConfiguration$iv$iv2, companion2.getSetViewConfiguration());
            $composer6.enableReusing();
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer6)), $composer6, Integer.valueOf(($changed$iv$iv$iv2 >> 3) & 112));
            $composer6.startReplaceableGroup(2058660585);
            Composer $composer$iv3 = $composer6;
            int i6 = ($changed$iv$iv$iv2 >> 9) & 14;
            Density density2 = density$iv$iv2;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            int i7 = ((0 >> 6) & 112) | 6;
            Composer $composer7 = $composer$iv3;
            Composer composer = $composer7;
            Composer composer2 = $composer7;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer $composer8 = $composer6;
            Composer $composer9 = $composer7;
            ComposerKt.sourceInformationMarkerStart($composer9, 891850163, "C35@1203L118,40@1334L163:DialogItem.kt#bcxyhz");
            Alignment.Vertical vertical2 = verticalAlignment$iv;
            int $dirty3 = $dirty2;
            Composer $composer10 = $composer8;
            $composer2 = $composer5;
            Function3 function32 = skippableUpdate$iv$iv$iv2;
            TextKt.m754TextfLXpl1I(title, (Modifier) null, textColor2, TextUnitKt.getSp(liveLiterals$DialogItemKt.m2979Int$$$this$call$getsp$$valtmp0_fontSize$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callRow$funDialogItem()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, composer2, (($dirty3 >> 3) & 14) | (($dirty3 >> 3) & 896), 0, 65522);
            TextKt.m754TextfLXpl1I(text, (Modifier) null, textColor2, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, TextOverflow.Companion.m2313getEllipsisgIe3tQ8(), false, liveLiterals$DialogItemKt.m2980Int$arg13$callText1$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callRow$funDialogItem(), (Function1) null, (TextStyle) null, composer, (($dirty3 >> 6) & 14) | (($dirty3 >> 3) & 896), 48, 55290);
            ComposerKt.sourceInformationMarkerEnd($composer9);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer10.endReplaceableGroup();
            $composer10.endNode();
            $composer10.endReplaceableGroup();
            $composer10.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer10);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            $composer2.endReplaceableGroup();
            $composer2.endNode();
            $composer2.endReplaceableGroup();
            $composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer3.skipToGroupEnd();
            textColor2 = j;
            int i8 = $dirty2;
            $composer2 = $composer3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogItemKt$DialogItem$2(icon, title, text, textColor2, $changed, i));
        }
    }
}
