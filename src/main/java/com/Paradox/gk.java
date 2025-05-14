package com.Paradox;

import android.os.Handler;
import android.util.Log;
import java.util.Observable;
import java.util.Observer;

class gk implements Observer {
    final /* synthetic */ TabMainPanel a;
    private Handler b;

    public gk(TabMainPanel tabMainPanel, Handler handler) {
        this.a = tabMainPanel;
        this.b = handler;
    }

    public void update(Observable observable, Object obj) {
        Log.d("Observer", "panel changed");
        this.b.obtainMessage(cq.e).sendToTarget();
    }
}
