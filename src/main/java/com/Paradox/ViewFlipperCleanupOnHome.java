package com.Paradox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ViewFlipper;

public class ViewFlipperCleanupOnHome extends ViewFlipper {
    private bh a = null;
    private bi b = null;
    private boolean c = false;

    public ViewFlipperCleanupOnHome(Context context) {
        super(context);
    }

    public ViewFlipperCleanupOnHome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Animation a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    public static Animation b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    public static Animation c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    public static Animation d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    public static Animation e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        return translateAnimation;
    }

    /* access modifiers changed from: private */
    public void f() {
        if (this.a != null) {
            this.a.a(super.getCurrentView());
        }
    }

    public void a(boolean z, bh bhVar) {
        this.c = z;
        this.a = bhVar;
    }

    @SuppressLint("LongLogTag")
    public void setDisplayedChild(int i) {
        if (i > super.getDisplayedChild()) {
            setInAnimation(b());
            setOutAnimation(c());
        } else if (i < super.getDisplayedChild()) {
            setInAnimation(d());
            setOutAnimation(e());
        } else {
            Log.e("setDisplayedChild NOT MOVING", "");
        }
        if (i == 0 && i != super.getDisplayedChild()) {
            if (this.c) {
                getInAnimation().setAnimationListener(new gx(this));
            } else {
                f();
            }
        }
        super.setDisplayedChild(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setOnHomeListener(bh bhVar) {
        this.c = true;
        this.a = bhVar;
    }

    public void setOnSetDisplayedChildListener(bi biVar) {
        this.b = biVar;
    }

    public void showNext() {
    }

    public void showPrevious() {
    }
}
