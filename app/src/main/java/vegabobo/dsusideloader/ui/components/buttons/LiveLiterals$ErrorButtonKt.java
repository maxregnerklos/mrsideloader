package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: ErrorButton.kt */
public final class LiveLiterals$ErrorButtonKt {

    /* renamed from: Boolean$param-isEnabled$fun-ErrorButton  reason: not valid java name */
    public static boolean f1010Boolean$paramisEnabled$funErrorButton = true;
    public static final LiveLiterals$ErrorButtonKt INSTANCE = new LiveLiterals$ErrorButtonKt();

    /* renamed from: State$Boolean$param-isEnabled$fun-ErrorButton  reason: not valid java name */
    public static State f1011State$Boolean$paramisEnabled$funErrorButton;

    /* renamed from: Boolean$param-isEnabled$fun-ErrorButton  reason: not valid java name */
    public final boolean m3032Boolean$paramisEnabled$funErrorButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1010Boolean$paramisEnabled$funErrorButton;
        }
        State state = f1011State$Boolean$paramisEnabled$funErrorButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$param-isEnabled$fun-ErrorButton", Boolean.valueOf(f1010Boolean$paramisEnabled$funErrorButton));
            f1011State$Boolean$paramisEnabled$funErrorButton = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }
}
