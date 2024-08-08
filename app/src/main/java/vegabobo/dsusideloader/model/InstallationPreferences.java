package vegabobo.dsusideloader.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Session.kt */
public final class InstallationPreferences {
    public static final int $stable = LiveLiterals$SessionKt.INSTANCE.m2732Int$classInstallationPreferences();
    public boolean isUnmountSdCard;
    public boolean useBuiltinInstaller;

    public boolean equals(Object obj) {
        if (this == obj) {
            return LiveLiterals$SessionKt.INSTANCE.m2724Boolean$branch$when$funequals$classInstallationPreferences();
        }
        if (!(obj instanceof InstallationPreferences)) {
            return LiveLiterals$SessionKt.INSTANCE.m2725Boolean$branch$when1$funequals$classInstallationPreferences();
        }
        InstallationPreferences installationPreferences = (InstallationPreferences) obj;
        return this.isUnmountSdCard != installationPreferences.isUnmountSdCard ? LiveLiterals$SessionKt.INSTANCE.m2726Boolean$branch$when2$funequals$classInstallationPreferences() : this.useBuiltinInstaller != installationPreferences.useBuiltinInstaller ? LiveLiterals$SessionKt.INSTANCE.m2727Boolean$branch$when3$funequals$classInstallationPreferences() : LiveLiterals$SessionKt.INSTANCE.m2728Boolean$funequals$classInstallationPreferences();
    }

    public int hashCode() {
        boolean z = this.isUnmountSdCard;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int r2 = LiveLiterals$SessionKt.INSTANCE.m2731Int$arg0$calltimes$$this$callplus$setresult$funhashCode$classInstallationPreferences() * (z ? 1 : 0);
        boolean z3 = this.useBuiltinInstaller;
        if (!z3) {
            z2 = z3;
        }
        return r2 + (z2 ? 1 : 0);
    }

    public String toString() {
        LiveLiterals$SessionKt liveLiterals$SessionKt = LiveLiterals$SessionKt.INSTANCE;
        String r1 = liveLiterals$SessionKt.m2745String$0$str$funtoString$classInstallationPreferences();
        String r2 = liveLiterals$SessionKt.m2746String$1$str$funtoString$classInstallationPreferences();
        boolean z = this.isUnmountSdCard;
        String r4 = liveLiterals$SessionKt.m2752String$3$str$funtoString$classInstallationPreferences();
        String r5 = liveLiterals$SessionKt.m2754String$4$str$funtoString$classInstallationPreferences();
        boolean z2 = this.useBuiltinInstaller;
        String r0 = liveLiterals$SessionKt.m2756String$6$str$funtoString$classInstallationPreferences();
        return r1 + r2 + z + r4 + r5 + z2 + r0;
    }

    public InstallationPreferences(boolean isUnmountSdCard2, boolean useBuiltinInstaller2) {
        this.isUnmountSdCard = isUnmountSdCard2;
        this.useBuiltinInstaller = useBuiltinInstaller2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstallationPreferences(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LiveLiterals$SessionKt.INSTANCE.m2729Boolean$paramisUnmountSdCard$classInstallationPreferences() : z, (i & 2) != 0 ? LiveLiterals$SessionKt.INSTANCE.m2730Boolean$paramuseBuiltinInstaller$classInstallationPreferences() : z2);
    }

    public final boolean isUnmountSdCard() {
        return this.isUnmountSdCard;
    }

    public final void setUnmountSdCard(boolean z) {
        this.isUnmountSdCard = z;
    }

    public final boolean getUseBuiltinInstaller() {
        return this.useBuiltinInstaller;
    }

    public final void setUseBuiltinInstaller(boolean z) {
        this.useBuiltinInstaller = z;
    }
}
