package com.Paradox;

import android.util.Log;

class cx extends Thread {
    final /* synthetic */ cvconn a;
    private final /* synthetic */ byte[] b;

    cx(cvconn cvconnVar, byte[] bArr) {
        this.a = cvconnVar;
        this.b = bArr;
    }

    public void run() {
        try {
            Log.d("Commands", ">>>>>>>>>>>>>>>>>>NEIP_cmdPassThru - Call _panel.processCommand(dec);");
            this.a.j.g(this.b);
            Log.d("Commands", "<<<<<<<<<<<<<<<<<<NEIP_cmdPassThru - Called _panel.processCommand(dec);");
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Error", "");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
