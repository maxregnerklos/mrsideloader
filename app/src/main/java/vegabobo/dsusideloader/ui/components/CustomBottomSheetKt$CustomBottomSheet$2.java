package vegabobo.dsusideloader.ui.components;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isFirst;
    public final /* synthetic */ Function0 $onDismiss;
    public final /* synthetic */ ModalBottomSheetState $sheetState;
    public final /* synthetic */ MutableState $shouldCallOnDismiss;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$2(ModalBottomSheetState modalBottomSheetState, MutableState mutableState, MutableState mutableState2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = modalBottomSheetState;
        this.$isFirst = mutableState;
        this.$shouldCallOnDismiss = mutableState2;
        this.$onDismiss = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomBottomSheetKt$CustomBottomSheet$2(this.$sheetState, this.$isFirst, this.$shouldCallOnDismiss, this.$onDismiss, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CustomBottomSheetKt$CustomBottomSheet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() {
                    public final ModalBottomSheetValue invoke() {
                        return modalBottomSheetState.getCurrentValue();
                    }
                });
                final MutableState mutableState = this.$isFirst;
                final ModalBottomSheetState modalBottomSheetState2 = this.$sheetState;
                final MutableState mutableState2 = this.$shouldCallOnDismiss;
                final Function0 function0 = this.$onDismiss;
                AnonymousClass2 r3 = new FlowCollector() {
                    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(androidx.compose.material.ModalBottomSheetValue r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r6
                            vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1 r0 = (vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1 r0 = new vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1
                            r0.<init>(r4, r6)
                        L_0x0018:
                            r6 = r0
                            java.lang.Object r0 = r6.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r6.label
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
                            java.lang.Object r5 = r6.L$0
                            vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2$2 r5 = (vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2.AnonymousClass2) r5
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L_0x0059
                        L_0x0034:
                            kotlin.ResultKt.throwOnFailure(r0)
                            r2 = r4
                            androidx.compose.material.ModalBottomSheetValue r3 = androidx.compose.material.ModalBottomSheetValue.Hidden
                            if (r5 != r3) goto L_0x0081
                            androidx.compose.runtime.MutableState r5 = r4
                            java.lang.Object r5 = r5.getValue()
                            java.lang.Boolean r5 = (java.lang.Boolean) r5
                            boolean r5 = r5.booleanValue()
                            if (r5 == 0) goto L_0x006b
                            androidx.compose.material.ModalBottomSheetState r5 = r5
                            r6.L$0 = r2
                            r3 = 1
                            r6.label = r3
                            java.lang.Object r5 = r5.show(r6)
                            if (r5 != r1) goto L_0x0058
                            return r1
                        L_0x0058:
                            r5 = r2
                        L_0x0059:
                            androidx.compose.runtime.MutableState r1 = r4
                            vegabobo.dsusideloader.ui.components.LiveLiterals$CustomBottomSheetKt r2 = vegabobo.dsusideloader.ui.components.LiveLiterals$CustomBottomSheetKt.INSTANCE
                            boolean r2 = r2.m2965Boolean$arg0$call$setvalue$$branch$if$branch$if$fun$anonymous$$arg0$callcollect$fun$anonymous$$arg1$callLaunchedEffect$funCustomBottomSheet()
                            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                            r1.setValue(r2)
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        L_0x006b:
                            androidx.compose.runtime.MutableState r5 = r6
                            java.lang.Object r5 = r5.getValue()
                            java.lang.Boolean r5 = (java.lang.Boolean) r5
                            boolean r5 = r5.booleanValue()
                            if (r5 == 0) goto L_0x0081
                            kotlin.jvm.functions.Function0 r5 = r7
                            r5.invoke()
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        L_0x0081:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2.AnonymousClass2.emit(androidx.compose.material.ModalBottomSheetValue, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                };
                this.label = 1;
                if (snapshotFlow.collect(r3, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
