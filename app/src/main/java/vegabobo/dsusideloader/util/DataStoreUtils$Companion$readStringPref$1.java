package vegabobo.dsusideloader.util;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import vegabobo.dsusideloader.util.DataStoreUtils;

/* compiled from: DataStoreUtils.kt */
public final class DataStoreUtils$Companion$readStringPref$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataStoreUtils.Companion this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreUtils$Companion$readStringPref$1(DataStoreUtils.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readStringPref((DataStore) null, (String) null, (String) null, this);
    }
}
