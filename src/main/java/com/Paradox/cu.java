package com.Paradox;

import java.nio.ByteBuffer;

public class cu {
    private ByteBuffer a;

    public cu(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    public int a() {
        return this.a.capacity();
    }

    public byte[] b() {
        this.a.position(0);
        return this.a.array();
    }

    public byte[] c() {
        byte[] bArr = new byte[16];
        this.a.position(1);
        this.a.get(bArr, 0, 16);
        return bArr;
    }

    public short d() {
        return (short) (this.a.get(0) & 255);
    }

    public short e() {
        return (short) (this.a.get(17) & 255);
    }

    public short f() {
        return (short) (this.a.get(18) & 255);
    }

    public short g() {
        return (short) (this.a.get(19) & 255);
    }

    public short h() {
        return (short) (this.a.get(20) & 255);
    }

    public int i() {
        return this.a.getInt(21);
    }

    public boolean j() {
        return (this.a.get(21) & 255) == 112;
    }

    public boolean k() {
        return (this.a.get(21) & 255) == 113;
    }
}
