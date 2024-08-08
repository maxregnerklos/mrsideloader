package vegabobo.dsusideloader.ui.cards;

/* compiled from: CopyableTextCard.kt */
public abstract class CopyableTextCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CopyableTextCard(java.lang.String r26, boolean r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r14 = r26
            r15 = r29
            r13 = r30
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -727837707(0xffffffffd49e13f5, float:-5.4315172E12)
            r1 = r28
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(CopyableTextCard)P(1)21@769L7,22@844L7,23@873L36,25@915L558:CopyableTextCard.kt#e34gdu"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r29
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0022
            r1 = r1 | 6
            goto L_0x0030
        L_0x0022:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x0030
            boolean r2 = r12.changed((java.lang.Object) r14)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r1 = r1 | r2
        L_0x0030:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0049
            r2 = r13 & 2
            if (r2 != 0) goto L_0x0043
            r2 = r27
            boolean r3 = r12.changed((boolean) r2)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0043:
            r2 = r27
        L_0x0045:
            r3 = 16
        L_0x0047:
            r1 = r1 | r3
            goto L_0x004b
        L_0x0049:
            r2 = r27
        L_0x004b:
            r3 = r1 & 91
            r4 = 18
            if (r3 != r4) goto L_0x005f
            boolean r3 = r12.getSkipping()
            if (r3 != 0) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            r12.skipToGroupEnd()
            r21 = r12
            goto L_0x0121
        L_0x005f:
            r12.startDefaults()
            r3 = r15 & 1
            if (r3 == 0) goto L_0x007a
            boolean r3 = r12.getDefaultsInvalid()
            if (r3 == 0) goto L_0x006d
            goto L_0x007a
        L_0x006d:
            r12.skipToGroupEnd()
            r3 = r13 & 2
            if (r3 == 0) goto L_0x008a
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r1
            r16 = r2
            goto L_0x008d
        L_0x007a:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x008a
            vegabobo.dsusideloader.ui.cards.LiveLiterals$CopyableTextCardKt r3 = vegabobo.dsusideloader.ui.cards.LiveLiterals$CopyableTextCardKt.INSTANCE
            boolean r2 = r3.m2842Boolean$paramshowToast$funCopyableTextCard()
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r1
            r16 = r2
            goto L_0x008d
        L_0x008a:
            r11 = r1
            r16 = r2
        L_0x008d:
            r12.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x009c
            r1 = -1
            java.lang.String r2 = "vegabobo.dsusideloader.ui.cards.CopyableTextCard (CopyableTextCard.kt:17)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r1, r2)
        L_0x009c:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            r1 = 0
            r2 = 0
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r4)
            java.lang.Object r5 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r17 = r5
            android.content.Context r17 = (android.content.Context) r17
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager()
            r1 = 0
            r2 = 0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r4)
            java.lang.Object r3 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r18 = r3
            androidx.compose.ui.platform.ClipboardManager r18 = (androidx.compose.ui.platform.ClipboardManager) r18
            int r0 = vegabobo.dsusideloader.C0001R$string.copied
            r1 = 0
            java.lang.String r19 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r12, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            vegabobo.dsusideloader.ui.cards.CopyableTextCardKt$CopyableTextCard$1 r5 = new vegabobo.dsusideloader.ui.cards.CopyableTextCardKt$CopyableTextCard$1
            r0 = r5
            r1 = r18
            r2 = r26
            r3 = r16
            r4 = r17
            r10 = r5
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 837846125(0x31f0846d, float:6.9999744E-9)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r1, r10)
            int r0 = r11 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r24 = r0 | r1
            r25 = 507(0x1fb, float:7.1E-43)
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r20
            r7 = 0
            r8 = r22
            r9 = r23
            r20 = r11
            r11 = r12
            r21 = r12
            r12 = r24
            r13 = r25
            vegabobo.dsusideloader.ui.components.SimpleCardKt.m3027SimpleCardYod850M(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x011d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x011d:
            r2 = r16
            r1 = r20
        L_0x0121:
            androidx.compose.runtime.ScopeUpdateScope r0 = r21.endRestartGroup()
            if (r0 != 0) goto L_0x0128
            goto L_0x0132
        L_0x0128:
            vegabobo.dsusideloader.ui.cards.CopyableTextCardKt$CopyableTextCard$2 r3 = new vegabobo.dsusideloader.ui.cards.CopyableTextCardKt$CopyableTextCard$2
            r4 = r30
            r3.<init>(r14, r2, r15, r4)
            r0.updateScope(r3)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.cards.CopyableTextCardKt.CopyableTextCard(java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
