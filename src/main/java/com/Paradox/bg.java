package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidip.R;

class bg extends ArrayAdapter {
    final /* synthetic */ LocateActivity a;
    private int b;
    private LayoutInflater c;
    private LocateActivity.LocatedDevice d = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg(LocateActivity locateActivity, Context context, int i, LocateActivity.LocatedDevice locatedDevice) {
        super(context, i);
        this.a = locateActivity;
        this.b = i;
        this.c = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.d = locatedDevice;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.inflate(this.b, (ViewGroup) null);
        }
        LocateActivity.LocatedDevice locatedDevice = (LocateActivity.LocatedDevice) getItem(i);
        ((TextView) view.findViewById(R.id.textView1)).setText(locatedDevice.d);
        ((TextView) view.findViewById(R.id.textView2)).setText(locatedDevice.c);
        ((TextView) view.findViewById(R.id.textView3)).setText(locatedDevice.b);
        ((TextView) view.findViewById(R.id.textView4)).setText(Integer.toString(locatedDevice.a));
        if (this.d == null || this.d.a != locatedDevice.a || !this.d.b.equals(locatedDevice.b) || (this.d.c != null && this.d.c.length() > 0 && !this.d.c.equals(locatedDevice.c))) {
            ((ImageView) view.findViewById(R.id.locate_selected)).setSelected(false);
        } else {
            ((ImageView) view.findViewById(R.id.locate_selected)).setSelected(true);
        }
        return view;
    }
}
