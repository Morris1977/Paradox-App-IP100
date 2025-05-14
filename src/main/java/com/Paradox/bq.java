package com.Paradox;

import com.androidip.R;

class bq implements Runnable {
    final /* synthetic */ bp a;
    private final /* synthetic */ br b;

    bq(bp bpVar, br brVar) {
        this.a = bpVar;
        this.b = brVar;
    }

    public void run() {
        this.b.f.clearAnimation();
        this.b.f.setBackgroundResource(0);
        this.b.f.setImageResource(R.drawable.momentary_switch);
    }
}
