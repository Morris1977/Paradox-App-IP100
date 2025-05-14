package com.Paradox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.androidip.R;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class a extends BaseAdapter {
    private final LayoutInflater a;
    private final int b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private CopyOnWriteArrayList e;
    private int f;
    private int g;

    public a(Context context, int i, CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, int i2) {
        this.b = i;
        this.a = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.c = copyOnWriteArrayList;
        this.d = copyOnWriteArrayList2;
        this.f = i2;
        this.g = (int) ((context.getResources().getDisplayMetrics().density * 30.0f) + 0.5f);
        a();
    }

    private void a() {
        try {
            this.e = new CopyOnWriteArrayList();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                Iterator it2 = cVar.m().iterator();
                while (it2.hasNext()) {
                    gy gyVar = (gy) it2.next();
                    if (gyVar.c() && (gyVar.d() || gyVar.e())) {
                        this.e.add(new b(this, gyVar, cVar));
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.e.size();
    }

    public Object getItem(int i) {
        return this.e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @SuppressLint("ResourceType")
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(this.b, (ViewGroup) null);
        }
        b bVar = (b) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.tvZoneName);
        if (this.f > 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.height = this.g;
            textView.setLayoutParams(layoutParams);
            ((TextView) view.findViewById(R.id.tvZoneArea)).setText(bVar.b());
        } else {
            view.findViewById(R.id.tvZoneArea).setVisibility(8);
        }
        textView.setText(bVar.a());
        if (bVar.c()) {
            ((TextView) view.findViewById(R.id.tvZoneStatus)).setText(R.string.inalarm);
        } else if (bVar.d()) {
            ((TextView) view.findViewById(R.id.tvZoneStatus)).setText(R.string.wasinalarm);
        }
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
