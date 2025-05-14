package com.Paradox;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ggcambio {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ TabMainPanel a;
    /* access modifiers changed from: private */
    public c b;
    private CountDownTimer c;
    /* access modifiers changed from: private */
    public TextView d;

    public ggcambio(TabMainPanel tabMainPanel, TextView textView, c cVar) {
        long j = 0;
        this.a = tabMainPanel;
        this.b = cVar;
        this.d = textView;
        long w = ((long) cVar.w()) - 0;
        this.c = new ghcambio(this, (w >= 0 ? w : j) * 1000, 1000).start();
        Log.d("MAURO", "E' partito il countdown timer x ANT j vale : "+j);
    }

    public void a() {
        this.c.cancel();
        synchronized (this.d) {
            this.d.setVisibility(View.INVISIBLE);
        }
    }
    @SuppressLint("LongLogTag")
    public void finito() {
        Log.d("Finito il conteggio da GG...", "");
        a.ant2 = true;
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
    public void a(TextView textView) {
        synchronized (this.d) {
            Log.d("EntryDC  Update", " using  " + this.d + "   visible " + textView);
            if (this.d != textView) {
                this.d.setVisibility(View.INVISIBLE);
                this.d = textView;
                Log.d("EntryDC  Update - SWITCHED", " using  " + this.d);
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
