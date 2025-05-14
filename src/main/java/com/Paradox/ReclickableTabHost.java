package com.Paradox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TabHost;

public class ReclickableTabHost extends TabHost {
    private TabHost.OnTabChangeListener a = null;

    public ReclickableTabHost(Context context) {
        super(context);
    }

    public ReclickableTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCurrentTab(int i) {
        if (i != getCurrentTab()) {
            super.setCurrentTab(i);
        } else if (this.a != null) {
            this.a.onTabChanged(getCurrentTabTag());
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
        this.a = onTabChangeListener;
    }
}
