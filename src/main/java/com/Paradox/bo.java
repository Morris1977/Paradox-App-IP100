package com.Paradox;

import android.view.View;

import com.androidip.R;

class bo implements View.OnClickListener {
    final /* synthetic */ bjpgm a;
    private final /* synthetic */ br b;

    bo(bjpgm bjpgmVar, br brVar) {
        this.a = bjpgmVar;
        this.b = brVar;
    }

    public void onClick(View view) {
        dz dzVar = (dz) view.getTag();
        dzVar.a(2);
        if (((ag) dzVar.c()).a(dzVar.g(), dzVar.a())) {
            this.b.c.setImageResource(R.drawable.pgm_control_black_on);
            this.b.d.setImageResource(R.drawable.pgm_control_green_off);
        }
    }
}
