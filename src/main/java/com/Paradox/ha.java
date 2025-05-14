package com.Paradox;

import android.util.Log;
import android.widget.CompoundButton;

class ha implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ gz a;

    ha(gz gzVar) {
        this.a = gzVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        gy gyVar = (gy) compoundButton.getTag();
        if (compoundButton.isChecked()) {
            if (!gyVar.k()) {
                Log.d("Zone BYPASS On " + gyVar.p(), "");
                ((ag) gyVar.m()).a(new gy[]{gyVar}, true);
                this.a.notifyDataSetChanged();
            }
        } else if (gyVar.k()) {
            Log.d("Zone BYPASS Off " + gyVar.p(), "");
            ((ag) gyVar.m()).a(new gy[]{gyVar}, false);
            this.a.notifyDataSetChanged();
        }
    }
}
