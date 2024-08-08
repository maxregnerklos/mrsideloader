package vegabobo.dsusideloader.ui.cards;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: CopyableTextCard.kt */
public final class CopyableTextCardKt$CopyableTextCard$1$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ ClipboardManager $clipboardManager;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $copiedText;
    public final /* synthetic */ boolean $showToast;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CopyableTextCardKt$CopyableTextCard$1$1$1(ClipboardManager clipboardManager, String str, boolean z, Context context, String str2) {
        super(0);
        this.$clipboardManager = clipboardManager;
        this.$text = str;
        this.$showToast = z;
        this.$context = context;
        this.$copiedText = str2;
    }

    public final void invoke() {
        this.$clipboardManager.setText(new AnnotatedString(this.$text, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        if (this.$showToast) {
            Toast.makeText(this.$context, this.$copiedText, 0).show();
        }
    }
}
