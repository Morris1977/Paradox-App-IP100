package com.Paradox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.androidip.R;

class ZoneListView extends ListView {
    private static /* synthetic */ int[] a;

    public ZoneListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZoneListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    static /* synthetic */ int[] a() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[hd.values().length];
            try {
                iArr[hd.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[hd.BYPASSED.ordinal()] = 4;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[hd.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[hd.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            a = iArr;
        }
        return iArr;
    }

    private hf b() {
        return (hf) super.getAdapter();
    }

    private void c() {
        TextView textView = (TextView) getEmptyView();
        switch (a()[b().a().ordinal()]) {
            case 1:
                textView.setText(R.string.ThereAreNoOpenZones);
                return;
            case 2:
                textView.setText(R.string.ThereAreNoCloseZones);
                return;
            default:
                textView.setText(R.string.ThereAreNoZones);
                return;
        }
    }

    public void addHeaderView(View view) {
    }

    public void setEmptyView(View view) {
        super.setEmptyView(view);
        c();
    }
}
