package vegabobo.dsusideloader.ui.components;

import androidx.compose.material.ModalBottomSheetValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import vegabobo.dsusideloader.ui.components.CustomBottomSheetKt$CustomBottomSheet$2;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CustomBottomSheetKt$CustomBottomSheet$2.AnonymousClass2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetKt$CustomBottomSheet$2$2$emit$1(CustomBottomSheetKt$CustomBottomSheet$2.AnonymousClass2 r1, Continuation continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ModalBottomSheetValue) null, (Continuation) this);
    }
}
