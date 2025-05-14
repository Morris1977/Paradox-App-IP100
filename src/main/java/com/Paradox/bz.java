package com.Paradox;

import android.util.Log;

import com.androidip.R;

import java.io.Serializable;

class bz implements Serializable {
    String a;
    k[] b;
    n[] c;
    m[] d;
    l[] e;

    public bz(ag agVar, String str) {
        this.a = str;
        String string = MyApplication.acon().getResources().getString(R.string.AreaNum);
        //Log.d("MAURO", "SONO IN BZ str vale : "+ str);
        this.b = new k[agVar.a()];
        for (int i = 0; i < agVar.a(); i++) {
            this.b[i] = new k(string);
        }
        this.c = new n[agVar.b()];
        //Log.d("MAURO", "SONO IN BZ 2");
        for (int i2 = 0; i2 < agVar.b(); i2++) {
            this.c[i2] = new n(string);
        }
        this.d = new m[agVar.c()];
        //Log.d("MAURO", "SONO IN BZ 3");
        for (int i3 = 0; i3 < agVar.c(); i3++) {
            this.d[i3] = new m("", i3, true);
        }
        this.e = new l[agVar.a_()];
        //Log.d("MAURO", "SONO IN BZ 4");
        for (int i4 = 0; i4 < agVar.a_(); i4++) {
            this.e[i4] = new l("");
        }
        //Log.d("MAURO", "SONO IN BZ 5");
    }
}
