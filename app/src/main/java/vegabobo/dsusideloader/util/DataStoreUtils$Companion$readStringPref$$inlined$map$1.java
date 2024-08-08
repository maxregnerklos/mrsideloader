package vegabobo.dsusideloader.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SafeCollector.common.kt */
public final class DataStoreUtils$Companion$readStringPref$$inlined$map$1 implements Flow {
    public final /* synthetic */ String $default$inlined;
    public final /* synthetic */ String $key$inlined;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public DataStoreUtils$Companion$readStringPref$$inlined$map$1(Flow flow, String str, String str2) {
        this.$this_unsafeTransform$inlined = flow;
        this.$key$inlined = str;
        this.$default$inlined = str2;
    }

    public Object collect(FlowCollector collector, Continuation $completion) {
        final FlowCollector $this$unsafeTransform_u24lambda_u2d0 = collector;
        Continuation continuation = $completion;
        Flow flow = this.$this_unsafeTransform$inlined;
        final String str = this.$key$inlined;
        final String str2 = this.$default$inlined;
        Object collect = flow.collect(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1$2$1 r0 = (vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1$2$1 r0 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    r9 = r0
                    java.lang.Object r0 = r9.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r9.label
                    switch(r2) {
                        case 0: goto L_0x0031;
                        case 1: goto L_0x002c;
                        default: goto L_0x0024;
                    }
                L_0x0024:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x002c:
                    r8 = 0
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L_0x0056
                L_0x0031:
                    kotlin.ResultKt.throwOnFailure(r0)
                    r2 = r7
                    kotlinx.coroutines.flow.FlowCollector r3 = r0
                    r4 = 0
                    androidx.datastore.preferences.core.Preferences r8 = (androidx.datastore.preferences.core.Preferences) r8
                    r5 = 0
                    java.lang.String r6 = r5
                    androidx.datastore.preferences.core.Preferences$Key r6 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r6)
                    java.lang.Object r6 = r8.get(r6)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 != 0) goto L_0x004b
                    java.lang.String r6 = r6
                L_0x004b:
                    r8 = 1
                    r9.label = r8
                    java.lang.Object r8 = r3.emit(r6, r9)
                    if (r8 != r1) goto L_0x0055
                    return r1
                L_0x0055:
                    r8 = r4
                L_0x0056:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, $completion);
        return collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
