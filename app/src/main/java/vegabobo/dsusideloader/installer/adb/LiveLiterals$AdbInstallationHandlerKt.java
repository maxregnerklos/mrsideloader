package vegabobo.dsusideloader.installer.adb;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: AdbInstallationHandler.kt */
public final class LiveLiterals$AdbInstallationHandlerKt {
    public static final LiveLiterals$AdbInstallationHandlerKt INSTANCE = new LiveLiterals$AdbInstallationHandlerKt();

    /* renamed from: Int$class-AdbInstallationHandler  reason: not valid java name */
    public static int f93Int$classAdbInstallationHandler = 8;

    /* renamed from: State$Int$class-AdbInstallationHandler  reason: not valid java name */
    public static State f94State$Int$classAdbInstallationHandler;

    /* renamed from: Int$class-AdbInstallationHandler  reason: not valid java name */
    public final int m2571Int$classAdbInstallationHandler() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f93Int$classAdbInstallationHandler;
        }
        State state = f94State$Int$classAdbInstallationHandler;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-AdbInstallationHandler", Integer.valueOf(f93Int$classAdbInstallationHandler));
            f94State$Int$classAdbInstallationHandler = state;
        }
        return ((Number) state.getValue()).intValue();
    }
}
