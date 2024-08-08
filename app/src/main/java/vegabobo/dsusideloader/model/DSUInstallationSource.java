package vegabobo.dsusideloader.model;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DSUInstallationSource.kt */
public class DSUInstallationSource {
    public static final int $stable = LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2708Int$classDSUInstallationSource();
    public long fileSize;
    public final List images;
    public Type type;
    public Uri uri;

    public DSUInstallationSource(Type type2, Uri uri2, long fileSize2, List images2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(images2, "images");
        this.type = type2;
        this.uri = uri2;
        this.fileSize = fileSize2;
        this.images = images2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DSUInstallationSource(vegabobo.dsusideloader.model.Type r4, android.net.Uri r5, long r6, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            vegabobo.dsusideloader.model.Type r4 = vegabobo.dsusideloader.model.Type.NONE
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0013
            android.net.Uri r5 = android.net.Uri.EMPTY
            java.lang.String r10 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r10)
            r10 = r5
            goto L_0x0014
        L_0x0013:
            r10 = r5
        L_0x0014:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001c
            r6 = -1
            r0 = r6
            goto L_0x001d
        L_0x001c:
            r0 = r6
        L_0x001d:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0027
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r2 = r8
            goto L_0x0028
        L_0x0027:
            r2 = r8
        L_0x0028:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.model.DSUInstallationSource.<init>(vegabobo.dsusideloader.model.Type, android.net.Uri, long, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public Type getType() {
        return this.type;
    }

    public Uri getUri() {
        return this.uri;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public List getImages() {
        return this.images;
    }

    /* compiled from: DSUInstallationSource.kt */
    public static final class SingleSystemImage extends DSUInstallationSource {
        public static final int $stable = LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2710Int$classSingleSystemImage$classDSUInstallationSource();
        public long fileSize;
        public Type type;
        public Uri uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2695Boolean$branch$when$funequals$classSingleSystemImage$classDSUInstallationSource();
            }
            if (!(obj instanceof SingleSystemImage)) {
                return LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2697Boolean$branch$when1$funequals$classSingleSystemImage$classDSUInstallationSource();
            }
            SingleSystemImage singleSystemImage = (SingleSystemImage) obj;
            return !Intrinsics.areEqual((Object) this.uri, (Object) singleSystemImage.uri) ? LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2699Boolean$branch$when2$funequals$classSingleSystemImage$classDSUInstallationSource() : this.fileSize != singleSystemImage.fileSize ? LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2701Boolean$branch$when3$funequals$classSingleSystemImage$classDSUInstallationSource() : this.type != singleSystemImage.type ? LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2702Boolean$branch$when4$funequals$classSingleSystemImage$classDSUInstallationSource() : LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2704Boolean$funequals$classSingleSystemImage$classDSUInstallationSource();
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode();
            LiveLiterals$DSUInstallationSourceKt liveLiterals$DSUInstallationSourceKt = LiveLiterals$DSUInstallationSourceKt.INSTANCE;
            return (liveLiterals$DSUInstallationSourceKt.m2707Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classSingleSystemImage$classDSUInstallationSource() * ((liveLiterals$DSUInstallationSourceKt.m2706Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classSingleSystemImage$classDSUInstallationSource() * hashCode) + Long.hashCode(this.fileSize))) + this.type.hashCode();
        }

        public String toString() {
            LiveLiterals$DSUInstallationSourceKt liveLiterals$DSUInstallationSourceKt = LiveLiterals$DSUInstallationSourceKt.INSTANCE;
            String r1 = liveLiterals$DSUInstallationSourceKt.m2712String$0$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            String r2 = liveLiterals$DSUInstallationSourceKt.m2714String$1$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            Uri uri2 = this.uri;
            String r4 = liveLiterals$DSUInstallationSourceKt.m2716String$3$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            String r5 = liveLiterals$DSUInstallationSourceKt.m2718String$4$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            long j = this.fileSize;
            String r8 = liveLiterals$DSUInstallationSourceKt.m2720String$6$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            String r9 = liveLiterals$DSUInstallationSourceKt.m2721String$7$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            Type type2 = this.type;
            String r0 = liveLiterals$DSUInstallationSourceKt.m2722String$9$str$funtoString$classSingleSystemImage$classDSUInstallationSource();
            return r1 + r2 + uri2 + r4 + r5 + j + r8 + r9 + type2 + r0;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SingleSystemImage(android.net.Uri r1, long r2, vegabobo.dsusideloader.model.Type r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            /*
                r0 = this;
                r6 = r5 & 1
                if (r6 == 0) goto L_0x000b
                android.net.Uri r1 = android.net.Uri.EMPTY
                java.lang.String r6 = "EMPTY"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            L_0x000b:
                r6 = r5 & 2
                if (r6 == 0) goto L_0x0011
                r2 = -1
            L_0x0011:
                r5 = r5 & 4
                if (r5 == 0) goto L_0x0017
                vegabobo.dsusideloader.model.Type r4 = vegabobo.dsusideloader.model.Type.SINGLE_SYSTEM_IMAGE
            L_0x0017:
                r0.<init>(r1, r2, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.model.DSUInstallationSource.SingleSystemImage.<init>(android.net.Uri, long, vegabobo.dsusideloader.model.Type, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Uri getUri() {
            return this.uri;
        }

        public long getFileSize() {
            return this.fileSize;
        }

        public Type getType() {
            return this.type;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleSystemImage(Uri uri2, long fileSize2, Type type2) {
            super(Type.SINGLE_SYSTEM_IMAGE, (Uri) null, 0, (List) null, 14, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.uri = uri2;
            this.fileSize = fileSize2;
            this.type = type2;
        }
    }

    /* compiled from: DSUInstallationSource.kt */
    public static final class DsuPackage extends DSUInstallationSource {
        public static final int $stable = LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2709Int$classDsuPackage$classDSUInstallationSource();
        public Type type;
        public Uri uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2694Boolean$branch$when$funequals$classDsuPackage$classDSUInstallationSource();
            }
            if (!(obj instanceof DsuPackage)) {
                return LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2696Boolean$branch$when1$funequals$classDsuPackage$classDSUInstallationSource();
            }
            DsuPackage dsuPackage = (DsuPackage) obj;
            return !Intrinsics.areEqual((Object) this.uri, (Object) dsuPackage.uri) ? LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2698Boolean$branch$when2$funequals$classDsuPackage$classDSUInstallationSource() : this.type != dsuPackage.type ? LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2700Boolean$branch$when3$funequals$classDsuPackage$classDSUInstallationSource() : LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2703Boolean$funequals$classDsuPackage$classDSUInstallationSource();
        }

        public int hashCode() {
            return (LiveLiterals$DSUInstallationSourceKt.INSTANCE.m2705Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classDsuPackage$classDSUInstallationSource() * this.uri.hashCode()) + this.type.hashCode();
        }

        public String toString() {
            LiveLiterals$DSUInstallationSourceKt liveLiterals$DSUInstallationSourceKt = LiveLiterals$DSUInstallationSourceKt.INSTANCE;
            String r1 = liveLiterals$DSUInstallationSourceKt.m2711String$0$str$funtoString$classDsuPackage$classDSUInstallationSource();
            String r2 = liveLiterals$DSUInstallationSourceKt.m2713String$1$str$funtoString$classDsuPackage$classDSUInstallationSource();
            Uri uri2 = this.uri;
            String r4 = liveLiterals$DSUInstallationSourceKt.m2715String$3$str$funtoString$classDsuPackage$classDSUInstallationSource();
            String r5 = liveLiterals$DSUInstallationSourceKt.m2717String$4$str$funtoString$classDsuPackage$classDSUInstallationSource();
            Type type2 = this.type;
            String r0 = liveLiterals$DSUInstallationSourceKt.m2719String$6$str$funtoString$classDsuPackage$classDSUInstallationSource();
            return r1 + r2 + uri2 + r4 + r5 + type2 + r0;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ DsuPackage(android.net.Uri r1, vegabobo.dsusideloader.model.Type r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r4 = r3 & 1
                if (r4 == 0) goto L_0x000b
                android.net.Uri r1 = android.net.Uri.EMPTY
                java.lang.String r4 = "EMPTY"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            L_0x000b:
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0011
                vegabobo.dsusideloader.model.Type r2 = vegabobo.dsusideloader.model.Type.DSU_PACKAGE
            L_0x0011:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.model.DSUInstallationSource.DsuPackage.<init>(android.net.Uri, vegabobo.dsusideloader.model.Type, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Uri getUri() {
            return this.uri;
        }

        public Type getType() {
            return this.type;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DsuPackage(Uri uri2, Type type2) {
            super(Type.DSU_PACKAGE, (Uri) null, 0, (List) null, 14, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.uri = uri2;
            this.type = type2;
        }
    }
}
