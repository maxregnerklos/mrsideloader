package vegabobo.dsusideloader.ui.components.buttons;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: SecondaryButton.kt */
public final class LiveLiterals$SecondaryButtonKt {

    /* renamed from: Boolean$param-isEnabled$fun-SecondaryButton  reason: not valid java name */
    public static boolean f1014Boolean$paramisEnabled$funSecondaryButton = true;

    /* renamed from: Float$arg-1$call-addAlpha$val-colorButton$fun-SecondaryButton  reason: not valid java name */
    public static float f1015Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton = 0.05f;

    /* renamed from: Float$arg-1$call-addAlpha$val-colorText$fun-SecondaryButton  reason: not valid java name */
    public static float f1016Float$arg1$calladdAlpha$valcolorText$funSecondaryButton = 0.75f;
    public static final LiveLiterals$SecondaryButtonKt INSTANCE = new LiveLiterals$SecondaryButtonKt();

    /* renamed from: State$Boolean$param-isEnabled$fun-SecondaryButton  reason: not valid java name */
    public static State f1017State$Boolean$paramisEnabled$funSecondaryButton;

    /* renamed from: State$Float$arg-1$call-addAlpha$val-colorButton$fun-SecondaryButton  reason: not valid java name */
    public static State f1018State$Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton;

    /* renamed from: State$Float$arg-1$call-addAlpha$val-colorText$fun-SecondaryButton  reason: not valid java name */
    public static State f1019State$Float$arg1$calladdAlpha$valcolorText$funSecondaryButton;

    /* renamed from: Boolean$param-isEnabled$fun-SecondaryButton  reason: not valid java name */
    public final boolean m3034Boolean$paramisEnabled$funSecondaryButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1014Boolean$paramisEnabled$funSecondaryButton;
        }
        State state = f1017State$Boolean$paramisEnabled$funSecondaryButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Boolean$param-isEnabled$fun-SecondaryButton", Boolean.valueOf(f1014Boolean$paramisEnabled$funSecondaryButton));
            f1017State$Boolean$paramisEnabled$funSecondaryButton = state;
        }
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: Float$arg-1$call-addAlpha$val-colorButton$fun-SecondaryButton  reason: not valid java name */
    public final float m3035Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1015Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton;
        }
        State state = f1018State$Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Float$arg-1$call-addAlpha$val-colorButton$fun-SecondaryButton", Float.valueOf(f1015Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton));
            f1018State$Float$arg1$calladdAlpha$valcolorButton$funSecondaryButton = state;
        }
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: Float$arg-1$call-addAlpha$val-colorText$fun-SecondaryButton  reason: not valid java name */
    public final float m3036Float$arg1$calladdAlpha$valcolorText$funSecondaryButton() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f1016Float$arg1$calladdAlpha$valcolorText$funSecondaryButton;
        }
        State state = f1019State$Float$arg1$calladdAlpha$valcolorText$funSecondaryButton;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Float$arg-1$call-addAlpha$val-colorText$fun-SecondaryButton", Float.valueOf(f1016Float$arg1$calladdAlpha$valcolorText$funSecondaryButton));
            f1019State$Float$arg1$calladdAlpha$valcolorText$funSecondaryButton = state;
        }
        return ((Number) state.getValue()).floatValue();
    }
}
