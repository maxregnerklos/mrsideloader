package vegabobo.dsusideloader.util;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.topjohnwu.superuser.Shell;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rikka.shizuku.Shizuku;

/* compiled from: OperationModeUtils.kt */
public abstract class OperationModeUtils {
    public static final int $stable = LiveLiterals$OperationModeUtilsKt.INSTANCE.m3450Int$classOperationModeUtils();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: OperationModeUtils.kt */
    public static final class Companion {

        /* compiled from: OperationModeUtils.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OperationMode.values().length];
                try {
                    iArr[OperationMode.SYSTEM_AND_ROOT.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[OperationMode.SYSTEM.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[OperationMode.ROOT.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[OperationMode.ADB.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[OperationMode.SHIZUKU.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final OperationMode getOperationMode(Context context, boolean checkShizuku) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isDsuPermissionGranted(context)) {
                if (Shell.getShell().isRoot()) {
                    return OperationMode.SYSTEM_AND_ROOT;
                }
                return OperationMode.SYSTEM;
            } else if (Shell.getShell().isRoot()) {
                return OperationMode.ROOT;
            } else {
                if (!checkShizuku || !isShizukuPermissionGranted(context)) {
                    return OperationMode.ADB;
                }
                return OperationMode.SHIZUKU;
            }
        }

        public final String getOperationModeAsString(OperationMode operationMode) {
            Intrinsics.checkNotNullParameter(operationMode, "operationMode");
            switch (WhenMappings.$EnumSwitchMapping$0[operationMode.ordinal()]) {
                case 1:
                    return LiveLiterals$OperationModeUtilsKt.INSTANCE.m3451String$branch$when$fungetOperationModeAsString$classCompanion$classOperationModeUtils();
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                    return LiveLiterals$OperationModeUtilsKt.INSTANCE.m3452String$branch1$when$fungetOperationModeAsString$classCompanion$classOperationModeUtils();
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER:
                    return LiveLiterals$OperationModeUtilsKt.INSTANCE.m3453String$branch2$when$fungetOperationModeAsString$classCompanion$classOperationModeUtils();
                case PreferencesProto$Value.LONG_FIELD_NUMBER:
                    return LiveLiterals$OperationModeUtilsKt.INSTANCE.m3454String$branch3$when$fungetOperationModeAsString$classCompanion$classOperationModeUtils();
                case PreferencesProto$Value.STRING_FIELD_NUMBER:
                    return LiveLiterals$OperationModeUtilsKt.INSTANCE.m3455String$branch4$when$fungetOperationModeAsString$classCompanion$classOperationModeUtils();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final boolean isPermissionGranted(Context context, String permission) {
            return context.checkCallingOrSelfPermission(permission) == 0;
        }

        public final boolean isDsuPermissionGranted(Context context) {
            return isPermissionGranted(context, LiveLiterals$OperationModeUtilsKt.INSTANCE.m3456String$valdynPermission$funisDsuPermissionGranted$classCompanion$classOperationModeUtils());
        }

        public final boolean isReadLogsPermissionGranted(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return isPermissionGranted(context, LiveLiterals$OperationModeUtilsKt.INSTANCE.m3457String$valreadLogsPermission$funisReadLogsPermissionGranted$classCompanion$classOperationModeUtils());
        }

        public final boolean isShizukuPermissionGranted(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (Shizuku.isPreV11() || Shizuku.getVersion() < LiveLiterals$OperationModeUtilsKt.INSTANCE.m3449Int$arg1$callless$else$cond$if$funisShizukuPermissionGranted$classCompanion$classOperationModeUtils()) {
                return isPermissionGranted(context, "moe.shizuku.manager.permission.API_V23");
            }
            return Shizuku.checkSelfPermission() == 0;
        }
    }
}
