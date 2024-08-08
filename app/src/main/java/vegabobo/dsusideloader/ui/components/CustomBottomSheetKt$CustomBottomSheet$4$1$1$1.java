package vegabobo.dsusideloader.ui.components;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$4$1$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ ModalBottomSheetState $sheetState;
    public final /* synthetic */ MutableState $shouldCallOnDismiss;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$4$1$1$1(ModalBottomSheetState modalBottomSheetState, MutableState mutableState, Continuation continuation) {
        super(1, continuation);
        this.$sheetState = modalBottomSheetState;
        this.$shouldCallOnDismiss = mutableState;
    }

    public final Continuation create(Continuation continuation) {
        return new CustomBottomSheetKt$CustomBottomSheet$4$1$1$1(this.$sheetState, this.$shouldCallOnDismiss, continuation);
    }

    public final Object invoke(Continuation continuation) {
        return ((CustomBottomSheetKt$CustomBottomSheet$4$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        CustomBottomSheetKt$CustomBottomSheet$4$1$1$1 customBottomSheetKt$CustomBottomSheet$4$1$1$1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                this.label = 1;
                if (modalBottomSheetState.hide(this) != coroutine_suspended) {
                    customBottomSheetKt$CustomBottomSheet$4$1$1$1 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                customBottomSheetKt$CustomBottomSheet$4$1$1$1 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        customBottomSheetKt$CustomBottomSheet$4$1$1$1.$shouldCallOnDismiss.setValue(Boxing.boxBoolean(LiveLiterals$CustomBottomSheetKt.INSTANCE.m2966Boolean$arg0$call$setvalue$$fun$anonymous$$arg1$callinvoke$fun$anonymous$$arg3$callColumn$fun$anonymous$$arg2$callBottomSheetContent$fun$anonymous$$arg0$callModalBottomSheetLayout$funCustomBottomSheet()));
        return Unit.INSTANCE;
    }
}
