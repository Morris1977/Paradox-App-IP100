package com.Paradox;

import android.app.Activity;
import android.content.DialogInterface;

class hl implements DialogInterface.OnClickListener {
    final /* synthetic */ hi a;
    private final /* synthetic */ Activity b;

    hl(hi hiVar, Activity activity) {
        this.a = hiVar;
        this.b = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.finish();
    }
}
