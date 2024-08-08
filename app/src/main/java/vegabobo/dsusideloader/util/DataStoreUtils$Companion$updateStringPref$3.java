package vegabobo.dsusideloader.util;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: DataStoreUtils.kt */
public final class DataStoreUtils$Companion$updateStringPref$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $value;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreUtils$Companion$updateStringPref$3(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$key = str;
        this.$value = str2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreUtils$Companion$updateStringPref$3 dataStoreUtils$Companion$updateStringPref$3 = new DataStoreUtils$Companion$updateStringPref$3(this.$key, this.$value, continuation);
        dataStoreUtils$Companion$updateStringPref$3.L$0 = obj;
        return dataStoreUtils$Companion$updateStringPref$3;
    }

    public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
        return ((DataStoreUtils$Companion$updateStringPref$3) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.L$0).set(PreferencesKeys.stringKey(this.$key), this.$value);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
