package com.Paradox;

import android.widget.ImageView;

class ex implements Runnable {
    final /* synthetic */ TabMainPanel a;
    private final /* synthetic */ ImageView b;
    private final /* synthetic */ int c;

    ex(TabMainPanel tabMainPanel, ImageView imageView, int i) {
        this.a = tabMainPanel;
        this.b = imageView;
        this.c = i;
    }

    public void run() {
        this.b.clearAnimation();
        this.b.setBackgroundResource(0);
        this.b.setImageResource(this.c);
    }
}
