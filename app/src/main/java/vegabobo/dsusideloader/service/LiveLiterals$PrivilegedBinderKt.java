package vegabobo.dsusideloader.service;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: PrivilegedBinder.kt */
public final class LiveLiterals$PrivilegedBinderKt {
    public static final LiveLiterals$PrivilegedBinderKt INSTANCE = new LiveLiterals$PrivilegedBinderKt();

    /* renamed from: Int$class-PrivilegedRootService  reason: not valid java name */
    public static int f564Int$classPrivilegedRootService;

    /* renamed from: Int$class-PrivilegedSystemService  reason: not valid java name */
    public static int f565Int$classPrivilegedSystemService;

    /* renamed from: State$Int$class-PrivilegedRootService  reason: not valid java name */
    public static State f566State$Int$classPrivilegedRootService;

    /* renamed from: State$Int$class-PrivilegedSystemService  reason: not valid java name */
    public static State f567State$Int$classPrivilegedSystemService;

    /* renamed from: Int$class-PrivilegedRootService  reason: not valid java name */
    public final int m2798Int$classPrivilegedRootService() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f564Int$classPrivilegedRootService;
        }
        State state = f566State$Int$classPrivilegedRootService;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-PrivilegedRootService", Integer.valueOf(f564Int$classPrivilegedRootService));
            f566State$Int$classPrivilegedRootService = state;
        }
        return ((Number) state.getValue()).intValue();
    }

    /* renamed from: Int$class-PrivilegedSystemService  reason: not valid java name */
    public final int m2799Int$classPrivilegedSystemService() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f565Int$classPrivilegedSystemService;
        }
        State state = f567State$Int$classPrivilegedSystemService;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-PrivilegedSystemService", Integer.valueOf(f565Int$classPrivilegedSystemService));
            f567State$Int$classPrivilegedSystemService = state;
        }
        return ((Number) state.getValue()).intValue();
    }
}
