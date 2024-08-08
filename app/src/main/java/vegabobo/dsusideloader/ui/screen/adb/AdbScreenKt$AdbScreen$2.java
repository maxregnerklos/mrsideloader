package vegabobo.dsusideloader.ui.screen.adb;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.cards.CopyableTextCardKt;

/* compiled from: AdbScreen.kt */
public final class AdbScreenKt$AdbScreen$2 extends Lambda implements Function2 {
    public final /* synthetic */ String $startInstallationCommand;
    public final /* synthetic */ String $startInstallationCommandAdb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdbScreenKt$AdbScreen$2(String str, String str2) {
        super(2);
        this.$startInstallationCommandAdb = str;
        this.$startInstallationCommand = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C39@1556L50,39@1544L63,40@1620L52,41@1697L46,41@1685L59,42@1757L49,43@1831L45,43@1819L58:AdbScreen.kt#bu660e");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813929288, i, -1, "vegabobo.dsusideloader.ui.screen.adb.AdbScreen.<anonymous> (AdbScreen.kt:38)");
            }
            Composer composer2 = $composer;
            TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.adb_how_to_adb_shell, composer, 0), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 65534);
            Composer composer3 = $composer;
            CopyableTextCardKt.CopyableTextCard(this.$startInstallationCommandAdb, false, composer3, 0, 2);
            TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.adb_how_to_shell, composer3, 0), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 65534);
            Composer composer4 = $composer;
            CopyableTextCardKt.CopyableTextCard(this.$startInstallationCommand, false, composer4, 0, 2);
            TextKt.m754TextfLXpl1I(StringResources_androidKt.stringResource(C0001R$string.adb_how_to_done, composer4, 0), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
