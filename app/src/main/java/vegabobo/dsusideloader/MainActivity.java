package vegabobo.dsusideloader;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.CompositionContext;
import androidx.core.view.WindowCompat;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ipc.RootService;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.lsposed.hiddenapibypass.HiddenApiBypass;
import rikka.shizuku.Shizuku;
import vegabobo.dsusideloader.model.Session;
import vegabobo.dsusideloader.service.PrivilegedProvider;
import vegabobo.dsusideloader.service.PrivilegedRootService;
import vegabobo.dsusideloader.service.PrivilegedService;
import vegabobo.dsusideloader.service.PrivilegedSystemService;
import vegabobo.dsusideloader.util.OperationMode;
import vegabobo.dsusideloader.util.OperationModeUtils;

/* compiled from: MainActivity.kt */
public final class MainActivity extends Hilt_MainActivity implements Shizuku.OnRequestPermissionResultListener {
    public static final int $stable;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public final Shizuku.OnBinderReceivedListener BINDER_RECEIVED_LISTENER = new MainActivity$$ExternalSyntheticLambda0(this);
    public final KFunction REQUEST_PERMISSION_RESULT_LISTENER = new MainActivity$REQUEST_PERMISSION_RESULT_LISTENER$1(this);
    public final int SHIZUKU_REQUEST_CODE = 1000;
    public Session session;
    public boolean shouldCheckShizuku;
    public final String tag = getClass().getSimpleName();
    public final Shizuku.UserServiceArgs userServiceArgs = new Shizuku.UserServiceArgs(new ComponentName("vegabobo.dsusideloader", PrivilegedService.class.getName())).daemon(false).processNameSuffix("service").debuggable(BuildConfig.DEBUG).version(8);

    /* compiled from: MainActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperationMode.values().length];
            try {
                iArr[OperationMode.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[OperationMode.SYSTEM_AND_ROOT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[OperationMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[OperationMode.SHIZUKU.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Session getSession() {
        Session session2 = this.session;
        if (session2 != null) {
            return session2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void setupSessionOperationMode() {
        OperationModeUtils.Companion companion = OperationModeUtils.Companion;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        OperationMode operationMode = companion.getOperationMode(application, this.shouldCheckShizuku);
        getSession().setOperationMode(operationMode);
        String str = this.tag;
        String r2 = LiveLiterals$MainActivityKt.INSTANCE.m2547String$0$str$arg1$calld$funsetupSessionOperationMode$classMainActivity();
        Log.d(str, r2 + operationMode);
    }

    public final void addShizukuListeners() {
        Shizuku.addBinderReceivedListenerSticky(this.BINDER_RECEIVED_LISTENER);
        Shizuku.addRequestPermissionResultListener(new MainActivity$$ExternalSyntheticLambda3(this.REQUEST_PERMISSION_RESULT_LISTENER));
    }

    public static final void addShizukuListeners$lambda$0(KFunction $tmp0, int p0, int p1) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        ((Function2) $tmp0).invoke(Integer.valueOf(p0), Integer.valueOf(p1));
    }

    public static final void removeShizukuListeners$lambda$1(KFunction $tmp0, int p0, int p1) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        ((Function2) $tmp0).invoke(Integer.valueOf(p0), Integer.valueOf(p1));
    }

    public final void removeShizukuListeners() {
        Shizuku.removeRequestPermissionResultListener(new MainActivity$$ExternalSyntheticLambda2(this.REQUEST_PERMISSION_RESULT_LISTENER));
        Shizuku.removeBinderReceivedListener(this.BINDER_RECEIVED_LISTENER);
    }

    public static final void BINDER_RECEIVED_LISTENER$lambda$2(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!OperationModeUtils.Companion.isShizukuPermissionGranted(this$0)) {
            this$0.askShizukuPermission();
        } else {
            this$0.bindShizuku();
        }
    }

    public final void askShizukuPermission() {
        if (Shizuku.isPreV11() || Shizuku.getVersion() < LiveLiterals$MainActivityKt.INSTANCE.m2544Int$arg1$callless$else$cond$if$funaskShizukuPermission$classMainActivity()) {
            requestPermissions(new String[]{"moe.shizuku.manager.permission.API_V23"}, this.SHIZUKU_REQUEST_CODE);
        } else {
            Shizuku.requestPermission(this.SHIZUKU_REQUEST_CODE);
        }
    }

    public void onRequestPermissionResult(int requestCode, int grantResult) {
        if (grantResult == 0 && requestCode == this.SHIZUKU_REQUEST_CODE) {
            bindShizuku();
        }
        Shizuku.removeRequestPermissionResultListener(new MainActivity$$ExternalSyntheticLambda4(this.REQUEST_PERMISSION_RESULT_LISTENER));
    }

    public static final void onRequestPermissionResult$lambda$3(KFunction $tmp0, int p0, int p1) {
        Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
        ((Function2) $tmp0).invoke(Integer.valueOf(p0), Integer.valueOf(p1));
    }

    public final void bindShizuku() {
        Shizuku.bindUserService(this.userServiceArgs, PrivilegedProvider.INSTANCE.getConnection());
        this.shouldCheckShizuku = LiveLiterals$MainActivityKt.INSTANCE.m2540Boolean$arg0$call$setshouldCheckShizuku$$funbindShizuku$classMainActivity();
        setupSessionOperationMode();
    }

    /* compiled from: MainActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        LiveLiterals$MainActivityKt liveLiterals$MainActivityKt = LiveLiterals$MainActivityKt.INSTANCE;
        $stable = liveLiterals$MainActivityKt.m2545Int$classMainActivity();
        Shell.setDefaultBuilder(Shell.Builder.create().setFlags(8).setTimeout(liveLiterals$MainActivityKt.m2546Long$arg0$callsetTimeout$arg0$callsetDefaultBuilder$classCompanion$classMainActivity()));
    }

    public final void setupService() {
        if (getSession().isRoot()) {
            RootService.bind(new Intent(this, PrivilegedRootService.class), PrivilegedProvider.INSTANCE.getConnection());
        } else if (getSession().getOperationMode() == OperationMode.SYSTEM) {
            bindService(new Intent(this, PrivilegedSystemService.class), PrivilegedProvider.INSTANCE.getConnection(), 1);
        } else {
            addShizukuListeners();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Shell.getShell(new MainActivity$$ExternalSyntheticLambda1());
        WindowCompat.setDecorFitsSystemWindows(getWindow(), LiveLiterals$MainActivityKt.INSTANCE.m2541Boolean$arg1$callsetDecorFitsSystemWindows$funonCreate$classMainActivity());
        ComponentActivityKt.setContent$default(this, (CompositionContext) null, ComposableSingletons$MainActivityKt.INSTANCE.m2534getLambda2$app_miniDebug(), 1, (Object) null);
        if (savedInstanceState == null) {
            setupSessionOperationMode();
            setupService();
        }
    }

    public static final void onCreate$lambda$4(Shell it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    public void attachBaseContext(Context newBase) {
        HiddenApiBypass.addHiddenApiExemptions(LiveLiterals$MainActivityKt.INSTANCE.m2548String$0$vararg$arg0$calladdHiddenApiExemptions$funattachBaseContext$classMainActivity());
        super.attachBaseContext(newBase);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            int i = WhenMappings.$EnumSwitchMapping$0[getSession().getOperationMode().ordinal()];
            boolean z = true;
            if (i == 1) {
                z = LiveLiterals$MainActivityKt.INSTANCE.m2543Boolean$branch$when$cond$when$funonDestroy$classMainActivity();
            } else if (i != 2) {
                z = false;
            }
            if (z) {
                RootService.unbind(PrivilegedProvider.INSTANCE.getConnection());
            } else if (i == 3) {
                getApplicationContext().unbindService(PrivilegedProvider.INSTANCE.getConnection());
            } else if (i == 4) {
                removeShizukuListeners();
                Shizuku.unbindUserService(this.userServiceArgs, PrivilegedProvider.INSTANCE.getConnection(), LiveLiterals$MainActivityKt.INSTANCE.m2542Boolean$arg2$callunbindUserService$branch2$when$funonDestroy$classMainActivity());
            }
        }
    }
}
