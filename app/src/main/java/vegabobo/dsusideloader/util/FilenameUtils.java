package vegabobo.dsusideloader.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: FilenameUtils.kt */
public abstract class FilenameUtils {
    public static final int $stable = LiveLiterals$FilenameUtilsKt.INSTANCE.m3430Int$classFilenameUtils();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: FilenameUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final String appendToDigitsToString(String input, String textToAppend) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(textToAppend, "textToAppend");
            CharSequence $this$filterTo$iv$iv = input;
            StringBuilder sb = new StringBuilder();
            int length = $this$filterTo$iv$iv.length();
            for (int index$iv$iv = 0; index$iv$iv < length; index$iv$iv++) {
                char element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
                if (Character.isDigit(element$iv$iv)) {
                    sb.append(element$iv$iv);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            String newText = sb2 + textToAppend;
            if (Intrinsics.areEqual((Object) newText, (Object) textToAppend)) {
                return LiveLiterals$FilenameUtilsKt.INSTANCE.m3446String$setnewText$branch$if$funappendToDigitsToString$classCompanion$classFilenameUtils();
            }
            return newText;
        }

        public final String getFilePath(Uri uri, boolean addQuotes) {
            StringBuilder sb;
            String str;
            Intrinsics.checkNotNullParameter(uri, "uri");
            String input = String.valueOf(uri.getPath());
            LiveLiterals$FilenameUtilsKt liveLiterals$FilenameUtilsKt = LiveLiterals$FilenameUtilsKt.INSTANCE;
            String safStorage = StringsKt__StringsJVMKt.replace$default((String) StringsKt__StringsKt.split$default(input, new String[]{liveLiterals$FilenameUtilsKt.m3435String$0$vararg$arg0$callsplit$$this$callget$$$this$callreplace$valsafStorage$fungetFilePath$classCompanion$classFilenameUtils()}, false, 0, 6, (Object) null).get(liveLiterals$FilenameUtilsKt.m3428Int$arg0$callget$$$this$callreplace$valsafStorage$fungetFilePath$classCompanion$classFilenameUtils()), liveLiterals$FilenameUtilsKt.m3442String$arg0$callreplace$valsafStorage$fungetFilePath$classCompanion$classFilenameUtils(), liveLiterals$FilenameUtilsKt.m3445String$arg1$callreplace$valsafStorage$fungetFilePath$classCompanion$classFilenameUtils(), false, 4, (Object) null);
            String path = (String) StringsKt__StringsKt.split$default(safStorage, new String[]{liveLiterals$FilenameUtilsKt.m3436String$0$vararg$arg0$callsplit$$this$callget$valpath$fungetFilePath$classCompanion$classFilenameUtils()}, false, 0, 6, (Object) null).get(liveLiterals$FilenameUtilsKt.m3429Int$arg0$callget$valpath$fungetFilePath$classCompanion$classFilenameUtils());
            if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) liveLiterals$FilenameUtilsKt.m3439String$arg0$callcontains$cond$if$fungetFilePath$classCompanion$classFilenameUtils(), false, 2, (Object) null)) {
                if (addQuotes) {
                    str = liveLiterals$FilenameUtilsKt.m3431String$0$str$branch$if$branch$if$fungetFilePath$classCompanion$classFilenameUtils();
                    sb = new StringBuilder();
                } else {
                    str = liveLiterals$FilenameUtilsKt.m3434String$0$str$else$if$branch$if$fungetFilePath$classCompanion$classFilenameUtils();
                    sb = new StringBuilder();
                }
                sb.append(str);
                sb.append(path);
                return sb.toString();
            } else if (StringsKt__StringsKt.contains$default((CharSequence) safStorage, (CharSequence) liveLiterals$FilenameUtilsKt.m3440String$arg0$callcontains$cond$if1$fungetFilePath$classCompanion$classFilenameUtils(), false, 2, (Object) null)) {
                String finalPath = liveLiterals$FilenameUtilsKt.m3447String$valstoragePath$branch$if1$fungetFilePath$classCompanion$classFilenameUtils() + path;
                if (!addQuotes) {
                    return finalPath;
                }
                return liveLiterals$FilenameUtilsKt.m3432String$0$str$branch$if$branch$if1$fungetFilePath$classCompanion$classFilenameUtils() + finalPath + liveLiterals$FilenameUtilsKt.m3437String$2$str$branch$if$branch$if1$fungetFilePath$classCompanion$classFilenameUtils();
            } else {
                String finalPath2 = liveLiterals$FilenameUtilsKt.m3448String$valstoragePath$else$if1$fungetFilePath$classCompanion$classFilenameUtils() + StringsKt__StringsJVMKt.replace$default(safStorage, liveLiterals$FilenameUtilsKt.m3441String$arg0$callreplace$arg0$callplus$valfinalPath$else$if1$fungetFilePath$classCompanion$classFilenameUtils(), liveLiterals$FilenameUtilsKt.m3444String$arg1$callreplace$arg0$callplus$valfinalPath$else$if1$fungetFilePath$classCompanion$classFilenameUtils(), false, 4, (Object) null);
                if (!addQuotes) {
                    return finalPath2;
                }
                return liveLiterals$FilenameUtilsKt.m3433String$0$str$branch$if$else$if1$fungetFilePath$classCompanion$classFilenameUtils() + finalPath2 + liveLiterals$FilenameUtilsKt.m3438String$2$str$branch$if$else$if1$fungetFilePath$classCompanion$classFilenameUtils();
            }
        }

        public final String queryName(ContentResolver resolver, Uri uri) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Cursor returnCursor = resolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            Intrinsics.checkNotNull(returnCursor);
            int nameIndex = returnCursor.getColumnIndex("_display_name");
            returnCursor.moveToFirst();
            String name = returnCursor.getString(nameIndex);
            Intrinsics.checkNotNullExpressionValue(name, "returnCursor.getString(nameIndex)");
            returnCursor.close();
            return name;
        }

        public final String getDigits(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return appendToDigitsToString(input, LiveLiterals$FilenameUtilsKt.INSTANCE.m3443String$arg1$callappendToDigitsToString$fungetDigits$classCompanion$classFilenameUtils());
        }

        public final long getLengthFromFile(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(context, uri);
            Intrinsics.checkNotNull(fromSingleUri);
            return fromSingleUri.length();
        }
    }
}
