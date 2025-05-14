package com.Paradox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

class y implements View.OnClickListener {
    final /* synthetic */ EditSiteActivity ay;

    y(EditSiteActivity editSiteActivity) {
        this.ay = editSiteActivity;
    }

    public void onClick(View view) {
        if (!this.ay.a || this.ay.b != eb.ADD_BUTTON) {
            if (this.ay.a) {
                this.ay.aedit();
                this.ay.cf = this.ay.a(this.ay.cf);
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.Paradox.site", this.ay.cf);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                this.ay.setResult(3, intent);
            }
            this.ay.adone(!this.ay.a);
            return;
        }
        this.ay.aedit();
        this.ay.cf = this.ay.a(this.ay.cf);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("com.Paradox.site", this.ay.cf);
        Intent intent2 = new Intent();
        intent2.putExtras(bundle2);
        this.ay.setResult(3, intent2);
        this.ay.finish();
    }
}
