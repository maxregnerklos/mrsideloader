package vegabobo.dsusideloader.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CmdRunner.kt */
public final class CmdRunner$runCommand$2 extends Lambda implements Function1 {
    public final /* synthetic */ Ref$ObjectRef $output;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CmdRunner$runCommand$2(Ref$ObjectRef ref$ObjectRef) {
        super(1);
        this.$output = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((String) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Ref$ObjectRef ref$ObjectRef = this.$output;
        Object obj = ref$ObjectRef.element;
        String r2 = LiveLiterals$CmdRunnerKt.INSTANCE.m3417String$1$str$arg0$callplus$setoutput$fun$anonymous$$arg1$callrunCommand$funrunCommand1$classCmdRunner();
        ref$ObjectRef.element = obj + it + r2;
    }
}
