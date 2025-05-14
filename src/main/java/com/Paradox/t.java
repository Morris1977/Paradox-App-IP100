package com.Paradox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

class t {
    final /* synthetic */ DraggableListView a;
    private Context b;
    private WindowManager c;
    private WindowManager.LayoutParams d;
    private ImageView e;
    private Bitmap f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public t(DraggableListView draggableListView, Context context) {
        this.a = draggableListView;
        this.b = context;
        this.c = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
    }

    public void a() {
        if (this.e != null) {
            this.c.removeView(this.e);
            this.e.setImageDrawable((Drawable) null);
            this.e = null;
        }
        if (this.f != null) {
            this.f.recycle();
            this.f = null;
        }
    }

    public void a(int i2, int i3) {
        this.k = this.j;
        this.j = i3;
        this.d.y = (i3 - this.h) + this.g;
        this.c.updateViewLayout(this.e, this.d);
    }

    public void a(int i2, int i3, View view) {
        this.j = i2;
        this.k = i2;
        this.g = i3;
        this.h = i2 - view.getTop();
        this.i = view.getHeight();
        this.e = new ImageView(this.b);
        this.e.setBackgroundResource(17301505);
        view.setDrawingCacheEnabled(true);
        this.f = Bitmap.createBitmap(view.getDrawingCache());
        this.e.setImageBitmap(this.f);
        this.d = new WindowManager.LayoutParams();
        this.d.gravity = 48;
        this.d.x = 0;
        this.d.y = (i2 - this.h) + this.g;
        this.d.height = -2;
        this.d.width = -2;
        this.d.flags = 408;
        this.d.format = -3;
        this.d.windowAnimations = 0;
        this.c.addView(this.e, this.d);
    }

    public int b() {
        return this.i;
    }

    public int c() {
        int a2 = this.a.a(0, (int) (((float) (this.j - this.h)) + (((Math.signum((float) (this.j - this.k)) + 2.0f) * ((float) this.i)) / 2.0f)));
        return (a2 < 0 || a2 < this.a.c) ? a2 : a2 - 1;
    }
}
