package com.Paradox;

import android.content.DialogInterface;

import com.androidip.R;

class bk implements DialogInterface.OnClickListener {
    final /* synthetic */ bjpgm a;
    private final /* synthetic */ dz b;
    private final /* synthetic */ br c;

    bk(bjpgm bjpgmVar, dz dzVar, br brVar) {
        this.a = bjpgmVar;
        this.b = dzVar;
        this.c = brVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a(1);
        if (((ag) this.b.c()).a(this.b.g(), this.b.a())) {
            this.c.c.setImageResource(R.drawable.pgm_control_green_on);
            this.c.d.setImageResource(R.drawable.pgm_control_black_off);
        }
    }
}
