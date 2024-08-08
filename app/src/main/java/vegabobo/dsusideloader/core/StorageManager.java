package vegabobo.dsusideloader.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import androidx.datastore.core.DataStore;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.apache.commons.compress.utils.IOUtils;
import vegabobo.dsusideloader.util.DataStoreUtils;
import vegabobo.dsusideloader.util.FilenameUtils;

/* compiled from: StorageManager.kt */
public final class StorageManager {
    public static final int $stable = LiveLiterals$StorageManagerKt.INSTANCE.m2559Int$classStorageManager();
    public final Context appContext;
    public final DataStore preferences;
    public String rwPathAllowedByUser = "";
    public DocumentFile workspaceFolder;

    public StorageManager(Context appContext2, DataStore preferences2) {
        Intrinsics.checkNotNullParameter(appContext2, "appContext");
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        this.appContext = appContext2;
        this.preferences = preferences2;
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: vegabobo.dsusideloader.core.StorageManager$1  reason: invalid class name */
    /* compiled from: StorageManager.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public int label;
        public final /* synthetic */ StorageManager this$0;

        {
            this.this$0 = r2;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DataStoreUtils.Companion companion = DataStoreUtils.Companion;
                    DataStore access$getPreferences$p = this.this$0.preferences;
                    String r4 = LiveLiterals$StorageManagerKt.INSTANCE.m2569String$arg2$callreadStringPref$fun$anonymous$$arg2$calllaunch$classStorageManager();
                    final StorageManager storageManager = this.this$0;
                    AnonymousClass1 r5 = new Function1() {
                        public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                            invoke((String) p1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            storageManager.arePermissionsGrantedToFolder(it);
                        }
                    };
                    this.label = 1;
                    if (companion.readStringPref(access$getPreferences$p, "writable_path", r4, r5, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean arePermissionsGrantedToFolder(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List foldersUriPermissions = this.appContext.getContentResolver().getPersistedUriPermissions();
        Intrinsics.checkNotNullExpressionValue(foldersUriPermissions, "appContext.contentResolver.persistedUriPermissions");
        for (UriPermission folder : foldersUriPermissions) {
            String persistedUriString = folder.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(persistedUriString, "folder.uri.toString()");
            if (Intrinsics.areEqual((Object) path, (Object) persistedUriString)) {
                DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this.appContext, folder.getUri());
                Intrinsics.checkNotNull(fromTreeUri);
                if (!fromTreeUri.exists()) {
                    return LiveLiterals$StorageManagerKt.INSTANCE.m2556Boolean$branch$if$branch$if$body$loop$funarePermissionsGrantedToFolder$classStorageManager();
                }
                if (folder.isWritePermission() && folder.isReadPermission()) {
                    this.rwPathAllowedByUser = path;
                    return LiveLiterals$StorageManagerKt.INSTANCE.m2557Boolean$branch$if1$branch$if$body$loop$funarePermissionsGrantedToFolder$classStorageManager();
                }
            } else {
                this.appContext.revokeUriPermission(folder.getUri(), 3);
            }
        }
        return LiveLiterals$StorageManagerKt.INSTANCE.m2558Boolean$funarePermissionsGrantedToFolder$classStorageManager();
    }

    public final DocumentFile getWorkspaceFolder() {
        DocumentFile documentFile = this.workspaceFolder;
        if (documentFile != null) {
            if (documentFile == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workspaceFolder");
                documentFile = null;
            }
            if (documentFile.canRead()) {
                DocumentFile documentFile2 = this.workspaceFolder;
                if (documentFile2 != null) {
                    return documentFile2;
                }
                Intrinsics.throwUninitializedPropertyAccessException("workspaceFolder");
                return null;
            }
        }
        if (!(this.rwPathAllowedByUser.length() == 0)) {
            Context context = this.appContext;
            Uri parse = Uri.parse(this.rwPathAllowedByUser);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            DocumentFile writeableDir = DocumentFile.fromTreeUri(context, parse);
            if (writeableDir != null) {
                DocumentFile findFile = writeableDir.findFile("workspace_dsuhelper");
                if (findFile == null) {
                    findFile = writeableDir.createDirectory("workspace_dsuhelper");
                    Intrinsics.checkNotNull(findFile);
                }
                this.workspaceFolder = findFile;
                if (findFile != null) {
                    return findFile;
                }
                Intrinsics.throwUninitializedPropertyAccessException("workspaceFolder");
                return null;
            }
            throw new Exception(LiveLiterals$StorageManagerKt.INSTANCE.m2563String$arg0$call$init$$branch$when$valwriteableDir$fungetWorkspaceFolder$classStorageManager());
        }
        throw new Exception(LiveLiterals$StorageManagerKt.INSTANCE.m2561String$arg0$call$init$$branch$if1$fungetWorkspaceFolder$classStorageManager());
    }

    public final void cleanWorkspaceFolder(boolean deleteAlsoGzFile) {
        DocumentFile[] listFiles = getWorkspaceFolder().listFiles();
        Intrinsics.checkNotNullExpressionValue(listFiles, "getWorkspaceFolder().listFiles()");
        for (DocumentFile file : listFiles) {
            if (deleteAlsoGzFile || !StringsKt__StringsJVMKt.endsWith$default(String.valueOf(file.getName()), LiveLiterals$StorageManagerKt.INSTANCE.m2566String$arg0$callendsWith$$this$callnot$else$cond$if$body$loop$funcleanWorkspaceFolder$classStorageManager(), false, 2, (Object) null)) {
                file.delete();
            }
        }
    }

    public final Uri copyFileToSafFolder(Uri inputFile) {
        DocumentFile clone = createDocumentFile(getFilenameFromUri(inputFile));
        InputStream openInputStream = openInputStream(inputFile);
        Uri uri = clone.getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "clone.uri");
        IOUtils.copy(openInputStream, openOutputStream(uri));
        Uri uri2 = clone.getUri();
        Intrinsics.checkNotNullExpressionValue(uri2, "clone.uri");
        return uri2;
    }

    public final String writeStringToExternalFileDir(String content, String filename) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(filename, "filename");
        File externalFilesDir = this.appContext.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            String r3 = LiveLiterals$StorageManagerKt.INSTANCE.m2560String$0$str$arg0$callplus$arg0$call$init$$valnewFile$funwriteStringToExternalFileDir$classStorageManager();
            File newFile = new File(absolutePath + r3 + filename);
            if (newFile.exists()) {
                newFile.delete();
            }
            newFile.createNewFile();
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            FilesKt__FileReadWriteKt.writeBytes(newFile, bytes);
            String absolutePath2 = newFile.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "newFile.absolutePath");
            return absolutePath2;
        }
        throw new IOException(LiveLiterals$StorageManagerKt.INSTANCE.m2562String$arg0$call$init$$branch$when$valexternalFilesDir$funwriteStringToExternalFileDir$classStorageManager());
    }

    public final String writeStringToUri(String content, Uri uri) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(uri, "uri");
        OutputStream outputStream = this.appContext.getContentResolver().openOutputStream(uri);
        Intrinsics.checkNotNull(outputStream);
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
        outputStream.close();
        FilenameUtils.Companion companion = FilenameUtils.Companion;
        LiveLiterals$StorageManagerKt liveLiterals$StorageManagerKt = LiveLiterals$StorageManagerKt.INSTANCE;
        return StringsKt__StringsJVMKt.replace$default(companion.getFilePath(uri, liveLiterals$StorageManagerKt.m2555Boolean$arg1$callgetFilePath$$$this$callreplace$funwriteStringToUri$classStorageManager()), liveLiterals$StorageManagerKt.m2567String$arg0$callreplace$funwriteStringToUri$classStorageManager(), liveLiterals$StorageManagerKt.m2568String$arg1$callreplace$funwriteStringToUri$classStorageManager(), false, 4, (Object) null);
    }

    /* Debug info: failed to restart local var, previous not found, register: 4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readFileFromAssets(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r0 = r4.appContext
            android.content.res.AssetManager r0 = r0.getAssets()
            java.io.InputStream r0 = r0.open(r5)
            java.lang.String r1 = "appContext.assets.open(filename)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0022
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x002a
        L_0x0022:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L_0x002a:
            r0 = r2
            r1 = 0
            java.lang.String r3 = kotlin.io.TextStreamsKt.readText(r0)     // Catch:{ all -> 0x0035 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            return r3
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.core.StorageManager.readFileFromAssets(java.lang.String):java.lang.String");
    }

    public final String getFilenameFromUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        FilenameUtils.Companion companion = FilenameUtils.Companion;
        ContentResolver contentResolver = this.appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "appContext.contentResolver");
        return companion.queryName(contentResolver, uri);
    }

    public final long getFilesizeFromUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return FilenameUtils.Companion.getLengthFromFile(this.appContext, uri);
    }

    public final InputStream openInputStream(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        InputStream openInputStream = this.appContext.getContentResolver().openInputStream(uri);
        Intrinsics.checkNotNull(openInputStream);
        return openInputStream;
    }

    public final OutputStream openOutputStream(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        OutputStream openOutputStream = this.appContext.getContentResolver().openOutputStream(uri);
        Intrinsics.checkNotNull(openOutputStream);
        return openOutputStream;
    }

    public final DocumentFile createDocumentFile(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        DocumentFile createFile = getWorkspaceFolder().createFile(LiveLiterals$StorageManagerKt.INSTANCE.m2565String$arg0$callcreateFile$arg0$callCHECK_NOT_NULL$funcreateDocumentFile$classStorageManager(), filename);
        Intrinsics.checkNotNull(createFile);
        return createFile;
    }

    public final Uri getUriSafe(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (isPathWrong(uri)) {
            return copyFileToSafFolder(uri);
        }
        return uri;
    }

    public final boolean isPathWrong(Uri uri) {
        return StringsKt__StringsKt.contains$default((CharSequence) String.valueOf(uri.getPath()), (CharSequence) LiveLiterals$StorageManagerKt.INSTANCE.m2564String$arg0$callcontains$funisPathWrong$classStorageManager(), false, 2, (Object) null);
    }
}
