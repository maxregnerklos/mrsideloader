package vegabobo.dsusideloader.ui.screen.about;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AboutViewModel.kt */
public final class UpdaterResponse {
    public static final int $stable = LiveLiterals$AboutViewModelKt.INSTANCE.m3113Int$classUpdaterResponse();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public final String apkUrl;
    public final String changelogUrl;
    public final String identifier;
    public final int versionCode;
    public final String versionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$AboutViewModelKt.INSTANCE.m3094Boolean$branch$when$funequals$classUpdaterResponse();
        }
        if (!(obj instanceof UpdaterResponse)) {
            return LiveLiterals$AboutViewModelKt.INSTANCE.m3095Boolean$branch$when1$funequals$classUpdaterResponse();
        }
        UpdaterResponse updaterResponse = (UpdaterResponse) obj;
        return !Intrinsics.areEqual((Object) this.identifier, (Object) updaterResponse.identifier) ? LiveLiterals$AboutViewModelKt.INSTANCE.m3096Boolean$branch$when2$funequals$classUpdaterResponse() : this.versionCode != updaterResponse.versionCode ? LiveLiterals$AboutViewModelKt.INSTANCE.m3097Boolean$branch$when3$funequals$classUpdaterResponse() : !Intrinsics.areEqual((Object) this.versionName, (Object) updaterResponse.versionName) ? LiveLiterals$AboutViewModelKt.INSTANCE.m3098Boolean$branch$when4$funequals$classUpdaterResponse() : !Intrinsics.areEqual((Object) this.apkUrl, (Object) updaterResponse.apkUrl) ? LiveLiterals$AboutViewModelKt.INSTANCE.m3099Boolean$branch$when5$funequals$classUpdaterResponse() : !Intrinsics.areEqual((Object) this.changelogUrl, (Object) updaterResponse.changelogUrl) ? LiveLiterals$AboutViewModelKt.INSTANCE.m3100Boolean$branch$when6$funequals$classUpdaterResponse() : LiveLiterals$AboutViewModelKt.INSTANCE.m3101Boolean$funequals$classUpdaterResponse();
    }

    public int hashCode() {
        int hashCode = this.identifier.hashCode();
        LiveLiterals$AboutViewModelKt liveLiterals$AboutViewModelKt = LiveLiterals$AboutViewModelKt.INSTANCE;
        int r0 = liveLiterals$AboutViewModelKt.m3105Int$arg0$calltimes$$this$callplus$setresult1$funhashCode$classUpdaterResponse();
        int r2 = liveLiterals$AboutViewModelKt.m3106Int$arg0$calltimes$$this$callplus$setresult2$funhashCode$classUpdaterResponse();
        return (liveLiterals$AboutViewModelKt.m3107Int$arg0$calltimes$$this$callplus$setresult3$funhashCode$classUpdaterResponse() * ((r2 * ((r0 * ((liveLiterals$AboutViewModelKt.m3104Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classUpdaterResponse() * hashCode) + Integer.hashCode(this.versionCode))) + this.versionName.hashCode())) + this.apkUrl.hashCode())) + this.changelogUrl.hashCode();
    }

    public String toString() {
        LiveLiterals$AboutViewModelKt liveLiterals$AboutViewModelKt = LiveLiterals$AboutViewModelKt.INSTANCE;
        String r2 = liveLiterals$AboutViewModelKt.m3118String$0$str$funtoString$classUpdaterResponse();
        String r3 = liveLiterals$AboutViewModelKt.m3119String$1$str$funtoString$classUpdaterResponse();
        String str = this.identifier;
        String r5 = liveLiterals$AboutViewModelKt.m3124String$3$str$funtoString$classUpdaterResponse();
        String r6 = liveLiterals$AboutViewModelKt.m3125String$4$str$funtoString$classUpdaterResponse();
        int i = this.versionCode;
        String r8 = liveLiterals$AboutViewModelKt.m3126String$6$str$funtoString$classUpdaterResponse();
        String r9 = liveLiterals$AboutViewModelKt.m3127String$7$str$funtoString$classUpdaterResponse();
        String str2 = this.versionName;
        String r11 = liveLiterals$AboutViewModelKt.m3128String$9$str$funtoString$classUpdaterResponse();
        String r12 = liveLiterals$AboutViewModelKt.m3120String$10$str$funtoString$classUpdaterResponse();
        String str3 = this.apkUrl;
        String r14 = liveLiterals$AboutViewModelKt.m3121String$12$str$funtoString$classUpdaterResponse();
        String r16 = liveLiterals$AboutViewModelKt.m3122String$13$str$funtoString$classUpdaterResponse();
        String str4 = this.changelogUrl;
        String r1 = liveLiterals$AboutViewModelKt.m3123String$15$str$funtoString$classUpdaterResponse();
        return r2 + r3 + str + r5 + r6 + i + r8 + r9 + str2 + r11 + r12 + str3 + r14 + r16 + str4 + r1;
    }

    /* compiled from: AboutViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final KSerializer serializer() {
            return UpdaterResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdaterResponse(int seen1, String identifier2, int versionCode2, String versionName2, String apkUrl2, String changelogUrl2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((seen1 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 0, UpdaterResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((seen1 & 1) == 0) {
            this.identifier = LiveLiterals$AboutViewModelKt.INSTANCE.m3134String$paramidentifier$classUpdaterResponse();
        } else {
            this.identifier = identifier2;
        }
        if ((seen1 & 2) == 0) {
            this.versionCode = LiveLiterals$AboutViewModelKt.INSTANCE.m3114Int$paramversionCode$classUpdaterResponse();
        } else {
            this.versionCode = versionCode2;
        }
        if ((seen1 & 4) == 0) {
            this.versionName = LiveLiterals$AboutViewModelKt.INSTANCE.m3135String$paramversionName$classUpdaterResponse();
        } else {
            this.versionName = versionName2;
        }
        if ((seen1 & 8) == 0) {
            this.apkUrl = LiveLiterals$AboutViewModelKt.INSTANCE.m3132String$paramapkUrl$classUpdaterResponse();
        } else {
            this.apkUrl = apkUrl2;
        }
        if ((seen1 & 16) == 0) {
            this.changelogUrl = LiveLiterals$AboutViewModelKt.INSTANCE.m3133String$paramchangelogUrl$classUpdaterResponse();
        } else {
            this.changelogUrl = changelogUrl2;
        }
    }

    public UpdaterResponse(String identifier2, int versionCode2, String versionName2, String apkUrl2, String changelogUrl2) {
        Intrinsics.checkNotNullParameter(identifier2, "identifier");
        Intrinsics.checkNotNullParameter(versionName2, "versionName");
        Intrinsics.checkNotNullParameter(apkUrl2, "apkUrl");
        Intrinsics.checkNotNullParameter(changelogUrl2, "changelogUrl");
        this.identifier = identifier2;
        this.versionCode = versionCode2;
        this.versionName = versionName2;
        this.apkUrl = apkUrl2;
        this.changelogUrl = changelogUrl2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpdaterResponse(java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r4 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            java.lang.String r4 = r4.m3134String$paramidentifier$classUpdaterResponse()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0016
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r5 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            int r5 = r5.m3114Int$paramversionCode$classUpdaterResponse()
            r10 = r5
            goto L_0x0017
        L_0x0016:
            r10 = r5
        L_0x0017:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0023
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r5 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            java.lang.String r6 = r5.m3135String$paramversionName$classUpdaterResponse()
            r0 = r6
            goto L_0x0024
        L_0x0023:
            r0 = r6
        L_0x0024:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0030
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r5 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            java.lang.String r7 = r5.m3132String$paramapkUrl$classUpdaterResponse()
            r1 = r7
            goto L_0x0031
        L_0x0030:
            r1 = r7
        L_0x0031:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x003d
            vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt r5 = vegabobo.dsusideloader.ui.screen.about.LiveLiterals$AboutViewModelKt.INSTANCE
            java.lang.String r8 = r5.m3133String$paramchangelogUrl$classUpdaterResponse()
            r2 = r8
            goto L_0x003e
        L_0x003d:
            r2 = r8
        L_0x003e:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vegabobo.dsusideloader.ui.screen.about.UpdaterResponse.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getApkUrl() {
        return this.apkUrl;
    }

    public final String getChangelogUrl() {
        return this.changelogUrl;
    }
}
