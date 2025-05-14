package com.Paradox;

import android.util.Log;

class cw extends Thread {
    final /* synthetic */ cvconn a;

    cw(cvconn cvconnVar) {
        this.a = cvconnVar;
    }

    public void run() {
        try {
            Log.d("PC2P Thread", "startMonitoring>>>>>>>>>>>>>>>>>>>>>>>>"+this.a.j.J());
            this.a.j.J();
            Log.d("PC2P Thread", "<<<<<<<<<<<<<<<<<<<<<startMonitoring");
        } catch (Exception e) {
            Log.e("Error", "startMonitoring() FAILED");
            e.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        Log.d("PC2P Thread", "thread exiting");
    }
}
