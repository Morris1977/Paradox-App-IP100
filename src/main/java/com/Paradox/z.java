package com.Paradox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

class z implements View.OnClickListener {
    final /* synthetic */ EditSiteActivity az;

    z(EditSiteActivity editSiteActivity) {
        this.az = editSiteActivity;
    }

    public void onClick(View view) {
        this.az.aedit();
        this.az.cf = this.az.a(this.az.cf);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.Paradox.site", this.az.cf);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (this.az.a) {
            this.az.setResult(5, intent);
        } else if (this.az.b(this.az.cf)) {
            this.az.setResult(3, intent);
        } else {
            this.az.setResult(6, intent);
        }
        this.az.finish();
    }
}
