package vegabobo.dsusideloader.ui.screen.about;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.State;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import vegabobo.dsusideloader.C0001R$string;

/* compiled from: AboutScreen.kt */
public final class AboutScreenKt$AboutScreen$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AboutViewModel $aboutViewModel;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ State $uiState$delegate;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutScreenKt$AboutScreen$1(AboutViewModel aboutViewModel, State state, Context context, Continuation continuation) {
        super(2, continuation);
        this.$aboutViewModel = aboutViewModel;
        this.$uiState$delegate = state;
        this.$context = context;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutScreenKt$AboutScreen$1(this.$aboutViewModel, this.$uiState$delegate, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AboutScreenKt$AboutScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$1$1  reason: invalid class name */
    /* compiled from: AboutScreen.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: vegabobo.dsusideloader.ui.screen.about.AboutScreenKt$AboutScreen$1$1$WhenMappings */
        /* compiled from: AboutScreen.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DevOptToastDisplay.values().length];
                try {
                    iArr[DevOptToastDisplay.ENABLED_DEV_OPT.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[DevOptToastDisplay.DISABLED_DEV_OPT.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(context, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(DevOptToastDisplay devOptToastDisplay, Continuation continuation) {
            return ((AnonymousClass1) create(devOptToastDisplay, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    switch (WhenMappings.$EnumSwitchMapping$0[((DevOptToastDisplay) this.L$0).ordinal()]) {
                        case 1:
                            Context context = context;
                            Toast.makeText(context, context.getString(C0001R$string.developer_options_enabled), 1).show();
                            break;
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                            Context context2 = context;
                            Toast.makeText(context2, context2.getString(C0001R$string.developer_options_disabled), 1).show();
                            break;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$aboutViewModel.resetDeveloperOptionsCounter();
                MutableStateFlow toastDisplay = AboutScreenKt.AboutScreen$lambda$0(this.$uiState$delegate).getToastDisplay();
                final Context context = this.$context;
                AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                this.label = 1;
                if (FlowKt.collectLatest(toastDisplay, r3, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
