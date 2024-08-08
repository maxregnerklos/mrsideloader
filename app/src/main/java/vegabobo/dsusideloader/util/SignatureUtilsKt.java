package vegabobo.dsusideloader.util;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignatureUtils.kt */
public abstract class SignatureUtilsKt {
    public static final boolean isBuildSignedByAuthor(Application $this$isBuildSignedByAuthor) {
        Intrinsics.checkNotNullParameter($this$isBuildSignedByAuthor, "<this>");
        PackageManager packageManager = $this$isBuildSignedByAuthor.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "this.packageManager");
        String packageName = $this$isBuildSignedByAuthor.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        Iterable<String> signatures = getSignatures(packageManager, packageName);
        if (signatures == null) {
            return LiveLiterals$SignatureUtilsKt.INSTANCE.m3459Boolean$branch$when$valsignatures$funisBuildSignedByAuthor();
        }
        for (String digest : signatures) {
            if (Intrinsics.areEqual((Object) digest, (Object) "0da046eb480972124e2fe2251ebc5b19ea9e13d9")) {
                return LiveLiterals$SignatureUtilsKt.INSTANCE.m3458Boolean$branch$if$fun$anonymous$$arg0$callforEach$funisBuildSignedByAuthor();
            }
        }
        return LiveLiterals$SignatureUtilsKt.INSTANCE.m3460Boolean$funisBuildSignedByAuthor();
    }

    public static final List getSignatures(PackageManager pm, String packageName) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = pm.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(134217728));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "pm.getPackageInfo(\n     …ATES.toLong()),\n        )");
            if (packageInfo.signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
                Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "packageInfo.signingInfo.apkContentsSigners");
                return signatureDigest(apkContentsSigners);
            }
            Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
            Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "packageInfo.signingInfo.signingCertificateHistory");
            return signatureDigest(signingCertificateHistory);
        }
        PackageInfo packageInfo2 = pm.getPackageInfo(packageName, 134217728);
        if (packageInfo2 == null) {
            return null;
        }
        if (packageInfo2.signingInfo.hasMultipleSigners()) {
            Signature[] apkContentsSigners2 = packageInfo2.signingInfo.getApkContentsSigners();
            Intrinsics.checkNotNullExpressionValue(apkContentsSigners2, "packageInfo.signingInfo.apkContentsSigners");
            return signatureDigest(apkContentsSigners2);
        }
        Signature[] signingCertificateHistory2 = packageInfo2.signingInfo.getSigningCertificateHistory();
        Intrinsics.checkNotNullExpressionValue(signingCertificateHistory2, "packageInfo.signingInfo.signingCertificateHistory");
        return signatureDigest(signingCertificateHistory2);
    }

    public static final String signatureDigest(Signature sig) {
        byte[] signature = sig.toByteArray();
        try {
            LiveLiterals$SignatureUtilsKt liveLiterals$SignatureUtilsKt = LiveLiterals$SignatureUtilsKt.INSTANCE;
            byte[] digest = MessageDigest.getInstance(liveLiterals$SignatureUtilsKt.m3462String$arg0$callgetInstance$valmd$try$funsignatureDigest()).digest(signature);
            Intrinsics.checkNotNullExpressionValue(digest, "digest");
            return ArraysKt___ArraysKt.joinToString$default(digest, liveLiterals$SignatureUtilsKt.m3463String$arg0$calljoinToString$try$funsignatureDigest(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SignatureUtilsKt$signatureDigest$1.INSTANCE, 30, (Object) null);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static final List signatureDigest(Signature[] sigList) {
        Signature[] signatureArr = sigList;
        ArrayList arrayList = new ArrayList(signatureArr.length);
        for (Signature s : signatureArr) {
            arrayList.add(signatureDigest(s));
        }
        return arrayList;
    }
}
