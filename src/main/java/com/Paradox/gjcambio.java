package com.Paradox;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.androidip.R;

import java.util.Locale;

class gjcambio extends CountDownTimer {
    final /* synthetic */ gicambio a;
    public  TabMainPanel atab;
    public gbdisegna gb=null;
    int cont_ins=0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gjcambio(gicambio gicambioVar, long j, long j2) {
        super(j, j2);
        //Log.d("MAURO", "Sono in GJ 1 j e j2 valgono : "+j +" "+ j2);
        this.a = gicambioVar;
    }

    public void onFinish() {
        synchronized (this.a.d) {
            Log.d("ExitDC.onFinish da GJ", "");
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
            //Log.d("MAURO", "Sono in GJ 2");
            if (q < firstVisiblePosition || q > lastVisiblePosition) {
                this.a.d.setVisibility(View.INVISIBLE);
            } else {
                Log.d("ExitDC.onTick", new StringBuilder().append(j).toString());
                //Log.d("MAURO", "Sono in GJ3 this.a.b.i() vale : "+this.a.b.i());
                this.a.d.setVisibility(View.VISIBLE);
                this.a.d.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf((j / 1000) / 60), Long.valueOf((j / 1000) % 60)}));
            }
        }
        if (!this.a.b.i() || this.a.b.r() == 2 ) {
            //Log.d("MAURO", "Sono in GJ 4 this.a.b.i() vale : "+this.a.b.i());
            this.a.aesco();
        }
    }
}
