package vegabobo.dsusideloader.util;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CollectAsStateWithLifecycle.kt */
public final class CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2(Lifecycle lifecycle, Lifecycle.State state, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_collectAsStateWithLifecycle = flow;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2 collectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2 = new CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2(this.$lifecycle, this.$minActiveState, this.$this_collectAsStateWithLifecycle, continuation);
        collectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2.L$0 = obj;
        return collectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2;
    }

    public final Object invoke(ProduceStateScope produceStateScope, Continuation continuation) {
        return ((CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: vegabobo.dsusideloader.util.CollectAsStateWithLifecycleKt$collectAsStateWithLifecycle$2$1  reason: invalid class name */
    /* compiled from: CollectAsStateWithLifecycle.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public int label;

        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(flow, $this$produceState, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Flow flow = flow;
                    final ProduceStateScope produceStateScope = $this$produceState;
                    AnonymousClass1 r3 = new FlowCollector() {
                        public final Object emit(Object it, Continuation $completion) {
                            produceStateScope.setValue(it);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(r3, this) != coroutine_suspended) {
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

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final ProduceStateScope $this$produceState = (ProduceStateScope) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                final Flow flow = this.$this_collectAsStateWithLifecycle;
                AnonymousClass1 r5 = new AnonymousClass1((Continuation) null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, r5, this) != coroutine_suspended) {
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
