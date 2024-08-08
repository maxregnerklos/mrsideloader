package vegabobo.dsusideloader.preparation;

import android.net.Uri;
import java.io.InputStream;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Job;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.model.Session;

/* compiled from: Preparation.kt */
public final class Preparation implements Function0 {
    public static final int $stable = LiveLiterals$PreparationKt.INSTANCE.m2776Int$classPreparation();
    public final Job job;
    public final Function0 onCanceled;
    public final Function1 onPreparationFinished;
    public final Function1 onPreparationProgressUpdate;
    public final Function1 onStepUpdate;
    public final Session session;
    public final StorageManager storageManager;
    public final Uri userSelectedFileUri;
    public final long userSelectedImageSize;

    public Preparation(StorageManager storageManager2, Session session2, Job job2, Function1 onStepUpdate2, Function1 onPreparationProgressUpdate2, Function0 onCanceled2, Function1 onPreparationFinished2) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(session2, "session");
        Intrinsics.checkNotNullParameter(job2, "job");
        Intrinsics.checkNotNullParameter(onStepUpdate2, "onStepUpdate");
        Intrinsics.checkNotNullParameter(onPreparationProgressUpdate2, "onPreparationProgressUpdate");
        Intrinsics.checkNotNullParameter(onCanceled2, "onCanceled");
        Intrinsics.checkNotNullParameter(onPreparationFinished2, "onPreparationFinished");
        this.storageManager = storageManager2;
        this.session = session2;
        this.job = job2;
        this.onStepUpdate = onStepUpdate2;
        this.onPreparationProgressUpdate = onPreparationProgressUpdate2;
        this.onCanceled = onCanceled2;
        this.onPreparationFinished = onPreparationFinished2;
        this.userSelectedImageSize = session2.getUserSelection().getUserSelectedImageSize();
        this.userSelectedFileUri = session2.getUserSelection().getSelectedFileUri();
    }

    public void invoke() {
        if (!this.session.getPreferences().getUseBuiltinInstaller() || !this.session.isRoot()) {
            prepareForDSU();
        } else {
            prepareRooted();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void prepareRooted() {
        /*
            r10 = this;
            android.net.Uri r0 = r10.userSelectedFileUri
            java.lang.String r0 = r10.getExtension(r0)
            vegabobo.dsusideloader.preparation.LiveLiterals$PreparationKt r1 = vegabobo.dsusideloader.preparation.LiveLiterals$PreparationKt.INSTANCE
            java.lang.String r2 = r1.m2788String$arg1$callEQEQ$cond$when$valsource$funprepareRooted$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0024
            vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage r0 = new vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage
            android.net.Uri r4 = r10.userSelectedFileUri
            vegabobo.dsusideloader.core.StorageManager r1 = r10.storageManager
            long r5 = r1.getFilesizeFromUri(r4)
            r7 = 0
            r8 = 4
            r9 = 0
            r3 = r0
            r3.<init>(r4, r5, r7, r8, r9)
            goto L_0x0081
        L_0x0024:
            java.lang.String r2 = r1.m2785String$arg1$callEQEQ$cond$when$cond$when$cond1$when$valsource$funprepareRooted$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0033
            boolean r2 = r1.m2769Boolean$branch$when$cond$when$cond1$when$valsource$funprepareRooted$classPreparation()
            goto L_0x003b
        L_0x0033:
            java.lang.String r2 = r1.m2792String$arg1$callEQEQ$else$when$cond$when$cond1$when$valsource$funprepareRooted$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
        L_0x003b:
            if (r2 == 0) goto L_0x0042
            boolean r2 = r1.m2770Boolean$branch$when$cond1$when$valsource$funprepareRooted$classPreparation()
            goto L_0x004a
        L_0x0042:
            java.lang.String r2 = r1.m2793String$arg1$callEQEQ$else$when$cond1$when$valsource$funprepareRooted$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
        L_0x004a:
            if (r2 == 0) goto L_0x006e
            android.net.Uri r0 = r10.userSelectedFileUri
            kotlin.Pair r0 = r10.extractFile(r0)
            vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage r8 = new vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage
            java.lang.Object r1 = r0.getFirst()
            r2 = r1
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r1 = r0.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r5, r6, r7)
            r0 = r8
            goto L_0x0081
        L_0x006e:
            java.lang.String r2 = r1.m2790String$arg1$callEQEQ$cond2$when$valsource$funprepareRooted$classPreparation()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0096
            vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage r0 = new vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage
            android.net.Uri r1 = r10.userSelectedFileUri
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2, r3)
        L_0x0081:
            kotlinx.coroutines.Job r1 = r10.job
            boolean r1 = r1.isCancelled()
            if (r1 != 0) goto L_0x0090
            kotlin.jvm.functions.Function1 r1 = r10.onPreparationFinished
            r1.invoke(r0)
            goto L_0x0095
        L_0x0090:
            kotlin.jvm.functions.Function0 r1 = r10.onCanceled
            r1.invoke()
        L_0x0095:
            return
        L_0x0096:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = r1.m2781String$arg0$call$init$$else$when$valsource$funprepareRooted$classPreparation()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.preparation.Preparation.prepareRooted():void");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void prepareForDSU() {
        /*
            r13 = this;
            vegabobo.dsusideloader.core.StorageManager r0 = r13.storageManager
            vegabobo.dsusideloader.preparation.LiveLiterals$PreparationKt r1 = vegabobo.dsusideloader.preparation.LiveLiterals$PreparationKt.INSTANCE
            boolean r2 = r1.m2768Boolean$arg0$callcleanWorkspaceFolder$funprepareForDSU$classPreparation()
            r0.cleanWorkspaceFolder(r2)
            android.net.Uri r0 = r13.userSelectedFileUri
            java.lang.String r0 = r13.getExtension(r0)
            java.lang.String r2 = r1.m2787String$arg1$callEQEQ$cond$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0023
            android.net.Uri r2 = r13.userSelectedFileUri
            kotlin.Pair r2 = r13.prepareXz(r2)
            goto L_0x0064
        L_0x0023:
            java.lang.String r2 = r1.m2789String$arg1$callEQEQ$cond1$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0034
            android.net.Uri r2 = r13.userSelectedFileUri
            kotlin.Pair r2 = r13.prepareImage(r2)
            goto L_0x0064
        L_0x0034:
            java.lang.String r2 = r1.m2786String$arg1$callEQEQ$cond$when$cond2$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0043
            boolean r2 = r1.m2771Boolean$branch$when$cond2$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            goto L_0x004b
        L_0x0043:
            java.lang.String r2 = r1.m2794String$arg1$callEQEQ$else$when$cond2$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
        L_0x004b:
            if (r2 == 0) goto L_0x0054
            android.net.Uri r2 = r13.userSelectedFileUri
            kotlin.Pair r2 = r13.prepareGz(r2)
            goto L_0x0064
        L_0x0054:
            java.lang.String r2 = r1.m2791String$arg1$callEQEQ$cond3$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00ba
            android.net.Uri r2 = r13.userSelectedFileUri
            kotlin.Pair r2 = r13.prepareZip(r2)
        L_0x0064:
            java.lang.Object r3 = r2.getFirst()
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r4 = r2.getSecond()
            java.lang.Number r4 = (java.lang.Number) r4
            long r11 = r4.longValue()
            java.lang.String r1 = r1.m2784String$arg1$callEQEQ$cond$if$valsource$funprepareForDSU$classPreparation()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0088
            vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage r1 = new vegabobo.dsusideloader.model.DSUInstallationSource$DsuPackage
            r4 = 2
            r5 = 0
            r1.<init>(r3, r5, r4, r5)
            goto L_0x0093
        L_0x0088:
            vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage r1 = new vegabobo.dsusideloader.model.DSUInstallationSource$SingleSystemImage
            r8 = 0
            r9 = 4
            r10 = 0
            r4 = r1
            r5 = r3
            r6 = r11
            r4.<init>(r5, r6, r8, r9, r10)
        L_0x0093:
            kotlin.jvm.functions.Function1 r4 = r13.onStepUpdate
            vegabobo.dsusideloader.preparation.InstallationStep r5 = vegabobo.dsusideloader.preparation.InstallationStep.WAITING_USER_CONFIRMATION
            r4.invoke(r5)
            vegabobo.dsusideloader.core.StorageManager r4 = r13.storageManager
            kotlinx.coroutines.Job r5 = r13.job
            boolean r5 = r5.isCancelled()
            r4.cleanWorkspaceFolder(r5)
            kotlinx.coroutines.Job r4 = r13.job
            boolean r4 = r4.isCancelled()
            if (r4 != 0) goto L_0x00b4
            kotlin.jvm.functions.Function1 r4 = r13.onPreparationFinished
            r4.invoke(r1)
            goto L_0x00b9
        L_0x00b4:
            kotlin.jvm.functions.Function0 r4 = r13.onCanceled
            r4.invoke()
        L_0x00b9:
            return
        L_0x00ba:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r1 = r1.m2780String$arg0$call$init$$else$when$valpreparedFilePair$funprepareForDSU$classPreparation()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.preparation.Preparation.prepareForDSU():void");
    }

    public final Pair prepareZip(Uri zipFile) {
        return new Pair(getSafeUri(zipFile), Long.valueOf(LiveLiterals$PreparationKt.INSTANCE.m2777Long$arg1$call$init$$funprepareZip$classPreparation()));
    }

    public final Pair prepareXz(Uri xzFile) {
        String outputFile = getFileName(xzFile);
        this.onStepUpdate.invoke(InstallationStep.DECOMPRESSING_XZ);
        return prepareImage((Uri) new FileUnPacker(this.storageManager, xzFile, outputFile, this.job, this.onPreparationProgressUpdate).unpack().getFirst());
    }

    public final Pair prepareImage(Uri imageFile) {
        String outputFile = getFileName(imageFile) + LiveLiterals$PreparationKt.INSTANCE.m2779String$1$str$valoutputFile$funprepareImage$classPreparation();
        this.onStepUpdate.invoke(InstallationStep.COMPRESSING_TO_GZ);
        return new Pair(new FileUnPacker(this.storageManager, imageFile, outputFile, this.job, this.onPreparationProgressUpdate).pack().getFirst(), Long.valueOf(this.storageManager.getFilesizeFromUri(imageFile)));
    }

    public final Pair prepareGz(Uri gzFile) {
        Uri uri = getSafeUri(gzFile);
        long j = this.userSelectedImageSize;
        if (j != -1) {
            return new Pair(uri, Long.valueOf(j));
        }
        this.onStepUpdate.invoke(InstallationStep.PROCESSING);
        long fileSize = this.storageManager.getFilesizeFromUri(uri);
        LiveLiterals$PreparationKt liveLiterals$PreparationKt = LiveLiterals$PreparationKt.INSTANCE;
        if (((double) fileSize) < ((double) 2147483647L) * liveLiterals$PreparationKt.m2772Double$arg0$calltimes$valthree_gb$funprepareGz$classPreparation()) {
            InputStream inputStream = this.storageManager.openInputStream(uri);
            inputStream.skip(fileSize - ((long) liveLiterals$PreparationKt.m2775Int$arg0$callminus$arg0$callskip$branch$if1$funprepareGz$classPreparation()));
            byte[] bytes = new byte[liveLiterals$PreparationKt.m2774Int$arg0$call$init$$valbytes$branch$if1$funprepareGz$classPreparation()];
            inputStream.read(bytes);
            ArraysKt___ArraysKt.reverse(bytes);
            long imageSize = new BigInteger(liveLiterals$PreparationKt.m2773Int$arg0$call$init$$$this$calltoLong$valimageSize$branch$if1$funprepareGz$classPreparation(), bytes).longValue();
            if (imageSize > fileSize) {
                return new Pair(uri, Long.valueOf(imageSize));
            }
        }
        String outputFile = getFileName(uri);
        this.onStepUpdate.invoke(InstallationStep.DECOMPRESSING_GZIP);
        return new Pair(uri, new FileUnPacker(this.storageManager, uri, outputFile, this.job, this.onPreparationProgressUpdate).unpack().getSecond());
    }

    public final Pair extractFile(Uri uri) {
        return extractFile(uri, LiveLiterals$PreparationKt.INSTANCE.m2795String$arg1$callextractFile$funextractFile$classPreparation());
    }

    public final Pair extractFile(Uri uri, String partitionName) {
        this.onStepUpdate.invoke(InstallationStep.EXTRACTING_FILE);
        StorageManager storageManager2 = this.storageManager;
        String r1 = LiveLiterals$PreparationKt.INSTANCE.m2778String$1$str$arg2$call$init$$$this$callunpack$funextractFile1$classPreparation();
        return new FileUnPacker(storageManager2, uri, partitionName + r1, this.job, this.onPreparationProgressUpdate).unpack();
    }

    public final Uri getSafeUri(Uri uri) {
        this.onStepUpdate.invoke(InstallationStep.COPYING_FILE);
        return this.storageManager.getUriSafe(uri);
    }

    public final String getFileName(Uri uri) {
        return StringsKt__StringsKt.substringBeforeLast$default(this.storageManager.getFilenameFromUri(uri), LiveLiterals$PreparationKt.INSTANCE.m2783String$arg0$callsubstringBeforeLast$fungetFileName$classPreparation(), (String) null, 2, (Object) null);
    }

    public final String getExtension(Uri uri) {
        String filenameFromUri = this.storageManager.getFilenameFromUri(uri);
        LiveLiterals$PreparationKt liveLiterals$PreparationKt = LiveLiterals$PreparationKt.INSTANCE;
        return StringsKt__StringsKt.substringAfterLast(filenameFromUri, liveLiterals$PreparationKt.m2782String$arg0$callsubstringAfterLast$fungetExtension$classPreparation(), liveLiterals$PreparationKt.m2796String$arg1$callsubstringAfterLast$fungetExtension$classPreparation());
    }
}
