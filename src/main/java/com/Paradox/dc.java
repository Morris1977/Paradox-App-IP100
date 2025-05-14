package com.Paradox;

import android.util.Log;

class dc implements Runnable {
    final /* synthetic */ cz a;
    private final /* synthetic */ byte[] b;

    dc(cz czVar, byte[] bArr) {
        this.a = czVar;
        this.b = bArr;
    }

    public void run() {
        Log.e("POOL3 run (id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
        this.a.b(this.b);
        Log.e("..POOL3 run done", "");
    }
}
