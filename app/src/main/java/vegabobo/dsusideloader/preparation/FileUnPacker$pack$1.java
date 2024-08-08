package vegabobo.dsusideloader.preparation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: FileUnPacker.kt */
public final class FileUnPacker$pack$1 extends Lambda implements Function1 {
    public final /* synthetic */ FileUnPacker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileUnPacker$pack$1(FileUnPacker fileUnPacker) {
        super(1);
        this.this$0 = fileUnPacker;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke(((Number) p1).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long it) {
        FileUnPacker fileUnPacker = this.this$0;
        fileUnPacker.updateProgress(fileUnPacker.inputFileSize, it);
    }
}
