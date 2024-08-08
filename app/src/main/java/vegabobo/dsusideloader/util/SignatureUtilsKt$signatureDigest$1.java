package vegabobo.dsusideloader.util;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SignatureUtils.kt */
public final class SignatureUtilsKt$signatureDigest$1 extends Lambda implements Function1 {
    public static final SignatureUtilsKt$signatureDigest$1 INSTANCE = new SignatureUtilsKt$signatureDigest$1();

    public SignatureUtilsKt$signatureDigest$1() {
        super(1);
    }

    public final CharSequence invoke(byte it) {
        String format = String.format(LiveLiterals$SignatureUtilsKt.INSTANCE.m3461String$$$this$callformat$fun$anonymous$$arg5$calljoinToString$try$funsignatureDigest(), Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        return invoke(((Number) p1).byteValue());
    }
}
