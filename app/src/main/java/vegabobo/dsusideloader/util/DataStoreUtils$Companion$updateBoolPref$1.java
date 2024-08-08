package vegabobo.dsusideloader.util;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import vegabobo.dsusideloader.util.DataStoreUtils;

/* compiled from: DataStoreUtils.kt */
public final class DataStoreUtils$Companion$updateBoolPref$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataStoreUtils.Companion this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreUtils$Companion$updateBoolPref$1(DataStoreUtils.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateBoolPref((DataStore) null, (String) null, false, (Function0) null, this);
    }
}
