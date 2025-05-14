package com.Paradox;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ct {
    private ByteBuffer a;

    public ct(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.a.position(0);
    }

    public ct(byte[] bArr, boolean z) {
        if (z) {
            byte[] bArr2 = new byte[(bArr.length + 16)];
            Arrays.fill(bArr2, 0, 16, (byte) -18);
            this.a = ByteBuffer.wrap(bArr2);
            this.a.position(16);
            this.a.put(bArr);
        } else {
            this.a = ByteBuffer.wrap(bArr);
        }
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.a.position(0);
    }

    public int adi()
    {
        return this.a.limit();
    }

    public void a(int i)
    {
        this.a.put(0, (byte) (i & 255));
    }

    public void b(int i)
    {
        this.a.putShort(1, (short) (65535 & i));
    }

    public byte[] b() {
        this.a.position(0);
        return this.a.array();
    }

    public void c(int i) {
        this.a.put(3, (byte) (i & 255));
    }

    public byte[] c() {
        int a2 = adi() - 16;
        byte[] bArr = new byte[a2];
        this.a.position(16);
        this.a.get(bArr, 0, a2);
        return bArr;
    }

    public short d()
    {
        return (short) (this.a.get(0) & 255);
    }

    public void d(int i)
    {
        this.a.put(4, (byte) (i & 255));
    }

    public short e() {
        return this.a.getShort(1);
    }

    public void e(int i) {
        this.a.put(5, (byte) (i & 255));
    }

    public short f() {
        return (short) (this.a.get(3) & 255);
    }

    public void f(int i) {
        this.a.put(6, (byte) (i & 255));
    }

    public short g() {
        return (short) (this.a.get(4) & 255);
    }

    public void g(int i) {
        this.a.put(7, (byte) (i & 255));
    }

    public short h() {
        return (short) (this.a.get(5) & 255);
    }

    public void h(int i) {
        this.a.put(8, (byte) (i & 255));
    }

    public short i() {
        return (short) (this.a.get(6) & 255);
    }

    public void i(int i) {
        this.a.put(9, (byte) (i & 255));
    }
}
