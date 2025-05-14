package com.Paradox;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class AutoResizeTextView extends TextView {
    private g a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;

    public AutoResizeTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.d = 0.0f;
        this.e = 11.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = true;
        this.c = getTextSize();
    }

    private int a(CharSequence charSequence, TextPaint textPaint, int i, float f2) {
        textPaint.setTextSize(f2);
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, this.f, this.g, true).getHeight();
    }

    public void a() {
        if (this.c > 0.0f) {
            super.setTextSize(0, this.c);
            this.d = this.c;
        }
    }

    public void a(int i, int i2) {
        CharSequence text = getText();
        if (text != null && text.length() != 0 && i2 > 0 && i > 0 && this.c != 0.0f) {
            TextPaint paint = getPaint();
            float textSize = paint.getTextSize();
            float min = this.d > 0.0f ? Math.min(this.c, this.d) : this.c;
            float f2 = min;
            int a2 = a(text, paint, i, min);
            while (a2 > i2 && f2 > this.e) {
                float max = Math.max(f2 - 2.0f, this.e);
                a2 = a(text, paint, i, max);
                f2 = max;
            }
            if (this.h && f2 == this.e && a2 > i2) {
                StaticLayout staticLayout = new StaticLayout(text, paint, i, Layout.Alignment.ALIGN_NORMAL, this.f, this.g, false);
                if (staticLayout.getLineCount() > 0) {
                    int lineForVertical = staticLayout.getLineForVertical(i2) - 1;
                    if (lineForVertical < 0) {
                        setText("");
                    } else {
                        int lineStart = staticLayout.getLineStart(lineForVertical);
                        int lineEnd = staticLayout.getLineEnd(lineForVertical);
                        float lineWidth = staticLayout.getLineWidth(lineForVertical);
                        float measureText = paint.measureText("...");
                        while (((float) i) < lineWidth + measureText) {
                            lineEnd--;
                            lineWidth = paint.measureText(text.subSequence(lineStart, lineEnd + 1).toString());
                        }
                        setText(text.subSequence(0, lineEnd) + "...");
                    }
                }
            }
            paint.setTextSize(f2);
            setLineSpacing(this.g, this.f);
            if (this.a != null) {
                this.a.a(this, textSize, f2);
            }
            this.b = false;
        }
    }

    public boolean getAddEllipsis() {
        return this.h;
    }

    public float getMaxTextSize() {
        return this.d;
    }

    public float getMinTextSize() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.b) {
            a(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            this.b = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = true;
        a();
    }

    public void setAddEllipsis(boolean z) {
        this.h = z;
    }

    public void setLineSpacing(float f2, float f3) {
        super.setLineSpacing(f2, f3);
        this.f = f3;
        this.g = f2;
    }

    public void setMaxTextSize(float f2) {
        this.d = f2;
        requestLayout();
        invalidate();
    }

    public void setMinTextSize(float f2) {
        this.e = f2;
        requestLayout();
        invalidate();
    }

    public void setOnResizeListener(g gVar) {
        this.a = gVar;
    }

    public void setTextSize(float f2) {
        super.setTextSize(f2);
        this.c = getTextSize();
    }

    public void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        this.c = getTextSize();
    }
}
