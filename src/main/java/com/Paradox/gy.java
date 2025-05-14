package com.Paradox;

import android.util.Log;
import java.util.Observable;

public class gy extends Observable {
    private int a;
    private n b;
    private c c;
    private int d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private cz s;

    public gy(cz czVar, int i2, int i3) {
        //Log.d("MAURO", "SONO IN gy prima di Fcz");
        this.s = czVar;
        this.b = czVar.Fcz.c[i2];
        //Log.d("MAURO", "SONO IN gy dopo di Fcz");
        this.a = i2;
        this.d = i3;
    }

    public void a() {
        clearChanged();
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(byte[] bArr, int i2) {
        Log.d("ZONE SETLABEL:", "");
        this.b.a(bArr);
        if (i2 == 65535) {
            i2++;
        }
        this.b.a(i2);
        this.c.a(true, "setLabel()");
    }

    public boolean a(boolean z) {
        if (z == this.e) {
            return false;
        }
        setChanged();
        this.e = z;
        return true;
    }

    public c b() {
        return this.c;
    }

    public boolean b(boolean z) {
        if (z == this.f) {
            return false;
        }
        setChanged();
        this.f = z;
        return true;
    }

    public boolean c() {
        return this.e;
    }

    public boolean c(boolean z) {
        if (z == this.g) {
            return false;
        }
        setChanged();
        this.g = z;
        return true;
    }

    public boolean d() {
        return this.f;
    }

    public boolean d(boolean z) {
        if (z == this.h) {
            return false;
        }
        setChanged();
        this.h = z;
        return true;
    }

    public boolean e() {
        return this.g;
    }

    public boolean e(boolean z) {
        if (z == this.i) {
            return false;
        }
        setChanged();
        this.i = z;
        return true;
    }

    public boolean f() {
        return this.h;
    }

    public boolean f(boolean z) {
        if (z == this.j) {
            return false;
        }
        setChanged();
        this.j = z;
        return true;
    }

    public boolean g() {
        return this.i;
    }

    public boolean g(boolean z) {
        if (z == this.k) {
            return false;
        }
        setChanged();
        this.k = z;
        return true;
    }

    public boolean h() {
        return this.j;
    }

    public boolean h(boolean z) {
        if (z == this.l) {
            return false;
        }
        setChanged();
        this.l = z;
        return true;
    }

    public boolean i() {
        return this.k;
    }

    public boolean i(boolean z) {
        if (z == this.m) {
            return false;
        }
        setChanged();
        this.m = z;
        return true;
    }

    public boolean j() {
        return this.l;
    }

    public boolean j(boolean z) {
        if (z == this.n) {
            return false;
        }
        setChanged();
        this.n = z;
        return true;
    }

    public boolean k() {
        return this.o;
    }

    public boolean k(boolean z) {
        if (z == this.o) {
            return false;
        }
        setChanged();
        this.o = z;
        return true;
    }

    public boolean l() {
        return this.r;
    }

    public boolean l(boolean z) {
        if (z == this.p) {
            return false;
        }
        setChanged();
        this.p = z;
        return true;
    }

    public cz m() {
        return this.s;
    }

    public boolean m(boolean z) {
        if (z == this.q) {
            return false;
        }
        setChanged();
        this.q = z;
        return true;
    }

    public int n() {
        return this.d;
    }

    public boolean n(boolean z) {
        if (z == this.r) {
            return false;
        }
        setChanged();
        this.r = z;
        return true;
    }

    public int o() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public String p() {
        return this.b.a();
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.b.b();
    }
}
