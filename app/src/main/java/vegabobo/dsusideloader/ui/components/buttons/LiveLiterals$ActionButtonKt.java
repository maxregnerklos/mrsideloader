package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: ActionButton.kt */
public final class LiveLiterals$ActionButtonKt {

    /* renamed from: Boolean$param-isEnabled$fun-ActionButton  reason: not valid java name */
    public static boolean f1006Boolean$paramisEnabled$funActionButton = true;

    /* renamed from: Boolean$param-textButton$fun-ActionButton  reason: not valid java name */
    public static boolean f1007Boolean$paramtextButton$funActionButton;
    public static final LiveLiterals$ActionButtonKt INSTANCE = new LiveLiterals$ActionButtonKt();

    /* renamed from: State$Boolean$param-isEnabled$fun-ActionButton  reason: not valid java name */
    public static State f1008State$Boolean$paramisEnabled$funActionButton;

    /* renamed from: State$Boolean$param-textButton$fun-ActionButton  reason: not valid java name */
    public static State f1009State$Boolean$paramtextButton$funActionButton;

    /* renamed from: Boolean$param-isEnabled$fun-ActionButton  reason: not valid java name */
    public final boolean m3030Boolean$paramisEnabled$funActionButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1006Boolean$paramisEnabled$funActionButton;
        }
        State state = f1008State$Boolean$paramisEnabled$funActionButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$param-isEnabled$fun-ActionButton", Boolean.valueOf(f1006Boolean$paramisEnabled$funActionButton));
            f1008State$Boolean$paramisEnabled$funActionButton = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: Boolean$param-textButton$fun-ActionButton  reason: not valid java name */
    public final boolean m3031Boolean$paramtextButton$funActionButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1007Boolean$paramtextButton$funActionButton;
        }
        State state = f1009State$Boolean$paramtextButton$funActionButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$param-textButton$fun-ActionButton", Boolean.valueOf(f1007Boolean$paramtextButton$funActionButton));
            f1009State$Boolean$paramtextButton$funActionButton = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }
}
