package com.Paradox;

import java.io.Serializable;

class m implements Serializable {
    private boolean a;
    private byte[] b;
    private int c;
    private boolean d;
    public int e=0;

    private m()
    {
        this.c = -1;
    }

    public m(String str, int i, boolean z) {
        this.c = -1;
        this.d = true;
        this.a = z;
        this.b = null;
        this.e = i;
    }

    public void a(int i)
    {
        this.c = i;
    }

    public void a(String str)
    {
        this.b = cj.a(str);
    }

    public void a(boolean z)
    {
        this.a = z;
    }

    public void a(byte[] bArr)
    {
        this.b = bArr;
    }

    public boolean a()
    {
        return this.a;
    }

    public void b(boolean z)
    {
        this.d = z;
    }

    public byte[] b()
    {
        return this.b;
    }

    public String c()
    {
        return this.b == null ? "" : cj.a(this.b);
    }

    public int d()
    {
        return this.c;
    }

    public boolean e()
    {
        return this.d;
    }

    public int f()

    {
        return this.e;
    }
}
