package vegabobo.dsusideloader.util;

import com.topjohnwu.superuser.CallbackList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmdRunner.kt */
public final class CmdRunner$runReadEachLine$callbackList$1 extends CallbackList {
    public final /* synthetic */ Function1 $onReceive;

    public CmdRunner$runReadEachLine$callbackList$1(Function1 $onReceive2) {
        this.$onReceive = $onReceive2;
    }

    public final /* bridge */ boolean contains(Object element) {
        if (!(element == null ? true : element instanceof String)) {
            return false;
        }
        return contains((String) element);
    }

    public /* bridge */ boolean contains(String element) {
        return super.contains(element);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object element) {
        if (!(element == null ? true : element instanceof String)) {
            return -1;
        }
        return indexOf((String) element);
    }

    public /* bridge */ int indexOf(String element) {
        return super.indexOf(element);
    }

    public final /* bridge */ int lastIndexOf(Object element) {
        if (!(element == null ? true : element instanceof String)) {
            return -1;
        }
        return lastIndexOf((String) element);
    }

    public /* bridge */ int lastIndexOf(String element) {
        return super.lastIndexOf(element);
    }

    public final /* bridge */ boolean remove(Object element) {
        if (!(element == null ? true : element instanceof String)) {
            return false;
        }
        return remove((String) element);
    }

    public /* bridge */ boolean remove(String element) {
        return super.remove(element);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void onAddElement(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        this.$onReceive.invoke(s);
    }
}
