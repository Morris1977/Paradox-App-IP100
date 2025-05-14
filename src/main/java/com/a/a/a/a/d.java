package com.a.a.a.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class d implements b {
    private IBinder a;

    d(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(int i, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(1, obtain, (Parcel) null, 1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public void printStackTrace() {

    }

    public IBinder asBinder() {
        return this.a;
    }
}
