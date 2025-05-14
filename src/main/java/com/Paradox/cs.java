package com.Paradox;

public class cs {
    private int a;
    private int b;
    private byte c;
    private byte[] d;

    public cs(int i) {
        this.a = i;
        this.b = 0;
        this.d = new byte[0];
        this.c = 0;
    }

    public cs(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = bArr;
        this.c = 0;
    }

    public cs(int i, byte[] bArr) {
        this.a = i;
        this.b = 0;
        this.d = bArr;
        this.c = 0;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte[] d() {
        return this.d;
    }
}
