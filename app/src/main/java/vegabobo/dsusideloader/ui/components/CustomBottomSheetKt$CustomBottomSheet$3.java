package vegabobo.dsusideloader.ui.components;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$3 extends Lambda implements Function0 {
    public final /* synthetic */ CoroutineScope $coroutineScope;
    public final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$3(CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
        super(0);
        this.$coroutineScope = coroutineScope;
        this.$sheetState = modalBottomSheetState;
    }

    public final void invoke() {
        CoroutineScope coroutineScope = this.$coroutineScope;
        final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
    }

    /* renamed from: vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$3$1  reason: invalid class name */
    /* compiled from: CustomBottomSheet.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public int label;

        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(modalBottomSheetState, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                    this.label = 1;
                    if (modalBottomSheetState.hide(this) != coroutine_suspended) {
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
}
