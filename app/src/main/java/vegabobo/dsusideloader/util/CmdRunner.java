package vegabobo.dsusideloader.util;

import com.topjohnwu.superuser.Shell;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CmdRunner.kt */
public final class CmdRunner {
    public static final int $stable = LiveLiterals$CmdRunnerKt.INSTANCE.m3415Int$classCmdRunner();
    public static final CmdRunner INSTANCE = new CmdRunner();
    public static Process process;

    public final String run(String cmd) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        if (!Shell.getShell().isRoot()) {
            return runCommand(cmd);
        }
        return Shell.cmd(cmd).exec().getOut().toString();
    }

    public final void runReadEachLine(String cmd, Function1 onReceive) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(onReceive, "onReceive");
        if (Shell.getShell().isRoot()) {
            Shell.cmd(cmd).to(new CmdRunner$runReadEachLine$callbackList$1(onReceive)).submit();
            return;
        }
        runCommand(cmd, onReceive);
    }

    public final void runCommand(String cmd, Function1 onReceive) {
        String str;
        LiveLiterals$CmdRunnerKt liveLiterals$CmdRunnerKt = LiveLiterals$CmdRunnerKt.INSTANCE;
        process = new ProcessBuilder(new String[]{liveLiterals$CmdRunnerKt.m3416String$0$vararg$arg0$call$init$$$this$callstart$arg0$call$setprocess$$funrunCommand$classCmdRunner(), liveLiterals$CmdRunnerKt.m3418String$1$vararg$arg0$call$init$$$this$callstart$arg0$call$setprocess$$funrunCommand$classCmdRunner(), cmd}).start();
        Process process2 = process;
        Intrinsics.checkNotNull(process2);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                String it = readLine;
                if (it == null) {
                    str = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(it, "it ?: \"\"");
                    str = it;
                }
                String str2 = str;
                if (readLine != null) {
                    if (str2.length() > 0) {
                        onReceive.invoke(str2);
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    public final String runCommand(String cmd) {
        Ref$ObjectRef output = new Ref$ObjectRef();
        output.element = LiveLiterals$CmdRunnerKt.INSTANCE.m3419String$valoutput$funrunCommand1$classCmdRunner();
        runCommand(cmd, new CmdRunner$runCommand$2(output));
        return (String) output.element;
    }

    public final void destroy() {
        if (Shell.getShell().isRoot()) {
            Shell.getShell().close();
            Shell.getShell();
            return;
        }
        Process process2 = process;
        if (process2 != null) {
            Intrinsics.checkNotNull(process2);
            process2.destroy();
            process = null;
        }
    }
}
