package com.Paradox;

import android.view.View;
import android.view.animation.AnimationUtils;

import com.androidip.R;

class bu implements View.OnClickListener {
    final /* synthetic */ bs a;
    private final /* synthetic */ by b;

    bu(bs bsVar, by byVar) {
        this.a = bsVar;
        this.b = byVar;
    }

    public void onClick(View view) {
        bx bxVar = (bx) view.getTag();
        if (!bxVar.f()) {
            this.b.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            bxVar.b(true);
        } else if (bxVar.e()) {
            bxVar.a(false);
            this.b.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            this.b.d.startAnimation(AnimationUtils.loadAnimation(this.a.c, R.anim.slide_out_right));
            this.b.d.setVisibility(View.GONE);
        } else {
            bxVar.a(true);
            this.b.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            this.b.d.startAnimation(AnimationUtils.loadAnimation(this.a.c, R.anim.slide_in_from_right));
            this.b.d.setVisibility(View.VISIBLE);
        }
        this.b.b.setEnabled(bxVar.f());
        this.b.c.setEnabled(bxVar.f());
    }
}
