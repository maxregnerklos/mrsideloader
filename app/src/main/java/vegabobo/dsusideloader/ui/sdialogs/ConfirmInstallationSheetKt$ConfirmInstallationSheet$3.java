package vegabobo.dsusideloader.ui.sdialogs;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons$Outlined;
import androidx.compose.material.icons.outlined.ArticleKt;
import androidx.compose.material.icons.outlined.InsertDriveFileKt;
import androidx.compose.material.icons.outlined.StorageKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.components.DialogItemKt;

/* compiled from: ConfirmInstallationSheet.kt */
public final class ConfirmInstallationSheetKt$ConfirmInstallationSheet$3 extends Lambda implements Function3 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ String $filename;
    public final /* synthetic */ String $userdata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmInstallationSheetKt$ConfirmInstallationSheet$3(String str, int i, String str2, long j) {
        super(3);
        this.$filename = str;
        this.$$dirty = i;
        this.$userdata = str2;
        this.$fileSize = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke((ColumnScope) p1, (Composer) p2, ((Number) p3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope $this$DialogLikeBottomSheet, Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        Intrinsics.checkNotNullParameter($this$DialogLikeBottomSheet, "$this$DialogLikeBottomSheet");
        ComposerKt.sourceInformation(composer, "C32@1261L41,35@1409L43,37@1532L11,33@1315L256,41@1670L43,43@1800L11,39@1584L255,48@2013L40,50@2147L11,46@1919L271:ConfirmInstallationSheet.kt#c2k7s9");
        if ((i & 81) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1610812904, i, -1, "vegabobo.dsusideloader.ui.sdialogs.ConfirmInstallationSheet.<anonymous> (ConfirmInstallationSheet.kt:31)");
            }
            Modifier.Companion companion = Modifier.Companion;
            LiveLiterals$ConfirmInstallationSheetKt liveLiterals$ConfirmInstallationSheetKt = LiveLiterals$ConfirmInstallationSheetKt.INSTANCE;
            SpacerKt.Spacer(PaddingKt.m221padding3ABfNKs(companion, Dp.m2350constructorimpl((float) liveLiterals$ConfirmInstallationSheetKt.m3402Int$$$this$call$getdp$$arg0$callpadding$arg0$callSpacer$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet())), composer, 0);
            Icons$Outlined icons$Outlined = Icons$Outlined.INSTANCE;
            ImageVector insertDriveFile = InsertDriveFileKt.getInsertDriveFile(icons$Outlined);
            String str = StringResources_androidKt.stringResource(C0001R$string.selected_file, composer, 0) + liveLiterals$ConfirmInstallationSheetKt.m3404String$1$str$arg1$callDialogItem$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet();
            String str2 = this.$filename;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            Composer composer2 = $composer;
            DialogItemKt.m2935DialogItemww6aTOc(insertDriveFile, str, str2, materialTheme.getColorScheme(composer, i2).m586getOnBackground0d7_KjU(), composer2, (this.$$dirty << 6) & 896, 0);
            int i3 = i2;
            int i4 = i3;
            DialogItemKt.m2935DialogItemww6aTOc(StorageKt.getStorage(icons$Outlined), StringResources_androidKt.stringResource(C0001R$string.userdata_size, composer, 0) + liveLiterals$ConfirmInstallationSheetKt.m3405String$1$str$arg1$callDialogItem1$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet(), this.$userdata + liveLiterals$ConfirmInstallationSheetKt.m3407String$1$str$arg2$callDialogItem1$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet(), materialTheme.getColorScheme(composer, i3).m586getOnBackground0d7_KjU(), composer2, 0, 0);
            if (this.$fileSize != -1) {
                DialogItemKt.m2935DialogItemww6aTOc(ArticleKt.getArticle(icons$Outlined), StringResources_androidKt.stringResource(C0001R$string.image_size, composer, 0) + liveLiterals$ConfirmInstallationSheetKt.m3403String$1$str$arg1$callDialogItem$branch$if$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet(), this.$fileSize + liveLiterals$ConfirmInstallationSheetKt.m3406String$1$str$arg2$callDialogItem$branch$if$fun$anonymous$$arg10$callDialogLikeBottomSheet$funConfirmInstallationSheet(), materialTheme.getColorScheme(composer, i4).m586getOnBackground0d7_KjU(), $composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
