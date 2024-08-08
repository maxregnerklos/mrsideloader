package vegabobo.dsusideloader.core;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.util.DataStoreUtils;

/* compiled from: BaseViewModel.kt */
public abstract class BaseViewModel extends ViewModel {
    public static final int $stable = LiveLiterals$BaseViewModelKt.INSTANCE.m2553Int$classBaseViewModel();
    public final DataStore dataStore;

    public abstract DataStore getDataStore();

    public BaseViewModel(DataStore dataStore2) {
        Intrinsics.checkNotNullParameter(dataStore2, "dataStore");
        this.dataStore = dataStore2;
    }

    public final Object readStringPref(String key, Continuation $completion) {
        return DataStoreUtils.Companion.readStringPref(getDataStore(), key, LiveLiterals$BaseViewModelKt.INSTANCE.m2554String$arg2$callreadStringPref$funreadStringPref$classBaseViewModel(), $completion);
    }

    public final Object readBoolPref(String key, Continuation $completion) {
        return DataStoreUtils.Companion.readBoolPref(getDataStore(), key, LiveLiterals$BaseViewModelKt.INSTANCE.m2552Boolean$arg2$callreadBoolPref$funreadBoolPref$classBaseViewModel(), $completion);
    }

    public static /* synthetic */ Object updateBoolPref$default(BaseViewModel baseViewModel, String str, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = BaseViewModel$updateBoolPref$2.INSTANCE;
            }
            return baseViewModel.updateBoolPref(str, z, function1, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBoolPref");
    }

    public final Object updateBoolPref(String key, boolean value, Function1 onRead, Continuation $completion) {
        Object updateBoolPref = DataStoreUtils.Companion.updateBoolPref(getDataStore(), key, value, new BaseViewModel$updateBoolPref$3(onRead, value), $completion);
        return updateBoolPref == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateBoolPref : Unit.INSTANCE;
    }

    public final Object updateStringPref(String key, String value, Function1 onRead, Continuation $completion) {
        Object updateStringPref = DataStoreUtils.Companion.updateStringPref(getDataStore(), key, value, new BaseViewModel$updateStringPref$3(onRead, value), $completion);
        return updateStringPref == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateStringPref : Unit.INSTANCE;
    }
}
