package com.Paradox;

import android.widget.CompoundButton;

class ba implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ az a;

    ba(az azVar) {
        this.a = azVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.a.a.a((ay) compoundButton.getTag());
        }
    }
}
