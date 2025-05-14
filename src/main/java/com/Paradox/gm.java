package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.androidip.R;

import java.util.ArrayList;

class gm extends ArrayAdapter {
    final /* synthetic */ TabMainPanel a;
    private final int b;
    private ArrayList c = null;
    private final LayoutInflater d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm(TabMainPanel tabMainPanel, Context context, int i, ArrayList arrayList) {
        super(context, i, arrayList);
        this.a = tabMainPanel;
        this.b = i;
        this.c = arrayList;
        this.d = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.d.inflate(this.b, (ViewGroup) null);
        }
        dm dmVar = (dm) this.c.get(i);
        ((TextView) view.findViewById(R.id.tvModuleName)).setText(dmVar.c());
        ((TextView) view.findViewById(R.id.tvModuleStatus)).setText(dmVar.e());
        return view;
    }
}
