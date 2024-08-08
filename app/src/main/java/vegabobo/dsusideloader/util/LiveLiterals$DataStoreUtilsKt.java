package vegabobo.dsusideloader.util;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: DataStoreUtils.kt */
public final class LiveLiterals$DataStoreUtilsKt {
    public static final LiveLiterals$DataStoreUtilsKt INSTANCE = new LiveLiterals$DataStoreUtilsKt();

    /* renamed from: Int$class-DataStoreUtils  reason: not valid java name */
    public static int f1785Int$classDataStoreUtils;

    /* renamed from: State$Int$class-DataStoreUtils  reason: not valid java name */
    public static State f1786State$Int$classDataStoreUtils;

    /* renamed from: Int$class-DataStoreUtils  reason: not valid java name */
    public final int m3420Int$classDataStoreUtils() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1785Int$classDataStoreUtils;
        }
        State state = f1786State$Int$classDataStoreUtils;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-DataStoreUtils", Integer.valueOf(f1785Int$classDataStoreUtils));
            f1786State$Int$classDataStoreUtils = state;
        }
        return ((Number) state.getValue()).intValue();
    }
}
