package vegabobo.dsusideloader.ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: FileSelectionBox.kt */
public final class FileSelectionBoxKt$FileSelectionBox$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ KeyboardOptions $keyboardOptions;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1 $onValueChange;
    public final /* synthetic */ MutableInteractionSource $textFieldInteraction;
    public final /* synthetic */ String $textFieldTitle;
    public final /* synthetic */ String $textFieldValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSelectionBoxKt$FileSelectionBox$3(Modifier modifier, boolean z, KeyboardOptions keyboardOptions, boolean z2, boolean z3, String str, String str2, MutableInteractionSource mutableInteractionSource, Function1 function1, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$isReadOnly = z;
        this.$keyboardOptions = keyboardOptions;
        this.$isEnabled = z2;
        this.$isError = z3;
        this.$textFieldTitle = str;
        this.$textFieldValue = str2;
        this.$textFieldInteraction = mutableInteractionSource;
        this.$onValueChange = function1;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        FileSelectionBoxKt.FileSelectionBox(this.$modifier, this.$isReadOnly, this.$keyboardOptions, this.$isEnabled, this.$isError, this.$textFieldTitle, this.$textFieldValue, this.$textFieldInteraction, this.$onValueChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
