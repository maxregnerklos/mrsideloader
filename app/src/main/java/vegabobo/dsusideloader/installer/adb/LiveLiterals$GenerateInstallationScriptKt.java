package vegabobo.dsusideloader.installer.adb;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.LiveLiteralKt;

/* compiled from: GenerateInstallationScript.kt */
public final class LiveLiterals$GenerateInstallationScriptKt {
    public static final LiveLiterals$GenerateInstallationScriptKt INSTANCE = new LiveLiterals$GenerateInstallationScriptKt();

    /* renamed from: Int$class-GenerateInstallationScript  reason: not valid java name */
    public static int f95Int$classGenerateInstallationScript = 8;

    /* renamed from: State$Int$class-GenerateInstallationScript  reason: not valid java name */
    public static State f96State$Int$classGenerateInstallationScript;

    /* renamed from: State$String$arg-0$call-replace$$$this$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public static State f97State$String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript;

    /* renamed from: State$String$arg-0$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public static State f98State$String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript;

    /* renamed from: String$arg-0$call-replace$$$this$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public static String f99String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript = "%ACTION_INSTALL";

    /* renamed from: String$arg-0$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public static String f100String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript = "%UNMOUNT_SD";

    /* renamed from: Int$class-GenerateInstallationScript  reason: not valid java name */
    public final int m2572Int$classGenerateInstallationScript() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f95Int$classGenerateInstallationScript;
        }
        State state = f96State$Int$classGenerateInstallationScript;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("Int$class-GenerateInstallationScript", Integer.valueOf(f95Int$classGenerateInstallationScript));
            f96State$Int$classGenerateInstallationScript = state;
        }
        return ((Number) state.getValue()).intValue();
    }

    /* renamed from: String$arg-0$call-replace$$$this$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public final String m2573String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f99String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript;
        }
        State state = f97State$String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("String$arg-0$call-replace$$$this$call-replace$fun-getShellScript$class-GenerateInstallationScript", f99String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript);
            f97State$String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript = state;
        }
        return (String) state.getValue();
    }

    /* renamed from: String$arg-0$call-replace$fun-getShellScript$class-GenerateInstallationScript  reason: not valid java name */
    public final String m2574String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript() {
        if (!LiveLiteralKt.isLiveLiteralsEnabled()) {
            return f100String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript;
        }
        State state = f98State$String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript;
        if (state == null) {
            state = LiveLiteralKt.liveLiteral("String$arg-0$call-replace$fun-getShellScript$class-GenerateInstallationScript", f100String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript);
            f98State$String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript = state;
        }
        return (String) state.getValue();
    }
}
