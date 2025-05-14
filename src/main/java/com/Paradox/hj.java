package com.Paradox;

import android.app.Activity;
import android.content.DialogInterface;

class hj implements DialogInterface.OnCancelListener {
    final /* synthetic */ hi a;
    private final /* synthetic */ Activity b;

    hj(hi hiVar, Activity activity) {
        this.a = hiVar;
        this.b = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.b.finish();
    }
}
