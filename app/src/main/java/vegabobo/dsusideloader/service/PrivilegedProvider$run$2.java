package vegabobo.dsusideloader.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrivilegedProvider.kt */
public final class PrivilegedProvider$run$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $onConnected;
    public final /* synthetic */ Function0 $onFail;
    public int I$0;
    public int label;
    public final /* synthetic */ PrivilegedProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivilegedProvider$run$2(Function2 function2, Function0 function0, PrivilegedProvider privilegedProvider, Continuation continuation) {
        super(2, continuation);
        this.$onConnected = function2;
        this.$onFail = function0;
        this.this$0 = privilegedProvider;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new PrivilegedProvider$run$2(this.$onConnected, this.$onFail, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PrivilegedProvider$run$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (vegabobo.dsusideloader.service.PrivilegedProvider.INSTANCE.isConnected() != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE;
        r2 = r2 + r3.m2801Int$arg0$callplus$settimeout$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r2 <= r3.m2803Int$arg1$callgreater$cond$if$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        android.util.Log.e(vegabobo.dsusideloader.service.PrivilegedProvider.tag, r3.m2814String$arg1$calle$branch$if$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider());
        r0.$onFail.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r3 = r3.m2808Long$arg0$calldelay$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider();
        r0.I$0 = r2;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (kotlinx.coroutines.DelayKt.delay(r3, r0) != r1) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r3 = vegabobo.dsusideloader.service.PrivilegedProvider.tag;
        r4 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE;
        r5 = r4.m2810String$0$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider();
        r4 = r4.m2812String$2$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider();
        android.util.Log.d(r3, r5 + (r2 / r4.m2800Int$arg0$calldiv$1$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        r2 = vegabobo.dsusideloader.service.PrivilegedProvider.tag;
        r3 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE.m2811String$0$str$arg1$calld$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider();
        r4 = vegabobo.dsusideloader.service.PrivilegedProvider.run$service(r0.this$0).getUid();
        android.util.Log.d(r2, r3 + r4);
        r2 = r0.$onConnected;
        r3 = vegabobo.dsusideloader.service.PrivilegedProvider.run$service(r0.this$0);
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r2.invoke(r3, r0) != r1) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0021;
                case 2: goto L_0x0017;
                case 3: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0011:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00eb
        L_0x0017:
            r1 = r9
            int r2 = r1.I$0
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0089
        L_0x0021:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0045
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r9
            vegabobo.dsusideloader.service.PrivilegedProvider r2 = vegabobo.dsusideloader.service.PrivilegedProvider.INSTANCE
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto L_0x0048
            kotlin.jvm.functions.Function2 r2 = r1.$onConnected
            vegabobo.dsusideloader.service.PrivilegedProvider r3 = r1.this$0
            vegabobo.dsusideloader.IPrivilegedService r3 = vegabobo.dsusideloader.service.PrivilegedProvider.run$service(r3)
            r4 = 1
            r1.label = r4
            java.lang.Object r2 = r2.invoke(r3, r1)
            if (r2 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r0 = r1
        L_0x0045:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L_0x0048:
            vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt r2 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE
            int r2 = r2.m2806Int$valtimeout$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0051:
            vegabobo.dsusideloader.service.PrivilegedProvider r3 = vegabobo.dsusideloader.service.PrivilegedProvider.INSTANCE
            boolean r3 = r3.isConnected()
            if (r3 != 0) goto L_0x00b3
            vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt r3 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE
            int r4 = r3.m2801Int$arg0$callplus$settimeout$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            int r2 = r2 + r4
            int r4 = r3.m2803Int$arg1$callgreater$cond$if$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            if (r2 <= r4) goto L_0x0079
            java.lang.String r1 = vegabobo.dsusideloader.service.PrivilegedProvider.tag
            java.lang.String r3 = r3.m2814String$arg1$calle$branch$if$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            android.util.Log.e(r1, r3)
            kotlin.jvm.functions.Function0 r1 = r0.$onFail
            r1.invoke()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L_0x0079:
            long r3 = r3.m2808Long$arg0$calldelay$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            r0.I$0 = r2
            r5 = 2
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r0)
            if (r3 != r1) goto L_0x0089
            return r1
        L_0x0089:
            java.lang.String r3 = vegabobo.dsusideloader.service.PrivilegedProvider.tag
            vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt r4 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE
            java.lang.String r5 = r4.m2810String$0$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            int r6 = r4.m2800Int$arg0$calldiv$1$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            int r6 = r2 / r6
            java.lang.String r4 = r4.m2812String$2$str$arg1$calld$body$loop$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.d(r3, r4)
            goto L_0x0051
        L_0x00b3:
            java.lang.String r2 = vegabobo.dsusideloader.service.PrivilegedProvider.tag
            vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt r3 = vegabobo.dsusideloader.service.LiveLiterals$PrivilegedProviderKt.INSTANCE
            java.lang.String r3 = r3.m2811String$0$str$arg1$calld$fun$anonymous$$arg2$calllaunch$funrun$classPrivilegedProvider()
            vegabobo.dsusideloader.service.PrivilegedProvider r4 = r0.this$0
            vegabobo.dsusideloader.IPrivilegedService r4 = vegabobo.dsusideloader.service.PrivilegedProvider.run$service(r4)
            int r4 = r4.getUid()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r2, r3)
            kotlin.jvm.functions.Function2 r2 = r0.$onConnected
            vegabobo.dsusideloader.service.PrivilegedProvider r3 = r0.this$0
            vegabobo.dsusideloader.IPrivilegedService r3 = vegabobo.dsusideloader.service.PrivilegedProvider.run$service(r3)
            r4 = 3
            r0.label = r4
            java.lang.Object r2 = r2.invoke(r3, r0)
            if (r2 != r1) goto L_0x00eb
            return r1
        L_0x00eb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.service.PrivilegedProvider$run$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
