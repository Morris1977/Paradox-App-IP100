package com.Paradox;

public class PdxAes128Ecb {
    static {
        System.loadLibrary("pdxaes128ecb");
    }

    public native byte[] Decrypt(byte[] bArr, byte[] bArr2, byte b, int i);

    public native byte[] Encrypt(byte[] bArr, byte[] bArr2, byte b, int i);

    public native byte[] RecalculateKey(byte[] bArr, int i, byte b);
}
