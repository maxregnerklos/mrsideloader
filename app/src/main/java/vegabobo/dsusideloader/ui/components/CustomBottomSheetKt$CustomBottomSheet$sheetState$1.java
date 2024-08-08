package vegabobo.dsusideloader.ui.components;

import androidx.compose.material.ModalBottomSheetValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: CustomBottomSheet.kt */
public final class CustomBottomSheetKt$CustomBottomSheet$sheetState$1 extends Lambda implements Function1 {
    public static final CustomBottomSheetKt$CustomBottomSheet$sheetState$1 INSTANCE = new CustomBottomSheetKt$CustomBottomSheet$sheetState$1();

    public CustomBottomSheetKt$CustomBottomSheet$sheetState$1() {
        super(1);
    }

    public final Boolean invoke(ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it != ModalBottomSheetValue.HalfExpanded);
    }
}
