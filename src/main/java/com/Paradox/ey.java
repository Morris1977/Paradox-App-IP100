package com.Paradox;

import android.content.DialogInterface;

class ey implements DialogInterface.OnClickListener {
    final /* synthetic */ TabMainPanel a;
    private final /* synthetic */ boolean b;

    ey(TabMainPanel tabMainPanel, boolean z) {
        this.a = tabMainPanel;
        this.b = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.b) {
            this.a.a(true);
        }
    }
}
