package com.Paradox;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

class bw implements TextWatcher {
    private View a;
    final /* synthetic */ bs b;

    private bw(bs bsVar, View view) {
        this.b = bsVar;
        this.a = view;
    }

    /* synthetic */ bw(bs bsVar, View view, bw bwVar) {
        this(bsVar, view);
    }

    public View a() {
        return this.a;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
