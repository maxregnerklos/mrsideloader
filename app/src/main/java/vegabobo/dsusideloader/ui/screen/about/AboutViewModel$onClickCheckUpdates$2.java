package vegabobo.dsusideloader.ui.screen.about;

import android.util.Log;
import java.net.URL;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel$onClickCheckUpdates$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ AboutViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutViewModel$onClickCheckUpdates$2(AboutViewModel aboutViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aboutViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutViewModel$onClickCheckUpdates$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AboutViewModel$onClickCheckUpdates$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                try {
                    URL url = new URL("https://raw.githubusercontent.com/VegaBobo/DSU-Sideloader/master/other/updater.json");
                    this.this$0.setResponse((UpdaterResponse) Json.Default.decodeFromString(UpdaterResponse.Companion.serializer(), new String(TextStreamsKt.readBytes(url), Charsets.UTF_8)));
                    final AboutViewModel aboutViewModel = this.this$0;
                    aboutViewModel.updateUpdaterCard(new Function1() {
                        public final UpdaterCardState invoke(UpdaterCardState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return UpdaterCardState.copy$default(it, (UpdateStatus) null, false, aboutViewModel.getResponse().getVersionName(), 0.0f, 11, (Object) null);
                        }
                    });
                    if (this.this$0.getResponse().getVersionCode() > 8) {
                        this.this$0.updateUpdaterCard(AnonymousClass2.INSTANCE);
                    } else {
                        this.this$0.updateUpdaterCard(AnonymousClass3.INSTANCE);
                    }
                    Log.d(this.this$0.tag, String.valueOf(this.this$0.getResponse()));
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    this.this$0.updateUpdaterCard(AboutViewModel$onClickCheckUpdates$2$apiResponse$1.INSTANCE);
                    return Unit.INSTANCE;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
