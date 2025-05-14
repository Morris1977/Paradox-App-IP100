package com.Paradox;

import android.util.Log;
import java.io.ByteArrayOutputStream;

public class cf extends cb {
    public cf(String str, Site site) throws Throwable {
        super(str, site);
        this.q = de.ptEVO48;
    }

    public static String M() {
        return "EVO48";
    }

    public int a() {
        return 4;
    }

    public int b() {
        return 48;
    }

    public int c() {
        return 5;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream w() throws Exception {
        Log.d("", "[prepare_EVO_Read_ZoneAssignment]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(496, 64, false)).writeTo(byteArrayOutputStream);
        a(a(560, 32, false)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream x() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(1, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream y() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(2, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
