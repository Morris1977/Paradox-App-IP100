package com.Paradox;

import android.util.Log;
import java.util.Iterator;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

public class c extends Observable implements ad, ae {
    ggcambio a;
    gicambio b;
    public boolean c;
    boolean d;
    CopyOnWriteArrayList e;
    protected int f;
    cz g;
    private long h;
    private long i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private d n;
    private boolean o;
    private boolean p;
    boolean q;
    private boolean r = false;
    private boolean s;
    private boolean t;
    private int u;
    private CopyOnWriteArrayList v;
    private CopyOnWriteArrayList w;
    private int x;

    public c(cz czVar, int i2, int i3) {
        this.g = czVar;
        this.x = i2;
        a(i3);
        this.u = 0;
        a(true);
        this.q = false;
        this.t = false;
        this.l = false;
        this.n = com.Paradox.d.atUnknown;
        this.m = false;
        this.o = false;
        this.p = false;
        this.h = 0;
        this.i = 0;
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
    }

    public int A() {
        return r();
    }

    public void a() {
        clearChanged();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        this.g.Fcz.b[this.x].b(i2);
        this.g.Fcz.b[this.x].c(i3);
    }

    public void a(gy gyVar, boolean z) {
        gyVar.a(this);
        this.v.add(gyVar);
        setChanged();
        if (z) {
            a(z, "zonesAdd()");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(byte[] bArr, int i2) {
        this.g.Fcz.b[this.x].a(bArr);
        if (i2 == 65535) {
            i2++;
        }
        this.g.Fcz.b[this.x].a(i2);
    }

    public boolean a(int i2) {
        if (this.j == i2) {
            return false;
        }
        this.j = i2;
        setChanged();
        return true;
    }

    public boolean a(int i2, boolean z) {
        if (this.u == i2) {
            return false;
        }
        this.f = this.u;
        this.u = i2;
        if (z) {
            setChanged();
        }
        return true;
    }

    public boolean a(long j2) {
        if (this.h == j2) {
            return false;
        }
        this.h = j2;
        setChanged();
        return true;
    }

    public boolean a(d dVar) {
        if (this.n == dVar) {
            return false;
        }
        this.n = dVar;
        setChanged();
        return true;
    }

    public boolean a(gy gyVar) {
        return this.v.contains(gyVar);
    }

    public boolean a(String str) {
        if (!hasChanged() || this.g.Q()) {
            return false;
        }
        Log.d("Observed(area)", "notifyObserversIfChanged(" + str + ")...NOTIFY");
        notifyObservers();
        Log.d("Observed(area)", "notifyObserversIfChanged...NOTIFIED!!!");
        return true;
    }

    public boolean a(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        setChanged();
        return true;
    }

    public boolean a(boolean z, String str) {
        String str2 = String.valueOf(str) + " forced=" + z + " hasChanges=" + hasChanged();
        if (z) {
            setChanged();
            return a(str2);
        } else if (hasChanged()) {
            return a(str2);
        } else {
            return false;
        }
    }

    public boolean a(boolean z, boolean z2) {
        if (this.l == z) {
            return false;
        }
        this.l = z;
        if (z2) {
            setChanged();
        }
        return true;
    }

    public int b() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, int i3) {
        this.g.Fcz.b[this.x].d(i2);
        this.g.Fcz.b[this.x].c(i3);
    }

    public boolean b(long j2) {
        if (this.i == j2) {
            return false;
        }
        this.i = j2;
        setChanged();
        return true;
    }

    public boolean b(boolean z) {
        if (this.m == z) {
            return false;
        }
        this.m = z;
        setChanged();
        return true;
    }

    public boolean b(boolean z, boolean z2) {
        boolean z3 = false;
        if (this.q == z) {
            return false;
        }
        this.q = z;
        if (!z) {
            z3 = true;
        }
        this.r = z3;
        if (!z2) {
            return true;
        }
        setChanged();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, int i3) {
        this.g.Fcz.b[this.x].e(i2);
        this.g.Fcz.b[this.x].f(i3);
    }

    public boolean c() {
        return this.k;
    }

    public boolean c(boolean z) {
        if (this.o == z) {
            return false;
        }
        this.o = z;
        setChanged();
        return true;
    }

    public boolean c_() {
        return this.m;
    }

    public boolean d() {
        return this.l;
    }

    public boolean d(boolean z) {
        if (this.p == z) {
            return false;
        }
        this.p = z;
        setChanged();
        return true;
    }

    public void e(boolean z) {
        this.r = z;
    }

    public d f() {
        return this.n;
    }

    public boolean f(boolean z) {
        if (this.s == z) {
            return false;
        }
        this.s = z;
        setChanged();
        return true;
    }

    public boolean g() {
        return this.o;
    }

    public boolean g(boolean z) {
        if (this.t == z) {
            return false;
        }
        this.t = z;
        setChanged();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        int size = this.w.size();
        int size2 = this.e.size();
        this.w.clear();
        this.e.clear();
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c()) {
                if (gyVar.f()) {
                    this.w.add(gyVar);
                } else {
                    this.e.add(gyVar);
                }
            }
        }
        if (size != this.w.size() || size2 != this.e.size()) {
            Log.d("Observed(area)", "updateZones...fNotifyOnChanges=" + z);
            setChanged();
            a(z, "updateZones()");
            Log.d("Observed(area)", "...updateZones");
        }
    }

    public boolean h() {
        return this.p;
    }

    public boolean i() {
        return this.q;
    }

    public boolean j() {
        if (!this.r) {
            return this.r;
        }
        this.r = false;
        return true;
    }

    public boolean k() {
        return this.s;
    }

    public boolean l() {
        return this.t;
    }

    public CopyOnWriteArrayList m() {
        return this.v;
    }

    public CopyOnWriteArrayList n() {
        return this.w;
    }

    public CopyOnWriteArrayList o() {
        return this.e;
    }

    public int p() {
        Iterator it = this.v.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((gy) it.next()).k()) {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.x;
    }

    public int r() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.u = this.f;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f = this.u;
    }

    public String u() {
        return this.g.Fcz.b[this.x].a();
    }

    /* access modifiers changed from: package-private */
    public int v() {
        return this.g.Fcz.b[this.x].b();
    }

    /* access modifiers changed from: package-private */
    public int w() {
        return this.g.Fcz.b[this.x].c();
    }

    /* access modifiers changed from: package-private */
    public int x() {
        return this.g.Fcz.b[this.x].d();
    }

    /* access modifiers changed from: package-private */
    public int y() {
        return this.g.Fcz.b[this.x].e();
    }

    /* access modifiers changed from: package-private */
    public int z() {
        return this.g.Fcz.b[this.x].f();
    }
}
