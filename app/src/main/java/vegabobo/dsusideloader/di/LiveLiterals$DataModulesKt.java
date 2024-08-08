package vegabobo.dsusideloader.di;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: DataModules.kt */
public final class LiveLiterals$DataModulesKt {
    public static final LiveLiterals$DataModulesKt INSTANCE = new LiveLiterals$DataModulesKt();

    /* renamed from: Int$class-DataModules  reason: not valid java name */
    public static int f91Int$classDataModules;

    /* renamed from: State$Int$class-DataModules  reason: not valid java name */
    public static State f92State$Int$classDataModules;

    /* renamed from: Int$class-DataModules  reason: not valid java name */
    public final int m2570Int$classDataModules() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f91Int$classDataModules;
        }
        State state = f92State$Int$classDataModules;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-DataModules", Integer.valueOf(f91Int$classDataModules));
            f92State$Int$classDataModules = state;
        }
        return ((Number) state.getValue()).intValue();
    }
}
