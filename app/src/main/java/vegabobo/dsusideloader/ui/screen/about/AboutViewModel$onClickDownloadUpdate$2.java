package vegabobo.dsusideloader.ui.screen.about;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AboutViewModel.kt */
public final class AboutViewModel$onClickDownloadUpdate$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ AboutViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutViewModel$onClickDownloadUpdate$2(AboutViewModel aboutViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aboutViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutViewModel$onClickDownloadUpdate$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AboutViewModel$onClickDownloadUpdate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                String path = this.this$0.getApplication().getFilesDir().getPath();
                LiveLiterals$AboutViewModelKt liveLiterals$AboutViewModelKt = LiveLiterals$AboutViewModelKt.INSTANCE;
                File finalFile = new File(path + liveLiterals$AboutViewModelKt.m3129String$arg0$callplus$arg0$call$init$$valfinalFile$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel());
                try {
                    final long length = new URL(this.this$0.getResponse().getApkUrl()).openConnection().getContentLengthLong();
                    try {
                        InputStream input = new URL(this.this$0.getResponse().getApkUrl()).openStream();
                        FileOutputStream output = new FileOutputStream(finalFile);
                        byte[] buffer = new byte[(liveLiterals$AboutViewModelKt.m3102Int$$this$calltimes$arg0$call$init$$valbuffer$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel() * liveLiterals$AboutViewModelKt.m3108Int$arg0$calltimes$arg0$call$init$$valbuffer$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel())];
                        final Ref$LongRef readed = new Ref$LongRef();
                        readed.element = liveLiterals$AboutViewModelKt.m3115Long$valreaded$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel();
                        while (true) {
                            int it = input.read(buffer);
                            int n = it;
                            Unit unit = Unit.INSTANCE;
                            if (-1 != it) {
                                readed.element += (long) buffer.length;
                                output.write(buffer, LiveLiterals$AboutViewModelKt.INSTANCE.m3110Int$arg1$callwrite$body$loop$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel(), n);
                                this.this$0.updateUpdaterCard(new Function1() {
                                    public final UpdaterCardState invoke(UpdaterCardState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return UpdaterCardState.copy$default(it, (UpdateStatus) null, false, (String) null, ((float) readed.element) / ((float) length), 7, (Object) null);
                                    }
                                });
                            } else {
                                input.close();
                                output.close();
                                this.this$0.updateUpdaterCard(AnonymousClass3.INSTANCE);
                                Application application = this.this$0.getApplication();
                                LiveLiterals$AboutViewModelKt liveLiterals$AboutViewModelKt2 = LiveLiterals$AboutViewModelKt.INSTANCE;
                                Uri apkUri = FileProvider.getUriForFile(application, "vegabobo.dsusideloader" + liveLiterals$AboutViewModelKt2.m3130String$arg0$callplus$arg1$callgetUriForFile$valapkUri$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel(), finalFile);
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(apkUri, liveLiterals$AboutViewModelKt2.m3131String$arg1$callsetDataAndType$fun$anonymous$$arg2$calllaunch$funonClickDownloadUpdate$classAboutViewModel());
                                intent.setFlags(intent.getFlags() + 268435456);
                                intent.setFlags(intent.getFlags() + 1);
                                this.this$0.getApplication().startActivity(intent);
                                return Unit.INSTANCE;
                            }
                        }
                    } catch (Exception e) {
                        this.this$0.updateUpdaterCard(AboutViewModel$onClickDownloadUpdate$2$input$1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    this.this$0.updateUpdaterCard(AboutViewModel$onClickDownloadUpdate$2$length$1.INSTANCE);
                    return Unit.INSTANCE;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
