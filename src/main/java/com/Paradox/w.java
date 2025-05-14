package com.Paradox;

import android.view.View;
import android.widget.AdapterView;

class w implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ EditSiteActivity a;

    w(EditSiteActivity editSiteActivity) {
        this.a = editSiteActivity;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.cf.c((long) this.a.d.getSelectedItemPosition());
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
