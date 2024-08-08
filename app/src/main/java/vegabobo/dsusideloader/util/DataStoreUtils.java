package vegabobo.dsusideloader.util;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DataStoreUtils.kt */
public abstract class DataStoreUtils {
    public static final int $stable = LiveLiterals$DataStoreUtilsKt.INSTANCE.m3420Int$classDataStoreUtils();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: DataStoreUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Object readBoolPref(DataStore dataStore, String key, boolean z, Continuation $completion) {
            return FlowKt.first(new DataStoreUtils$Companion$readBoolPref$$inlined$map$1(dataStore.getData(), key, z), $completion);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object readStringPref(androidx.datastore.core.DataStore r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
            /*
                r7 = this;
                boolean r0 = r11 instanceof vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$1
                if (r0 == 0) goto L_0x0013
                r0 = r11
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$1 r0 = (vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$1 r0 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$1
                r0.<init>(r7, r11)
            L_0x0018:
                r11 = r0
                java.lang.Object r0 = r11.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r11.label
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
                kotlin.ResultKt.throwOnFailure(r0)
                r8 = r0
                goto L_0x004d
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r0)
                kotlinx.coroutines.flow.Flow r8 = r8.getData()
                r2 = 0
                r3 = r8
                r4 = 0
                r5 = 0
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1 r6 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$$inlined$map$1
                r6.<init>(r3, r9, r10)
                r8 = 1
                r11.label = r8
                java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r6, r11)
                if (r8 != r1) goto L_0x004d
                return r1
            L_0x004d:
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = r8.toString()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.util.DataStoreUtils.Companion.readStringPref(androidx.datastore.core.DataStore, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object readStringPref(androidx.datastore.core.DataStore r5, java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
            /*
                r4 = this;
                boolean r0 = r9 instanceof vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$3
                if (r0 == 0) goto L_0x0013
                r0 = r9
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$3 r0 = (vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$3) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$3 r0 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$readStringPref$3
                r0.<init>(r4, r9)
            L_0x0018:
                r9 = r0
                java.lang.Object r0 = r9.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                switch(r2) {
                    case 0: goto L_0x0036;
                    case 1: goto L_0x002c;
                    default: goto L_0x0024;
                }
            L_0x0024:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002c:
                java.lang.Object r5 = r9.L$0
                kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                kotlin.ResultKt.throwOnFailure(r0)
                r8 = r5
                r5 = r0
                goto L_0x0046
            L_0x0036:
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r4
                r9.L$0 = r8
                r3 = 1
                r9.label = r3
                java.lang.Object r5 = r2.readStringPref(r5, r6, r7, r9)
                if (r5 != r1) goto L_0x0046
                return r1
            L_0x0046:
                java.lang.String r5 = (java.lang.String) r5
                r8.invoke(r5)
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.util.DataStoreUtils.Companion.readStringPref(androidx.datastore.core.DataStore, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object updateBoolPref(androidx.datastore.core.DataStore r6, java.lang.String r7, boolean r8, kotlin.jvm.functions.Function0 r9, kotlin.coroutines.Continuation r10) {
            /*
                r5 = this;
                boolean r0 = r10 instanceof vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$1
                if (r0 == 0) goto L_0x0013
                r0 = r10
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$1 r0 = (vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$1 r0 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$1
                r0.<init>(r5, r10)
            L_0x0018:
                r10 = r0
                java.lang.Object r0 = r10.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r10.label
                switch(r2) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002c;
                    default: goto L_0x0024;
                }
            L_0x0024:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x002c:
                java.lang.Object r6 = r10.L$0
                kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                kotlin.ResultKt.throwOnFailure(r0)
                goto L_0x004f
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r0)
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$3 r2 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateBoolPref$3
                r3 = 1
                if (r8 == 0) goto L_0x003e
                r8 = r3
                goto L_0x003f
            L_0x003e:
                r8 = 0
            L_0x003f:
                r4 = 0
                r2.<init>(r7, r8, r4)
                r10.L$0 = r9
                r10.label = r3
                java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r6, r2, r10)
                if (r6 != r1) goto L_0x004e
                return r1
            L_0x004e:
                r6 = r9
            L_0x004f:
                r6.invoke()
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.util.DataStoreUtils.Companion.updateBoolPref(androidx.datastore.core.DataStore, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object updateStringPref(androidx.datastore.core.DataStore r5, java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function0 r8, kotlin.coroutines.Continuation r9) {
            /*
                r4 = this;
                boolean r0 = r9 instanceof vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$1 r0 = (vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$1 r0 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$1
                r0.<init>(r4, r9)
            L_0x0018:
                r9 = r0
                java.lang.Object r0 = r9.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                switch(r2) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002c;
                    default: goto L_0x0024;
                }
            L_0x0024:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002c:
                java.lang.Object r5 = r9.L$0
                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                kotlin.ResultKt.throwOnFailure(r0)
                goto L_0x004a
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r0)
                vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$3 r2 = new vegabobo.dsusideloader.util.DataStoreUtils$Companion$updateStringPref$3
                r3 = 0
                r2.<init>(r6, r7, r3)
                r9.L$0 = r8
                r3 = 1
                r9.label = r3
                java.lang.Object r5 = androidx.datastore.preferences.core.PreferencesKt.edit(r5, r2, r9)
                if (r5 != r1) goto L_0x0049
                return r1
            L_0x0049:
                r5 = r8
            L_0x004a:
                r5.invoke()
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.util.DataStoreUtils.Companion.updateStringPref(androidx.datastore.core.DataStore, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
