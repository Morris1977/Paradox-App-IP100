package com.a.a.a.a;

import android.util.Log;

class i extends c {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ hlic a;
    /* access modifiers changed from: private */
    public final mlic b;
    private Runnable c = new j(this);

    public i(hlic hlicVar, mlic mlicVar) {
        this.a = hlicVar;
        this.b = mlicVar;
        a();
    }

    private void a() {
        Log.i("LicenseChecker", "Start monitoring timeout.");
        this.a.g.postDelayed(this.c, 10000);
    }

    /* access modifiers changed from: private */
    public void b() {
        Log.i("LicenseChecker", "Clearing timeout.");
        this.a.g.removeCallbacks(this.c);
    }

    public void a(int i, String str, String str2) {
        this.a.g.post(new klic(this, i, str, str2));
    }

    @Override
    public void printStackTrace() {

    }
}
