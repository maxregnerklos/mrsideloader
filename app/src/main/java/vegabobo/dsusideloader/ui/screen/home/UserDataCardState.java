package vegabobo.dsusideloader.ui.screen.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeUiState.kt */
public final class UserDataCardState {
    public static final int $stable = LiveLiterals$HomeUiStateKt.INSTANCE.m3214Int$classUserDataCardState();
    public final boolean isError;
    public final boolean isSelected;
    public final int maximumAllowed;
    public final String text;

    public static /* synthetic */ UserDataCardState copy$default(UserDataCardState userDataCardState, boolean z, boolean z2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = userDataCardState.isSelected;
        }
        if ((i2 & 2) != 0) {
            z2 = userDataCardState.isError;
        }
        if ((i2 & 4) != 0) {
            str = userDataCardState.text;
        }
        if ((i2 & 8) != 0) {
            i = userDataCardState.maximumAllowed;
        }
        return userDataCardState.copy(z, z2, str, i);
    }

    public final UserDataCardState copy(boolean z, boolean z2, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "text");
        return new UserDataCardState(z, z2, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3150Boolean$branch$when$funequals$classUserDataCardState();
        }
        if (!(obj instanceof UserDataCardState)) {
            return LiveLiterals$HomeUiStateKt.INSTANCE.m3154Boolean$branch$when1$funequals$classUserDataCardState();
        }
        UserDataCardState userDataCardState = (UserDataCardState) obj;
        return this.isSelected != userDataCardState.isSelected ? LiveLiterals$HomeUiStateKt.INSTANCE.m3159Boolean$branch$when2$funequals$classUserDataCardState() : this.isError != userDataCardState.isError ? LiveLiterals$HomeUiStateKt.INSTANCE.m3163Boolean$branch$when3$funequals$classUserDataCardState() : !Intrinsics.areEqual((Object) this.text, (Object) userDataCardState.text) ? LiveLiterals$HomeUiStateKt.INSTANCE.m3166Boolean$branch$when4$funequals$classUserDataCardState() : this.maximumAllowed != userDataCardState.maximumAllowed ? LiveLiterals$HomeUiStateKt.INSTANCE.m3169Boolean$branch$when5$funequals$classUserDataCardState() : LiveLiterals$HomeUiStateKt.INSTANCE.m3181Boolean$funequals$classUserDataCardState();
    }

    public int hashCode() {
        boolean z = this.isSelected;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        int r3 = liveLiterals$HomeUiStateKt.m3195Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classUserDataCardState() * (z ? 1 : 0);
        boolean z3 = this.isError;
        if (!z3) {
            z2 = z3;
        }
        return (liveLiterals$HomeUiStateKt.m3201Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classUserDataCardState() * ((liveLiterals$HomeUiStateKt.m3198Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classUserDataCardState() * (r3 + (z2 ? 1 : 0))) + this.text.hashCode())) + Integer.hashCode(this.maximumAllowed);
    }

    public String toString() {
        LiveLiterals$HomeUiStateKt liveLiterals$HomeUiStateKt = LiveLiterals$HomeUiStateKt.INSTANCE;
        String r1 = liveLiterals$HomeUiStateKt.m3219String$0$str$funtoString$classUserDataCardState();
        String r2 = liveLiterals$HomeUiStateKt.m3223String$1$str$funtoString$classUserDataCardState();
        boolean z = this.isSelected;
        String r4 = liveLiterals$HomeUiStateKt.m3251String$3$str$funtoString$classUserDataCardState();
        String r5 = liveLiterals$HomeUiStateKt.m3255String$4$str$funtoString$classUserDataCardState();
        boolean z2 = this.isError;
        String r7 = liveLiterals$HomeUiStateKt.m3259String$6$str$funtoString$classUserDataCardState();
        String r8 = liveLiterals$HomeUiStateKt.m3262String$7$str$funtoString$classUserDataCardState();
        String str = this.text;
        String r10 = liveLiterals$HomeUiStateKt.m3265String$9$str$funtoString$classUserDataCardState();
        String r11 = liveLiterals$HomeUiStateKt.m3226String$10$str$funtoString$classUserDataCardState();
        int i = this.maximumAllowed;
        String r0 = liveLiterals$HomeUiStateKt.m3229String$12$str$funtoString$classUserDataCardState();
        return r1 + r2 + z + r4 + r5 + z2 + r7 + r8 + str + r10 + r11 + i + r0;
    }

    public UserDataCardState(boolean isSelected2, boolean isError2, String text2, int maximumAllowed2) {
        Intrinsics.checkNotNullParameter(text2, "text");
        this.isSelected = isSelected2;
        this.isError = isError2;
        this.text = text2;
        this.maximumAllowed = maximumAllowed2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserDataCardState(boolean z, boolean z2, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3187Boolean$paramisSelected$classUserDataCardState() : z, (i2 & 2) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3183Boolean$paramisError$classUserDataCardState() : z2, (i2 & 4) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3271String$paramtext$classUserDataCardState() : str, (i2 & 8) != 0 ? LiveLiterals$HomeUiStateKt.INSTANCE.m3215Int$parammaximumAllowed$classUserDataCardState() : i);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final String getText() {
        return this.text;
    }

    public final int getMaximumAllowed() {
        return this.maximumAllowed;
    }
}
