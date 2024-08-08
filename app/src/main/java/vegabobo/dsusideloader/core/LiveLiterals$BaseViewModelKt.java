package vegabobo.dsusideloader.core;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: BaseViewModel.kt */
public final class LiveLiterals$BaseViewModelKt {

    /* renamed from: Boolean$arg-2$call-readBoolPref$fun-readBoolPref$class-BaseViewModel  reason: not valid java name */
    public static boolean f53Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel;
    public static final LiveLiterals$BaseViewModelKt INSTANCE = new LiveLiterals$BaseViewModelKt();

    /* renamed from: Int$class-BaseViewModel  reason: not valid java name */
    public static int f54Int$classBaseViewModel = 8;

    /* renamed from: State$Boolean$arg-2$call-readBoolPref$fun-readBoolPref$class-BaseViewModel  reason: not valid java name */
    public static State f55State$Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel;

    /* renamed from: State$Int$class-BaseViewModel  reason: not valid java name */
    public static State f56State$Int$classBaseViewModel;

    /* renamed from: State$String$arg-2$call-readStringPref$fun-readStringPref$class-BaseViewModel  reason: not valid java name */
    public static State f57State$String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel;

    /* renamed from: String$arg-2$call-readStringPref$fun-readStringPref$class-BaseViewModel  reason: not valid java name */
    public static String f58String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel = "";

    /* renamed from: Boolean$arg-2$call-readBoolPref$fun-readBoolPref$class-BaseViewModel  reason: not valid java name */
    public final boolean m2552Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f53Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel;
        }
        State state = f55State$Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$arg-2$call-readBoolPref$fun-readBoolPref$class-BaseViewModel", Boolean.valueOf(f53Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel));
            f55State$Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: Int$class-BaseViewModel  reason: not valid java name */
    public final int m2553Int$classBaseViewModel() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f54Int$classBaseViewModel;
        }
        State state = f56State$Int$classBaseViewModel;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-BaseViewModel", Integer.valueOf(f54Int$classBaseViewModel));
            f56State$Int$classBaseViewModel = state;
        }
        return ((Number) state.getValue()).intValue();
    }

    /* renamed from: String$arg-2$call-readStringPref$fun-readStringPref$class-BaseViewModel  reason: not valid java name */
    public final String m2554String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f58String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel;
        }
        State state = f57State$String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("String$arg-2$call-readStringPref$fun-readStringPref$class-BaseViewModel", f58String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel);
            f57State$String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel = state;
        }
        return (String) state.getValue();
    }
}
