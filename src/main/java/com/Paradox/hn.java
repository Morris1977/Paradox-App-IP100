package com.Paradox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.androidip.R;

public class hn {
    Context a;
    boolean bhn;
    boolean chn;
    Activity d;
    private Toast e;
    int i,i2;

    hn(Context context, Activity activity, boolean z, boolean z2, Site site) {
        this.a = context;
        this.bhn = z;
        this.chn = z2;
        this.d = activity;
        ahn(site);
    }

    @SuppressLint("ResourceType")
    public void ahn(Site site) {
        i = site.g().length();
        i2 = site.hsit().length();
        //Log.d("LICENZA", "aa.adia vale : " + aavar.adia );
        //Log.d("LICENZA", "site.g().lenght() vale : " + i );
        //Log.d("LICENZA", "site.hsit().lenght() vale : " + i2 );
        if (!this.bhn || !this.chn) {
            if (!this.chn) {
                Log.d("LICENZA", "NON A POSTO1");
                this.e = Toast.makeText(this.a, "No connection available!", 1);
                this.e.show();
                return;
            }
            Log.d("LICENZA", "NON A POSTO2");
            this.e = Toast.makeText(this.a, R.string.unlicensed_dialog_title, 1);
            this.e.show();
        } else if (aavar.adia || (site.j() && site.g().length() > 0 && site.hsit().length() > 0)) {
            Log.d("LICENZA", "OK A POSTO");
            ((ParadoxActivity) this.d).atab(site);
        } else {
            if (!site.j()) {
                site.fsite("");
            }
            ((ParadoxActivity) this.d).bciao(site).show();
        }
    }
}
