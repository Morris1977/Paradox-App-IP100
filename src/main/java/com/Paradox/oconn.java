package com.Paradox;

import android.util.Log;

public class oconn {
    private static /* synthetic */ int[] f;
    private PdxAes128Ecb a = new PdxAes128Ecb();
    private pcod b = pcod.CRYPTOR_NONE;
    private int c = 16;
    public byte d = -18;
    private byte[] eoconn = new byte[0];

    private void aoconn(byte[] bArr, int i)
    {
        //Log.d("occonn", "il byte prima RECALCULATE vale : "+ bArr);
        //Log.d("occonn", "i invece vale : "+ i);
        this.eoconn = this.a.RecalculateKey(bArr, i, this.d);
        //Log.d("occonn", "il byte dopo RECALCULATE vale: "+ this.eoconn);
    }

    static  int[] boconn() {
        int[] iArr = f;
        if (iArr == null) {
            iArr = new int[pcod.values().length];
            try {
                iArr[pcod.CRYPTOR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[pcod.CRYPTOR_OLD_MODULE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[pcod.CRYPTOR_PDX_256_ECB.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            f = iArr;
        }
        return iArr;
    }

    public pcod a() {
        return this.b;
    }

    public void adioconn(pcod pcodVar) throws Exception {
        if (this.b != pcodVar) {
            switch (boconn()[pcodVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    this.c = 16;
                    //Log.d("oconn", "Sono dentro 1 il byte vale : "+ this.eoconn);
                    this.b = pcodVar;
                    aoco(this.eoconn);
                    return;
                default:
                    throw new Exception("unknown cryptor type");
            }
        }
    }

    public void aoco(byte[] bArr) {
        synchronized (this) {
            switch (boconn()[this.b.ordinal()]) {
                case 2:
                case 3:
                    aoconn(bArr, 32);
                    break;
            }
        }
    }

    public byte[] boco(byte[] bArr) {
        switch (boconn()[this.b.ordinal()]) {
            case 2:
            case 3:
                return this.a.Encrypt(bArr, this.eoconn, this.d, this.c);
            default:
                return bArr;
        }
    }

    public byte[] c(byte[] bArr) {
        switch (boconn()[this.b.ordinal()]) {
            case 2:
            case 3:
                return this.a.Decrypt(bArr, this.eoconn, this.d, this.c);
            default:
                return bArr;
        }
    }
}
