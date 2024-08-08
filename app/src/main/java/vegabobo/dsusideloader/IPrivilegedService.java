package vegabobo.dsusideloader;

import android.content.Intent;
import android.gsi.GsiProgress;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.storage.VolumeInfo;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;

public interface IPrivilegedService extends IInterface {
    boolean abort();

    boolean closePartition();

    int createPartition(String str, long j, boolean z);

    void destroy();

    void exit();

    boolean finishInstallation();

    void forceStopPackage(String str);

    GsiProgress getInstallationProgress();

    int getUid();

    List getVolumes();

    void grantPermission(String str);

    boolean isEnabled();

    boolean isInUse();

    boolean isInstalled();

    void mount(String str);

    boolean remove();

    boolean setAshmem(ParcelFileDescriptor parcelFileDescriptor, long j);

    void setDynProp();

    boolean setEnable(boolean z, boolean z2);

    void startActivity(Intent intent);

    boolean startInstallation(String str);

    boolean submitFromAshmem(long j);

    long suggestScratchSize();

    void unmount(String str);

    public static abstract class Stub extends Binder implements IPrivilegedService {
        public Stub() {
            attachInterface(this, "vegabobo.dsusideloader.IPrivilegedService");
        }

        public static IPrivilegedService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface("vegabobo.dsusideloader.IPrivilegedService");
            if (iin == null || !(iin instanceof IPrivilegedService)) {
                return new Proxy(obj);
            }
            return (IPrivilegedService) iin;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
            Intent _arg0;
            ParcelFileDescriptor _arg02;
            boolean _arg2 = false;
            switch (code) {
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    exit();
                    reply.writeNoException();
                    return true;
                case 101:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    setDynProp();
                    reply.writeNoException();
                    return true;
                case 1001:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    int _result = getUid();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                case 1002:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    if (data.readInt() != 0) {
                        _arg0 = (Intent) Intent.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    startActivity(_arg0);
                    reply.writeNoException();
                    return true;
                case 1004:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    forceStopPackage(data.readString());
                    reply.writeNoException();
                    return true;
                case 2002:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    grantPermission(data.readString());
                    reply.writeNoException();
                    return true;
                case 3002:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    List<VolumeInfo> _result2 = getVolumes();
                    reply.writeNoException();
                    reply.writeTypedList(_result2);
                    return true;
                case 3003:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    unmount(data.readString());
                    reply.writeNoException();
                    return true;
                case 3004:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    mount(data.readString());
                    reply.writeNoException();
                    return true;
                case 4002:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    GsiProgress _result3 = getInstallationProgress();
                    reply.writeNoException();
                    if (_result3 != null) {
                        reply.writeInt(1);
                        _result3.writeToParcel(reply, 1);
                    } else {
                        reply.writeInt(0);
                    }
                    return true;
                case 4003:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result4 = abort();
                    reply.writeNoException();
                    reply.writeInt(_result4);
                    return true;
                case 4004:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result5 = isInUse();
                    reply.writeNoException();
                    reply.writeInt(_result5);
                    return true;
                case 4005:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result6 = isInstalled();
                    reply.writeNoException();
                    reply.writeInt(_result6);
                    return true;
                case 4006:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result7 = isEnabled();
                    reply.writeNoException();
                    reply.writeInt(_result7);
                    return true;
                case 4007:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result8 = remove();
                    reply.writeNoException();
                    reply.writeInt(_result8);
                    return true;
                case 4008:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _arg03 = data.readInt() != 0;
                    if (data.readInt() != 0) {
                        _arg2 = true;
                    }
                    boolean _result9 = setEnable(_arg03, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result9);
                    return true;
                case 4009:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result10 = finishInstallation();
                    reply.writeNoException();
                    reply.writeInt(_result10);
                    return true;
                case 4010:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result11 = startInstallation(data.readString());
                    reply.writeNoException();
                    reply.writeInt(_result11);
                    return true;
                case 4011:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    String _arg04 = data.readString();
                    long _arg1 = data.readLong();
                    if (data.readInt() != 0) {
                        _arg2 = true;
                    }
                    int _result12 = createPartition(_arg04, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result12);
                    return true;
                case 4012:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result13 = closePartition();
                    reply.writeNoException();
                    reply.writeInt(_result13);
                    return true;
                case 4013:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    if (data.readInt() != 0) {
                        _arg02 = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(data);
                    } else {
                        _arg02 = null;
                    }
                    boolean _result14 = setAshmem(_arg02, data.readLong());
                    reply.writeNoException();
                    reply.writeInt(_result14);
                    return true;
                case 4014:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result15 = submitFromAshmem(data.readLong());
                    reply.writeNoException();
                    reply.writeInt(_result15);
                    return true;
                case 4015:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    long _result16 = suggestScratchSize();
                    reply.writeNoException();
                    reply.writeLong(_result16);
                    return true;
                case 16777115:
                    data.enforceInterface("vegabobo.dsusideloader.IPrivilegedService");
                    destroy();
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString("vegabobo.dsusideloader.IPrivilegedService");
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IPrivilegedService {
            public static IPrivilegedService sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void setDynProp() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (this.mRemote.transact(101, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setDynProp();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public int getUid() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (!this.mRemote.transact(1001, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUid();
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void startActivity(Intent intent) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (intent != null) {
                        _data.writeInt(1);
                        intent.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    if (this.mRemote.transact(1002, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().startActivity(intent);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void forceStopPackage(String packageName) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(packageName);
                    if (this.mRemote.transact(1004, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().forceStopPackage(packageName);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void grantPermission(String permission) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(permission);
                    if (this.mRemote.transact(2002, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().grantPermission(permission);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public List getVolumes() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (!this.mRemote.transact(3002, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVolumes();
                    }
                    _reply.readException();
                    List<VolumeInfo> _result = _reply.createTypedArrayList(VolumeInfo.CREATOR);
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void unmount(String volId) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(volId);
                    if (this.mRemote.transact(3003, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unmount(volId);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void mount(String volId) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(volId);
                    if (this.mRemote.transact(3004, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().mount(volId);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public GsiProgress getInstallationProgress() {
                GsiProgress _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (!this.mRemote.transact(4002, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstallationProgress();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = (GsiProgress) GsiProgress.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean abort() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4003, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().abort();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean isInUse() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4004, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isInUse();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean isInstalled() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4005, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isInstalled();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean isEnabled() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4006, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isEnabled();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean remove() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4007, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().remove();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean setEnable(boolean enable, boolean oneShot) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result = true;
                    _data.writeInt(enable ? 1 : 0);
                    _data.writeInt(oneShot ? 1 : 0);
                    if (!this.mRemote.transact(4008, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setEnable(enable, oneShot);
                    }
                    _reply.readException();
                    if (_reply.readInt() == 0) {
                        _result = false;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean finishInstallation() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4009, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().finishInstallation();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean startInstallation(String dsuSlot) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(dsuSlot);
                    boolean z = false;
                    if (!this.mRemote.transact(4010, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startInstallation(dsuSlot);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public int createPartition(String name, long size, boolean readOnly) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeString(name);
                    _data.writeLong(size);
                    _data.writeInt(readOnly ? 1 : 0);
                    if (!this.mRemote.transact(4011, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createPartition(name, size, readOnly);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean closePartition() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean z = false;
                    if (!this.mRemote.transact(4012, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().closePartition();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean setAshmem(ParcelFileDescriptor fd, long size) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    boolean _result = true;
                    if (fd != null) {
                        _data.writeInt(1);
                        fd.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeLong(size);
                    if (!this.mRemote.transact(4013, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAshmem(fd, size);
                    }
                    _reply.readException();
                    if (_reply.readInt() == 0) {
                        _result = false;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public boolean submitFromAshmem(long bytes) {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    _data.writeLong(bytes);
                    boolean z = false;
                    if (!this.mRemote.transact(4014, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().submitFromAshmem(bytes);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        z = true;
                    }
                    boolean _status = z;
                    _reply.recycle();
                    _data.recycle();
                    return _status;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public long suggestScratchSize() {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("vegabobo.dsusideloader.IPrivilegedService");
                    if (!this.mRemote.transact(4015, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().suggestScratchSize();
                    }
                    _reply.readException();
                    long _result = _reply.readLong();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public static IPrivilegedService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
