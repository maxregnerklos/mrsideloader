package vegabobo.dsusideloader.preparation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* compiled from: FileUnPacker.kt */
public final class FileUnPacker$unpack$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $archiveInputStream;
    public final /* synthetic */ FileUnPacker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileUnPacker$unpack$1(FileUnPacker fileUnPacker, Object obj) {
        super(1);
        this.this$0 = fileUnPacker;
        this.$archiveInputStream = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Number) p1).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long it) {
        FileUnPacker fileUnPacker = this.this$0;
        fileUnPacker.updateProgress(fileUnPacker.inputFileSize, ((InputStreamStatistics) this.$archiveInputStream).getCompressedCount());
    }
}
