package vegabobo.dsusideloader.util;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: StorageUtils.kt */
public abstract class StorageUtils {
    public static final int $stable = LiveLiterals$StorageUtilsKt.INSTANCE.m3467Int$classStorageUtils();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* compiled from: StorageUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Pair getAllocInfo(float allowedPercentage) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            long blockSize = statFs.getBlockSizeLong();
            long availableSize = statFs.getAvailableBlocksLong() * blockSize;
            boolean hasAvailableStorage = ((float) availableSize) / ((float) (statFs.getBlockCountLong() * blockSize)) > allowedPercentage;
            LiveLiterals$StorageUtilsKt liveLiterals$StorageUtilsKt = LiveLiterals$StorageUtilsKt.INSTANCE;
            int availSizeInGb = (int) (((availableSize / liveLiterals$StorageUtilsKt.m3468Long$arg0$calldiv$$this$calldiv$$this$calldiv$$this$calltoInt$valavailSizeInGb$fungetAllocInfo$classCompanion$classStorageUtils()) / liveLiterals$StorageUtilsKt.m3469Long$arg0$calldiv$$this$calldiv$$this$calltoInt$valavailSizeInGb$fungetAllocInfo$classCompanion$classStorageUtils()) / liveLiterals$StorageUtilsKt.m3470Long$arg0$calldiv$$this$calltoInt$valavailSizeInGb$fungetAllocInfo$classCompanion$classStorageUtils());
            if (availSizeInGb >= liveLiterals$StorageUtilsKt.m3466Int$arg1$callgreaterOrEqual$cond$if$fungetAllocInfo$classCompanion$classStorageUtils()) {
                availSizeInGb -= liveLiterals$StorageUtilsKt.m3465Int$arg0$callminus$setavailSizeInGb$branch$if$fungetAllocInfo$classCompanion$classStorageUtils();
            }
            return new Pair(Boolean.valueOf(hasAvailableStorage), Integer.valueOf(availSizeInGb / liveLiterals$StorageUtilsKt.m3464Int$arg0$calldiv$valmaximumAllowedForAllocation$fungetAllocInfo$classCompanion$classStorageUtils()));
        }
    }
}
