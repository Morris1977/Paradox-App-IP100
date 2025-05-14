package com.Paradox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabWidget;

import com.androidip.R;

import java.util.HashMap;

public class BadgeTabWidget extends TabWidget {
    HashMap a = new HashMap();

    public BadgeTabWidget(Context context) {
        super(context);
    }

    public BadgeTabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int a(int i) {
        i iVar = (i) this.a.get(Integer.valueOf(i));
        if (iVar == null) {
            return 0;
        }
        return iVar.a();
    }

    public void a(int i, int i2) {
        i iVar = (i) this.a.get(Integer.valueOf(i2));
        if (iVar == null) {
            iVar = new i(this);
            this.a.put(Integer.valueOf(i2), iVar);
        }
        iVar.a(i);
        getChildAt(i2).setVisibility(View.INVISIBLE);
        getChildAt(i2).setVisibility(View.VISIBLE);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                if (getChildAt(i) == view) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        int a2 = a(i);
        if (a2 > 0 || a2 < 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.badge), 24, 19, true);
            int right = (view.getRight() - createScaledBitmap.getWidth()) - 5;
            canvas.drawBitmap(createScaledBitmap, (float) right, 0.0f, new Paint());
            Typeface create = Typeface.create("Verdana", Typeface.BOLD);
            Paint paint = new Paint(1);
            paint.setTypeface(create);
            paint.setTextSize(12.0f);
            paint.setARGB(255, 255, 255, 255);
            String sb = new StringBuilder().append(a2).toString();
            if (a2 < 0) {
                sb = "!";
            }
            Rect rect = new Rect();
            paint.getTextBounds(sb, 0, sb.length(), rect);
            canvas.drawText(sb, (float) (((createScaledBitmap.getWidth() / 2) + right) - (rect.width() / 2)), (float) (((rect.height() / 2) + (createScaledBitmap.getHeight() / 2)) - 2), paint);
        }
        return drawChild;
    }
}
