package com.Paradox;

import android.util.Log;
import java.nio.ByteBuffer;

class cr implements ac {
    final /* synthetic */ cq a;

    cr(cq cqVar) {
        this.a = cqVar;
    }

    public void a(int i) {
        Log.d("RX", "processDisconnect() CB called");
        this.a.k.lock();
        this.a.n.a = false;
        this.a.l.signalAll();
        this.a.k.unlock();
    }

    public void a(ByteBuffer byteBuffer) throws Throwable {
        this.a.a(byteBuffer);
    }
}
