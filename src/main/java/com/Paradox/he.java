package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidip.R;

class he extends ArrayAdapter {
    final /* synthetic */ ZoneViewerActivity a;
    private int b;
    private LayoutInflater c = ((LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public he(ZoneViewerActivity zoneViewerActivity, Context context, int i) {
        super(context, i);
        this.a = zoneViewerActivity;
        this.b = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.inflate(this.b, new LinearLayout(getContext()), true);
        }
        gy gyVar = (gy) getItem(i);
        ((TextView) view.findViewById(R.id.tvZoneName)).setText(gyVar.p());
        gyVar.f();
        return view;
    }
}
