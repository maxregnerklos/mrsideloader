package vegabobo.dsusideloader.installer.adb;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import vegabobo.dsusideloader.core.StorageManager;
import vegabobo.dsusideloader.model.InstallationPreferences;

/* compiled from: GenerateInstallationScript.kt */
public final class GenerateInstallationScript {
    public static final int $stable = LiveLiterals$GenerateInstallationScriptKt.INSTANCE.m2572Int$classGenerateInstallationScript();
    public final InstallationPreferences instPrefs;
    public final Triple parameters;
    public final StorageManager storageManager;

    public GenerateInstallationScript(StorageManager storageManager2, Triple parameters2, InstallationPreferences instPrefs2) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(parameters2, "parameters");
        Intrinsics.checkNotNullParameter(instPrefs2, "instPrefs");
        this.storageManager = storageManager2;
        this.parameters = parameters2;
        this.instPrefs = instPrefs2;
    }

    public final String writeToFile() {
        return this.storageManager.writeStringToExternalFileDir(getShellScript(), "install");
    }

    public final String getShellScript() {
        String readFileFromAssets = this.storageManager.readFileFromAssets("install_script.sh");
        LiveLiterals$GenerateInstallationScriptKt liveLiterals$GenerateInstallationScriptKt = LiveLiterals$GenerateInstallationScriptKt.INSTANCE;
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(readFileFromAssets, liveLiterals$GenerateInstallationScriptKt.m2573String$arg0$callreplace$$$this$callreplace$fungetShellScript$classGenerateInstallationScript(), new InstallationCmdline(this.parameters).getCmd(), false, 4, (Object) null), liveLiterals$GenerateInstallationScriptKt.m2574String$arg0$callreplace$fungetShellScript$classGenerateInstallationScript(), String.valueOf(this.instPrefs.isUnmountSdCard()), false, 4, (Object) null);
    }
}
