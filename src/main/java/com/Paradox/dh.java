package com.Paradox;

public class dh extends dg {
    public dh(String str, Site site) throws Throwable {
        super(str, site);
    }

    /* access modifiers changed from: package-private */
    public byte[] t() {
        byte[] bArr = new byte[15];
        bArr[0] = 32;
        bArr[1] = Byte.MIN_VALUE;
        bArr[3] = 32;
        bArr[4] = Byte.MIN_VALUE;
        bArr[5] = 1;
        bArr[6] = 32;
        bArr[7] = Byte.MIN_VALUE;
        bArr[8] = 2;
        bArr[9] = 32;
        bArr[10] = Byte.MIN_VALUE;
        bArr[11] = 7;
        bArr[12] = 32;
        bArr[13] = Byte.MIN_VALUE;
        bArr[14] = 8;
        return bArr;
    }
}
