package com.Paradox;

import android.util.Log;

class da implements Runnable {
    final /* synthetic */ cz a;
    private final /* synthetic */ byte[] b;
    private final /* synthetic */ int c;

    da(cz czVar, byte[] bArr, int i) {
        this.a = czVar;
        this.b = bArr;
        this.c = i;
    }

    public void run() {
        Log.d("POOL1 run (id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
        this.a.c(this.b, this.c);
        Log.d("..POOL1 run done", "");
    }
}
