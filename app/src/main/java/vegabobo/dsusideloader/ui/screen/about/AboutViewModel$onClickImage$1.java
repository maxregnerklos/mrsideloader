package vegabobo.dsusideloader.ui.screen.about;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel$onClickImage$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public int label;
    public final /* synthetic */ AboutViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutViewModel$onClickImage$1(AboutViewModel aboutViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aboutViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutViewModel$onClickImage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AboutViewModel$onClickImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r12 = !((java.lang.Boolean) r12).booleanValue();
        r5 = r4.this$0.tag;
        r6 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE.m3116String$0$str$arg1$calld$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r12 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        android.util.Log.d(r5, r6 + r8);
        r5 = r4.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r12 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r6 = new vegabobo.dsusideloader.ui.screen.about.AboutViewModel$onClickImage$1.AnonymousClass1();
        r4.I$0 = r12;
        r4.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (r5.updateBoolPref("developer_options", r3, r6, r4) != r0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r2 = r12;
        r12 = r1;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r2 != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r1 = r8.this$0;
        r3 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE.m3092Boolean$arg1$callupdateBoolPref$branch$if$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel();
        r8.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (vegabobo.dsusideloader.core.BaseViewModel.updateBoolPref$default(r1, "disable_storage_check", r3, (kotlin.jvm.functions.Function1) null, r8, 4, (java.lang.Object) null) != r0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r1 = r8.this$0;
        r3 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE.m3093Boolean$arg1$callupdateBoolPref1$branch$if$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel();
        r8.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (vegabobo.dsusideloader.core.BaseViewModel.updateBoolPref$default(r1, "full_logcat_logging", r3, (kotlin.jvm.functions.Function1) null, r8, 4, (java.lang.Object) null) != r0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            java.lang.String r2 = "developer_options"
            r3 = 1
            switch(r1) {
                case 0: goto L_0x0031;
                case 1: goto L_0x002a;
                case 2: goto L_0x0021;
                case 3: goto L_0x001a;
                case 4: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0014:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00bd
        L_0x001a:
            r1 = r11
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r1
            goto L_0x00a4
        L_0x0021:
            r1 = r11
            int r2 = r1.I$0
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r1
            goto L_0x008a
        L_0x002a:
            r1 = r11
            kotlin.ResultKt.throwOnFailure(r12)
            r4 = r1
            r1 = r12
            goto L_0x0044
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r11
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r4 = r1.this$0
            r1.label = r3
            java.lang.Object r4 = r4.readBoolPref(r2, r1)
            if (r4 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r10 = r1
            r1 = r12
            r12 = r4
            r4 = r10
        L_0x0044:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r12 = r12 ^ r3
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r5 = r4.this$0
            java.lang.String r5 = r5.tag
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r6 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            java.lang.String r6 = r6.m3116String$0$str$arg1$calld$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel()
            r7 = 0
            if (r12 == 0) goto L_0x005c
            r8 = r3
            goto L_0x005d
        L_0x005c:
            r8 = r7
        L_0x005d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            android.util.Log.d(r5, r6)
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r5 = r4.this$0
            if (r12 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = r7
        L_0x0076:
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel$onClickImage$1$1 r6 = new vegabobo.dsusideloader.ui.screen.about.AboutViewModel$onClickImage$1$1
            r6.<init>(r5)
            r4.I$0 = r12
            r7 = 2
            r4.label = r7
            java.lang.Object r2 = r5.updateBoolPref(r2, r3, r6, r4)
            if (r2 != r0) goto L_0x0087
            return r0
        L_0x0087:
            r2 = r12
            r12 = r1
            r8 = r4
        L_0x008a:
            if (r2 != 0) goto L_0x00be
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r1 = r8.this$0
            java.lang.String r2 = "disable_storage_check"
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r3 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            boolean r3 = r3.m3092Boolean$arg1$callupdateBoolPref$branch$if$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel()
            r4 = 0
            r6 = 4
            r7 = 0
            r5 = 3
            r8.label = r5
            r5 = r8
            java.lang.Object r1 = vegabobo.dsusideloader.core.BaseViewModel.updateBoolPref$default(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r0) goto L_0x00a4
            return r0
        L_0x00a4:
            vegabobo.dsusideloader.ui.screen.about.AboutViewModel r1 = r8.this$0
            java.lang.String r2 = "full_logcat_logging"
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r3 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            boolean r3 = r3.m3093Boolean$arg1$callupdateBoolPref1$branch$if$fun$anonymous$$arg2$calllaunch$branch$if$funonClickImage$classAboutViewModel()
            r4 = 0
            r6 = 4
            r7 = 0
            r5 = 4
            r8.label = r5
            r5 = r8
            java.lang.Object r1 = vegabobo.dsusideloader.core.BaseViewModel.updateBoolPref$default(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r0 = r8
        L_0x00bd:
            r8 = r0
        L_0x00be:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.about.AboutViewModel$onClickImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
