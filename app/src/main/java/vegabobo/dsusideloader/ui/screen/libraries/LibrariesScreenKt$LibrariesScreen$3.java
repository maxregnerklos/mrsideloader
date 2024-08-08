package vegabobo.dsusideloader.ui.screen.libraries;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: LibrariesScreen.kt */
public final class LibrariesScreenKt$LibrariesScreen$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function1 $navigate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibrariesScreenKt$LibrariesScreen$3(Function1 function1, int i) {
        super(2);
        this.$navigate = function1;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LibrariesScreenKt.LibrariesScreen(this.$navigate, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
