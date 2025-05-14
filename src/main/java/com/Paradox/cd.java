package com.Paradox;

import android.annotation.SuppressLint;
import android.util.Log;

public class cd extends cc implements ah {
    public cd(String str, Site site) throws Throwable {
        super(str, site);
        int c = super.c();
        while (true) {
            int i = c;
            if (i < c()) {
                ((dz) this.v.get(i)).h().a(false);
                c = i + 1;
            } else {
                return;
            }
        }
    }

    @SuppressLint("LongLogTag")
    private byte[] e(int i) {
        try {
            Log.d("prepare_EVO_AC#" + i, "");
            if (i < 0 || i >= N()) {
                Log.e("prepare_EVO_AC_: Index too large: " + i, "");
                return null;
            }
            byte[] bArr = new byte[72];
            bArr[0] = 71;
            bArr[1] = -84;
            bArr[2] = 71;
            byte b = (byte) ((i / 8) + 7);
            bArr[b] = (byte) (bArr[b] | (1 << (i % 8)));
            bArr[71] = a(com.Paradox.f.a(bArr, 1, 70), 70);
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int N() {
        return 8;
    }

    @SuppressLint("LongLogTag")
    public boolean a(dz dzVar) {
        if (dzVar == null) {
            Log.e("pulseUtilityKey - null pgm", "");
            return false;
        } else if (dzVar.h().a()) {
            Log.e("pulseUtilityKey - Wrong pgm", "");
            return false;
        } else {
            byte[] e = e(dzVar.g() - super.c());
            if (e == null) {
                return false;
            }
            j(e);
            return true;
        }
    }

    public int c() {
        return super.c() + N();
    }
}
