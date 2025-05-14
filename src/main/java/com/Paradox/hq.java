package com.Paradox;

class hq {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int atPanicAlarm;
    public int atSilentAlarm;
    public int atAudibleAlarm;
    public int atFireAlarm;
    public int atUnknown;

    hq() {
    }

    public boolean a() {
        return this.a || this.b || this.c || this.d || this.e || this.f || this.g || this.h || this.i || this.j || this.k || this.l;
    }
}
