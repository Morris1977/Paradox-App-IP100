package com.Paradox;

import android.view.View;

import com.androidip.R;

class gf implements Runnable {
    final /* synthetic */ geconnect a;

    gf(geconnect geconnectVar) {
        this.a = geconnectVar;
    }

    public void run() {
        this.a.a.findViewById(R.id.loading_progressbar_title).setVisibility(View.GONE);
        this.a.a.hgeconnect = null;
    }
}
