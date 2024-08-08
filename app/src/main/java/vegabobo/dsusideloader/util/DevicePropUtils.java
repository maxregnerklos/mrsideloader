package vegabobo.dsusideloader.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* compiled from: DevicePropUtils.kt */
public abstract class DevicePropUtils {
    public static final int $stable = LiveLiterals$DevicePropUtilsKt.INSTANCE.m3422Int$classDevicePropUtils();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: DevicePropUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final float getGsidBinaryAllowedPerc() {
            LiveLiterals$DevicePropUtilsKt liveLiterals$DevicePropUtilsKt = LiveLiterals$DevicePropUtilsKt.INSTANCE;
            String minAllowed = getSystemProperty(liveLiterals$DevicePropUtilsKt.m3425String$arg0$callgetSystemProperty$valminAllowed$fungetGsidBinaryAllowedPerc$classCompanion$classDevicePropUtils());
            return minAllowed.length() > 0 ? Float.parseFloat(minAllowed) : liveLiterals$DevicePropUtilsKt.m3421Float$else$if$fungetGsidBinaryAllowedPerc$classCompanion$classDevicePropUtils();
        }

        public final boolean hasDynamicPartitions() {
            LiveLiterals$DevicePropUtilsKt liveLiterals$DevicePropUtilsKt = LiveLiterals$DevicePropUtilsKt.INSTANCE;
            return Intrinsics.areEqual((Object) getSystemProperty(liveLiterals$DevicePropUtilsKt.m3424String$arg0$callgetSystemProperty$arg0$callEQEQ$funhasDynamicPartitions$classCompanion$classDevicePropUtils()), (Object) liveLiterals$DevicePropUtilsKt.m3426String$arg1$callEQEQ$funhasDynamicPartitions$classCompanion$classDevicePropUtils());
        }

        public final String getSystemProperty(String key) {
            LiveLiterals$DevicePropUtilsKt liveLiterals$DevicePropUtilsKt = LiveLiterals$DevicePropUtilsKt.INSTANCE;
            return HiddenApiBypass.invoke(Class.forName(liveLiterals$DevicePropUtilsKt.m3423String$arg0$callforName$valsystemPropertiesClass$fungetSystemProperty$classCompanion$classDevicePropUtils()), (Object) null, liveLiterals$DevicePropUtilsKt.m3427String$arg2$callinvoke$valvalue$fungetSystemProperty$classCompanion$classDevicePropUtils(), key).toString();
        }
    }
}
