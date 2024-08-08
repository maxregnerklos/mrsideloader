package vegabobo.dsusideloader.service;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: Connection.kt */
public final class LiveLiterals$ConnectionKt {
    public static final LiveLiterals$ConnectionKt INSTANCE = new LiveLiterals$ConnectionKt();

    /* renamed from: Int$class-Connection  reason: not valid java name */
    public static int f562Int$classConnection = 8;

    /* renamed from: State$Int$class-Connection  reason: not valid java name */
    public static State f563State$Int$classConnection;

    /* renamed from: Int$class-Connection  reason: not valid java name */
    public final int m2797Int$classConnection() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f562Int$classConnection;
        }
        State state = f563State$Int$classConnection;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-Connection", Integer.valueOf(f562Int$classConnection));
            f563State$Int$classConnection = state;
        }
        return ((Number) state.getValue()).intValue();
    }
}
