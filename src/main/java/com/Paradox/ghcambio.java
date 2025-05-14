package com.Paradox;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;

import java.util.Locale;

class ghcambio extends CountDownTimer {
    final /* synthetic */ ggcambio a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ghcambio(ggcambio ggcambioVar, long j, long j2) {
        super(j, j2);
        this.a = ggcambioVar;
    }

    public void onFinish() {
        synchronized (this.a.d) {
            Log.d("ExitDC.onFinish da GH", "");
            this.a.d.setVisibility(View.INVISIBLE);
            this.a.finito();
            //notify();
        }
    }

    public void onTick(long j) {
        synchronized (this.a.d) {
            int firstVisiblePosition = this.a.a.t.getFirstVisiblePosition();
            int lastVisiblePosition = this.a.a.t.getLastVisiblePosition();
            int q = this.a.b.q();
            if (q < firstVisiblePosition || q > lastVisiblePosition) {
                this.a.d.setVisibility(View.INVISIBLE);
            } else {
                this.a.d.setVisibility(View.VISIBLE);
                this.a.d.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf((j / 1000) / 60), Long.valueOf((j / 1000) % 60)}));
            }
        }
        if (!this.a.b.k()) {
            this.a.a();
        }
    }
}
