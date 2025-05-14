package com.Paradox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

class v implements View.OnClickListener {
    final /* synthetic */ EditSiteActivity a;

    v(EditSiteActivity editSiteActivity) {
        this.a = editSiteActivity;
    }

    public void onClick(View view) {
        this.a.b(false);
        this.a.aedit();
        LocateActivity.LocatedDevice locatedDevice = new LocateActivity.LocatedDevice(this.a.cf.d(), this.a.cf.c(), this.a.cf.e(), this.a.cf.f());
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.Paradox.IP", locatedDevice);
        Intent intent = new Intent(this.a, LocateActivity.class);
        intent.putExtras(bundle);
        this.a.startActivityForResult(intent, 0);
    }
}
