package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: TopBar.kt */
public final class LiveLiterals$TopBarKt {
    public static final LiveLiterals$TopBarKt INSTANCE = new LiveLiterals$TopBarKt();

    /* renamed from: State$String$param-iconContentDescription$fun-TopBar  reason: not valid java name */
    public static State f1003State$String$paramiconContentDescription$funTopBar;

    /* renamed from: String$param-iconContentDescription$fun-TopBar  reason: not valid java name */
    public static String f1004String$paramiconContentDescription$funTopBar = "icon";

    /* renamed from: String$param-iconContentDescription$fun-TopBar  reason: not valid java name */
    public final String m3026String$paramiconContentDescription$funTopBar() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1004String$paramiconContentDescription$funTopBar;
        }
        State state = f1003State$String$paramiconContentDescription$funTopBar;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("String$param-iconContentDescription$fun-TopBar", f1004String$paramiconContentDescription$funTopBar);
            f1003State$String$paramiconContentDescription$funTopBar = state;
        }
        return (String) state.getValue();
    }
}
