package com.Paradox;

import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.androidip.R;

class bv implements View.OnClickListener {
    final /* synthetic */ bs a;
    private final /* synthetic */ by b;

    bv(bs bsVar, by byVar) {
        this.a = bsVar;
        this.b = byVar;
    }

    public void onClick(View view) {
        bx bxVar = (bx) view.getTag();
        Log.d("MAURO", "Sono in BV");
        if (bxVar.f()) {
            bxVar.b(false);
            bxVar.a(false);
            this.b.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            this.b.d.startAnimation(AnimationUtils.loadAnimation(this.a.c, R.anim.slide_out_right));
            this.b.d.setVisibility(View.GONE);
        }
        this.b.b.setEnabled(bxVar.f());
        this.b.c.setEnabled(bxVar.f());
    }
}
