package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferenceItem.kt */
public abstract class PreferenceItemKt {
    public static final void PreferenceItem(String title, String description, ImageVector icon, Function1 onClick, boolean isChecked, boolean showToggle, boolean isEnabled, Composer $composer, int $changed, int i) {
        String description2;
        ImageVector imageVector;
        Function1 onClick2;
        boolean isChecked2;
        boolean showToggle2;
        boolean isEnabled2;
        Composer $composer2;
        boolean showToggle3;
        ImageVector icon2;
        String description3;
        boolean isChecked3;
        Function1 onClick3;
        boolean isEnabled3;
        Function1 onClick4;
        boolean isChecked4;
        int $dirty;
        Object value$iv$iv;
        Composer $composer3;
        String str;
        Composer $composer$iv;
        boolean z;
        int $dirty2;
        String str2;
        Function0 factory$iv$iv$iv;
        Modifier.Companion companion;
        Object value$iv$iv2;
        ImageVector icon3;
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = title;
        int i6 = $changed;
        Intrinsics.checkNotNullParameter(str3, "title");
        Composer $composer4 = $composer.startRestartGroup(-488967702);
        ComposerKt.sourceInformation($composer4, "C(PreferenceItem)P(6!2,4!1,5)35@1239L22,31@1089L1550:PreferenceItem.kt#bcxyhz");
        int $dirty3 = $changed;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if ((i6 & 14) == 0) {
            $dirty3 |= $composer4.changed((Object) str3) ? 4 : 2;
        }
        if ((i6 & 112) == 0) {
            if ((i & 2) == 0) {
                description2 = description;
                if ($composer4.changed((Object) description2)) {
                    i5 = 32;
                    $dirty3 |= i5;
                }
            } else {
                description2 = description;
            }
            i5 = 16;
            $dirty3 |= i5;
        } else {
            description2 = description;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty3 |= 384;
            imageVector = icon;
        } else if ((i6 & 896) == 0) {
            imageVector = icon;
            $dirty3 |= $composer4.changed((Object) imageVector) ? 256 : 128;
        } else {
            imageVector = icon;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty3 |= 3072;
            onClick2 = onClick;
        } else if ((i6 & 7168) == 0) {
            onClick2 = onClick;
            $dirty3 |= $composer4.changedInstance(onClick2) ? 2048 : 1024;
        } else {
            onClick2 = onClick;
        }
        if ((i6 & 57344) == 0) {
            if ((i & 16) == 0) {
                isChecked2 = isChecked;
                if ($composer4.changed(isChecked2)) {
                    i4 = 16384;
                    $dirty3 |= i4;
                }
            } else {
                isChecked2 = isChecked;
            }
            i4 = 8192;
            $dirty3 |= i4;
        } else {
            isChecked2 = isChecked;
        }
        if ((458752 & i6) == 0) {
            if ((i & 32) == 0) {
                showToggle2 = showToggle;
                if ($composer4.changed(showToggle2)) {
                    i3 = 131072;
                    $dirty3 |= i3;
                }
            } else {
                showToggle2 = showToggle;
            }
            i3 = 65536;
            $dirty3 |= i3;
        } else {
            showToggle2 = showToggle;
        }
        if ((3670016 & i6) == 0) {
            if ((i & 64) == 0) {
                isEnabled2 = isEnabled;
                if ($composer4.changed(isEnabled2)) {
                    i2 = 1048576;
                    $dirty3 |= i2;
                }
            } else {
                isEnabled2 = isEnabled;
            }
            i2 = 524288;
            $dirty3 |= i2;
        } else {
            isEnabled2 = isEnabled;
        }
        if ((2995931 & $dirty3) != 599186 || !$composer4.getSkipping()) {
            $composer4.startDefaults();
            if ((i6 & 1) == 0 || $composer4.getDefaultsInvalid()) {
                if ((i & 2) != 0) {
                    description2 = LiveLiterals$PreferenceItemKt.INSTANCE.m3013String$paramdescription$funPreferenceItem();
                    $dirty3 &= -113;
                }
                if (i7 != 0) {
                    icon3 = null;
                } else {
                    icon3 = imageVector;
                }
                if (i8 != 0) {
                    onClick2 = PreferenceItemKt$PreferenceItem$1.INSTANCE;
                }
                if ((i & 16) != 0) {
                    $dirty3 &= -57345;
                    isChecked2 = LiveLiterals$PreferenceItemKt.INSTANCE.m3000Boolean$paramisChecked$funPreferenceItem();
                }
                if (i != false && true) {
                    $dirty3 &= -458753;
                    showToggle2 = LiveLiterals$PreferenceItemKt.INSTANCE.m3002Boolean$paramshowToggle$funPreferenceItem();
                }
                if (i != false && true) {
                    $dirty = $dirty3 & -3670017;
                    description3 = description2;
                    icon2 = icon3;
                    isEnabled3 = LiveLiterals$PreferenceItemKt.INSTANCE.m3001Boolean$paramisEnabled$funPreferenceItem();
                    onClick4 = onClick2;
                    isChecked4 = isChecked2;
                    showToggle3 = showToggle2;
                } else {
                    $dirty = $dirty3;
                    description3 = description2;
                    icon2 = icon3;
                    onClick4 = onClick2;
                    isChecked4 = isChecked2;
                    showToggle3 = showToggle2;
                    isEnabled3 = isEnabled2;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty3 &= -113;
                }
                if ((i & 16) != 0) {
                    $dirty3 &= -57345;
                }
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                }
                if ((i & 64) != 0) {
                    $dirty3 &= -3670017;
                }
                $dirty = $dirty3;
                description3 = description2;
                icon2 = imageVector;
                onClick4 = onClick2;
                isChecked4 = isChecked2;
                showToggle3 = showToggle2;
                isEnabled3 = isEnabled2;
            }
            $composer4.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-488967702, $dirty, -1, "vegabobo.dsusideloader.ui.components.PreferenceItem (PreferenceItem.kt:22)");
            }
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, (Object) null);
            Object key2$iv = Boolean.valueOf(isChecked4);
            int i9 = (($dirty >> 9) & 14) | (($dirty >> 9) & 112);
            $composer4.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation($composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean invalid$iv$iv = $composer4.changed((Object) onClick4) | $composer4.changed(key2$iv);
            Composer $this$cache$iv$iv = $composer4;
            Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
            if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                value$iv$iv = new PreferenceItemKt$PreferenceItem$2$1(onClick4, isChecked4);
                $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
            } else {
                Composer composer = $this$cache$iv$iv;
                value$iv$iv = it$iv$iv;
            }
            $composer4.endReplaceableGroup();
            Modifier r0 = ClickableKt.m101clickableXHw0xAI$default(fillMaxWidth$default, isEnabled3, (String) null, (Role) null, (Function0) value$iv$iv, 6, (Object) null);
            LiveLiterals$PreferenceItemKt liveLiterals$PreferenceItemKt = LiveLiterals$PreferenceItemKt.INSTANCE;
            Modifier r02 = PaddingKt.m224paddingqDBjuR0(r0, Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3008Int$$$this$call$getdp$$valtmp1_start$valtmp6_modifier$funPreferenceItem()), Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3011Int$$$this$call$getdp$$valtmp4_top$valtmp6_modifier$funPreferenceItem()), Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3009Int$$$this$call$getdp$$valtmp2_end$valtmp6_modifier$funPreferenceItem()), Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3010Int$$$this$call$getdp$$valtmp3_bottom$valtmp6_modifier$funPreferenceItem()));
            $composer4.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer4, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal horizontalArrangement$iv = arrangement.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, centerVertically, $composer4, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            $composer4.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            Arrangement.Horizontal horizontalArrangement$iv2 = horizontalArrangement$iv;
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = $composer4.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Density density$iv$iv = (Density) consume;
            CompositionLocal this_$iv$iv$iv2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer4.consume(this_$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            CompositionLocal this_$iv$iv$iv3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer4.consume(this_$iv$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0 constructor = companion4.getConstructor();
            Function3 skippableUpdate$iv$iv$iv = LayoutKt.materializerOf(r02);
            int $changed$iv$iv$iv = ((((384 << 3) & 112) << 9) & 7168) | 6;
            Function0 factory$iv$iv$iv2 = constructor;
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                $composer4.createNode(factory$iv$iv$iv2);
            } else {
                $composer4.useNode();
            }
            $composer4.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer4);
            String str4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion4.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion4.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion4.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion4.getSetViewConfiguration());
            $composer4.enableReusing();
            skippableUpdate$iv$iv$iv.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer4)), $composer4, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            $composer4.startReplaceableGroup(2058660585);
            int i10 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv2 = $composer4;
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            int i11 = ((384 >> 6) & 112) | 6;
            RowScope $this$PreferenceItem_u24lambda_u244 = rowScope;
            Composer $composer5 = $composer$iv2;
            ViewConfiguration viewConfiguration$iv$iv2 = viewConfiguration$iv$iv;
            LayoutDirection layoutDirection$iv$iv2 = layoutDirection$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer5, -1236924578, "C50@1665L707:PreferenceItem.kt#bcxyhz");
            $composer5.startReplaceableGroup(-1236924578);
            ComposerKt.sourceInformation($composer5, "44@1490L156");
            if (icon2 != null) {
                int i12 = (($dirty >> 6) & 14) | 48;
                ViewConfiguration viewConfiguration = viewConfiguration$iv$iv2;
                LayoutDirection layoutDirection = layoutDirection$iv$iv2;
                Density density = density$iv$iv;
                $composer$iv = $composer$iv2;
                Function0 function0 = factory$iv$iv$iv2;
                str = str4;
                $composer3 = $composer5;
                MeasurePolicy measurePolicy = measurePolicy$iv;
                $dirty2 = $dirty;
                Arrangement.Horizontal horizontal = horizontalArrangement$iv2;
                z = true;
                str2 = "C:CompositionLocal.kt#9igjgp";
                IconKt.m669Iconww6aTOc(icon2, (String) null, PaddingKt.m225paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3007Int$$$this$call$getdp$$arg2$callpadding$arg2$callIcon$branch$if$fun$anonymous$$arg3$callRow$funPreferenceItem()), 0.0f, 11, (Object) null), 0, $composer5, i12, 8);
            } else {
                $composer$iv = $composer$iv2;
                Function0 function02 = factory$iv$iv$iv2;
                $composer3 = $composer5;
                MeasurePolicy measurePolicy2 = measurePolicy$iv;
                $dirty2 = $dirty;
                Arrangement.Horizontal horizontal2 = horizontalArrangement$iv2;
                str = str4;
                ViewConfiguration viewConfiguration2 = viewConfiguration$iv$iv2;
                LayoutDirection layoutDirection2 = layoutDirection$iv$iv2;
                z = true;
                str2 = "C:CompositionLocal.kt#9igjgp";
            }
            $composer3.endReplaceableGroup();
            Modifier modifier$iv = RowScope.weight$default($this$PreferenceItem_u24lambda_u244, companion3, liveLiterals$PreferenceItemKt.m3004Float$arg0$callweight$arg0$callRow$fun$anonymous$$arg3$callRow$funPreferenceItem(), false, 2, (Object) null);
            Composer $composer6 = $composer3;
            $composer6.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation($composer6, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv3 = arrangement.getStart();
            Alignment.Vertical verticalAlignment$iv = companion2.getTop();
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv3, verticalAlignment$iv, $composer6, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer6.startReplaceableGroup(-1323940314);
            String str5 = str;
            ComposerKt.sourceInformation($composer6, str5);
            CompositionLocal this_$iv$iv$iv4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, str2);
            Object consume4 = $composer6.consume(this_$iv$iv$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            Density density$iv$iv2 = (Density) consume4;
            CompositionLocal this_$iv$iv$iv5 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, str2);
            Object consume5 = $composer6.consume(this_$iv$iv$iv5);
            ComposerKt.sourceInformationMarkerEnd($composer6);
            LayoutDirection layoutDirection$iv$iv3 = (LayoutDirection) consume5;
            ComposerKt.sourceInformationMarkerStart($composer6, 2023513938, str2);
            Object consume6 = $composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd($composer6);
            ViewConfiguration viewConfiguration$iv$iv3 = (ViewConfiguration) consume6;
            Function0 constructor2 = companion4.getConstructor();
            Alignment.Vertical verticalAlignment$iv2 = verticalAlignment$iv;
            int $changed$iv$iv$iv2 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv3 = LayoutKt.materializerOf(modifier$iv);
            Function0 factory$iv$iv$iv3 = constructor2;
            Arrangement.Horizontal horizontalArrangement$iv4 = horizontalArrangement$iv3;
            if (!($composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer6.startReusableNode();
            if ($composer6.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv3;
                $composer6.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv3;
                $composer6.useNode();
            }
            $composer6.disableReusing();
            Function0 factory$iv$iv$iv4 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv2 = Updater.m972constructorimpl($composer6);
            boolean isChecked5 = isChecked4;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, measurePolicy$iv2, companion4.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, density$iv$iv2, companion4.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, layoutDirection$iv$iv3, companion4.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv2, viewConfiguration$iv$iv3, companion4.getSetViewConfiguration());
            $composer6.enableReusing();
            skippableUpdate$iv$iv$iv3.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer6)), $composer6, Integer.valueOf(($changed$iv$iv$iv2 >> 3) & 112));
            $composer6.startReplaceableGroup(2058660585);
            int i13 = ($changed$iv$iv$iv2 >> 9) & 14;
            Composer $composer$iv3 = $composer6;
            ViewConfiguration viewConfiguration$iv$iv4 = viewConfiguration$iv$iv3;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            int i14 = ((0 >> 6) & 112) | 6;
            Composer $composer7 = $composer$iv3;
            Density density$iv$iv3 = density$iv$iv2;
            ComposerKt.sourceInformationMarkerStart($composer7, -112465790, "C51@1717L645:PreferenceItem.kt#bcxyhz");
            Modifier modifier$iv2 = rowScope.align(companion3, companion2.getCenterVertically());
            $composer7.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation($composer7, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = arrangement.getTop();
            Alignment.Horizontal horizontalAlignment$iv = companion2.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer7, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            RowScopeInstance rowScopeInstance = rowScope;
            $composer7.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation($composer7, str5);
            CompositionLocal this_$iv$iv$iv6 = CompositionLocalsKt.getLocalDensity();
            Alignment.Horizontal horizontalAlignment$iv2 = horizontalAlignment$iv;
            ComposerKt.sourceInformationMarkerStart($composer7, 2023513938, str2);
            Object consume7 = $composer7.consume(this_$iv$iv$iv6);
            ComposerKt.sourceInformationMarkerEnd($composer7);
            Density density$iv$iv4 = (Density) consume7;
            CompositionLocal this_$iv$iv$iv7 = CompositionLocalsKt.getLocalLayoutDirection();
            Arrangement.Vertical verticalArrangement$iv2 = verticalArrangement$iv;
            ComposerKt.sourceInformationMarkerStart($composer7, 2023513938, str2);
            Object consume8 = $composer7.consume(this_$iv$iv$iv7);
            ComposerKt.sourceInformationMarkerEnd($composer7);
            LayoutDirection layoutDirection$iv$iv4 = (LayoutDirection) consume8;
            CompositionLocal this_$iv$iv$iv8 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart($composer7, 2023513938, str2);
            Object consume9 = $composer7.consume(this_$iv$iv$iv8);
            ComposerKt.sourceInformationMarkerEnd($composer7);
            ViewConfiguration viewConfiguration$iv$iv5 = (ViewConfiguration) consume9;
            Function0 factory$iv$iv$iv5 = companion4.getConstructor();
            Function3 skippableUpdate$iv$iv$iv4 = LayoutKt.materializerOf(modifier$iv2);
            LayoutDirection layoutDirection$iv$iv5 = layoutDirection$iv$iv3;
            int $changed$iv$iv$iv3 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            if (!($composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer7.startReusableNode();
            if ($composer7.getInserting()) {
                $composer7.createNode(factory$iv$iv$iv5);
            } else {
                $composer7.useNode();
            }
            $composer7.disableReusing();
            Composer $this$Layout_u24lambda_u2d0$iv$iv3 = Updater.m972constructorimpl($composer7);
            Function0 factory$iv$iv$iv6 = factory$iv$iv$iv5;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv3, measurePolicy$iv3, companion4.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv3, density$iv$iv4, companion4.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv3, layoutDirection$iv$iv4, companion4.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv3, viewConfiguration$iv$iv5, companion4.getSetViewConfiguration());
            $composer7.enableReusing();
            skippableUpdate$iv$iv$iv4.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer7)), $composer7, Integer.valueOf(($changed$iv$iv$iv3 >> 3) & 112));
            $composer7.startReplaceableGroup(2058660585);
            int i15 = ($changed$iv$iv$iv3 >> 9) & 14;
            Composer $composer$iv4 = $composer7;
            Density density$iv$iv5 = density$iv$iv4;
            ComposerKt.sourceInformationMarkerStart($composer$iv4, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            int i16 = ((0 >> 6) & 112) | 6;
            Composer $composer8 = $composer$iv4;
            Composer composer2 = $composer8;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer8, 1097179047, "C58@1969L10,55@1849L164:PreferenceItem.kt#bcxyhz");
            Alignment.Horizontal horizontal3 = horizontalAlignment$iv2;
            Function0 function03 = factory$iv$iv$iv6;
            ViewConfiguration viewConfiguration3 = viewConfiguration$iv$iv4;
            Composer $composer9 = $composer8;
            Function3 function3 = skippableUpdate$iv$iv$iv4;
            LayoutDirection layoutDirection3 = layoutDirection$iv$iv4;
            Arrangement.Vertical vertical = verticalArrangement$iv2;
            Density density2 = density$iv$iv3;
            MeasurePolicy measurePolicy3 = measurePolicy$iv3;
            Composer $composer$iv5 = $composer$iv4;
            LayoutDirection layoutDirection4 = layoutDirection$iv$iv5;
            MeasurePolicy measurePolicy4 = measurePolicy$iv2;
            Alignment.Vertical vertical2 = verticalAlignment$iv2;
            Function3 function32 = skippableUpdate$iv$iv$iv3;
            Arrangement.Horizontal horizontal4 = horizontalArrangement$iv4;
            Composer $composer10 = $composer7;
            Function0 function04 = factory$iv$iv$iv4;
            Composer $composer11 = $composer6;
            Modifier.Companion companion5 = companion3;
            ViewConfiguration viewConfiguration4 = viewConfiguration$iv$iv5;
            int $dirty4 = $dirty2;
            boolean isChecked6 = isChecked5;
            Composer $composer$iv6 = $composer$iv3;
            $composer2 = $composer4;
            Function1 onClick5 = onClick4;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i17 = MaterialTheme.$stable;
            RowScopeInstance rowScopeInstance2 = rowScopeInstance;
            Function3 function33 = skippableUpdate$iv$iv$iv2;
            Density density3 = density$iv$iv5;
            MaterialTheme materialTheme2 = materialTheme;
            int i18 = i17;
            TextKt.m754TextfLXpl1I(title, (Modifier) null, 0, TextUnitKt.getSp(liveLiterals$PreferenceItemKt.m3012Int$$$this$call$getsp$$arg3$callText$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callRow$fun$anonymous$$arg3$callRow$funPreferenceItem()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, materialTheme.getTypography($composer9, i17).getHeadlineMedium(), composer2, $dirty4 & 14, 0, 32758);
            Composer $composer12 = $composer9;
            $composer12.startReplaceableGroup(-112465477);
            ComposerKt.sourceInformation($composer12, "61@2082L29,64@2228L10,62@2132L198");
            if (description3.length() > 0 ? z : false) {
                companion = companion5;
                SpacerKt.Spacer(SizeKt.m243height3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3005Int$$$this$call$getdp$$arg0$callheight$arg0$callSpacer$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callRow$fun$anonymous$$arg3$callRow$funPreferenceItem())), $composer12, 0);
                TextKt.m754TextfLXpl1I(description3, AlphaKt.alpha(companion, liveLiterals$PreferenceItemKt.m3003Float$arg0$callalpha$valtmp1_modifier$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callRow$fun$anonymous$$arg3$callRow$funPreferenceItem()), 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, materialTheme2.getTypography($composer12, i18).getBodyMedium(), $composer12, ($dirty4 >> 3) & 14, 0, 32764);
            } else {
                companion = companion5;
            }
            $composer12.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer12);
            ComposerKt.sourceInformationMarkerEnd($composer$iv5);
            $composer10.endReplaceableGroup();
            $composer10.endNode();
            $composer10.endReplaceableGroup();
            $composer10.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer10);
            ComposerKt.sourceInformationMarkerEnd($composer$iv6);
            $composer11.endReplaceableGroup();
            $composer11.endNode();
            $composer11.endReplaceableGroup();
            $composer11.endReplaceableGroup();
            Composer $composer13 = $composer11;
            $composer13.startReplaceableGroup(1250017624);
            ComposerKt.sourceInformation($composer13, "74@2527L22,71@2411L212");
            if (showToggle3) {
                Modifier r4 = PaddingKt.m225paddingqDBjuR0$default(companion, Dp.m2350constructorimpl((float) liveLiterals$PreferenceItemKt.m3006Int$$$this$call$getdp$$arg0$callpadding$valtmp0_modifier$branch$if1$fun$anonymous$$arg3$callRow$funPreferenceItem()), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                Object key2$iv2 = Boolean.valueOf(isChecked6);
                int i19 = (($dirty4 >> 9) & 14) | (($dirty4 >> 9) & 112);
                $composer13.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation($composer13, "CC(remember)P(1,2):Composables.kt#9igjgp");
                onClick3 = onClick5;
                boolean invalid$iv$iv2 = $composer13.changed((Object) onClick3) | $composer13.changed(key2$iv2);
                Composer $this$cache$iv$iv2 = $composer13;
                Object it$iv$iv2 = $this$cache$iv$iv2.rememberedValue();
                if (invalid$iv$iv2 || it$iv$iv2 == Composer.Companion.getEmpty()) {
                    isChecked3 = isChecked6;
                    value$iv$iv2 = new PreferenceItemKt$PreferenceItem$3$2$1(onClick3, isChecked3);
                    $this$cache$iv$iv2.updateRememberedValue(value$iv$iv2);
                } else {
                    value$iv$iv2 = it$iv$iv2;
                    isChecked3 = isChecked6;
                }
                $composer13.endReplaceableGroup();
                SwitchKt.Switch(isChecked3, (Function1) value$iv$iv2, r4, (Function2) null, isEnabled3, (SwitchColors) null, (MutableInteractionSource) null, $composer13, (($dirty4 >> 12) & 14) | (($dirty4 >> 6) & 57344), 104);
            } else {
                isChecked3 = isChecked6;
                onClick3 = onClick5;
            }
            $composer13.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd($composer13);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer2.endReplaceableGroup();
            $composer2.endNode();
            $composer2.endReplaceableGroup();
            $composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isEnabled2 = isEnabled3;
        } else {
            $composer4.skipToGroupEnd();
            int i20 = $dirty3;
            description3 = description2;
            icon2 = imageVector;
            onClick3 = onClick2;
            showToggle3 = showToggle2;
            $composer2 = $composer4;
            isChecked3 = isChecked2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PreferenceItemKt$PreferenceItem$4(title, description3, icon2, onClick3, isChecked3, showToggle3, isEnabled2, $changed, i));
        }
    }
}
