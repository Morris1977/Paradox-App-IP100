package com.Paradox;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

import com.androidip.R;

class bp implements View.OnClickListener {
    final /* synthetic */ bjpgm a;
    private final /* synthetic */ br b;

    bp(bjpgm bjpgmVar, br brVar) {
        this.a = bjpgmVar;
        this.b = brVar;
    }

    public void onClick(View view) {
        if (this.b.f.getBackground() == null) {
            this.b.f.setImageResource(0);
            this.b.f.clearAnimation();
            this.b.f.setBackgroundResource(0);
            this.b.f.setBackgroundResource(R.drawable.momentary_switch_animation);
            AnimationDrawable animationDrawable = (AnimationDrawable) this.b.f.getBackground();
            int i = 10;
            for (int i2 = 0; i2 < animationDrawable.getNumberOfFrames(); i2++) {
                i += animationDrawable.getDuration(i2);
            }
            this.b.f.postDelayed(new bq(this, this.b), (long) i);
            if (!animationDrawable.isRunning()) {
                this.b.f.setImageResource(0);
                animationDrawable.start();
            } else {
                this.b.f.setImageResource(R.drawable.momentary_switch);
                animationDrawable.stop();
            }
            dz dzVar = (dz) view.getTag();
            ((cd) dzVar.c()).a(dzVar);
        }
    }
}
