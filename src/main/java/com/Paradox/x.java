package com.Paradox;

import android.view.View;
import android.widget.AdapterView;

class x implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ EditSiteActivity a;

    x(EditSiteActivity editSiteActivity) {
        this.a = editSiteActivity;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.cf.d((long) ((ck) this.a.e.getSelectedItem()).a());
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
