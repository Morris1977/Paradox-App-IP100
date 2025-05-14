package com.Paradox;

import android.view.View;

class bt extends bw {
    final /* synthetic */ bs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bt(bs bsVar, View view) {
        super(bsVar, view, (bw) null);
        this.a = bsVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        bx bxVar = (bx) a().getTag();
        if (bxVar != null) {
            bxVar.a(charSequence.toString());
        }
    }
}
