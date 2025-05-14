package com.Paradox;

import android.view.animation.Animation;

class gx implements Animation.AnimationListener {
    final /* synthetic */ ViewFlipperCleanupOnHome a;

    gx(ViewFlipperCleanupOnHome viewFlipperCleanupOnHome) {
        this.a = viewFlipperCleanupOnHome;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.f();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
