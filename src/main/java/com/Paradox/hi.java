package com.Paradox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import com.a.a.a.a.hlic;
import com.a.a.a.a.l;
import com.androidip.R;

class hi implements Runnable {
    final /* synthetic */ hh a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ Activity d;
    private final /* synthetic */ hlic e;
    private final /* synthetic */ l f;

    hi(hh hhVar, Context context, boolean z, Activity activity, hlic hlicVar, l lVar) {
        this.a = hhVar;
        this.b = context;
        this.c = z;
        this.d = activity;
        this.e = hlicVar;
        this.f = lVar;
    }

    public void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setOnCancelListener(new hj(this, this.d));
        builder.setMessage(this.c ? R.string.unlicensed_dialog_retry_body : R.string.unlicensed_dialog_body).setPositiveButton(this.c ? R.string.retry_button : R.string.buy_button, new hk(this, this.c, this.e, this.f, this.b)).setNegativeButton(R.string.quit_button, new hl(this, this.d)).show();
    }
}
