package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: PrimaryButton.kt */
public final class LiveLiterals$PrimaryButtonKt {

    /* renamed from: Boolean$param-isEnabled$fun-PrimaryButton  reason: not valid java name */
    public static boolean f1012Boolean$paramisEnabled$funPrimaryButton = true;
    public static final LiveLiterals$PrimaryButtonKt INSTANCE = new LiveLiterals$PrimaryButtonKt();

    /* renamed from: State$Boolean$param-isEnabled$fun-PrimaryButton  reason: not valid java name */
    public static State f1013State$Boolean$paramisEnabled$funPrimaryButton;

    /* renamed from: Boolean$param-isEnabled$fun-PrimaryButton  reason: not valid java name */
    public final boolean m3033Boolean$paramisEnabled$funPrimaryButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1012Boolean$paramisEnabled$funPrimaryButton;
        }
        State state = f1013State$Boolean$paramisEnabled$funPrimaryButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$param-isEnabled$fun-PrimaryButton", Boolean.valueOf(f1012Boolean$paramisEnabled$funPrimaryButton));
            f1013State$Boolean$paramisEnabled$funPrimaryButton = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }
}
