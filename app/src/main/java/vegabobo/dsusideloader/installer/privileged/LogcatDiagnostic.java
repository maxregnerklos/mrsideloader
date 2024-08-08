package vegabobo.dsusideloader.installer.privileged;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.util.CmdRunner;

/* compiled from: LogcatDiagnostic.kt */
public final class LogcatDiagnostic {
    public static final int $stable = LiveLiterals$LogcatDiagnosticKt.INSTANCE.m2612Int$classLogcatDiagnostic();
    public final AtomicBoolean isLogging = new AtomicBoolean(false);
    public String logs = "";
    public final Function2 onInstallationError;
    public final Function2 onInstallationProgressUpdate;
    public final Function0 onInstallationSuccess;
    public final Function0 onLogLineReceived;
    public final Function1 onStepUpdate;
    public boolean shouldLogEverything;
    public final String tag = getClass().getSimpleName();

    public LogcatDiagnostic(Function2 onInstallationError2, Function1 onStepUpdate2, Function2 onInstallationProgressUpdate2, Function0 onInstallationSuccess2, Function0 onLogLineReceived2) {
        Intrinsics.checkNotNullParameter(onInstallationError2, "onInstallationError");
        Intrinsics.checkNotNullParameter(onStepUpdate2, "onStepUpdate");
        Intrinsics.checkNotNullParameter(onInstallationProgressUpdate2, "onInstallationProgressUpdate");
        Intrinsics.checkNotNullParameter(onInstallationSuccess2, "onInstallationSuccess");
        Intrinsics.checkNotNullParameter(onLogLineReceived2, "onLogLineReceived");
        this.onInstallationError = onInstallationError2;
        this.onStepUpdate = onStepUpdate2;
        this.onInstallationProgressUpdate = onInstallationProgressUpdate2;
        this.onInstallationSuccess = onInstallationSuccess2;
        this.onLogLineReceived = onLogLineReceived2;
    }

    public final String getLogs() {
        return this.logs;
    }

    public final void setLogs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logs = str;
    }

    public final AtomicBoolean isLogging() {
        return this.isLogging;
    }

    public final void setShouldLogEverything(boolean z) {
        this.shouldLogEverything = z;
    }

    public final void startLogging(String prependString) {
        String logCmd;
        Intrinsics.checkNotNullParameter(prependString, "prependString");
        if (this.isLogging.get()) {
            destroy();
        }
        LiveLiterals$LogcatDiagnosticKt liveLiterals$LogcatDiagnosticKt = LiveLiterals$LogcatDiagnosticKt.INSTANCE;
        this.logs = liveLiterals$LogcatDiagnosticKt.m2621String$arg0$call$setlogs$$funstartLogging$classLogcatDiagnostic();
        this.isLogging.set(liveLiterals$LogcatDiagnosticKt.m2606Boolean$arg0$callset$funstartLogging$classLogcatDiagnostic());
        String str = this.tag;
        String r2 = liveLiterals$LogcatDiagnosticKt.m2616String$0$str$arg1$calld$funstartLogging$classLogcatDiagnostic();
        boolean z = this.shouldLogEverything;
        String r4 = liveLiterals$LogcatDiagnosticKt.m2620String$2$str$arg1$calld$funstartLogging$classLogcatDiagnostic();
        boolean z2 = this.isLogging.get();
        Log.d(str, r2 + z + r4 + z2);
        CmdRunner cmdRunner = CmdRunner.INSTANCE;
        cmdRunner.run(liveLiterals$LogcatDiagnosticKt.m2646String$arg0$callrun$funstartLogging$classLogcatDiagnostic());
        if (this.shouldLogEverything) {
            logCmd = liveLiterals$LogcatDiagnosticKt.m2648String$branch$if$vallogCmd$funstartLogging$classLogcatDiagnostic();
        } else {
            logCmd = liveLiterals$LogcatDiagnosticKt.m2649String$else$if$vallogCmd$funstartLogging$classLogcatDiagnostic();
        }
        cmdRunner.runReadEachLine(logCmd, new LogcatDiagnostic$startLogging$1(this, prependString));
    }

    public final void destroy() {
        CmdRunner.INSTANCE.destroy();
        AtomicBoolean atomicBoolean = this.isLogging;
        LiveLiterals$LogcatDiagnosticKt liveLiterals$LogcatDiagnosticKt = LiveLiterals$LogcatDiagnosticKt.INSTANCE;
        atomicBoolean.set(liveLiterals$LogcatDiagnosticKt.m2605Boolean$arg0$callset$fundestroy$classLogcatDiagnostic());
        String str = this.tag;
        String r1 = liveLiterals$LogcatDiagnosticKt.m2615String$0$str$arg1$calld$fundestroy$classLogcatDiagnostic();
        boolean z = this.isLogging.get();
        Log.d(str, r1 + z);
    }
}
