package com.Paradox;

import java.io.ByteArrayOutputStream;

public class cc extends cf {
    public cc(String str, Site site) throws Throwable {
        super(str, site);
        this.q = de.ptEVO192;
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream D() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        super.D().writeTo(byteArrayOutputStream);
        a(a(7, 64, true)).writeTo(byteArrayOutputStream);
        a(a(8, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    public static String M() {
        return "EVO192";
    }

    public int a() {
        return 8;
    }

    public int a_() {
        return 256;
    }

    public int b() {
        return 192;
    }

    public int c() {
        return 5;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream w() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        super.w().writeTo(byteArrayOutputStream);
        a(a(592, 64, false)).writeTo(byteArrayOutputStream);
        a(a(656, 32, false)).writeTo(byteArrayOutputStream);
        a(a(24759, 64, false)).writeTo(byteArrayOutputStream);
        a(a(24823, 64, false)).writeTo(byteArrayOutputStream);
        a(a(24887, 64, false)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream x() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        super.x().writeTo(byteArrayOutputStream);
        a(a(9, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream y() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        super.y().writeTo(byteArrayOutputStream);
        a(a(10, 64, true)).writeTo(byteArrayOutputStream);
        a(a(11, 4, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
