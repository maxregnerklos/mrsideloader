package vegabobo.dsusideloader.ui.screen.home;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vegabobo.dsusideloader.model.DSUInstallationSource;
import vegabobo.dsusideloader.model.InstallationPreferences;
import vegabobo.dsusideloader.preparation.InstallationStep;
import vegabobo.dsusideloader.preparation.Preparation;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$onConfirmInstallationSheet$2 extends SuspendLambda implements Function2 {
    public Object L$0;
    public int label;
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onConfirmInstallationSheet$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$onConfirmInstallationSheet$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$onConfirmInstallationSheet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        InstallationPreferences installationPreferences;
        HomeViewModel$onConfirmInstallationSheet$2 homeViewModel$onConfirmInstallationSheet$2;
        InstallationPreferences installationPreferences2;
        HomeViewModel$onConfirmInstallationSheet$2 homeViewModel$onConfirmInstallationSheet$22;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                InstallationPreferences preferences = this.this$0.getSession().getPreferences();
                HomeViewModel homeViewModel = this.this$0;
                this.L$0 = preferences;
                this.label = 1;
                Object readBoolPref = homeViewModel.readBoolPref("umount_sd", this);
                if (readBoolPref != coroutine_suspended) {
                    Object obj = $result;
                    $result = readBoolPref;
                    installationPreferences2 = preferences;
                    homeViewModel$onConfirmInstallationSheet$22 = this;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                installationPreferences2 = (InstallationPreferences) this.L$0;
                homeViewModel$onConfirmInstallationSheet$22 = this;
                Object obj2 = $result;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                homeViewModel$onConfirmInstallationSheet$2 = this;
                ResultKt.throwOnFailure($result);
                installationPreferences = (InstallationPreferences) homeViewModel$onConfirmInstallationSheet$2.L$0;
                Object obj3 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        installationPreferences2.setUnmountSdCard(((Boolean) $result).booleanValue());
        InstallationPreferences preferences2 = homeViewModel$onConfirmInstallationSheet$22.this$0.getSession().getPreferences();
        HomeViewModel homeViewModel2 = homeViewModel$onConfirmInstallationSheet$22.this$0;
        homeViewModel$onConfirmInstallationSheet$22.L$0 = preferences2;
        homeViewModel$onConfirmInstallationSheet$22.label = 2;
        Object readBoolPref2 = homeViewModel2.readBoolPref("builtin_installer", homeViewModel$onConfirmInstallationSheet$22);
        if (readBoolPref2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        homeViewModel$onConfirmInstallationSheet$2 = homeViewModel$onConfirmInstallationSheet$22;
        installationPreferences = preferences2;
        $result = readBoolPref2;
        installationPreferences.setUseBuiltinInstaller(((Boolean) $result).booleanValue());
        new Preparation(homeViewModel$onConfirmInstallationSheet$2.this$0.storageManager, homeViewModel$onConfirmInstallationSheet$2.this$0.getSession(), homeViewModel$onConfirmInstallationSheet$2.this$0.getInstallationJob(), new Function1(homeViewModel$onConfirmInstallationSheet$2.this$0) {
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                invoke((InstallationStep) p1);
                return Unit.INSTANCE;
            }

            public final void invoke(InstallationStep p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((HomeViewModel) this.receiver).onStepUpdate(p0);
            }
        }, new Function1(homeViewModel$onConfirmInstallationSheet$2.this$0) {
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                invoke(((Number) p1).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float p0) {
                ((HomeViewModel) this.receiver).onPreparationProgressUpdate(p0);
            }
        }, new Function0(homeViewModel$onConfirmInstallationSheet$2.this$0) {
            public final void invoke() {
                ((HomeViewModel) this.receiver).onClickCancelInstallationButton();
            }
        }, new Function1(homeViewModel$onConfirmInstallationSheet$2.this$0) {
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                invoke((DSUInstallationSource) p1);
                return Unit.INSTANCE;
            }

            public final void invoke(DSUInstallationSource p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((HomeViewModel) this.receiver).onPreparationFinished(p0);
            }
        }).invoke();
        return Unit.INSTANCE;
    }
}
