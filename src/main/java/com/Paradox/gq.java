package com.Paradox;

import android.database.DataSetObserver;

class gq extends DataSetObserver {
    final /* synthetic */ TabMainPanel a;

    private gq(TabMainPanel tabMainPanel) {
        this.a = tabMainPanel;
    }

    /* synthetic */ gq(TabMainPanel tabMainPanel, gq gqVar) {
        this(tabMainPanel);
    }

    public void onChanged() {
        this.a.H.notifyDataSetChanged();
        this.a.htab();
    }

    public void onInvalidated() {
        this.a.H.notifyDataSetInvalidated();
    }
}
