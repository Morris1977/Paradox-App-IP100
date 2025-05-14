package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.androidip.R;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class gz extends BaseAdapter {
    public static int a = 1;
    public static int b = 2;
    public static int c = 4;
    public static int d = ((a | b) | c);
    private final int e;
    private final LayoutInflater f;
    /* access modifiers changed from: private */
    public final ViewFlipperCleanupOnHome g;
    private final CopyOnWriteArrayList h;
    private CopyOnWriteArrayList i;
    private int j = d;

    public gz(Context context, int i2, CopyOnWriteArrayList copyOnWriteArrayList, ViewFlipperCleanupOnHome viewFlipperCleanupOnHome) {
        this.e = i2;
        this.f = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.g = viewFlipperCleanupOnHome;
        this.h = new CopyOnWriteArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c() && gyVar.l()) {
                this.h.add(gyVar);
            }
        }
        b();
    }

    private boolean b() {
        if (this.h == null) {
            return false;
        }
        this.i = new CopyOnWriteArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (((this.j & a) == a && gyVar.f()) || (((this.j & b) == b && !gyVar.f()) || ((this.j & c) == c && gyVar.k()))) {
                this.i.add(gyVar);
            }
        }
        return true;
    }

    public int a() {
        return this.j;
    }

    public int a(int i2) {
        this.j = i2;
        if (b()) {
            notifyDataSetChanged();
        }
        return this.j;
    }

    public int getCount() {
        if (this.i == null) {
            return 0;
        }
        return this.i.size();
    }

    public Object getItem(int i2) {
        if (this.i == null || this.i.size() == 0) {
            return null;
        }
        return this.i.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemViewType(int i2) {
        return 0;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        hc hcVar;
        if (view == null) {
            view = this.f.inflate(this.e, (ViewGroup) null);
            hcVar = new hc();
            hcVar.a = (TextView) view.findViewById(R.id.tvZoneName_for_bypass);
            hcVar.b = (TextView) view.findViewById(R.id.tvZoneStatus);
            hcVar.c = (CheckBox) view.findViewById(R.id.checkBypassed);
            hcVar.c.setOnCheckedChangeListener(new ha(this));
            view.setOnClickListener(new hb(this));
            view.setTag(hcVar);
        } else {
            hcVar = (hc) view.getTag();
        }
        gy gyVar = (gy) getItem(i2);
        hcVar.c.setTag(gyVar);
        hcVar.a.setText(gyVar.p());
        hcVar.c.setChecked(gyVar.k());
        if (gyVar.k()) {
            hcVar.c.setText(R.string.Bypassed);
        } else {
            hcVar.c.setText(R.string.clickToBypass);
        }
        hcVar.b.setText(gyVar.f() ? R.string.Open : R.string.Closed);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
