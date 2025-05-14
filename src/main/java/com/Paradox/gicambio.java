package com.Paradox;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class gicambio {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ TabMainPanel a;
    /* access modifiers changed from: private */
    public c b;
    private final CountDownTimer c;
    /* access modifiers changed from: private */
    public TextView d;

    public gicambio(TabMainPanel tabMainPanel, TextView textView, c cVar, ImageView imageView) {
        long j = 0;
        this.a = tabMainPanel;
        this.b = cVar;
        this.d = textView;
        cVar  = (c) ((imageView)).getTag();
        //long z = cVar.l() ? cVar.z() : cVar.y(); cVar.y() vale 0, dovrebbe valere 20
        long z = cVar.l() ? cVar.z() : 20;
        j = z >= 0 ? z : 0L;
        Log.d("ExitDC.Start", "");
        //Log.d("MAURO", "Sono in GI ho cliccato un altra icona z vale : "+z);
        this.c = new gjcambio(this, j * 1000, 1000L).start();
        Log.d("MAURO", "E' partito il countdown timer x ANTIFURTO TOTALE j vale : "+j);
        cVar.b(true, false);
        cVar.a(1, false);
        try {
            this.a.itab();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    public void aesco() {
        Log.d("ExitDC.Canceling...", "");
        this.c.cancel();
        synchronized (this.d) {
            this.d.setVisibility(View.INVISIBLE);
        }
    }
    @SuppressLint("LongLogTag")
    public void finito() {
        Log.d("Finito il conteggio da GI...", "");
        if (a.numeroicona == 1) {
            a.ant = false;
            a.ant1 = true;
        }
        if (a.numeroicona == 4) {
            a.antsleep = false;
            a.ant1sleep = true;
        }
        if (a.numeroicona == 5) {
            a.antper = false;
            a.ant1per = true;
        }
        try {
            this.a.itab();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        synchronized (this.d) {
            this.d.setVisibility(View.INVISIBLE);
        }
    }
    @SuppressLint("LongLogTag")
    public void agi1(TextView textView) {
        synchronized (this.d) {
            Log.d("ExitDC  Update", " using  " + this.d + "   visible " + textView);
            if (this.d != textView) {
                this.d.setVisibility(View.INVISIBLE);
                this.d = textView;
                Log.d("ExitDC  Update - SWITCHED", " using  " + this.d);
            }
            int firstVisiblePosition = this.a.t.getFirstVisiblePosition();
            int lastVisiblePosition = this.a.t.getLastVisiblePosition();
            int q = this.b.q();
            if (q < firstVisiblePosition || q > lastVisiblePosition) {
                this.d.setVisibility(View.INVISIBLE);
            } else {
                this.d.setVisibility(View.VISIBLE);
            }
        }
    }

}
