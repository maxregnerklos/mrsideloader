package vegabobo.dsusideloader.ui.cards.warnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: StorageWarningCard.kt */
public final class StorageWarningCardKt$StorageWarningCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $minPercentageFreeStorage;
    public final /* synthetic */ Function0 $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageWarningCardKt$StorageWarningCard$2(String str, Function0 function0, int i) {
        super(2);
        this.$minPercentageFreeStorage = str;
        this.$onClick = function0;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StorageWarningCardKt.StorageWarningCard(this.$minPercentageFreeStorage, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
