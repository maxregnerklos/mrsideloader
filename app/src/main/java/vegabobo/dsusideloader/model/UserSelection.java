package vegabobo.dsusideloader.model;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import vegabobo.dsusideloader.util.FilenameUtils;

/* compiled from: Session.kt */
public final class UserSelection {
    public static final int $stable = LiveLiterals$SessionKt.INSTANCE.m2734Int$classUserSelection();
    public String selectedFileName;
    public Uri selectedFileUri;
    public long userSelectedImageSize;
    public long userSelectedUserdata;

    public UserSelection(long userSelectedUserdata2, long userSelectedImageSize2, Uri selectedFileUri2, String selectedFileName2) {
        Intrinsics.checkNotNullParameter(selectedFileUri2, "selectedFileUri");
        Intrinsics.checkNotNullParameter(selectedFileName2, "selectedFileName");
        this.userSelectedUserdata = userSelectedUserdata2;
        this.userSelectedImageSize = userSelectedImageSize2;
        this.selectedFileUri = selectedFileUri2;
        this.selectedFileName = selectedFileName2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserSelection(long r8, long r10, android.net.Uri r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x000b
            r8 = 2147483648(0x80000000, double:1.0609978955E-314)
            r1 = r8
            goto L_0x000c
        L_0x000b:
            r1 = r8
        L_0x000c:
            r8 = r14 & 2
            if (r8 == 0) goto L_0x0014
            r10 = -1
            r3 = r10
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0022
            android.net.Uri r12 = android.net.Uri.EMPTY
            java.lang.String r8 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)
            r5 = r12
            goto L_0x0023
        L_0x0022:
            r5 = r12
        L_0x0023:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x002f
            vegabobo.dsusideloader.model.LiveLiterals$SessionKt r8 = vegabobo.dsusideloader.model.LiveLiterals$SessionKt.INSTANCE
            java.lang.String r13 = r8.m2757String$paramselectedFileName$classUserSelection()
            r6 = r13
            goto L_0x0030
        L_0x002f:
            r6 = r13
        L_0x0030:
            r0 = r7
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.model.UserSelection.<init>(long, long, android.net.Uri, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getUserSelectedUserdata() {
        return this.userSelectedUserdata;
    }

    public final long getUserSelectedImageSize() {
        return this.userSelectedImageSize;
    }

    public final Uri getSelectedFileUri() {
        return this.selectedFileUri;
    }

    public final void setSelectedFileUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.selectedFileUri = uri;
    }

    public final String getSelectedFileName() {
        return this.selectedFileName;
    }

    public final void setSelectedFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedFileName = str;
    }

    public final String getUserDataSizeAsGB() {
        long j = this.userSelectedUserdata;
        LiveLiterals$SessionKt liveLiterals$SessionKt = LiveLiterals$SessionKt.INSTANCE;
        return String.valueOf(((j / liveLiterals$SessionKt.m2735Long$arg0$calldiv$$this$calldiv$$this$calldiv$0$str$fungetUserDataSizeAsGB$classUserSelection()) / liveLiterals$SessionKt.m2736Long$arg0$calldiv$$this$calldiv$0$str$fungetUserDataSizeAsGB$classUserSelection()) / liveLiterals$SessionKt.m2737Long$arg0$calldiv$0$str$fungetUserDataSizeAsGB$classUserSelection());
    }

    public final void setUserDataSize(String size) {
        long j;
        Intrinsics.checkNotNullParameter(size, "size");
        if (size.length() > 0) {
            long parseLong = Long.parseLong(FilenameUtils.Companion.getDigits(size));
            LiveLiterals$SessionKt liveLiterals$SessionKt = LiveLiterals$SessionKt.INSTANCE;
            j = parseLong * liveLiterals$SessionKt.m2738Long$arg0$calltimes$$this$calltimes$$this$calltimes$branch$if$arg0$call$setuserSelectedUserdata$$funsetUserDataSize$classUserSelection() * liveLiterals$SessionKt.m2739Long$arg0$calltimes$$this$calltimes$branch$if$arg0$call$setuserSelectedUserdata$$funsetUserDataSize$classUserSelection() * liveLiterals$SessionKt.m2740Long$arg0$calltimes$branch$if$arg0$call$setuserSelectedUserdata$$funsetUserDataSize$classUserSelection();
        } else {
            j = 2147483648L;
        }
        this.userSelectedUserdata = j;
    }

    public final void setImageSize(String size) {
        long j;
        Intrinsics.checkNotNullParameter(size, "size");
        if (size.length() > 0) {
            j = Long.parseLong(FilenameUtils.Companion.getDigits(size));
        } else {
            j = -1;
        }
        this.userSelectedImageSize = j;
    }

    public final boolean isCustomImageSize() {
        return this.userSelectedImageSize != -1;
    }

    public String toString() {
        LiveLiterals$SessionKt liveLiterals$SessionKt = LiveLiterals$SessionKt.INSTANCE;
        String r1 = liveLiterals$SessionKt.m2741String$0$str$$this$callplus$$this$callplus$$this$callplus$funtoString$classUserSelection();
        long j = this.userSelectedUserdata;
        String r4 = liveLiterals$SessionKt.m2748String$2$str$$this$callplus$$this$callplus$$this$callplus$funtoString$classUserSelection();
        String r5 = liveLiterals$SessionKt.m2742String$0$str$arg0$callplus$$this$callplus$$this$callplus$funtoString$classUserSelection();
        long j2 = this.userSelectedImageSize;
        String r8 = liveLiterals$SessionKt.m2749String$2$str$arg0$callplus$$this$callplus$$this$callplus$funtoString$classUserSelection();
        String r9 = liveLiterals$SessionKt.m2743String$0$str$arg0$callplus$$this$callplus$funtoString$classUserSelection();
        Uri uri = this.selectedFileUri;
        String r11 = liveLiterals$SessionKt.m2750String$2$str$arg0$callplus$$this$callplus$funtoString$classUserSelection();
        String r12 = liveLiterals$SessionKt.m2744String$0$str$arg0$callplus$funtoString$classUserSelection();
        String str = this.selectedFileName;
        String r0 = liveLiterals$SessionKt.m2751String$2$str$arg0$callplus$funtoString$classUserSelection();
        return r1 + j + r4 + r5 + j2 + r8 + r9 + uri + r11 + r12 + str + r0;
    }
}
