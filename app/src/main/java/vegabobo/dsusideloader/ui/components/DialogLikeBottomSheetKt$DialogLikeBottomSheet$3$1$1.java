package vegabobo.dsusideloader.ui.components;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: DialogLikeBottomSheet.kt */
public final class DialogLikeBottomSheetKt$DialogLikeBottomSheet$3$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ CoroutineScope $coroutineScope;
    public final /* synthetic */ Function1 $it;
    public final /* synthetic */ Function0 $onClickCancel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLikeBottomSheetKt$DialogLikeBottomSheet$3$1$1(CoroutineScope coroutineScope, Function1 function1, Function0 function0) {
        super(0);
        this.$coroutineScope = coroutineScope;
        this.$it = function1;
        this.$onClickCancel = function0;
    }

    public final void invoke() {
        CoroutineScope coroutineScope = this.$coroutineScope;
        final Function1 function1 = this.$it;
        final Function0 function0 = this.$onClickCancel;
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
    }

    /* renamed from: vegabobo.dsusideloader.ui.components.DialogLikeBottomSheetKt$DialogLikeBottomSheet$3$1$1$1  reason: invalid class name */
    /* compiled from: DialogLikeBottomSheet.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public int label;

        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(function1, function0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            AnonymousClass1 r0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function1 function1 = function1;
                    this.label = 1;
                    if (function1.invoke(this) != coroutine_suspended) {
                        r0 = this;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    r0 = this;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
