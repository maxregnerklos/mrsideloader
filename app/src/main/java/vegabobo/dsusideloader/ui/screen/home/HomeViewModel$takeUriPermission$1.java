package vegabobo.dsusideloader.ui.screen.home;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$takeUriPermission$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$takeUriPermission$1(HomeViewModel homeViewModel, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$uri = uri;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$takeUriPermission$1(this.this$0, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$takeUriPermission$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0011:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0050
        L_0x0016:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel r2 = r1.this$0
            vegabobo.dsusideloader.core.StorageManager r2 = r2.storageManager
            android.net.Uri r3 = r1.$uri
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "uri.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r2 = r2.arePermissionsGrantedToFolder(r3)
            if (r2 == 0) goto L_0x0051
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel r2 = r1.this$0
            android.net.Uri r3 = r1.$uri
            java.lang.String r3 = r3.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel$takeUriPermission$1$1 r4 = new vegabobo.dsusideloader.ui.screen.home.HomeViewModel$takeUriPermission$1$1
            vegabobo.dsusideloader.ui.screen.home.HomeViewModel r5 = r1.this$0
            r4.<init>(r5)
            r5 = 1
            r1.label = r5
            java.lang.String r5 = "writable_path"
            java.lang.Object r2 = r2.updateStringPref(r5, r3, r4, r1)
            if (r2 != r0) goto L_0x004f
            return r0
        L_0x004f:
            r0 = r1
        L_0x0050:
            r1 = r0
        L_0x0051:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.home.HomeViewModel$takeUriPermission$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
