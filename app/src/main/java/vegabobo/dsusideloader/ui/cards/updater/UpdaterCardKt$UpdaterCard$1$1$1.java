package vegabobo.dsusideloader.ui.cards.updater;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.about.UpdaterCardState;

/* compiled from: UpdaterCard.kt */
public final class UpdaterCardKt$UpdaterCard$1$1$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function0 $onClickImage;
    public final /* synthetic */ UpdaterCardState $uiState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdaterCardKt$UpdaterCard$1$1$1(UpdaterCardState updaterCardState, Function0 function0, int i) {
        super(2);
        this.$uiState = updaterCardState;
        this.$onClickImage = function0;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r45, int r46) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            r2 = r46
            java.lang.String r3 = "C74@2928L1278:UpdaterCard.kt#ogv8z"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r2 & 11
            r4 = 2
            if (r3 != r4) goto L_0x001c
            boolean r3 = r45.getSkipping()
            if (r3 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r45.skipToGroupEnd()
            goto L_0x0308
        L_0x001c:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x002b
            r3 = -1
            java.lang.String r5 = "vegabobo.dsusideloader.ui.cards.updater.UpdaterCard.<anonymous>.<anonymous>.<anonymous> (UpdaterCard.kt:73)"
            r6 = -171530638(0xfffffffff5c6a672, float:-5.0363803E32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x002b:
            vegabobo.dsusideloader.ui.screen.about.UpdaterCardState r3 = r0.$uiState
            kotlin.jvm.functions.Function0 r5 = r0.$onClickImage
            int r6 = r0.$$dirty
            r7 = 0
            r8 = 0
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.Companion
            r10 = r9
            androidx.compose.ui.Alignment$Companion r11 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r12 = r11.getTopStart()
            r13 = 0
            int r14 = r7 >> 3
            r14 = r14 & 14
            int r15 = r7 >> 3
            r15 = r15 & 112(0x70, float:1.57E-43)
            r14 = r14 | r15
            androidx.compose.ui.layout.MeasurePolicy r14 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r12, r13, r1, r14)
            int r15 = r7 << 3
            r15 = r15 & 112(0x70, float:1.57E-43)
            r16 = 0
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r18 = 6
            r19 = 0
            r0 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r2 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r2)
            java.lang.Object r20 = r1.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r45)
            r4 = r20
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r19 = r18
            r18 = 6
            r20 = 0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r2)
            r0 = r19
            java.lang.Object r19 = r1.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r45)
            r0 = r19
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r19 = r18
            r18 = 6
            r20 = 0
            r22 = r8
            r8 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r8, r2)
            r2 = r19
            java.lang.Object r8 = r1.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r45)
            r2 = r8
            androidx.compose.ui.platform.ViewConfiguration r2 = (androidx.compose.ui.platform.ViewConfiguration) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r18 = r8.getConstructor()
            kotlin.jvm.functions.Function3 r19 = androidx.compose.ui.layout.LayoutKt.materializerOf(r10)
            r20 = r10
            int r10 = r15 << 9
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 6
            r21 = r18
            r18 = r19
            r19 = 0
            r23 = r12
            androidx.compose.runtime.Applier r12 = r45.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x00df
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00df:
            r45.startReusableNode()
            boolean r12 = r45.getInserting()
            if (r12 == 0) goto L_0x00ee
            r12 = r21
            r1.createNode(r12)
            goto L_0x00f3
        L_0x00ee:
            r12 = r21
            r45.useNode()
        L_0x00f3:
            r45.disableReusing()
            r21 = r12
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.m972constructorimpl(r45)
            r24 = 0
            r25 = r13
            kotlin.jvm.functions.Function2 r13 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m973setimpl(r12, r14, r13)
            kotlin.jvm.functions.Function2 r13 = r8.getSetDensity()
            androidx.compose.runtime.Updater.m973setimpl(r12, r4, r13)
            kotlin.jvm.functions.Function2 r13 = r8.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m973setimpl(r12, r0, r13)
            kotlin.jvm.functions.Function2 r8 = r8.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m973setimpl(r12, r2, r8)
            r45.enableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.SkippableUpdater.m967constructorimpl(r45)
            androidx.compose.runtime.SkippableUpdater r8 = androidx.compose.runtime.SkippableUpdater.m966boximpl(r8)
            int r12 = r10 >> 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = r18
            r13.invoke(r8, r1, r12)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r8)
            int r8 = r10 >> 9
            r8 = r8 & 14
            r12 = r45
            r18 = 0
            r24 = r0
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r1 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r1 = r7 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            r37 = r12
            r38 = 0
            r39 = r1
            r1 = -1356675754(0xffffffffaf22c556, float:-1.4803922E-10)
            r40 = r2
            java.lang.String r2 = "C88@3534L34,89@3601L54,97@4008L18,98@4062L46,91@3729L459:UpdaterCard.kt#ogv8z"
            r41 = r4
            r4 = r37
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r1, r2)
            vegabobo.dsusideloader.ui.cards.updater.LiveLiterals$UpdaterCardKt r1 = vegabobo.dsusideloader.ui.cards.updater.LiveLiterals$UpdaterCardKt.INSTANCE
            int r2 = r1.m2911Int$$$this$call$getdp$$arg0$callsize$$$this$callalign$valprogressBarModifier$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
            r26 = 0
            r37 = r7
            float r7 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r7)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m248size3ABfNKs(r9, r2)
            androidx.compose.ui.Alignment r7 = r11.getCenter()
            androidx.compose.ui.Modifier r26 = r0.align(r2, r7)
            r2 = -1356675612(0xffffffffaf22c5e4, float:-1.4804119E-10)
            r4.startReplaceableGroup(r2)
            java.lang.String r2 = "79@3150L57"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r2)
            boolean r2 = vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt.UpdaterCard$isCheckingForUpdates(r3)
            if (r2 == 0) goto L_0x01a5
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 6
            r30 = r4
            androidx.compose.material3.ProgressIndicatorKt.m681CircularProgressIndicatoraMcp0Q(r26, r27, r29, r30, r31, r32)
        L_0x01a5:
            r4.endReplaceableGroup()
            r2 = -1356675458(0xffffffffaf22c67e, float:-1.4804333E-10)
            r4.startReplaceableGroup(r2)
            java.lang.String r2 = "82@3303L172"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r2)
            boolean r2 = r3.isDownloading()
            if (r2 == 0) goto L_0x01cc
            float r27 = r3.getProgressBar()
            r29 = 0
            r31 = 0
            r33 = 0
            r34 = 12
            r28 = r26
            r32 = r4
            androidx.compose.material3.ProgressIndicatorKt.m680CircularProgressIndicatorMBs18nI(r27, r28, r29, r31, r32, r33, r34)
        L_0x01cc:
            r4.endReplaceableGroup()
            r2 = 0
            r7 = r2
            r27 = 0
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r2)
            r2 = 0
            r28 = r4
            r29 = 0
            r30 = r2
            java.lang.Object r2 = r28.rememberedValue()
            r31 = 0
            androidx.compose.runtime.Composer$Companion r35 = androidx.compose.runtime.Composer.Companion
            r32 = r7
            java.lang.Object r7 = r35.getEmpty()
            if (r2 != r7) goto L_0x0212
            r7 = 0
            boolean r33 = r1.m2901Boolean$arg0$callmutableStateOf$fun$anonymous$$arg0$callremember$valselected$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
            r36 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r33)
            r33 = r7
            r7 = 0
            r42 = r8
            r8 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r7, r8, r7)
            r7 = r28
            r7.updateRememberedValue(r2)
            goto L_0x0218
        L_0x0212:
            r36 = r2
            r42 = r8
            r7 = r28
        L_0x0218:
            r4.endReplaceableGroup()
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            java.lang.Object r7 = r2.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0230
            float r7 = r1.m2905Float$branch$if$arg0$callanimateFloatAsState$valscale$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
            goto L_0x0234
        L_0x0230:
            float r7 = r1.m2906Float$else$if$arg0$callanimateFloatAsState$valscale$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
        L_0x0234:
            r27 = r7
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 14
            r31 = r4
            androidx.compose.runtime.State r7 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r27, r28, r29, r30, r31, r32, r33)
            boolean r3 = vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt.UpdaterCard$isDownloading(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.setValue(r3)
            int r3 = r1.m2912Int$$$this$call$getdp$$arg0$callsize$$$this$callscale$$$this$callclip$$$this$callalign$$$this$callclickable$valtmp0_modifier$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
            r8 = 0
            r17 = r2
            float r2 = (float) r3
            float r2 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m248size3ABfNKs(r9, r2)
            java.lang.Object r3 = r7.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.ScaleKt.scale(r2, r3)
            androidx.compose.foundation.shape.RoundedCornerShape r3 = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.ClipKt.clip(r2, r3)
            androidx.compose.ui.Alignment r3 = r11.getCenter()
            androidx.compose.ui.Modifier r27 = r0.align(r2, r3)
            r28 = 0
            r29 = 0
            int r2 = r6 >> 6
            r2 = r2 & 14
            r3 = 0
            r6 = 1157296644(0x44faf204, float:2007.563)
            r4.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r6)
            boolean r6 = r4.changed((java.lang.Object) r5)
            r8 = r4
            r9 = 0
            java.lang.Object r11 = r8.rememberedValue()
            r31 = 0
            if (r6 != 0) goto L_0x02ae
            r43 = r0
            java.lang.Object r0 = r35.getEmpty()
            if (r11 != r0) goto L_0x02ac
            goto L_0x02b0
        L_0x02ac:
            r0 = r11
            goto L_0x02bd
        L_0x02ae:
            r43 = r0
        L_0x02b0:
            r0 = 0
            r32 = r0
            vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt$UpdaterCard$1$1$1$1$1$1 r0 = new vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt$UpdaterCard$1$1$1$1$1$1
            r0.<init>(r5)
            r8.updateRememberedValue(r0)
        L_0x02bd:
            r4.endReplaceableGroup()
            r31 = r0
            kotlin.jvm.functions.Function0 r31 = (kotlin.jvm.functions.Function0) r31
            r32 = 7
            r33 = 0
            androidx.compose.ui.Modifier r29 = androidx.compose.foundation.ClickableKt.m101clickableXHw0xAI$default(r27, r28, r29, r30, r31, r32, r33)
            int r0 = vegabobo.dsusideloader.C0000R$drawable.app_icon_mini
            r2 = 0
            androidx.compose.ui.graphics.painter.Painter r27 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(r0, r4, r2)
            java.lang.String r28 = r1.m2918String$arg1$callImage$fun$anonymous$$arg3$callBox$fun$anonymous$$arg7$callSurface$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg9$callSimpleCard$funUpdaterCard()
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 8
            r36 = 120(0x78, float:1.68E-43)
            r34 = r4
            androidx.compose.foundation.ImageKt.Image(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r45.endReplaceableGroup()
            r45.endNode()
            r45.endReplaceableGroup()
            r45.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0308
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0308:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt$UpdaterCard$1$1$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
