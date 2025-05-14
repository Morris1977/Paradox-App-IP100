package com.Paradox;

import android.os.Parcel;
import android.os.Parcelable;

class bf implements Parcelable.Creator {
    bf() {
    }

    /* renamed from: a */
    public LocateActivity.LocatedDevice createFromParcel(Parcel parcel) {
        return new LocateActivity.LocatedDevice(parcel);
    }

    /* renamed from: a */
    public LocateActivity.LocatedDevice[] newArray(int i) {
        return new LocateActivity.LocatedDevice[i];
    }
}
