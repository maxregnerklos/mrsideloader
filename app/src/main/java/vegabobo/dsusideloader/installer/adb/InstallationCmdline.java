package vegabobo.dsusideloader.installer.adb;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: InstallationCmdline.kt */
public final class InstallationCmdline {
    public static final int $stable = LiveLiterals$InstallationCmdlineKt.INSTANCE.m2575Int$classInstallationCmdline();
    public final Triple parameters;

    public InstallationCmdline(Triple parameters2) {
        Intrinsics.checkNotNullParameter(parameters2, "parameters");
        this.parameters = parameters2;
    }

    public final String getCmd() {
        LiveLiterals$InstallationCmdlineKt liveLiterals$InstallationCmdlineKt = LiveLiterals$InstallationCmdlineKt.INSTANCE;
        String r1 = liveLiterals$InstallationCmdlineKt.m2576String$$this$callplus$$this$callplus$$this$callplus$$this$callplus$fungetCmd$classInstallationCmdline();
        String r2 = liveLiterals$InstallationCmdlineKt.m2585String$arg0$callplus$$this$callplus$$this$callplus$$this$callplus$fungetCmd$classInstallationCmdline();
        String r3 = liveLiterals$InstallationCmdlineKt.m2586String$arg0$callplus$$this$callplus$$this$callplus$fungetCmd$classInstallationCmdline();
        String r0 = liveLiterals$InstallationCmdlineKt.m2587String$arg0$callplus$$this$callplus$fungetCmd$classInstallationCmdline();
        String genInstallationArguments = genInstallationArguments();
        return r1 + r2 + r3 + r0 + genInstallationArguments;
    }

    public final String genInstallationArguments() {
        long userdataSize = ((Number) this.parameters.getFirst()).longValue();
        long imageFileSize = ((Number) this.parameters.getThird()).longValue();
        LiveLiterals$InstallationCmdlineKt liveLiterals$InstallationCmdlineKt = LiveLiterals$InstallationCmdlineKt.INSTANCE;
        String arguments = (liveLiterals$InstallationCmdlineKt.m2590String$valarguments$fungenInstallationArguments$classInstallationCmdline() + addArgument(liveLiterals$InstallationCmdlineKt.m2583String$arg0$calladdArgument$arg0$callplus$setarguments$fungenInstallationArguments$classInstallationCmdline(), (String) this.parameters.getSecond())) + addArgument(liveLiterals$InstallationCmdlineKt.m2584String$arg0$calladdArgument$arg0$callplus$setarguments1$fungenInstallationArguments$classInstallationCmdline(), liveLiterals$InstallationCmdlineKt.m2589String$arg1$calladdArgument$arg0$callplus$setarguments1$fungenInstallationArguments$classInstallationCmdline(), Long.valueOf(userdataSize));
        if (imageFileSize != -1) {
            arguments = arguments + addArgument(liveLiterals$InstallationCmdlineKt.m2582String$arg0$calladdArgument$arg0$callplus$setarguments$branch$if$fungenInstallationArguments$classInstallationCmdline(), liveLiterals$InstallationCmdlineKt.m2588String$arg1$calladdArgument$arg0$callplus$setarguments$branch$if$fungenInstallationArguments$classInstallationCmdline(), Long.valueOf(imageFileSize));
        }
        return StringsKt__StringsKt.trim(arguments).toString();
    }

    public final String addArgument(String argument, String property, Object value) {
        LiveLiterals$InstallationCmdlineKt liveLiterals$InstallationCmdlineKt = LiveLiterals$InstallationCmdlineKt.INSTANCE;
        String r1 = liveLiterals$InstallationCmdlineKt.m2577String$1$str$funaddArgument$classInstallationCmdline();
        String r2 = liveLiterals$InstallationCmdlineKt.m2579String$3$str$funaddArgument$classInstallationCmdline();
        String r0 = liveLiterals$InstallationCmdlineKt.m2581String$5$str$funaddArgument$classInstallationCmdline();
        return argument + r1 + property + r2 + value + r0;
    }

    public final String addArgument(String argument, Object value) {
        LiveLiterals$InstallationCmdlineKt liveLiterals$InstallationCmdlineKt = LiveLiterals$InstallationCmdlineKt.INSTANCE;
        String r1 = liveLiterals$InstallationCmdlineKt.m2578String$1$str$funaddArgument1$classInstallationCmdline();
        String r0 = liveLiterals$InstallationCmdlineKt.m2580String$3$str$funaddArgument1$classInstallationCmdline();
        return argument + r1 + value + r0;
    }
}
