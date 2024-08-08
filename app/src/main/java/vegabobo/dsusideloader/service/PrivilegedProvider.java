package vegabobo.dsusideloader.service;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import vegabobo.dsusideloader.IPrivilegedService;

/* compiled from: PrivilegedProvider.kt */
public final class PrivilegedProvider {
    public static final int $stable = LiveLiterals$PrivilegedProviderKt.INSTANCE.m2805Int$classPrivilegedProvider();
    public static final PrivilegedProvider INSTANCE;
    public static Connection connection = new Connection();
    public static final String tag;

    static {
        PrivilegedProvider privilegedProvider = new PrivilegedProvider();
        INSTANCE = privilegedProvider;
        tag = privilegedProvider.getClass().getSimpleName();
    }

    public final Connection getConnection() {
        return connection;
    }

    public static /* synthetic */ void run$default(PrivilegedProvider privilegedProvider, Function0 function0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = PrivilegedProvider$run$1.INSTANCE;
        }
        privilegedProvider.run(function0, function2);
    }

    public static final IPrivilegedService run$service(PrivilegedProvider this$0) {
        IPrivilegedService service = connection.getSERVICE();
        Intrinsics.checkNotNull(service);
        return service;
    }

    public final void run(Function0 onFail, Function2 onConnected) {
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(onConnected, "onConnected");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new PrivilegedProvider$run$2(onConnected, onFail, this, (Continuation) null), 3, (Object) null);
    }

    public final IPrivilegedService getService() {
        int timeout = LiveLiterals$PrivilegedProviderKt.INSTANCE.m2807Int$valtimeout$fungetService$classPrivilegedProvider();
        while (!isConnected()) {
            LiveLiterals$PrivilegedProviderKt liveLiterals$PrivilegedProviderKt = LiveLiterals$PrivilegedProviderKt.INSTANCE;
            timeout += liveLiterals$PrivilegedProviderKt.m2802Int$arg0$callplus$settimeout$body$loop$fungetService$classPrivilegedProvider();
            if (timeout <= liveLiterals$PrivilegedProviderKt.m2804Int$arg1$callgreater$cond$if$body$loop$fungetService$classPrivilegedProvider()) {
                Thread.sleep(liveLiterals$PrivilegedProviderKt.m2809Long$arg0$callsleep$body$loop$fungetService$classPrivilegedProvider());
            } else {
                throw new Exception(liveLiterals$PrivilegedProviderKt.m2813String$arg0$call$init$$branch$if$body$loop$fungetService$classPrivilegedProvider());
            }
        }
        IPrivilegedService service = connection.getSERVICE();
        Intrinsics.checkNotNull(service);
        return service;
    }

    public final boolean isConnected() {
        return connection.getSERVICE() != null;
    }
}
