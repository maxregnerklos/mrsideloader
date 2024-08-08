package vegabobo.dsusideloader.installer.root;

import android.app.Application;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SharedMemory;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.lsposed.hiddenapibypass.HiddenApiBypass;
import vegabobo.dsusideloader.model.DSUInstallationSource;
import vegabobo.dsusideloader.model.ImagePartition;
import vegabobo.dsusideloader.model.Type;
import vegabobo.dsusideloader.preparation.InstallationStep;
import vegabobo.dsusideloader.service.PrivilegedProvider;

/* compiled from: DSUInstaller.kt */
public final class DSUInstaller extends DynamicSystemImpl implements Function0 {
    public static final int $stable = LiveLiterals$DSUInstallerKt.INSTANCE.m2659Int$classDSUInstaller();
    public final List UNSUPPORTED_PARTITIONS = CollectionsKt__CollectionsKt.listOf("vbmeta", "boot", "userdata", "dtbo", "super_empty", "system_other", "scratch");
    public final Application application;
    public final DSUInstallationSource dsuInstallation;
    public Job installationJob;
    public final Function1 onCreatePartition;
    public final Function2 onInstallationError;
    public final Function2 onInstallationProgressUpdate;
    public final Function1 onInstallationStepUpdate;
    public final Function0 onInstallationSuccess;
    public final String tag = getClass().getSimpleName();
    public final long userdataSize;

    /* compiled from: DSUInstaller.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.SINGLE_SYSTEM_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Type.MULTIPLE_IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Type.DSU_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Type.URL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DSUInstaller(Application application2, long userdataSize2, DSUInstallationSource dsuInstallation2, Job installationJob2, Function2 onInstallationError2, Function2 onInstallationProgressUpdate2, Function1 onCreatePartition2, Function1 onInstallationStepUpdate2, Function0 onInstallationSuccess2) {
        Application application3 = application2;
        DSUInstallationSource dSUInstallationSource = dsuInstallation2;
        Job job = installationJob2;
        Function2 function2 = onInstallationError2;
        Function2 function22 = onInstallationProgressUpdate2;
        Function1 function1 = onCreatePartition2;
        Function1 function12 = onInstallationStepUpdate2;
        Function0 function0 = onInstallationSuccess2;
        Intrinsics.checkNotNullParameter(application3, "application");
        Intrinsics.checkNotNullParameter(dSUInstallationSource, "dsuInstallation");
        Intrinsics.checkNotNullParameter(job, "installationJob");
        Intrinsics.checkNotNullParameter(function2, "onInstallationError");
        Intrinsics.checkNotNullParameter(function22, "onInstallationProgressUpdate");
        Intrinsics.checkNotNullParameter(function1, "onCreatePartition");
        Intrinsics.checkNotNullParameter(function12, "onInstallationStepUpdate");
        Intrinsics.checkNotNullParameter(function0, "onInstallationSuccess");
        this.application = application3;
        this.userdataSize = userdataSize2;
        this.dsuInstallation = dSUInstallationSource;
        this.installationJob = job;
        this.onInstallationError = function2;
        this.onInstallationProgressUpdate = function22;
        this.onCreatePartition = function1;
        this.onInstallationStepUpdate = function12;
        this.onInstallationSuccess = function0;
    }

    /* compiled from: DSUInstaller.kt */
    public static final class MappedMemoryBuffer implements AutoCloseable {
        public ByteBuffer mBuffer;

        public MappedMemoryBuffer(ByteBuffer mBuffer2) {
            this.mBuffer = mBuffer2;
        }

        public final ByteBuffer getMBuffer() {
            return this.mBuffer;
        }

        public void close() {
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer != null) {
                Intrinsics.checkNotNull(byteBuffer);
                SharedMemory.unmap(byteBuffer);
                this.mBuffer = null;
            }
        }
    }

    public final boolean isPartitionSupported(String partitionName) {
        return !this.UNSUPPORTED_PARTITIONS.contains(partitionName);
    }

    public final ParcelFileDescriptor getFdDup(SharedMemory sharedMemory) {
        Object invoke = HiddenApiBypass.invoke(sharedMemory.getClass(), sharedMemory, LiveLiterals$DSUInstallerKt.INSTANCE.m2691String$arg2$callinvoke$fungetFdDup$classDSUInstaller(), new Object[0]);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.ParcelFileDescriptor");
        return (ParcelFileDescriptor) invoke;
    }

    public final boolean shouldInstallEntry(String name) {
        LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
        if (!StringsKt__StringsJVMKt.endsWith$default(name, liveLiterals$DSUInstallerKt.m2684String$arg0$callendsWith$$this$callnot$cond$if$funshouldInstallEntry$classDSUInstaller(), false, 2, (Object) null)) {
            return liveLiterals$DSUInstallerKt.m2650Boolean$branch$if$funshouldInstallEntry$classDSUInstaller();
        }
        return isPartitionSupported(StringsKt__StringsKt.substringAfterLast$default(name, liveLiterals$DSUInstallerKt.m2687String$arg0$callsubstringAfterLast$valpartitionName$funshouldInstallEntry$classDSUInstaller(), (String) null, 2, (Object) null));
    }

    public final void publishProgress(long bytesRead, long totalBytes, String partition) {
        LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
        float progress = liveLiterals$DSUInstallerKt.m2654Float$valprogress$funpublishProgress$classDSUInstaller();
        if (!(totalBytes == liveLiterals$DSUInstallerKt.m2664Long$arg1$callEQEQ$$this$callnot$cond$cond$if$funpublishProgress$classDSUInstaller() || bytesRead == liveLiterals$DSUInstallerKt.m2663Long$arg1$callEQEQ$$this$callnot$branch$cond$if$funpublishProgress$classDSUInstaller())) {
            progress = ((float) bytesRead) / ((float) totalBytes);
        }
        this.onInstallationProgressUpdate.invoke(Float.valueOf(progress), partition);
    }

    public static /* synthetic */ void installWritablePartition$default(DSUInstaller dSUInstaller, String str, long j, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = LiveLiterals$DSUInstallerKt.INSTANCE.m2653Boolean$paramreadOnly$funinstallWritablePartition$classDSUInstaller();
        }
        dSUInstaller.installWritablePartition(str, j, z);
    }

    public final void installWritablePartition(String partition, long partitionSize, boolean readOnly) {
        String str = partition;
        long j = partitionSize;
        CompletableJob job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(job)), (CoroutineContext) null, (CoroutineStart) null, new DSUInstaller$installWritablePartition$1(this, partition, partitionSize, readOnly, job, (Continuation) null), 3, (Object) null);
        LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
        publishProgress(liveLiterals$DSUInstallerKt.m2662Long$arg0$callpublishProgress$funinstallWritablePartition$classDSUInstaller(), partitionSize, partition);
        long prevInstalledSize = liveLiterals$DSUInstallerKt.m2667Long$valprevInstalledSize$funinstallWritablePartition$classDSUInstaller();
        while (job.isActive()) {
            long installedSize = getInstallationProgress().bytes_processed;
            if (installedSize > 134217728 + prevInstalledSize) {
                prevInstalledSize = installedSize;
                long j2 = installedSize;
                publishProgress(installedSize, partitionSize, partition);
            }
            Object unused2 = BuildersKt__BuildersKt.runBlocking$default((CoroutineContext) null, new DSUInstaller$installWritablePartition$2((Continuation) null), 1, (Object) null);
        }
        if (!closePartition()) {
            String str2 = this.tag;
            LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt2 = LiveLiterals$DSUInstallerKt.INSTANCE;
            String r2 = liveLiterals$DSUInstallerKt2.m2674String$0$str$arg1$calle$branch$if$funinstallWritablePartition$classDSUInstaller();
            String r1 = liveLiterals$DSUInstallerKt2.m2680String$2$str$arg1$calle$branch$if$funinstallWritablePartition$classDSUInstaller();
            Log.e(str2, r2 + str + r1);
            this.onInstallationError.invoke(InstallationStep.ERROR_CREATE_PARTITION, str);
            return;
        }
        if (prevInstalledSize != j) {
            publishProgress(partitionSize, partitionSize, partition);
        }
        String str3 = this.tag;
        LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt3 = LiveLiterals$DSUInstallerKt.INSTANCE;
        String r22 = liveLiterals$DSUInstallerKt3.m2673String$0$str$arg1$calld$funinstallWritablePartition$classDSUInstaller();
        String r3 = liveLiterals$DSUInstallerKt3.m2679String$2$str$arg1$calld$funinstallWritablePartition$classDSUInstaller();
        String r12 = liveLiterals$DSUInstallerKt3.m2683String$4$str$arg1$calld$funinstallWritablePartition$classDSUInstaller();
        Log.d(str3, r22 + str + r3 + readOnly + r12 + j);
    }

    public static /* synthetic */ void installImage$default(DSUInstaller dSUInstaller, String str, long j, InputStream inputStream, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = LiveLiterals$DSUInstallerKt.INSTANCE.m2652Boolean$paramreadOnly$funinstallImage$classDSUInstaller();
        } else {
            z2 = z;
        }
        dSUInstaller.installImage(str, j, inputStream, z2);
    }

    /* Debug info: failed to restart local var, previous not found, register: 25 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r22 = r4;
        r23 = r6;
        r24 = r0;
        publishProgress(r13, r13, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        kotlin.jdk7.AutoCloseableKt.closeFinally(r10, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0103, code lost:
        kotlin.io.CloseableKt.closeFinally(r15, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010b, code lost:
        if (closePartition() != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010d, code lost:
        r0 = r7.tag;
        r1 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE;
        r2 = r1.m2670String$0$str$arg1$calld$branch$if$funinstallImage$classDSUInstaller();
        r1 = r1.m2677String$2$str$arg1$calld$branch$if$funinstallImage$classDSUInstaller();
        android.util.Log.d(r0, r2 + r8 + r1);
        r7.onInstallationError.invoke(vegabobo.dsusideloader.preparation.InstallationStep.ERROR_CREATE_PARTITION, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0136, code lost:
        r0 = r7.tag;
        r1 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE;
        r2 = r1.m2671String$0$str$arg1$calld$funinstallImage$classDSUInstaller();
        r3 = r1.m2678String$2$str$arg1$calld$funinstallImage$classDSUInstaller();
        r1 = r1.m2682String$4$str$arg1$calld$funinstallImage$classDSUInstaller();
        android.util.Log.d(r0, r2 + r8 + r3 + r9 + r1 + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0164, code lost:
        return;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String, code=java.lang.Throwable, for r26v0, types: [java.lang.String] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void installImage(java.lang.Throwable r26, long r27, java.io.InputStream r29, boolean r30) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = r30
            vegabobo.dsusideloader.installer.root.SparseInputStream r0 = new vegabobo.dsusideloader.installer.root.SparseInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r10 = r29
            r1.<init>(r10)
            r0.<init>(r1)
            r11 = r0
            long r0 = r11.getUnsparseSize()
            vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt r12 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE
            long r2 = r12.m2665Long$arg1$callEQEQ$$this$callnot$cond$if$valpartitionSize$funinstallImage$classDSUInstaller()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            long r0 = r11.getUnsparseSize()
            goto L_0x0028
        L_0x0026:
            r0 = r27
        L_0x0028:
            r13 = r0
            kotlin.jvm.functions.Function1 r0 = r7.onCreatePartition
            r0.invoke(r8)
            r7.createNewPartition(r8, r13, r9)
            kotlin.jvm.functions.Function1 r0 = r7.onInstallationStepUpdate
            vegabobo.dsusideloader.preparation.InstallationStep r1 = vegabobo.dsusideloader.preparation.InstallationStep.INSTALLING_ROOTED
            r0.invoke(r1)
            java.lang.String r0 = r12.m2668String$0$str$arg0$callcreate$$$this$calluse$funinstallImage$classDSUInstaller()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r1 = 524288(0x80000, float:7.34684E-40)
            android.os.SharedMemory r15 = android.os.SharedMemory.create(r0, r1)
            r6 = r15
            r16 = 0
            vegabobo.dsusideloader.installer.root.DSUInstaller$MappedMemoryBuffer r4 = new vegabobo.dsusideloader.installer.root.DSUInstaller$MappedMemoryBuffer     // Catch:{ all -> 0x0174 }
            java.nio.ByteBuffer r0 = r6.mapReadWrite()     // Catch:{ all -> 0x0174 }
            r4.<init>(r0)     // Catch:{ all -> 0x0174 }
            r0 = r4
            r17 = 0
            java.lang.String r1 = "sharedMemory"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)     // Catch:{ all -> 0x0168 }
            android.os.ParcelFileDescriptor r1 = r7.getFdDup(r6)     // Catch:{ all -> 0x0168 }
            r5 = r1
            int r1 = r6.getSize()     // Catch:{ all -> 0x0168 }
            long r1 = (long) r1     // Catch:{ all -> 0x0168 }
            r7.setAshmem(r5, r1)     // Catch:{ all -> 0x0168 }
            long r2 = r12.m2661Long$arg0$callpublishProgress$fun$anonymous$$arg0$calluse$fun$anonymous$$arg0$calluse$funinstallImage$classDSUInstaller()     // Catch:{ all -> 0x0168 }
            r1 = r25
            r10 = r4
            r18 = r5
            r4 = r13
            r19 = r6
            r6 = r26
            r1.publishProgress(r2, r4, r6)     // Catch:{ all -> 0x0165 }
            long r1 = r12.m2666Long$valinstalledSize$fun$anonymous$$arg0$calluse$fun$anonymous$$arg0$calluse$funinstallImage$classDSUInstaller()     // Catch:{ all -> 0x0165 }
            int r3 = r19.getSize()     // Catch:{ all -> 0x0165 }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0165 }
            r12 = r3
            java.nio.ByteBuffer r3 = r0.getMBuffer()     // Catch:{ all -> 0x0165 }
            r6 = r3
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ all -> 0x0165 }
            r3.<init>()     // Catch:{ all -> 0x0165 }
            r4 = r3
            r20 = r1
        L_0x009b:
            int r1 = r12.length     // Catch:{ all -> 0x0165 }
            r2 = 0
            int r1 = r11.read(r12, r2, r1)     // Catch:{ all -> 0x0165 }
            r2 = r1
            r3 = 0
            r4.element = r2     // Catch:{ all -> 0x0165 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0165 }
            r5 = 0
            if (r1 <= 0) goto L_0x00ee
            kotlinx.coroutines.Job r1 = r7.installationJob     // Catch:{ all -> 0x0165 }
            boolean r1 = r1.isCancelled()     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x00bb
            kotlin.jdk7.AutoCloseableKt.closeFinally(r10, r5)     // Catch:{ all -> 0x0174 }
            kotlin.io.CloseableKt.closeFinally(r15, r5)
            return
        L_0x00bb:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch:{ all -> 0x0165 }
            vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt r1 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE     // Catch:{ all -> 0x0165 }
            int r2 = r1.m2656Int$arg0$callposition$body$loop$fun$anonymous$$arg0$calluse$fun$anonymous$$arg0$calluse$funinstallImage$classDSUInstaller()     // Catch:{ all -> 0x0165 }
            r6.position(r2)     // Catch:{ all -> 0x0165 }
            int r1 = r1.m2658Int$arg1$callput$body$loop$fun$anonymous$$arg0$calluse$fun$anonymous$$arg0$calluse$funinstallImage$classDSUInstaller()     // Catch:{ all -> 0x0165 }
            int r2 = r4.element     // Catch:{ all -> 0x0165 }
            r6.put(r12, r1, r2)     // Catch:{ all -> 0x0165 }
            int r1 = r4.element     // Catch:{ all -> 0x0165 }
            long r1 = (long) r1     // Catch:{ all -> 0x0165 }
            r7.submitFromAshmem(r1)     // Catch:{ all -> 0x0165 }
            int r1 = r4.element     // Catch:{ all -> 0x0165 }
            long r1 = (long) r1     // Catch:{ all -> 0x0165 }
            long r20 = r20 + r1
            r1 = r25
            r2 = r20
            r22 = r4
            r4 = r13
            r23 = r6
            r6 = r26
            r1.publishProgress(r2, r4, r6)     // Catch:{ all -> 0x0165 }
            r4 = r22
            r6 = r23
            goto L_0x009b
        L_0x00ee:
            r22 = r4
            r23 = r6
            r1 = r25
            r2 = r13
            r6 = r5
            r4 = r13
            r24 = r0
            r0 = r6
            r6 = r26
            r1.publishProgress(r2, r4, r6)     // Catch:{ all -> 0x0165 }
            kotlin.jdk7.AutoCloseableKt.closeFinally(r10, r0)     // Catch:{ all -> 0x0174 }
            kotlin.io.CloseableKt.closeFinally(r15, r0)
            boolean r0 = r25.closePartition()
            if (r0 != 0) goto L_0x0136
            java.lang.String r0 = r7.tag
            vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt r1 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE
            java.lang.String r2 = r1.m2670String$0$str$arg1$calld$branch$if$funinstallImage$classDSUInstaller()
            java.lang.String r1 = r1.m2677String$2$str$arg1$calld$branch$if$funinstallImage$classDSUInstaller()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r0, r1)
            kotlin.jvm.functions.Function2 r0 = r7.onInstallationError
            vegabobo.dsusideloader.preparation.InstallationStep r1 = vegabobo.dsusideloader.preparation.InstallationStep.ERROR_CREATE_PARTITION
            r0.invoke(r1, r8)
            return
        L_0x0136:
            java.lang.String r0 = r7.tag
            vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt r1 = vegabobo.dsusideloader.installer.root.LiveLiterals$DSUInstallerKt.INSTANCE
            java.lang.String r2 = r1.m2671String$0$str$arg1$calld$funinstallImage$classDSUInstaller()
            java.lang.String r3 = r1.m2678String$2$str$arg1$calld$funinstallImage$classDSUInstaller()
            java.lang.String r1 = r1.m2682String$4$str$arg1$calld$funinstallImage$classDSUInstaller()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r8)
            r4.append(r3)
            r4.append(r9)
            r4.append(r1)
            r4.append(r13)
            java.lang.String r1 = r4.toString()
            android.util.Log.d(r0, r1)
            return
        L_0x0165:
            r0 = move-exception
            r1 = r0
            goto L_0x016d
        L_0x0168:
            r0 = move-exception
            r10 = r4
            r19 = r6
            r1 = r0
        L_0x016d:
            throw r1     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r2 = r0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r10, r1)     // Catch:{ all -> 0x0174 }
            throw r2     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r15, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.installer.root.DSUInstaller.installImage(java.lang.String, long, java.io.InputStream, boolean):void");
    }

    public final boolean installStreamingZipUpdate(InputStream inputStream) {
        ZipInputStream zis = new ZipInputStream(inputStream);
        do {
            ZipEntry it = zis.getNextEntry();
            ZipEntry zipEntry = it;
            if (it == null) {
                break;
            }
            Intrinsics.checkNotNull(zipEntry);
            String fileName = zipEntry.getName();
            Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
            if (shouldInstallEntry(fileName)) {
                installImageFromAnEntry(zipEntry, zis);
            } else {
                String str = this.tag;
                String r4 = LiveLiterals$DSUInstallerKt.INSTANCE.m2675String$1$str$arg1$calld$else$if$body$loop$funinstallStreamingZipUpdate$classDSUInstaller();
                Log.d(str, fileName + r4);
            }
        } while (!this.installationJob.isCancelled());
        return LiveLiterals$DSUInstallerKt.INSTANCE.m2651Boolean$funinstallStreamingZipUpdate$classDSUInstaller();
    }

    public final void installImageFromAnEntry(ZipEntry entry, InputStream inputStream) {
        String fileName = entry.getName();
        String str = this.tag;
        LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
        String r3 = liveLiterals$DSUInstallerKt.m2672String$0$str$arg1$calld$funinstallImageFromAnEntry$classDSUInstaller();
        Log.d(str, r3 + fileName);
        Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
        String partitionName = fileName.substring(liveLiterals$DSUInstallerKt.m2657Int$arg0$callsubstring$valpartitionName$funinstallImageFromAnEntry$classDSUInstaller(), fileName.length() - liveLiterals$DSUInstallerKt.m2655Int$arg0$callminus$arg1$callsubstring$valpartitionName$funinstallImageFromAnEntry$classDSUInstaller());
        Intrinsics.checkNotNullExpressionValue(partitionName, "this as java.lang.String…ing(startIndex, endIndex)");
        installImage$default(this, partitionName, entry.getSize(), inputStream, false, 8, (Object) null);
    }

    public final void startInstallation() {
        PrivilegedProvider.INSTANCE.getService().setDynProp();
        if (isInUse()) {
            this.onInstallationError.invoke(InstallationStep.ERROR_ALREADY_RUNNING_DYN_OS, LiveLiterals$DSUInstallerKt.INSTANCE.m2689String$arg1$callinvoke$branch$if$funstartInstallation$classDSUInstaller());
        } else if (isInstalled()) {
            this.onInstallationError.invoke(InstallationStep.ERROR_REQUIRES_DISCARD_DSU, LiveLiterals$DSUInstallerKt.INSTANCE.m2690String$arg1$callinvoke$branch$if1$funstartInstallation$classDSUInstaller());
        } else {
            forceStopDSU();
            startInstallation("dsu");
            LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
            installWritablePartition$default(this, liveLiterals$DSUInstallerKt.m2686String$arg0$callinstallWritablePartition$funstartInstallation$classDSUInstaller(), this.userdataSize, false, 4, (Object) null);
            switch (WhenMappings.$EnumSwitchMapping$0[this.dsuInstallation.getType().ordinal()]) {
                case 1:
                    installImage(liveLiterals$DSUInstallerKt.m2685String$arg0$callinstallImage$branch$when$funstartInstallation$classDSUInstaller(), this.dsuInstallation.getFileSize(), this.dsuInstallation.getUri());
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                    installImages(this.dsuInstallation.getImages());
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER:
                    installStreamingZipUpdate(openInputStream(this.dsuInstallation.getUri()));
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER:
                    InputStream openStream = new URL(this.dsuInstallation.getUri().toString()).openStream();
                    Intrinsics.checkNotNullExpressionValue(openStream, "url.openStream()");
                    installStreamingZipUpdate(openStream);
                    break;
            }
            if (!this.installationJob.isCancelled()) {
                finishInstallation();
                Log.d(this.tag, liveLiterals$DSUInstallerKt.m2688String$arg1$calld$branch$if2$funstartInstallation$classDSUInstaller());
                this.onInstallationSuccess.invoke();
            }
        }
    }

    public final void installImages(List images) {
        Iterator it = images.iterator();
        while (it.hasNext()) {
            ImagePartition image = (ImagePartition) it.next();
            if (isPartitionSupported(image.getPartitionName())) {
                installImage(image.getPartitionName(), image.getFileSize(), image.getUri());
            }
            if (this.installationJob.isCancelled()) {
                remove();
            }
        }
    }

    public final void installImage(String partitionName, long uncompressedSize, Uri uri) {
        installImage$default(this, partitionName, uncompressedSize, openInputStream(uri), false, 8, (Object) null);
        if (this.installationJob.isCancelled()) {
            remove();
        }
    }

    public final InputStream openInputStream(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        InputStream openInputStream = this.application.getContentResolver().openInputStream(uri);
        Intrinsics.checkNotNull(openInputStream);
        return openInputStream;
    }

    public final void createNewPartition(String partition, long partitionSize, boolean readOnly) {
        Intrinsics.checkNotNullParameter(partition, "partition");
        int result = createPartition(partition, partitionSize, readOnly);
        if (result != 0) {
            String str = this.tag;
            LiveLiterals$DSUInstallerKt liveLiterals$DSUInstallerKt = LiveLiterals$DSUInstallerKt.INSTANCE;
            String r3 = liveLiterals$DSUInstallerKt.m2669String$0$str$arg1$calld$branch$if$funcreateNewPartition$classDSUInstaller();
            String r4 = liveLiterals$DSUInstallerKt.m2676String$2$str$arg1$calld$branch$if$funcreateNewPartition$classDSUInstaller();
            String r2 = liveLiterals$DSUInstallerKt.m2681String$4$str$arg1$calld$branch$if$funcreateNewPartition$classDSUInstaller();
            Log.d(str, r3 + partition + r4 + result + r2);
            Job.DefaultImpls.cancel$default(this.installationJob, (CancellationException) null, 1, (Object) null);
            this.onInstallationError.invoke(InstallationStep.ERROR_CREATE_PARTITION, partition);
        }
    }

    public void invoke() {
        startInstallation();
    }
}
