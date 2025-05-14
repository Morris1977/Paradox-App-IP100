package com.Paradox;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.a.a.a.a.hlic;
import com.a.a.a.a.l;

class hk implements DialogInterface.OnClickListener {
    boolean a;
    final /* synthetic */ hi b;
    private final /* synthetic */ hlic c;
    private final /* synthetic */ l d;
    private final /* synthetic */ Context e;

    hk(hi hiVar, boolean z, hlic hlicVar, l lVar, Context context) {
        this.b = hiVar;
        this.c = hlicVar;
        this.d = lVar;
        this.e = context;
        this.a = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.a) {
            this.c.a(this.d);
            return;
        }
        this.e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/details?id=" + this.e.getPackageName())));
    }
}
