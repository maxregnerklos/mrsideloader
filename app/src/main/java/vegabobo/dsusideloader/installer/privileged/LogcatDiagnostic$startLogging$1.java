package vegabobo.dsusideloader.installer.privileged;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import vegabobo.dsusideloader.preparation.InstallationStep;

/* compiled from: LogcatDiagnostic.kt */
public final class LogcatDiagnostic$startLogging$1 extends Lambda implements Function1 {
    public final /* synthetic */ String $prependString;
    public final /* synthetic */ LogcatDiagnostic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogcatDiagnostic$startLogging$1(LogcatDiagnostic logcatDiagnostic, String str) {
        super(1);
        this.this$0 = logcatDiagnostic;
        this.$prependString = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((String) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.this$0.getLogs().length() == 0) {
            LogcatDiagnostic logcatDiagnostic = this.this$0;
            String str = this.$prependString;
            String r4 = LiveLiterals$LogcatDiagnosticKt.INSTANCE.m2618String$1$str$arg0$call$setlogs$$branch$if$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic();
            logcatDiagnostic.setLogs(str + r4);
        }
        LiveLiterals$LogcatDiagnosticKt liveLiterals$LogcatDiagnosticKt = LiveLiterals$LogcatDiagnosticKt.INSTANCE;
        if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2632String$arg0$callcontains$cond$cond$if1$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2624String$arg0$callcontains$branch$cond$if1$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
            this.this$0.onStepUpdate.invoke(InstallationStep.INSTALLING);
            this.this$0.onInstallationProgressUpdate.invoke(Float.valueOf(liveLiterals$LogcatDiagnosticKt.m2607Float$arg0$callinvoke1$branch$if1$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic()), liveLiterals$LogcatDiagnosticKt.m2647String$arg1$callinvoke1$branch$if1$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic());
        }
        if (this.this$0.isLogging().get()) {
            LogcatDiagnostic logcatDiagnostic2 = this.this$0;
            String logs = logcatDiagnostic2.getLogs();
            String r7 = liveLiterals$LogcatDiagnosticKt.m2619String$1$str$arg0$callplus$arg0$call$setlogs$$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic();
            logcatDiagnostic2.setLogs(logs + it + r7);
            this.this$0.onLogLineReceived.invoke();
            if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2643String$arg0$callcontains$cond$if3$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_ALREADY_RUNNING_DYN_OS, it);
                this.this$0.destroy();
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2634String$arg0$callcontains$cond$cond$if4$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2626String$arg0$callcontains$branch$cond$if4$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_EXTERNAL_SDCARD_ALLOC, it);
                this.this$0.destroy();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2644String$arg0$callcontains$cond$if5$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_NO_AVAIL_STORAGE, it);
                this.this$0.destroy();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2630String$arg0$callcontains$cond$cond$cond$if6$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2622String$arg0$callcontains$branch$cond$cond$if6$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2627String$arg0$callcontains$branch$cond$if6$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_F2FS_WRONG_PATH, it);
                this.this$0.destroy();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2635String$arg0$callcontains$cond$cond$if7$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2628String$arg0$callcontains$branch$cond$if7$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_SELINUX, it);
                this.this$0.destroy();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2636String$arg0$callcontains$cond$cond$if8$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2629String$arg0$callcontains$branch$cond$if8$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                this.this$0.onInstallationError.invoke(InstallationStep.ERROR_EXTENTS, it);
                this.this$0.destroy();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2645String$arg0$callcontains$cond$if9$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2637String$arg0$callcontains$cond$if$branch$if9$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                    this.this$0.onInstallationError.invoke(InstallationStep.ERROR_CANCELED, it);
                } else {
                    this.this$0.onInstallationError.invoke(InstallationStep.ERROR, it);
                }
                this.this$0.destroy();
            } else {
                if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2638String$arg0$callcontains$cond$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                    if (!StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2631String$arg0$callcontains$cond$cond$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) || !StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt.m2623String$arg0$callcontains$branch$cond$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                        this.this$0.onStepUpdate.invoke(InstallationStep.PROCESSING_LOG_READABLE);
                    } else {
                        try {
                            Regex progressRgx = new Regex(liveLiterals$LogcatDiagnosticKt.m2614String$$$this$calltoRegex$valprogressRgx$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic());
                            Regex partitionRgx = new Regex(liveLiterals$LogcatDiagnosticKt.m2613String$$$this$calltoRegex$valpartitionRgx$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic());
                            MatchResult find$default = Regex.find$default(progressRgx, it, 0, 2, (Object) null);
                            Intrinsics.checkNotNull(find$default);
                            List progressText = StringsKt__StringsKt.split$default((CharSequence) find$default.getGroupValues().get(liveLiterals$LogcatDiagnosticKt.m2608Int$arg0$callget$$$this$callsplit$valprogressText$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic()), new String[]{liveLiterals$LogcatDiagnosticKt.m2617String$0$vararg$arg0$callsplit$valprogressText$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic()}, false, 0, 6, (Object) null);
                            float progress = Float.parseFloat((String) progressText.get(liveLiterals$LogcatDiagnosticKt.m2609Int$arg0$callget$$$this$calltoFloat$$this$calldiv$valprogress$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic())) / Float.parseFloat((String) progressText.get(liveLiterals$LogcatDiagnosticKt.m2610Int$arg0$callget$$$this$calltoFloat$arg0$calldiv$valprogress$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic()));
                            MatchResult find$default2 = Regex.find$default(partitionRgx, it, 0, 2, (Object) null);
                            Intrinsics.checkNotNull(find$default2);
                            this.this$0.onInstallationProgressUpdate.invoke(Float.valueOf(progress), (String) find$default2.getGroupValues().get(liveLiterals$LogcatDiagnosticKt.m2611Int$arg0$callget$valpartitionText$try$branch$if$branch$if10$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic()));
                        } catch (Exception e) {
                            this.this$0.onStepUpdate.invoke(InstallationStep.PROCESSING_LOG_READABLE);
                        }
                    }
                }
                LiveLiterals$LogcatDiagnosticKt liveLiterals$LogcatDiagnosticKt2 = LiveLiterals$LogcatDiagnosticKt.INSTANCE;
                if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2633String$arg0$callcontains$cond$cond$if11$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2625String$arg0$callcontains$branch$cond$if11$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                    this.this$0.onInstallationSuccess.invoke();
                    this.this$0.destroy();
                } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2639String$arg0$callcontains$cond$if12$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                    this.this$0.onInstallationError.invoke(InstallationStep.ERROR_CANCELED, it);
                    this.this$0.destroy();
                } else {
                    if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2640String$arg0$callcontains$cond$if13$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                        this.this$0.onStepUpdate.invoke(InstallationStep.PROCESSING_LOG_READABLE);
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2641String$arg0$callcontains$cond$if14$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                        this.this$0.onInstallationSuccess.invoke();
                        this.this$0.destroy();
                    } else if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) liveLiterals$LogcatDiagnosticKt2.m2642String$arg0$callcontains$cond$if15$fun$anonymous$$arg1$callrunReadEachLine$funstartLogging$classLogcatDiagnostic(), false, 2, (Object) null)) {
                        this.this$0.onInstallationError.invoke(InstallationStep.ERROR, it);
                        this.this$0.destroy();
                    }
                }
            }
        }
    }
}
