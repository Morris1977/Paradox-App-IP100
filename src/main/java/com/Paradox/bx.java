package com.Paradox;

class bx {
    final /* synthetic */ bs a;
    private boolean b = false;
    private m c;
    private dz d;
    private boolean e;
    private String f;
    private boolean g = false;

    public bx(bs bsVar, dz dzVar) {
        this.a = bsVar;
        this.d = dzVar;
        this.c = dzVar.h();
        //this.e = this.c.e();
        //this.f = this.c.c();
    }

    /* access modifiers changed from: package-private */
    public m a()
    {
        return this.c;
    }

    public void a(String str) {
        boolean z = true;
        try {
            if (this.f.equals(str)) {
                z = false;
            }
            this.b = z;
            if (this.b) {
                this.b = true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public dz b() {
        return this.d;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void c() {
        this.c.b(this.e);
        this.c.a(this.f);
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.e;
    }

    public int g() {
        return this.c.f();
    }

    public String h() {
        return this.f;
    }
}
