package vegabobo.dsusideloader.preparation;

import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import vegabobo.dsusideloader.core.StorageManager;

/* compiled from: FileUnPacker.kt */
public final class FileUnPacker {
    public static final int $stable = LiveLiterals$FileUnPackerKt.INSTANCE.m2762Int$classFileUnPacker();
    public DocumentFile finalFile;
    public final Uri inputFile;
    public final long inputFileSize;
    public InputStream inputStream;
    public final Job installationJob;
    public final Function1 onProgressChange;
    public OutputStream outputStream;
    public final StorageManager storageManager;

    public FileUnPacker(StorageManager storageManager2, Uri inputFile2, String outputFile, Job installationJob2, Function1 onProgressChange2) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(inputFile2, "inputFile");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(installationJob2, "installationJob");
        Intrinsics.checkNotNullParameter(onProgressChange2, "onProgressChange");
        this.storageManager = storageManager2;
        this.inputFile = inputFile2;
        this.installationJob = installationJob2;
        this.onProgressChange = onProgressChange2;
        DocumentFile createDocumentFile = storageManager2.createDocumentFile(outputFile);
        this.finalFile = createDocumentFile;
        Uri uri = createDocumentFile.getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "finalFile.uri");
        this.outputStream = storageManager2.openOutputStream(uri);
        this.inputStream = storageManager2.openInputStream(inputFile2);
        this.inputFileSize = storageManager2.getFilesizeFromUri(inputFile2);
    }

    public final void copy(InputStream inputStr, OutputStream outputStr, Function1 onReadedBuffer) {
        LiveLiterals$FileUnPackerKt liveLiterals$FileUnPackerKt = LiveLiterals$FileUnPackerKt.INSTANCE;
        byte[] buffer = new byte[(liveLiterals$FileUnPackerKt.m2759Int$$this$calltimes$arg0$call$init$$valbuffer$funcopy$classFileUnPacker() * liveLiterals$FileUnPackerKt.m2760Int$arg0$calltimes$arg0$call$init$$valbuffer$funcopy$classFileUnPacker())];
        long readed = liveLiterals$FileUnPackerKt.m2763Long$valreaded$funcopy$classFileUnPacker();
        while (true) {
            int it = inputStr.read(buffer);
            int n = it;
            Unit unit = Unit.INSTANCE;
            if (-1 == it || this.installationJob.isCancelled()) {
                inputStr.close();
                outputStr.flush();
                outputStr.close();
            } else {
                readed += (long) buffer.length;
                onReadedBuffer.invoke(Long.valueOf(readed));
                outputStr.write(buffer, LiveLiterals$FileUnPackerKt.INSTANCE.m2761Int$arg1$callwrite$body$loop$funcopy$classFileUnPacker(), n);
            }
        }
        inputStr.close();
        outputStr.flush();
        outputStr.close();
    }

    public final Pair pack() {
        copy(this.inputStream, new GzipCompressorOutputStream(this.outputStream), new FileUnPacker$pack$1(this));
        StorageManager storageManager2 = this.storageManager;
        Uri uri = this.finalFile.getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "finalFile.uri");
        long fileLength = storageManager2.getFilesizeFromUri(uri);
        Uri uri2 = this.finalFile.getUri();
        Intrinsics.checkNotNullExpressionValue(uri2, "finalFile.uri");
        return new Pair(uri2, Long.valueOf(fileLength));
    }

    public final Pair unpack() {
        InputStream inputStream2;
        String $this$unpack_u24lambda_u241 = this.storageManager.getFilenameFromUri(this.inputFile);
        LiveLiterals$FileUnPackerKt liveLiterals$FileUnPackerKt = LiveLiterals$FileUnPackerKt.INSTANCE;
        if (StringsKt__StringsJVMKt.endsWith$default($this$unpack_u24lambda_u241, liveLiterals$FileUnPackerKt.m2765String$arg0$callendsWith$cond$when$fun$anonymous$$arg1$callwith$valarchiveInputStream$fununpack$classFileUnPacker(), false, 2, (Object) null)) {
            inputStream2 = new XZCompressorInputStream(this.inputStream);
        } else if (StringsKt__StringsJVMKt.endsWith$default($this$unpack_u24lambda_u241, liveLiterals$FileUnPackerKt.m2766String$arg0$callendsWith$cond1$when$fun$anonymous$$arg1$callwith$valarchiveInputStream$fununpack$classFileUnPacker(), false, 2, (Object) null)) {
            inputStream2 = new GzipCompressorInputStream(this.inputStream);
        } else if (StringsKt__StringsJVMKt.endsWith$default($this$unpack_u24lambda_u241, liveLiterals$FileUnPackerKt.m2767String$arg0$callendsWith$cond2$when$fun$anonymous$$arg1$callwith$valarchiveInputStream$fununpack$classFileUnPacker(), false, 2, (Object) null)) {
            inputStream2 = new GzipCompressorInputStream(this.inputStream);
        } else {
            throw new Exception(liveLiterals$FileUnPackerKt.m2764String$arg0$call$init$$else$when$fun$anonymous$$arg1$callwith$valarchiveInputStream$fununpack$classFileUnPacker());
        }
        InputStream inputStream3 = inputStream2;
        copy(inputStream3, this.outputStream, new FileUnPacker$unpack$1(this, inputStream3));
        StorageManager storageManager2 = this.storageManager;
        Uri uri = this.finalFile.getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "finalFile.uri");
        long fileLength = storageManager2.getFilesizeFromUri(uri);
        Uri uri2 = this.finalFile.getUri();
        Intrinsics.checkNotNullExpressionValue(uri2, "finalFile.uri");
        return new Pair(uri2, Long.valueOf(fileLength));
    }

    public final void updateProgress(long fileSize, long readed) {
        this.onProgressChange.invoke(Float.valueOf(((float) readed) / ((float) fileSize)));
    }
}
