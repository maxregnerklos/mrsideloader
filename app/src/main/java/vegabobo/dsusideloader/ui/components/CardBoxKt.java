package vegabobo.dsusideloader.ui.components;

/* compiled from: CardBox.kt */
public abstract class CardBoxKt {
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x07d9  */
    /* renamed from: CardBox-ueL0Wzs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2924CardBoxueL0Wzs(androidx.compose.ui.Modifier r86, java.lang.String r87, boolean r88, boolean r89, boolean r90, boolean r91, long r92, kotlin.jvm.functions.Function1 r94, androidx.compose.foundation.shape.RoundedCornerShape r95, kotlin.jvm.functions.Function3 r96, androidx.compose.runtime.Composer r97, int r98, int r99) {
        /*
            r14 = r96
            r15 = r98
            r13 = r99
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1280654815(0xffffffffb3aac221, float:-7.951554E-8)
            r1 = r97
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(CardBox)P(7,3,1,5,6!1,2:c#ui.graphics.Color,8,9)28@1085L11,33@1290L1337:CardBox.kt#bcxyhz"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            r0 = r98
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0024
            r0 = r0 | 6
            r2 = r86
            goto L_0x0037
        L_0x0024:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x0035
            r2 = r86
            boolean r3 = r12.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0032
            r3 = 4
            goto L_0x0033
        L_0x0032:
            r3 = 2
        L_0x0033:
            r0 = r0 | r3
            goto L_0x0037
        L_0x0035:
            r2 = r86
        L_0x0037:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0050
            r3 = r13 & 2
            if (r3 != 0) goto L_0x004a
            r3 = r87
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004a:
            r3 = r87
        L_0x004c:
            r4 = 16
        L_0x004e:
            r0 = r0 | r4
            goto L_0x0052
        L_0x0050:
            r3 = r87
        L_0x0052:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006b
            r4 = r13 & 4
            if (r4 != 0) goto L_0x0065
            r4 = r88
            boolean r5 = r12.changed((boolean) r4)
            if (r5 == 0) goto L_0x0067
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0065:
            r4 = r88
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r0 = r0 | r5
            goto L_0x006d
        L_0x006b:
            r4 = r88
        L_0x006d:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r13 & 8
            if (r5 != 0) goto L_0x0080
            r5 = r89
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0080:
            r5 = r89
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r89
        L_0x0088:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r15
            if (r6 != 0) goto L_0x00a3
            r6 = r13 & 16
            if (r6 != 0) goto L_0x009d
            r6 = r90
            boolean r7 = r12.changed((boolean) r6)
            if (r7 == 0) goto L_0x009f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009d:
            r6 = r90
        L_0x009f:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r7
            goto L_0x00a5
        L_0x00a3:
            r6 = r90
        L_0x00a5:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r15
            if (r7 != 0) goto L_0x00bf
            r7 = r13 & 32
            if (r7 != 0) goto L_0x00b9
            r7 = r91
            boolean r8 = r12.changed((boolean) r7)
            if (r8 == 0) goto L_0x00bb
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00b9:
            r7 = r91
        L_0x00bb:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r0 = r0 | r8
            goto L_0x00c1
        L_0x00bf:
            r7 = r91
        L_0x00c1:
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x00db
            r8 = r13 & 64
            if (r8 != 0) goto L_0x00d5
            r8 = r92
            boolean r10 = r12.changed((long) r8)
            if (r10 == 0) goto L_0x00d7
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d5:
            r8 = r92
        L_0x00d7:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r0 = r0 | r10
            goto L_0x00dd
        L_0x00db:
            r8 = r92
        L_0x00dd:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00e7
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r11
            r11 = r94
            goto L_0x00fe
        L_0x00e7:
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x00fc
            r11 = r94
            boolean r16 = r12.changedInstance(r11)
            if (r16 == 0) goto L_0x00f7
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r0 = r0 | r16
            goto L_0x00fe
        L_0x00fc:
            r11 = r94
        L_0x00fe:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x011a
            r2 = r13 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0113
            r2 = r95
            boolean r16 = r12.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x0115
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r2 = r95
        L_0x0115:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r0 = r0 | r16
            goto L_0x011c
        L_0x011a:
            r2 = r95
        L_0x011c:
            r2 = r13 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0124
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0122:
            r0 = r0 | r2
            goto L_0x0135
        L_0x0124:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r15
            if (r2 != 0) goto L_0x0135
            boolean r2 = r12.changedInstance(r14)
            if (r2 == 0) goto L_0x0132
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0122
        L_0x0132:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0122
        L_0x0135:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0161
            boolean r2 = r12.getSkipping()
            if (r2 != 0) goto L_0x0145
            goto L_0x0161
        L_0x0145:
            r12.skipToGroupEnd()
            r16 = r87
            r19 = r95
            r60 = r0
            r17 = r4
            r39 = r5
            r33 = r6
            r18 = r7
            r26 = r8
            r38 = r11
            r56 = r12
            r15 = r14
            r14 = r86
            goto L_0x07ce
        L_0x0161:
            r12.startDefaults()
            r2 = r15 & 1
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r12.getDefaultsInvalid()
            if (r2 == 0) goto L_0x016f
            goto L_0x01c0
        L_0x016f:
            r12.skipToGroupEnd()
            r1 = r13 & 2
            if (r1 == 0) goto L_0x0178
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0178:
            r1 = r13 & 4
            if (r1 == 0) goto L_0x017e
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017e:
            r1 = r13 & 8
            if (r1 == 0) goto L_0x0184
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0184:
            r1 = r13 & 16
            if (r1 == 0) goto L_0x018c
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r1
        L_0x018c:
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0194
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x0194:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x019c
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r1
        L_0x019c:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01b2
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
            r2 = r87
            r1 = r95
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r0
            r0 = r86
            goto L_0x0252
        L_0x01b2:
            r2 = r87
            r1 = r95
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r0
            r0 = r86
            goto L_0x0252
        L_0x01c0:
            if (r1 == 0) goto L_0x01c5
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            goto L_0x01c7
        L_0x01c5:
            r1 = r86
        L_0x01c7:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x01d4
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r2 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            java.lang.String r2 = r2.m2961String$paramcardTitle$funCardBox()
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x01d6
        L_0x01d4:
            r2 = r87
        L_0x01d6:
            r3 = r13 & 4
            if (r3 == 0) goto L_0x01e3
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r3 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            boolean r3 = r3.m2950Boolean$paramaddToggle$funCardBox()
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01e4
        L_0x01e3:
            r3 = r4
        L_0x01e4:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x01f1
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r4 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            boolean r4 = r4.m2951Boolean$paramisToggleChecked$funCardBox()
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x01f2
        L_0x01f1:
            r4 = r5
        L_0x01f2:
            r5 = r13 & 16
            if (r5 == 0) goto L_0x0201
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r5 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            boolean r5 = r5.m2952Boolean$paramisToggleEnabled$funCardBox()
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r6
            goto L_0x0202
        L_0x0201:
            r5 = r6
        L_0x0202:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x0211
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r6 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            boolean r6 = r6.m2949Boolean$paramaddPadding$funCardBox()
            r7 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r7
            goto L_0x0212
        L_0x0211:
            r6 = r7
        L_0x0212:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0229
            androidx.compose.material3.MaterialTheme r7 = androidx.compose.material3.MaterialTheme.INSTANCE
            r86 = r1
            int r1 = androidx.compose.material3.MaterialTheme.$stable
            androidx.compose.material3.ColorScheme r1 = r7.getColorScheme(r12, r1)
            long r7 = r1.m583getInverseOnSurface0d7_KjU()
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r1
            goto L_0x022c
        L_0x0229:
            r86 = r1
            r7 = r8
        L_0x022c:
            if (r10 == 0) goto L_0x0231
            vegabobo.dsusideloader.ui.components.CardBoxKt$CardBox$1 r1 = vegabobo.dsusideloader.ui.components.CardBoxKt$CardBox$1.INSTANCE
            r11 = r1
        L_0x0231:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x024d
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r1 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            int r1 = r1.m2956Int$$$this$call$getdp$$arg0$callRoundedCornerShape$paramroundedCornerShape$funCardBox()
            r9 = 0
            float r10 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r10)
            androidx.compose.foundation.shape.RoundedCornerShape r1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m335RoundedCornerShape0680j_4(r1)
            r9 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r9
            r9 = r0
            r0 = r86
            goto L_0x0252
        L_0x024d:
            r1 = r95
            r9 = r0
            r0 = r86
        L_0x0252:
            r12.endDefaults()
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0264
            r10 = -1280654815(0xffffffffb3aac221, float:-7.951554E-8)
            r13 = -1
            java.lang.String r15 = "vegabobo.dsusideloader.ui.components.CardBox (CardBox.kt:21)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r9, r13, r15)
        L_0x0264:
            if (r6 == 0) goto L_0x02bd
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.draw.ClipKt.clip(r10, r1)
            r16 = 0
            r17 = 2
            r18 = 0
            r86 = r10
            r87 = r7
            r89 = r16
            r90 = r17
            r91 = r18
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.BackgroundKt.m87backgroundbw27NRU$default(r86, r87, r89, r90, r91)
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r16 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            int r13 = r16.m2958Int$$$this$call$getdp$$arg0$callpadding$valtmp0_$receiver$$$this$callfillMaxWidth$branch$if$arg0$callBox$funCardBox()
            r17 = 0
            float r15 = (float) r13
            float r13 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r15)
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.PaddingKt.m221padding3ABfNKs(r10, r13)
            int r10 = r16.m2959Int$$$this$call$getdp$$valtmp1_end$$$this$callfillMaxWidth$branch$if$arg0$callBox$funCardBox()
            r13 = 0
            float r15 = (float) r10
            float r20 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r15)
            int r10 = r16.m2960Int$$$this$call$getdp$$valtmp2_start$$$this$callfillMaxWidth$branch$if$arg0$callBox$funCardBox()
            r13 = 0
            float r15 = (float) r10
            float r18 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r15)
            r19 = 0
            r21 = 0
            r22 = 10
            r23 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.PaddingKt.m225paddingqDBjuR0$default(r17, r18, r19, r20, r21, r22, r23)
            r95 = r6
            r6 = 1
            r13 = 0
            r15 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r10, r15, r6, r13)
            goto L_0x02de
        L_0x02bd:
            r95 = r6
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.draw.ClipKt.clip(r6, r1)
            r10 = 0
            r13 = 2
            r15 = 0
            r86 = r6
            r87 = r7
            r89 = r10
            r90 = r13
            r91 = r15
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.BackgroundKt.m87backgroundbw27NRU$default(r86, r87, r89, r90, r91)
            r10 = 0
            r13 = 0
            r15 = 1
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r6, r13, r15, r10)
            r10 = r6
        L_0x02de:
            r6 = r10
            r10 = 0
            r13 = r10
            r15 = 0
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.Companion
            r97 = r1
            androidx.compose.ui.Alignment r1 = r10.getTopStart()
            r26 = r7
            r7 = 0
            int r8 = r13 >> 3
            r8 = r8 & 14
            int r16 = r13 >> 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            r8 = r8 | r16
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r7, r12, r8)
            int r16 = r13 << 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            r28 = r16
            r29 = 0
            r30 = r1
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r88 = r16
            r16 = 6
            r17 = 0
            r31 = r7
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            r32 = r15
            java.lang.String r15 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r7, r15)
            r7 = r88
            java.lang.Object r18 = r12.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r7 = r18
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r88 = r16
            r16 = 6
            r17 = 0
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r14, r15)
            r14 = r88
            java.lang.Object r18 = r12.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r14 = r18
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r88 = r16
            r16 = 6
            r17 = 0
            r33 = r5
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r5, r15)
            r5 = r88
            java.lang.Object r18 = r12.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r5 = r18
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r17 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r18 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            r34 = r6
            int r6 = r28 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            r35 = r17
            r36 = r18
            r37 = 0
            r38 = r11
            androidx.compose.runtime.Applier r11 = r12.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x03a0
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03a0:
            r12.startReusableNode()
            boolean r11 = r12.getInserting()
            if (r11 == 0) goto L_0x03af
            r11 = r35
            r12.createNode(r11)
            goto L_0x03b4
        L_0x03af:
            r11 = r35
            r12.useNode()
        L_0x03b4:
            r12.disableReusing()
            r35 = r11
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m972constructorimpl(r12)
            r17 = 0
            r39 = r4
            kotlin.jvm.functions.Function2 r4 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m973setimpl(r11, r8, r4)
            kotlin.jvm.functions.Function2 r4 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m973setimpl(r11, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m973setimpl(r11, r14, r4)
            kotlin.jvm.functions.Function2 r4 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m973setimpl(r11, r5, r4)
            r12.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m967constructorimpl(r12)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m966boximpl(r4)
            int r11 = r6 >> 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r40 = r5
            r5 = r36
            r5.invoke(r4, r12, r11)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.startReplaceableGroup(r4)
            int r11 = r6 >> 9
            r11 = r11 & 14
            r36 = r12
            r41 = 0
            r4 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r42 = r5
            java.lang.String r5 = "C72@3384L9:Box.kt#2w3rfo"
            r43 = r6
            r6 = r36
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r4, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r5 = r13 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            r44 = 0
            r45 = r4
            r4 = 620797682(0x25009ef2, float:1.1156083E-16)
            r46 = r5
            java.lang.String r5 = "C48@1733L888:CardBox.kt#bcxyhz"
            r47 = r7
            r7 = r36
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r7, r4, r5)
            r4 = r9 & 14
            r5 = 0
            r36 = r5
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r7.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            r48 = r8
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r5.getTop()
            r49 = r11
            androidx.compose.ui.Alignment$Horizontal r11 = r10.getStart()
            int r17 = r4 >> 3
            r17 = r17 & 14
            int r18 = r4 >> 3
            r18 = r18 & 112(0x70, float:1.57E-43)
            r50 = r13
            r13 = r17 | r18
            androidx.compose.ui.layout.MeasurePolicy r13 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r8, r11, r7, r13)
            int r17 = r4 << 3
            r17 = r17 & 112(0x70, float:1.57E-43)
            r51 = r17
            r52 = 0
            r53 = r8
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.startReplaceableGroup(r8)
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r17 = 6
            r18 = 0
            r54 = r11
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r7, r11, r15)
            java.lang.Object r11 = r7.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r7)
            r8 = r11
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r17 = 6
            r18 = 0
            r55 = r14
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r7, r14, r15)
            java.lang.Object r14 = r7.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r7)
            r11 = r14
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r17 = 6
            r18 = 0
            r56 = r12
            r12 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r7, r12, r15)
            java.lang.Object r12 = r7.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r7)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            kotlin.jvm.functions.Function0 r14 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r17 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            r57 = r6
            int r6 = r51 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            r58 = r17
            r59 = 0
            r60 = r9
            androidx.compose.runtime.Applier r9 = r7.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x04dd
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x04dd:
            r7.startReusableNode()
            boolean r9 = r7.getInserting()
            if (r9 == 0) goto L_0x04ea
            r7.createNode(r14)
            goto L_0x04ed
        L_0x04ea:
            r7.useNode()
        L_0x04ed:
            r7.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m972constructorimpl(r7)
            r17 = 0
            r61 = r14
            kotlin.jvm.functions.Function2 r14 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m973setimpl(r9, r13, r14)
            kotlin.jvm.functions.Function2 r14 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m973setimpl(r9, r8, r14)
            kotlin.jvm.functions.Function2 r14 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m973setimpl(r9, r11, r14)
            kotlin.jvm.functions.Function2 r14 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m973setimpl(r9, r12, r14)
            r7.enableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.SkippableUpdater.m967constructorimpl(r7)
            androidx.compose.runtime.SkippableUpdater r9 = androidx.compose.runtime.SkippableUpdater.m966boximpl(r9)
            int r14 = r6 >> 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r62 = r8
            r8 = r58
            r8.invoke(r9, r7, r14)
            r9 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.startReplaceableGroup(r9)
            int r9 = r6 >> 9
            r9 = r9 & 14
            r14 = r7
            r58 = 0
            r63 = r6
            r6 = 276693704(0x107e02c8, float:5.009481E-29)
            r64 = r8
            java.lang.String r8 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r6, r8)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            int r8 = r4 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r8 | 6
            r65 = r14
            r66 = 0
            r67 = r4
            r4 = 383501757(0x16dbc5bd, float:3.5506149E-25)
            r68 = r9
            java.lang.String r9 = "C67@2598L13:CardBox.kt#bcxyhz"
            r69 = r11
            r11 = r65
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r9)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0574
            r4 = 1
            goto L_0x0575
        L_0x0574:
            r4 = 0
        L_0x0575:
            if (r4 == 0) goto L_0x0770
            if (r3 == 0) goto L_0x072d
            r4 = 383501818(0x16dbc5fa, float:3.55063E-25)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = "51@1858L486"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            r93 = r3
            r94 = r12
            r3 = 0
            r9 = 0
            r12 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r4, r3, r12, r9)
            androidx.compose.ui.Alignment$Vertical r9 = r10.getCenterVertically()
            r10 = 390(0x186, float:5.47E-43)
            r12 = 0
            r65 = r12
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r11.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r12)
            androidx.compose.foundation.layout.Arrangement$Horizontal r5 = r5.getStart()
            int r12 = r10 >> 3
            r12 = r12 & 14
            int r17 = r10 >> 3
            r17 = r17 & 112(0x70, float:1.57E-43)
            r12 = r12 | r17
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r5, r9, r11, r12)
            int r17 = r10 << 3
            r17 = r17 & 112(0x70, float:1.57E-43)
            r70 = r17
            r71 = 0
            r72 = r5
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r5 = 6
            r17 = 0
            r87 = r5
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r5, r15)
            java.lang.Object r5 = r11.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r1 = r5
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r17 = 6
            r18 = 0
            r73 = r9
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r9, r15)
            java.lang.Object r9 = r11.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r5 = r9
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r17 = 6
            r18 = 0
            r74 = r13
            r13 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r13, r15)
            java.lang.Object r13 = r11.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r9 = r13
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            kotlin.jvm.functions.Function0 r13 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r15 = androidx.compose.ui.layout.LayoutKt.materializerOf(r3)
            r75 = r3
            int r3 = r70 << 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 6
            r76 = 0
            r77 = r7
            androidx.compose.runtime.Applier r7 = r11.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x0637
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0637:
            r11.startReusableNode()
            boolean r7 = r11.getInserting()
            if (r7 == 0) goto L_0x0644
            r11.createNode(r13)
            goto L_0x0647
        L_0x0644:
            r11.useNode()
        L_0x0647:
            r11.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m972constructorimpl(r11)
            r17 = 0
            r78 = r13
            kotlin.jvm.functions.Function2 r13 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m973setimpl(r7, r12, r13)
            kotlin.jvm.functions.Function2 r13 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m973setimpl(r7, r1, r13)
            kotlin.jvm.functions.Function2 r13 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m973setimpl(r7, r5, r13)
            kotlin.jvm.functions.Function2 r13 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m973setimpl(r7, r9, r13)
            r11.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m967constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m966boximpl(r7)
            int r13 = r3 >> 3
            r13 = r13 & 112(0x70, float:1.57E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15.invoke(r7, r11, r13)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r7)
            int r7 = r3 >> 9
            r7 = r7 & 14
            r13 = r11
            r79 = 0
            r80 = r1
            r1 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            r81 = r3
            java.lang.String r3 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r1, r3)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r3 = r10 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r82 = r13
            r87 = r1
            r1 = 0
            r83 = r1
            r1 = -1953168477(0xffffffff8b9503a3, float:-5.7398184E-32)
            r84 = r3
            java.lang.String r3 = "C52@1972L53,53@2050L41,54@2116L206:CardBox.kt#bcxyhz"
            r85 = r5
            r5 = r82
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r1, r3)
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r1 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            float r3 = r1.m2955Float$arg0$callweight$arg0$callCardTitle$fun$anonymous$$arg3$callRow$branch$if$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callBox$funCardBox()
            r16 = 0
            r17 = 2
            r18 = 0
            r88 = r0
            r89 = r3
            r90 = r16
            r91 = r17
            r92 = r18
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.RowScope.weight$default(r87, r88, r89, r90, r91, r92)
            r0 = r60 & 112(0x70, float:1.57E-43)
            r89 = r7
            r7 = 0
            vegabobo.dsusideloader.ui.components.CardTitleKt.CardTitle(r3, r2, r5, r0, r7)
            int r0 = r1.m2957Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer$fun$anonymous$$arg3$callRow$branch$if$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callBox$funCardBox()
            r1 = 0
            float r3 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r3)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m221padding3ABfNKs(r4, r0)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r0, r5, r7)
            r19 = 0
            r21 = 0
            r22 = 0
            int r0 = r60 >> 9
            r0 = r0 & 14
            int r1 = r60 >> 18
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r60 & r1
            r24 = r0 | r1
            r25 = 108(0x6c, float:1.51E-43)
            r16 = r39
            r17 = r38
            r20 = r33
            r23 = r5
            androidx.compose.material3.SwitchKt.Switch(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            goto L_0x077a
        L_0x072d:
            r88 = r0
            r93 = r3
            r77 = r7
            r94 = r12
            r74 = r13
            r0 = 383502350(0x16dbc80e, float:3.550761E-25)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "61@2390L163"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.Companion
            r16 = 0
            vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt r0 = vegabobo.dsusideloader.ui.components.LiveLiterals$CardBoxKt.INSTANCE
            double r3 = r0.m2953Double$$$this$call$getdp$$arg1$callpadding$valtmp0_modifier$else$if$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callBox$funCardBox()
            r1 = 0
            float r5 = (float) r3
            float r17 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r5)
            r18 = 0
            double r0 = r0.m2954Double$$$this$call$getdp$$arg3$callpadding$valtmp0_modifier$else$if$branch$if$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg3$callBox$funCardBox()
            r3 = 0
            float r4 = (float) r0
            float r19 = androidx.compose.ui.unit.Dp.m2350constructorimpl(r4)
            r20 = 5
            r21 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m225paddingqDBjuR0$default(r15, r16, r17, r18, r19, r20, r21)
            r1 = r60 & 112(0x70, float:1.57E-43)
            r3 = 0
            vegabobo.dsusideloader.ui.components.CardTitleKt.CardTitle(r0, r2, r11, r1, r3)
            r11.endReplaceableGroup()
            goto L_0x077a
        L_0x0770:
            r88 = r0
            r93 = r3
            r77 = r7
            r94 = r12
            r74 = r13
        L_0x077a:
            r11.endReplaceableGroup()
            r0 = r8 & 14
            int r1 = r60 >> 24
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15 = r96
            r15.invoke(r6, r11, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r77.endReplaceableGroup()
            r77.endNode()
            r77.endReplaceableGroup()
            r77.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r77)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r57)
            r56.endReplaceableGroup()
            r56.endNode()
            r56.endReplaceableGroup()
            r56.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x07c4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x07c4:
            r14 = r88
            r17 = r93
            r18 = r95
            r19 = r97
            r16 = r2
        L_0x07ce:
            androidx.compose.runtime.ScopeUpdateScope r13 = r56.endRestartGroup()
            if (r13 != 0) goto L_0x07d9
            r86 = r14
            r20 = r56
            goto L_0x07ff
        L_0x07d9:
            vegabobo.dsusideloader.ui.components.CardBoxKt$CardBox$3 r12 = new vegabobo.dsusideloader.ui.components.CardBoxKt$CardBox$3
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r39
            r5 = r33
            r6 = r18
            r7 = r26
            r9 = r38
            r10 = r19
            r11 = r96
            r86 = r14
            r20 = r56
            r14 = r12
            r12 = r98
            r15 = r13
            r13 = r99
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            r15.updateScope(r14)
        L_0x07ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.components.CardBoxKt.m2924CardBoxueL0Wzs(androidx.compose.ui.Modifier, java.lang.String, boolean, boolean, boolean, boolean, long, kotlin.jvm.functions.Function1, androidx.compose.foundation.shape.RoundedCornerShape, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
