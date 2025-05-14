package com.Paradox;

import com.androidip.R;

import java.io.Serializable;

class n implements Serializable {
    private byte[] a;
    private int b;

    private n() {
        this.b = -1;
    }

    public n(String str) {
        this.b = -1;
        this.b = -1;
    }

    public String a() {
        return this.a == null ? MyApplication.acon().getResources().getString(R.string.AreaNum) : cj.a(this.a);
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(byte[] bArr) {
        this.a = bArr;
    }

    public int b() {
        return this.b;
    }
}
