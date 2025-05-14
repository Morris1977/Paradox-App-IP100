package com.Paradox;

import com.androidip.R;

import java.io.Serializable;

class l implements Serializable {
    private byte[] a;
    private int b;
    private String c;

    private l() {
        this.b = -1;
    }

    public l(String str) {
        this.b = -1;
        this.b = -1;
        this.c = "";
    }

    public String a() {
        return this.a == null ? MyApplication.acon().getResources().getString(R.string.AreaNum) : cj.a(this.a);
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(byte[] bArr) {
        this.a = bArr;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}
