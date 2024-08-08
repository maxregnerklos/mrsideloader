package vegabobo.dsusideloader.ui.cards;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.buttons.PrimaryButtonKt;

/* compiled from: CopyableTextCard.kt */
public final class CopyableTextCardKt$CopyableTextCard$1 extends Lambda implements Function2 {
    public final /* synthetic */ ClipboardManager $clipboardManager;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $copiedText;
    public final /* synthetic */ boolean $showToast;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CopyableTextCardKt$CopyableTextCard$1(ClipboardManager clipboardManager, String str, boolean z, Context context, String str2) {
        super(2);
        this.$clipboardManager = clipboardManager;
        this.$text = str;
        this.$showToast = z;
        this.$context = context;
        this.$copiedText = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Function0 factory$iv$iv$iv;
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C28@980L476:CopyableTextCard.kt#e34gdu");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837846125, i, -1, "vegabobo.dsusideloader.ui.cards.CopyableTextCard.<anonymous> (CopyableTextCard.kt:27)");
            }
            ClipboardManager clipboardManager = this.$clipboardManager;
            String str = this.$text;
            boolean z = this.$showToast;
            Context context = this.$context;
            String str2 = this.$copiedText;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            Modifier.Companion companion2 = companion;
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            CompositionLocal this_$iv$iv$iv = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(this_$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density density$iv$iv = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd($composer);
            LayoutDirection layoutDirection$iv$iv = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd($composer);
            ViewConfiguration viewConfiguration$iv$iv = (ViewConfiguration) consume3;
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(companion2);
            Modifier.Companion companion4 = companion2;
            int $changed$iv$iv$iv = ((((0 << 3) & 112) << 9) & 7168) | 6;
            Function3 skippableUpdate$iv$iv$iv = materializerOf;
            Function0 factory$iv$iv$iv2 = constructor;
            Arrangement.Horizontal horizontalArrangement$iv2 = horizontalArrangement$iv;
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                composer.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv2;
                $composer.useNode();
            }
            $composer.disableReusing();
            Function0 factory$iv$iv$iv3 = factory$iv$iv$iv;
            Composer $this$Layout_u24lambda_u2d0$iv$iv = Updater.m972constructorimpl($composer);
            Alignment.Vertical verticalAlignment$iv2 = verticalAlignment$iv;
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, measurePolicy$iv, companion3.getSetMeasurePolicy());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, density$iv$iv, companion3.getSetDensity());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, layoutDirection$iv$iv, companion3.getSetLayoutDirection());
            Updater.m973setimpl($this$Layout_u24lambda_u2d0$iv$iv, viewConfiguration$iv$iv, companion3.getSetViewConfiguration());
            $composer.enableReusing();
            Function3 skippableUpdate$iv$iv$iv2 = skippableUpdate$iv$iv$iv;
            skippableUpdate$iv$iv$iv2.invoke(SkippableUpdater.m966boximpl(SkippableUpdater.m967constructorimpl($composer)), composer, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            int i2 = ($changed$iv$iv$iv >> 9) & 14;
            Composer $composer$iv = $composer;
            LayoutDirection layoutDirection = layoutDirection$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            Density density = density$iv$iv;
            RowScope $this$invoke_u24lambda_u240 = RowScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            Function3 skippableUpdate$iv$iv$iv3 = skippableUpdate$iv$iv$iv2;
            Composer $composer2 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer2, 1693618884, "C29@1002L38,31@1099L39,30@1057L385:CopyableTextCard.kt#e34gdu");
            MeasurePolicy measurePolicy = measurePolicy$iv;
            Composer $composer3 = $composer2;
            Function3 function3 = skippableUpdate$iv$iv$iv3;
            Alignment.Vertical vertical = verticalAlignment$iv2;
            SpacerKt.Spacer(RowScope.weight$default($this$invoke_u24lambda_u240, companion, LiveLiterals$CopyableTextCardKt.INSTANCE.m2843Float$arg0$callweight$arg0$callSpacer$fun$anonymous$$arg3$callRow$fun$anonymous$$arg9$callSimpleCard$funCopyableTextCard(), false, 2, (Object) null), $composer3, 0);
            Function0 function0 = factory$iv$iv$iv3;
            Arrangement.Horizontal horizontal = horizontalArrangement$iv2;
            PrimaryButtonKt.PrimaryButton((Modifier) null, StringResources_androidKt.stringResource(C0001R$string.copy_text, $composer3, 0), new CopyableTextCardKt$CopyableTextCard$1$1$1(clipboardManager, str, z, context, str2), false, $composer3, 0, 9);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer.endReplaceableGroup();
            $composer.endNode();
            $composer.endReplaceableGroup();
            $composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
