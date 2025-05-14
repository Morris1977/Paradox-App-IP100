package com.Paradox;

import android.util.Log;

public class ce extends cd {
    public ce(String str, Site site) throws Throwable {
        super(str, site);
    }

    private void d(int i, byte[] bArr) {
        int length = bArr.length;
        if (1 > length) {
            Log.e("Error", "_process_PgmStatus -> invalid length " + length);
            return;
        }
        while (i < this.v.size() && i * 3 < length) {
            ((dz) this.v.get(i)).a((bArr[i * 3] & 1) != 0 ? 1 : 2);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void h(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x800b -> invalid length " + length);
            return;
        }
        super.h(bArr);
        d(0, com.Paradox.f.a(bArr, 49, bArr.length));
    }
}
