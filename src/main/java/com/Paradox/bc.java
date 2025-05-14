package com.Paradox;

import android.view.View;

class bc implements View.OnClickListener {
    final /* synthetic */ LocateActivity a;

    bc(LocateActivity locateActivity) {
        this.a = locateActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
