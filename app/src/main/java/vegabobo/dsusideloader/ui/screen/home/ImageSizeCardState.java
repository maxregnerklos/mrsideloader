package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeUiState.kt */
public final class ImageSizeCardState {
    public static final int $stable = LiveLiterals$HomeUiStateKt.INSTANCE.m3212Int$classImageSizeCardState();
    public final boolean isSelected;
    public final String text;

    public static /* synthetic */ ImageSizeCardState copy$default(ImageSizeCardState imageSizeCardState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = imageSizeCardState.isSelected;
        }
        if ((i & 2) != 0) {
            str = imageSizeCardState.text;
        }
        return imageSizeCardState.copy(z, str);
    }

    public final ImageSizeCardState copy(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        return new ImageSizeCardState(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3148Boolean$branch$when$funequals$classImageSizeCardState();
        }
        if (!(obj instanceof ImageSizeCardState)) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3152Boolean$branch$when1$funequals$classImageSizeCardState();
        }
        ImageSizeCardState imageSizeCardState = (ImageSizeCardState) obj;
        return this.isSelected != imageSizeCardState.isSelected ? LiveLiterals$HomeUiStateKt.INSTANCE.m3157Boolean$branch$when2$funequals$classImageSizeCardState() : !Intrinsics.areEqual((Object) this.text, (Object) imageSizeCardState.text) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3161Boolean$branch$when3$funequals$classImageSizeCardState() : LiveLiterals$HomeUiStateKt.INSTANCE.m3179Boolean$funequals$classImageSizeCardState();
    }

    public int hashCode() {
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return (LiveLiterals$HomeUiStateKt.INSTANCE.m3193Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classImageSizeCardState() * (z ? 1 : 0)) + this.text.hashCode();
    }

    public String toString() {
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        String r1 = liveLiterals$HomeUiStateKt.m3217String$0$str$funtoString$classImageSizeCardState();
        String r2 = liveLiterals$HomeUiStateKt.m3221String$1$str$funtoString$classImageSizeCardState();
        boolean z = this.isSelected;
        String r4 = liveLiterals$HomeUiStateKt.m3249String$3$str$funtoString$classImageSizeCardState();
        String r5 = liveLiterals$HomeUiStateKt.m3253String$4$str$funtoString$classImageSizeCardState();
        String str = this.text;
        String r0 = liveLiterals$HomeUiStateKt.m3257String$6$str$funtoString$classImageSizeCardState();
        return r1 + r2 + z + r4 + r5 + str + r0;
    }

    public ImageSizeCardState(boolean isSelected2, String text2) {
        Intrinsics.checkNotNullParameter(text2, "text");
        this.isSelected = isSelected2;
        this.text = text2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSizeCardState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3186Boolean$paramisSelected$classImageSizeCardState() : z, (i & 2) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3269String$paramtext$classImageSizeCardState() : str);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final String getText() {
        return this.text;
    }
}
