package com.Paradox;

import android.view.View;

import com.androidip.R;

class bn implements View.OnClickListener {
    final /* synthetic */ bjpgm a;
    private final /* synthetic */ br b;

    bn(bjpgm bjpgmVar, br brVar) {
        this.a = bjpgmVar;
        this.b = brVar;
    }

    public void onClick(View view) {
        dz dzVar = (dz) view.getTag();
        if ((dzVar.c() instanceof ah) || dzVar.b() <= 0) {
            dzVar.a(1);
            if (((ag) dzVar.c()).a(dzVar.g(), dzVar.a())) {
                this.b.c.setImageResource(R.drawable.pgm_control_green_on);
                this.b.d.setImageResource(R.drawable.pgm_control_black_off);
                return;
            }
            return;
        }
        this.a.a(dzVar, this.b);
    }
}
