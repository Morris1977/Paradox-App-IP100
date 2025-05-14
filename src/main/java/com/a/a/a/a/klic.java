package com.a.a.a.a;

import android.util.Log;

class klic implements Runnable {
    final i a;
    private final int b;
    private final String c;
    private final String d;

    klic(i iVar, int i, String str, String str2) {
        this.a = iVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public void run() {
        Log.i("LicenseChecker", "Received response.");
        if (this.a.a.i.contains(this.a.b)) {
            this.a.b();
            //this.a.b.a(this.a.a.d, this.b, this.c, this.d);
            this.a.a.a(this.a.b);
            Log.i("LicenseChecker", "QUESTO LO FA");
        }
    }
}
