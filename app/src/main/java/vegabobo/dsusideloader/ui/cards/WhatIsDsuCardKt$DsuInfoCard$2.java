package vegabobo.dsusideloader.ui.cards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: WhatIsDsuCard.kt */
public final class WhatIsDsuCardKt$DsuInfoCard$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0 $onClickLearnMore;
    public final /* synthetic */ Function0 $onClickViewDocs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WhatIsDsuCardKt$DsuInfoCard$2(Modifier modifier, Function0 function0, Function0 function02, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$onClickViewDocs = function0;
        this.$onClickLearnMore = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        WhatIsDsuCardKt.DsuInfoCard(this.$modifier, this.$onClickViewDocs, this.$onClickLearnMore, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
