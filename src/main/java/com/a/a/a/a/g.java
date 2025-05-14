package com.a.a.a.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class g implements e {
    private IBinder a;

    g(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(long j, String str, b bVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            obtain.writeLong(j);
            obtain.writeString(str);
            if (bVar != null) {
                iBinder = bVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.a.transact(1, obtain, (Parcel) null, 1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
