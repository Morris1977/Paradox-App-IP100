package com.Paradox;

import android.os.Parcel;
import android.os.Parcelable;

class Site implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ea();
    private long a;
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String hsite;
    private int i;
    private boolean j;
    private String k;
    private int l;
    private String m;
    private int n;

    public Site() {
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.hsite = "";
        this.j = false;
        this.i = 0;
        this.k = "";
        this.l = cj.c();
        this.m = "";
        this.n = 15;
    }

    public Site(Parcel parcel) {
        this();
        a(parcel);
    }

    public Site(eb ebVar) {
        this();
        if (ebVar == eb.ADD_BUTTON) {
            this.i = -2;
        }
    }

    private void a(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.hsite = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
    }

    public long a() {
        return this.a;
    }

    public void a(long j2) {
        this.a = j2;
    }

    public void a(String str) {
        if (str == null) {
            this.b = "";
        } else {
            this.b = str.trim();
        }
    }

    public void a(boolean z) {
        this.j = z;
    }

    public String b() {
        return this.b;
    }

    public void b(long j2) {
        this.d = (int) j2;
    }

    public void b(String str) {
        if (str == null) {
            this.c = "";
        } else {
            this.c = str.trim();
        }
    }

    public void b(boolean z) {
        if (z) {
            this.i = -2;
        } else if (this.i <= 0) {
            this.i = 0;
        }
    }

    public String c() {
        return this.c;
    }

    public void c(long j2) {
        this.i = (int) j2;
    }

    public void c(String str) {
        this.e = str.trim();
    }

    public int d() {
        return this.d;
    }

    public void d(long j2) {
        this.l = (int) j2;
    }

    public void d(String str) {
        if (str == null) {
            this.f = "";
        } else {
            this.f = str.trim();
        }
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    public void e(long j2) {
        this.n = (int) j2;
    }

    public void e(String str) {
        if (str == null) {
            this.g = "";
        } else {
            this.g = str.trim();
        }
    }

    public String f() {
        return this.f;
    }

    public void fsite(String str) {
        if (str == null) {
            this.hsite = "";
        } else {
            this.hsite = str.trim();
        }
    }

    public String g() {
        return this.g;
    }

    public void g(String str) {
        this.k = str;
    }

    public String hsit()
    {
        return this.hsite;
    }

    public void hsi(String str) {
        if (str == null) {
            str = "";
        }
        this.m = str;
    }

    public int i() {
        if (aavar.adia || this.i != 2) {
            return this.i;
        }
        return 1;
    }

    public boolean j() {
        return this.j;
    }

    public String k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public String m() {
        return this.m;
    }

    public int n() {
        return this.n;
    }

    public eb o() {
        return this.i == -2 ? eb.ADD_BUTTON : this.f.length() <= 0 ? eb.ENTRY_NEW : p() ? eb.ENTRY_READY : q() ? eb.ENTRY_READY : r() ? eb.ENTRY_READY : this.i == -2 ? eb.ADD_BUTTON : eb.ENTRY_NEW;
    }

    public boolean p() {
        return this.i == 1 && this.b != null && this.b.length() > 0;
    }

    public boolean q() {
        return this.i == 0 && this.c.length() > 0 && this.d > 0;
    }

    public boolean r() {
        return this.i == 2 && this.m.length() > 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.hsite);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
    }
}
