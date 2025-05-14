package com.Paradox;

import com.androidip.R;

import java.io.Serializable;

class k implements Serializable {
    private byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private k() {
        this.b = -1;
    }

    public k(String str) {
        this.b = -1;
        this.a = null;
        this.b = -1;
        this.c = 0;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = 0;
        this.h = -1;
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

    public void b(int i) {
        this.c = i;
    }

    public int c() {
        return this.c;
    }

    public void c(int i) {
        this.d = i;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.g = i;
    }

    public int f() {
        return this.g;
    }

    public void f(int i) {
        this.h = i;
    }
}
