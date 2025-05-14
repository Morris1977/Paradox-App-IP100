package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.androidip.R;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class hf extends BaseAdapter {
    private final Context a;
    private final LayoutInflater b;
    private final int c;
    private final ae d;
    private hd e = hd.OPEN;
    private CopyOnWriteArrayList f;
    private CopyOnWriteArrayList g;
    private CopyOnWriteArrayList h;
    private CopyOnWriteArrayList i;

    public hf(Context context, int i2, ae aeVar) {
        this.a = context;
        this.c = i2;
        this.b = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.d = aeVar;
        b();
    }

    private void b() {
        this.f = (CopyOnWriteArrayList) this.d.n().clone();
        this.g = (CopyOnWriteArrayList) this.d.o().clone();
        this.h = (CopyOnWriteArrayList) this.f.clone();
        this.h.addAll(this.g);
        this.i = new CopyOnWriteArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.k()) {
                this.i.add(gyVar);
            }
        }
    }

    public hd a() {
        return this.e;
    }

    public void a(hd hdVar) {
        if (this.h.size() == 0) {
            this.e = hd.ALL;
        } else {
            this.e = hdVar;
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.e == hd.OPEN ? this.f.size() : this.e == hd.CLOSED ? this.g.size() : this.e == hd.BYPASSED ? this.i.size() : this.h.size();
    }

    public Object getItem(int i2) {
        return this.e == hd.OPEN ? this.f.get(i2) : this.e == hd.CLOSED ? this.g.get(i2) : this.e == hd.BYPASSED ? this.i.get(i2) : this.h.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(this.c, (ViewGroup) null);
        }
        gy gyVar = (gy) getItem(i2);
        TextView textView = (TextView) view.findViewById(R.id.tvZoneStatus);
        ((TextView) view.findViewById(R.id.tvZoneName)).setText(gyVar.p());
        String string = this.a.getResources().getString(R.string.zoneStatusPair);
        Object[] objArr = new Object[2];
        objArr[0] = gyVar.k() ? String.valueOf(this.a.getString(R.string.Bypassed)) + "/" : "";
        objArr[1] = this.a.getString(gyVar.f() ? R.string.Open : R.string.Closed);
        textView.setText(String.format(string, objArr));
        return view;
    }

    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
