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

public class hg extends BaseAdapter {
    private final LayoutInflater a;
    private final int b;
    private final ae c;
    private CopyOnWriteArrayList d;

    public hg(Context context, int i, ae aeVar) {
        this.b = i;
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.c = aeVar;
        a();
    }

    private void a() {
        this.d = new CopyOnWriteArrayList();
        Iterator it = this.c.m().iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c() && gyVar.d()) {
                this.d.add(gyVar);
            }
        }
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.d.size();
    }

    public Object getItem(int i) {
        return this.d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(this.b, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.tvZoneName)).setText(((gy) getItem(i)).p());
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
