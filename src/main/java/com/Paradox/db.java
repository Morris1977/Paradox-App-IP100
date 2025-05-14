package com.Paradox;

import android.util.Log;

class db implements Runnable {
    final /* synthetic */ cz a;
    private final /* synthetic */ byte[] b;

    db(cz czVar, byte[] bArr) {
        this.a = czVar;
        this.b = bArr;
    }

    public void run() {
        Log.e("POOL2 run (id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
        try {
            this.a.acz(this.b);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        Log.e("..POOL2 run done", "");
    }
}
