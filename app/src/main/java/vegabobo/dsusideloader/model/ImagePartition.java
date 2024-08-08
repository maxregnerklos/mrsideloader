package vegabobo.dsusideloader.model;

import android.net.Uri;

/* compiled from: DSUInstallationSource.kt */
public abstract class ImagePartition {
    public abstract long getFileSize();

    public abstract String getPartitionName();

    public abstract Uri getUri();
}
