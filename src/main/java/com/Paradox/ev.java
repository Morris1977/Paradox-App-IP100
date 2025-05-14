package com.Paradox;

import android.view.View;

class ev implements View.OnClickListener {
    final /* synthetic */ TabMainPanel a;

    ev(TabMainPanel tabMainPanel) {
        this.a = tabMainPanel;
    }

    public void onClick(View view) {
        this.a.r.setDisplayedChild(0);
    }
}
