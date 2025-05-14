package com.Paradox;

import android.view.View;

class ew implements View.OnClickListener {
    final /* synthetic */ TabMainPanel a;

    ew(TabMainPanel tabMainPanel) {
        this.a = tabMainPanel;
    }

    public void onClick(View view) {
        this.a.r.setDisplayedChild(0);
    }
}
